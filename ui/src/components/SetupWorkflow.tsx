import { useCallback, useEffect, useRef, useState } from "react";
import { ArrowClockwise, Check, FolderOpen, HardDrives, ShieldWarning } from "@phosphor-icons/react";
import { dashboardRequest, jsonBody } from "../lib/hostApi";
import SetupWizard from "./SetupWizard";
import VersionSelect, { useVersionCatalog, versionIsValid } from "./VersionSelect";

interface SetupCandidate {
  path: string;
  type: string;
  mcVersion: string;
  port: number;
  configured: boolean;
  legacyConfigured: boolean;
  hasServerFiles: boolean;
  legacyVersion: string;
  contents: string[];
}

interface HostMinimizeState {
  status: string;
  restartRequired: boolean;
  worldName: string;
  firstSetupStatus: string;
  firstSetupWorld: string;
  firstSetupDisabledPluginCount: string;
  firstSetupConfirmation: string;
  confirmation: string;
  rollbackConfirmation: string;
  notes: string[];
  message?: string;
  heap?: { name: string; applied: boolean; detail: string }[];
}

interface SetupState {
  required: boolean;
  legacyDataFound: boolean;
  completed: boolean;
  candidates: SetupCandidate[];
  cleanupAvailable: boolean;
  legacyJars: string[];
  ntfy: { enabled: boolean; server: string; topic: string };
}

export default function SetupWorkflow() {
  const [state, setState] = useState<SetupState | null>(null);
  const [selected, setSelected] = useState("");
  const [directory, setDirectory] = useState("./child-server");
  const [type, setType] = useState("vanilla");
  const [mcVersion, setMcVersion] = useState("");
  const [port, setPort] = useState("2063");
  const [ntfy, setNtfy] = useState({ enabled: false, server: "https://ntfy.sh", topic: "" });
  const [busy, setBusy] = useState(false);
  const [error, setError] = useState("");
  const [host, setHost] = useState<HostMinimizeState | null>(null);
  const initialized = useRef(false);
  const ntfyInitialized = useRef(false);
  const selectedCandidate = state?.candidates.find((candidate) => candidate.path === selected);
  const preserveVersion = !!selectedCandidate?.configured && selectedCandidate.type === type && selectedCandidate.mcVersion === mcVersion;
  const catalog = useVersionCatalog(type, !!state && !state.required && !state.completed);

  const refresh = useCallback(async () => {
    setError("");
    try {
      const result = await dashboardRequest<SetupState>("/api/setup");
      setState(result);
      setHost(await dashboardRequest<HostMinimizeState>("/api/host-minimize"));
      if (!ntfyInitialized.current) {
        ntfyInitialized.current = true;
        setNtfy(result.ntfy);
      }
      const candidate = result.candidates.length === 1 ? result.candidates[0] : undefined;
      setSelected((current) => current || candidate?.path || "");
      if (!initialized.current && candidate) {
        initialized.current = true;
        if (candidate.configured) {
          setType(candidate.type);
          setMcVersion(candidate.mcVersion);
          setPort(String(candidate.port));
        }
      }
      return true;
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : "Einrichtungsstatus konnte nicht geladen werden.");
      return false;
    }
  }, []);

  useEffect(() => {
    void refresh();
    const onPageChange = (event: Event) => {
      if ((event as CustomEvent<string>).detail === "setup") void refresh();
    };
    window.addEventListener("dashboard:tab", onPageChange);
    return () => window.removeEventListener("dashboard:tab", onPageChange);
  }, [refresh]);

  const submit = async (action: "attach" | "delete" | "import" | "new" | "reset") => {
    setBusy(true);
    setError("");
    try {
      const path = action === "new" ? directory.trim() : selected;
      if (!path) throw new Error("Bitte zuerst einen Serverordner auswählen.");
      if (action !== "import" && !versionIsValid(type, mcVersion, catalog.versions, action !== "new" && preserveVersion))
        throw new Error("Bitte eine verfügbare Minecraft-Version auswählen.");
      let confirm = "";
      if (action === "reset") {
        const candidateName = path.split(/[\\/]/).filter(Boolean).at(-1) || path;
        const contents = state?.candidates.find((candidate) => candidate.path === path)?.contents ?? [];
        const accepted = await window.dashboardUi?.confirm({
          title: "Vorhandenen Child-Ordner neu aufsetzen?",
          description: `Dieser Ordner wird verschoben und als Sicherung archiviert: ${path}\nEnthalten sind u.a.: ${contents.join(", ") || "keine Einträge erkannt"}.`,
          confirmLabel: "Ordner archivieren",
          destructive: true,
        });
        if (!accepted) return;
        confirm = `ARCHIVIEREN ${candidateName}`;
      } else if (action === "delete") {
        const candidateName = path.split(/[\\/]/).filter(Boolean).at(-1) || path;
        const contents = state?.candidates.find((candidate) => candidate.path === path)?.contents ?? [];
        const accepted = await window.dashboardUi?.confirm({
          title: "Child-Ordner endgültig löschen?",
          description: `ACHTUNG: Der gesamte Child-Ordner wird unwiderruflich gelöscht: ${path}\nDazu gehören Welten und alle darin enthaltenen Dateien. Erkannter Inhalt: ${contents.join(", ") || "keine Einträge erkannt"}. Server-Root und externe Verzeichnisse werden nicht gelöscht.`,
          confirmLabel: "Child endgültig löschen",
          destructive: true,
        });
        if (!accepted) return;
        confirm = `DELETE ${candidateName}`;
      } else if (action === "import" && !state?.candidates.find((candidate) => candidate.path === path)?.legacyVersion) {
        const accepted = await window.dashboardUi?.confirm({
          title: "Plugin-Version ist nicht feststellbar",
          description: "Die Plugin-JAR fehlt oder enthält keine lesbare Versionsangabe. Importiere nur, wenn die alte Konfiguration sicher aus ServerHoster 1.10.1 oder neuer stammt.",
          confirmLabel: "Version bestätigen",
        });
        if (!accepted) return;
        confirm = "IMPORT 1.10.1+";
      } else {
        const accepted = await window.dashboardUi?.confirm({
          title: action === "import" ? "Serverkonfiguration übernehmen?" : "Server einrichten?",
          description: action === "import"
            ? `Die erkannte Konfiguration für ${path} wird als einzelner Child-Server übernommen. Dateien im Serverordner bleiben unangetastet.`
            : `Servertyp ${type} ${mcVersion} wird für ${path} konfiguriert. Es wird noch kein Server-JAR heruntergeladen.`,
          confirmLabel: action === "import" ? "Konfiguration übernehmen" : "Einrichtung bestätigen",
        });
        if (!accepted) return;
      }
      const result = await dashboardRequest<{ warning?: string }>("/api/setup", {
        method: "POST",
        body: jsonBody({ action, path, type, mcVersion, port: Number(port), confirm, ntfy }),
      });
      await refresh();
      window.dashboardUi?.notify(
        result.warning ?? "Einrichtung gespeichert. Ein Child-Start ist jetzt möglich.",
        !!result.warning,
      );
      if (state?.cleanupAvailable) {
        const shouldClean = await window.dashboardUi?.confirm({
          title: "Alte FabricLauncher-Dateien jetzt löschen?",
          description: "Die Migration ist abgeschlossen. Alte Plugin-Einstellungen, Secrets und JARs können optional entfernt werden. Lokale Backups und Speicher-Notfallberichte bleiben erhalten.",
          confirmLabel: "Bereinigung prüfen",
          destructive: true,
        });
        if (shouldClean) await cleanupLegacy();
      }
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : "Einrichtung fehlgeschlagen.");
    } finally {
      setBusy(false);
    }
  };

  const cleanupLegacy = async () => {
    const accepted = await window.dashboardUi?.confirm({
      title: "Alte FabricLauncher-Dateien löschen?",
      description: `Entfernt alte Plugin-Einstellungen, Secrets und erkannte FabricLauncher-JARs (${state?.legacyJars.join(", ") || "keine JARs"}). Child-Ordner und Welten bleiben unberührt; lokale Backups und Speicher-Notfallberichte werden ausdrücklich erhalten.`,
      confirmLabel: "Alte Dateien löschen",
      destructive: true,
    });
    if (!accepted) return;
    setBusy(true);
    setError("");
    try {
      await dashboardRequest("/api/setup/cleanup", {
        method: "POST",
        body: jsonBody({ confirm: "DELETE FABRICLAUNCHER" }),
      });
      await refresh();
      window.dashboardUi?.notify("Alte FabricLauncher-Dateien bereinigt; lokale Backups und Notfallberichte bleiben erhalten.");
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : "Alte Dateien konnten nicht gelöscht werden.");
    } finally {
      setBusy(false);
    }
  };

  const hostAction = async (action: "apply" | "rollback", required: string) => {
    const accepted = await window.dashboardUi?.confirm({
      title: action === "apply" ? "Äußeren Spigot verkleinern?" : "Host-Dateien zurückholen?",
      description: action === "apply"
        ? "Ein laufender Child wird zuerst sauber gestoppt. Bestehende Welten, Plugins, Logs und Backups werden nicht gelöscht. Danach musst du den äußeren Spigot selbst im Panel neu starten."
        : "Die gesicherten server.properties, bukkit.yml und spigot.yml werden zurückgeschrieben. Welten werden nicht gelöscht.",
      confirmLabel: action === "apply" ? "Minimierung vorbereiten" : "Zurückholen",
      destructive: true,
    });
    if (!accepted) return;
    setBusy(true);
    try {
      const result = await dashboardRequest<HostMinimizeState>("/api/host-minimize", {
        method: "POST",
        body: jsonBody({ action, confirm: required }),
      });
      setHost(result);
      window.dashboardUi?.notify(result.message ?? "Gespeichert.", false);
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : "Host-Aktion fehlgeschlagen.");
    } finally {
      setBusy(false);
    }
  };

  const runHostFirstSetup = async (required: string) => {
    const accepted = await window.dashboardUi?.confirm({
      title: "Aggressive Host-Grundeinrichtung ausführen?",
      description: "Dies ist für ein Upgrade ausdrücklich manuell. Alle erkannten äußeren Minecraft-Welten werden unwiderruflich entfernt, eine neue Void-Lobby wird eingerichtet und andere Plugin-JARs werden mit .disabled umbenannt. Child-Daten, ServerHoster-Konfiguration, Passwort und Backups bleiben erhalten. Der Host fährt herunter und muss nach der Bestätigung und nach der Vorbereitung jeweils im Hosting-Panel gestartet werden. Die Weltlöschung erfolgt erst nach dem Laden der neuen Lobby und kann nicht zurückgenommen werden.",
      confirmLabel: "Host-Grundeinrichtung starten",
      destructive: true,
    });
    if (!accepted) return;
    setBusy(true);
    setError("");
    try {
      await dashboardRequest("/api/host-first-setup", {
        method: "POST",
        body: jsonBody({ confirm: required }),
      });
      setHost((current) => current ? { ...current, firstSetupStatus: "requested" } : current);
      window.dashboardUi?.notify("Host-Grundeinrichtung bestätigt. Der Host fährt herunter; starte ihn im Hosting-Panel neu.");
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : "Host-Grundeinrichtung konnte nicht gestartet werden.");
    } finally {
      setBusy(false);
    }
  };

  if (!state && !error) return <section className="setup-workflow"><p>Einrichtung wird geladen …</p></section>;
  if (!state) return <section className="setup-workflow"><p className="workflow-error" role="alert">{error}</p><button className="btn" type="button" onClick={() => void refresh()}>Erneut versuchen</button></section>;
  if (state.required && !host && !error) return <section className="setup-workflow"><p>Host-Einstellungen werden geladen …</p></section>;
  if (state.required && !host) return <section className="setup-workflow"><p className="workflow-error" role="alert">{error}</p><button className="btn" type="button" onClick={() => void refresh()}>Erneut versuchen</button></section>;
  if (state.required) return <SetupWizard state={state} host={host} onComplete={refresh} />;

  return (
    <section className="setup-workflow">
      <header className="setup-heading">
        <div>
          <p className="eyebrow">EINMALIGE EINRICHTUNG</p>
          <h2>{state?.completed ? "Child-Server eingerichtet" : "Serverhoster einrichten"}</h2>
          <p>Es wird genau ein Child-Server verwaltet. Die Einrichtung lädt keine Mods oder Plugins vorab herunter.</p>
        </div>
        <button className="btn" onClick={() => void refresh()} disabled={busy} aria-label="Erneut laden">
          <ArrowClockwise size={18} />
        </button>
      </header>

      {error && <p className="workflow-error" role="alert">{error}</p>}

      {state?.completed && (
        <>
          <article className="setup-card">
            <Check size={20} />
            <div><b>Einrichtung abgeschlossen</b><p>Serverdateien werden nur bei einem expliziten Start eingerichtet oder aktualisiert.</p></div>
          </article>
          {state.cleanupAvailable && (
            <article className="setup-card">
              <FolderOpen size={20} />
              <div><b>Alte Plugin-Dateien erkannt</b><p>Die Bereinigung ist optional und betrifft nicht den Child-Server.</p></div>
              <button className="btn danger-outline" disabled={busy} onClick={() => void cleanupLegacy()}>Alte Dateien löschen …</button>
            </article>
          )}
        </>
      )}

      {state?.legacyDataFound && !state.completed && (
        <article className="setup-card">
          <FolderOpen size={20} />
          <div><b>Ältere ServerHoster-Konfiguration gefunden</b><p>Übernahme ist optional. Bestehende Child-Dateien werden dabei nicht verändert.</p></div>
        </article>
      )}

      {!state?.completed && (
        <>
          {state?.candidates.length ? (
            <div className="setup-card-list">
              <h3>Erkannte Serverordner</h3>
              {state.candidates.length > 1 && (
                <article className="setup-card">
                  <ShieldWarning size={20} />
                  <div><b>Mehrere Serverordner gefunden</b><p>Es wird nur der ausgewählte Ordner eingebunden, archiviert oder gelöscht. Alle anderen erkannten Ordner bleiben unverändert und müssen bei Bedarf separat behandelt werden.</p></div>
                </article>
              )}
              {state.candidates.map((candidate) => (
                <label className="setup-card" key={candidate.path}>
                  <input
                    type="radio"
                    name="server-candidate"
                    value={candidate.path}
                    checked={selected === candidate.path}
                    onChange={() => {
                      setSelected(candidate.path);
                      if (candidate.configured) {
                        setType(candidate.type);
                        setMcVersion(candidate.mcVersion);
                        setPort(String(candidate.port));
                      }
                    }}
                  />
                  <HardDrives size={20} />
                  <div>
                    <b>{candidate.path}</b>
                    <p>{candidate.configured ? `${candidate.type} ${candidate.mcVersion} · Port ${candidate.port}` : "Serverdateien erkannt; Konfiguration muss angegeben werden."}{candidate.legacyConfigured ? ` · alte Plugin-Version ${candidate.legacyVersion || "nicht feststellbar"}` : ""}</p>
                    <p className="muted">Inhalt: {candidate.contents.join(", ") || "keine Einträge erkannt"}</p>
                  </div>
                </label>
              ))}
              <div className="setup-actions">
                {state.candidates.find((candidate) => candidate.path === selected)?.legacyConfigured && (
                  <button className="btn pri" disabled={busy || !selected} onClick={() => void submit("import")}>Alte Konfiguration übernehmen</button>
                )}
                <button className="btn pri" disabled={busy || !selected || !versionIsValid(type, mcVersion, catalog.versions, preserveVersion)} onClick={() => void submit("attach")}>Vorhandenen Ordner einbinden</button>
                <button className="btn" disabled={busy || !selected || !versionIsValid(type, mcVersion, catalog.versions, preserveVersion)} onClick={() => void submit("reset")}>Neu aufsetzen …</button>
                <button className="btn danger-outline" disabled={busy || !selected || !versionIsValid(type, mcVersion, catalog.versions, preserveVersion)} onClick={() => void submit("delete")}>Endgültig löschen und neu aufsetzen …</button>
              </div>
            </div>
          ) : (
            <article className="setup-card">
              <ShieldWarning size={20} />
              <div><b>Kein vorhandener Child-Server erkannt</b><p>Lege zunächst die Serverkonfiguration fest. Der Child-Ordner wird erst beim Start verwendet.</p></div>
            </article>
          )}

          <div className="setup-card-list">
            <h3>Server einrichten</h3>
            <label>Serverordner<input value={directory} onChange={(event) => setDirectory(event.target.value)} /></label>
            <div className="setup-form-grid">
              <label>Servertyp<select value={type} onChange={(event) => { setType(event.target.value); setMcVersion(""); }}>
                {["vanilla", "fabric", "paper", "spigot", "custom"].map((value) => <option key={value}>{value}</option>)}
              </select></label>
              <VersionSelect type={type} value={mcVersion} onChange={setMcVersion} preserve={preserveVersion} catalog={catalog} />
              <label>Spielport<input type="number" min="1" max="65535" value={port} onChange={(event) => setPort(event.target.value)} /></label>
            </div>
            <button className="btn pri" disabled={busy || !directory || !versionIsValid(type, mcVersion, catalog.versions, false) || !Number(port)} onClick={() => void submit("new")}>Konfiguration speichern</button>
          </div>
          <div className="setup-card-list">
            <h3>ntfy-Benachrichtigungen (optional)</h3>
            <label className="setup-checkbox">
              <input type="checkbox" checked={ntfy.enabled} onChange={(event) => setNtfy({ ...ntfy, enabled: event.target.checked })} />
              Benachrichtigungen aktivieren
            </label>
            <div className="setup-form-grid">
              <label>ntfy-Server-URL<input value={ntfy.server} onChange={(event) => setNtfy({ ...ntfy, server: event.target.value })} /></label>
              <label>Thema<input value={ntfy.topic} onChange={(event) => setNtfy({ ...ntfy, topic: event.target.value })} /></label>
            </div>
            <p className="muted">Zugangstoken bleiben außerhalb der config.yml in der lokalen secrets.yml gespeichert.</p>
          </div>
        </>
      )}

      {host && host.firstSetupStatus !== "done" && host.firstSetupStatus !== "" && <div className="setup-card-list">
        <h3>Einmalige Host-Grundeinrichtung</h3>
        <p>Bei einer Neuinstallation automatisch beim ersten Start. Bei einem Upgrade wird aus Sicherheitsgründen nichts automatisch verändert; du kannst die aggressive Grundeinrichtung hier ausdrücklich bestätigen. Sie entfernt alle erkannten äußeren Minecraft-Welten und richtet eine Void-Lobby ein. Andere Plugin-JARs werden in-place umbenannt (Endung .disabled), damit sie nicht geladen werden; ihre Dateien und Konfigurationen bleiben erhalten. Child-Server, ServerHoster-Konfiguration, Dashboard-Passwort und Backups bleiben erhalten. Nach der Vorbereitung fährt der Host herunter und muss im Hosting-Panel gestartet werden. Erst nach dem Laden der neuen Lobby werden alte Welten unwiderruflich gelöscht.</p>
        <p>Status: {host?.firstSetupStatus ?? "unbekannt"}{host?.firstSetupWorld ? ` · Void-Welt ${host.firstSetupWorld}` : ""}{Number(host?.firstSetupDisabledPluginCount ?? 0) > 0 ? ` · deaktivierte Zusatz-Plugins: ${host?.firstSetupDisabledPluginCount}` : ""}</p>
        {host?.firstSetupStatus === "manual-required" && (
          <div className="setup-actions">
            <button className="btn" disabled={busy} type="button" onClick={() => void runHostFirstSetup(host.firstSetupConfirmation || "HOST GRUNDSETUP")}>Host-Grundeinrichtung starten …</button>
          </div>
        )}
        {host?.firstSetupStatus === "restart-required" && <p>Die Einrichtung ist vorbereitet. Bitte den äußeren Host im Hosting-Panel neu starten.</p>}
      </div>}

      <div className="setup-card-list">
        <h3>Host minimieren</h3>
        <p>Wendet die laufenden Host-Optimierungen an, ohne Welten auszuwählen, neu anzulegen oder zu löschen. Sicht- und Simulationsdistanz, Spawns, Nether/End und Host-Whitelist werden minimiert. Child-Server, Welten, Plugin-Dateien, Logs und Backups bleiben erhalten. Port, Online-Mode und ein ausgeschaltetes RCON bleiben unverändert; -Xmx wird nicht gesenkt. Die Whitelist des Childs bleibt unverändert.</p>
        <p>Status: {host?.status ?? "unbekannt"}{host?.restartRequired ? " · äußerer Neustart im Panel nötig" : ""}{host?.worldName ? ` · Host-Welt ${host.worldName}` : ""}</p>
        <ul>{(host?.notes ?? []).map((note) => <li key={note}>{note}</li>)}</ul>
        {host?.heap && host.heap.length > 0 && <p className="muted">{host.heap.map((flag) => `${flag.name}: ${flag.detail}`).join(" · ")}</p>}
        {host?.message && <p>{host.message}</p>}
        <div className="setup-actions">
          <button className="btn" disabled={busy} type="button" onClick={() => void hostAction("apply", host?.confirmation || "HOST MINIMIEREN")}>Minimierung vorbereiten …</button>
          <button className="btn" disabled={busy || host?.status === "inactive"} type="button" onClick={() => void hostAction("rollback", host?.rollbackConfirmation || "HOST ZURUECK")}>Dateien zurückholen …</button>
        </div>
      </div>
    </section>
  );
}
