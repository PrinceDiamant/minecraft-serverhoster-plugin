import { useCallback, useEffect, useRef, useState } from "react";
import { ArrowClockwise, Check, FolderOpen, HardDrives, ShieldWarning } from "@phosphor-icons/react";
import { dashboardRequest, jsonBody } from "../lib/hostApi";

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

interface CleanSetupState {
  armed: boolean;
  confirmation: string;
  delete: string[];
  keep: string[];
  notes: string[];
  message?: string;
  identity: string;
}

interface HostMinimizeState {
  status: string;
  restartRequired: boolean;
  lobbyName: string;
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
  const [mcVersion, setMcVersion] = useState("26.3");
  const [port, setPort] = useState("2063");
  const [ntfy, setNtfy] = useState({ enabled: false, server: "https://ntfy.sh", topic: "" });
  const [busy, setBusy] = useState(false);
  const [error, setError] = useState("");
  const [host, setHost] = useState<HostMinimizeState | null>(null);
  const [clean, setClean] = useState<CleanSetupState | null>(null);
  const initialized = useRef(false);
  const ntfyInitialized = useRef(false);

  const refresh = useCallback(async () => {
    setError("");
    try {
      const result = await dashboardRequest<SetupState>("/api/setup");
      setState(result);
      try {
        setHost(await dashboardRequest<HostMinimizeState>("/api/host-minimize"));
      } catch {
        setHost(null);
      }
      try {
        setClean(await dashboardRequest<CleanSetupState>("/api/clean-setup"));
      } catch {
        setClean(null);
      }
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
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : "Einrichtungsstatus konnte nicht geladen werden.");
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
      let confirm = "";
      if (action === "reset") {
        const candidateName = path.split(/[\\/]/).filter(Boolean).at(-1) || path;
        const contents = state?.candidates.find((candidate) => candidate.path === path)?.contents ?? [];
        const typed = await window.dashboardUi?.prompt({
          title: "Vorhandenen Child-Ordner neu aufsetzen?",
          description: `Dieser Ordner wird verschoben und als Sicherung archiviert: ${path}\nEnthalten sind u.a.: ${contents.join(", ") || "keine Einträge erkannt"}. Zum Bestätigen „ARCHIVIEREN ${candidateName}“ exakt eingeben.`,
          placeholder: `ARCHIVIEREN ${candidateName}`,
          requiredValue: `ARCHIVIEREN ${candidateName}`,
          confirmLabel: "Ordner archivieren",
          destructive: true,
        });
        if (typed !== `ARCHIVIEREN ${candidateName}`) return;
        confirm = typed;
      } else if (action === "delete") {
        const candidateName = path.split(/[\\/]/).filter(Boolean).at(-1) || path;
        const contents = state?.candidates.find((candidate) => candidate.path === path)?.contents ?? [];
        const typed = await window.dashboardUi?.prompt({
          title: "Child-Ordner endgültig löschen?",
          description: `ACHTUNG: Der gesamte Child-Ordner wird unwiderruflich gelöscht: ${path}\nDazu gehören Welten und alle darin enthaltenen Dateien. Erkannter Inhalt: ${contents.join(", ") || "keine Einträge erkannt"}. Server-Root und externe Verzeichnisse werden nicht gelöscht. Zum Bestätigen „DELETE ${candidateName}“ exakt eingeben.`,
          placeholder: `DELETE ${candidateName}`,
          requiredValue: `DELETE ${candidateName}`,
          confirmLabel: "Child endgültig löschen",
          destructive: true,
        });
        if (typed !== `DELETE ${candidateName}`) return;
        confirm = typed;
      } else if (action === "import" && !state?.candidates.find((candidate) => candidate.path === path)?.legacyVersion) {
        const typed = await window.dashboardUi?.prompt({
          title: "Plugin-Version ist nicht feststellbar",
          description: "Die Plugin-JAR fehlt oder enthält keine lesbare Versionsangabe. Importiere nur, wenn die alte Konfiguration sicher aus ServerHoster 1.10.1 oder neuer stammt.",
          placeholder: "IMPORT 1.10.1+",
          requiredValue: "IMPORT 1.10.1+",
          confirmLabel: "Version bestätigen",
        });
        if (typed !== "IMPORT 1.10.1+") return;
        confirm = typed;
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
    const typed = await window.dashboardUi?.prompt({
      title: "Alte FabricLauncher-Dateien löschen?",
      description: `Entfernt alte Plugin-Einstellungen, Secrets und erkannte FabricLauncher-JARs (${state?.legacyJars.join(", ") || "keine JARs"}). Child-Ordner und Welten bleiben unberührt; lokale Backups und Speicher-Notfallberichte werden ausdrücklich erhalten.`,
      placeholder: "DELETE FABRICLAUNCHER",
      requiredValue: "DELETE FABRICLAUNCHER",
      confirmLabel: "Alte Dateien löschen",
      destructive: true,
    });
    if (typed !== "DELETE FABRICLAUNCHER") return;
    setBusy(true);
    setError("");
    try {
      await dashboardRequest("/api/setup/cleanup", {
        method: "POST",
        body: jsonBody({ confirm: typed }),
      });
      await refresh();
      window.dashboardUi?.notify("Alte FabricLauncher-Dateien bereinigt; lokale Backups und Notfallberichte bleiben erhalten.");
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : "Alte Dateien konnten nicht gelöscht werden.");
    } finally {
      setBusy(false);
    }
  };

  const cleanPreview = async () => {
    setBusy(true);
    try {
      const result = await dashboardRequest<CleanSetupState>("/api/clean-setup", {
        method: "POST",
        body: jsonBody({ action: "preview" }),
      });
      setClean(result);
      window.dashboardUi?.notify(result.message ?? "Löschliste erzeugt.", false);
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : "Clean-Vorschau fehlgeschlagen.");
    } finally {
      setBusy(false);
    }
  };

  const cleanApply = async () => {
    const required = clean?.confirmation ?? "";
    if (!required) return;
    const typed = await window.dashboardUi?.prompt({
      title: "Serverordner wirklich vollständig leeren?",
      description: "Das ist keine Minimierung. Die angezeigte Liste wird gelöscht, inklusive Child, Konfiguration, Passwort und lokalen Backups. Es gibt keine Rücknahme und keine versteckte Kopie. Der äußere Server fährt danach herunter.",
      placeholder: required,
      requiredValue: required,
      confirmLabel: "Endgültig löschen",
      destructive: true,
    });
    if (typed !== required) return;
    setBusy(true);
    try {
      const result = await dashboardRequest<CleanSetupState>("/api/clean-setup", {
        method: "POST",
        body: jsonBody({ action: "apply", confirm: typed }),
      });
      setClean(result);
      window.dashboardUi?.notify(result.message ?? "Clean-Setup gestartet.", false);
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : "Clean-Setup fehlgeschlagen.");
    } finally {
      setBusy(false);
    }
  };

  const hostAction = async (action: "apply" | "rollback", required: string) => {
    const typed = await window.dashboardUi?.prompt({
      title: action === "apply" ? "Äußeren Spigot verkleinern?" : "Host-Dateien zurückholen?",
      description: action === "apply"
        ? "Ein laufender Child wird zuerst sauber gestoppt. Bestehende Welten, Plugins, Logs und Backups werden nicht gelöscht. Danach musst du den äußeren Spigot selbst im Panel neu starten."
        : "Die gesicherten server.properties, bukkit.yml und spigot.yml werden zurückgeschrieben. Welten werden nicht gelöscht.",
      placeholder: required,
      requiredValue: required,
      confirmLabel: action === "apply" ? "Minimierung vorbereiten" : "Zurückholen",
      destructive: true,
    });
    if (typed !== required) return;
    setBusy(true);
    try {
      const result = await dashboardRequest<HostMinimizeState>("/api/host-minimize", {
        method: "POST",
        body: jsonBody({ action, confirm: typed }),
      });
      setHost(result);
      window.dashboardUi?.notify(result.message ?? "Gespeichert.", false);
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : "Host-Aktion fehlgeschlagen.");
    } finally {
      setBusy(false);
    }
  };

  if (!state && !error) return <section className="setup-workflow"><p>Einrichtung wird geladen …</p></section>;

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
                <button className="btn pri" disabled={busy || !selected} onClick={() => void submit("attach")}>Vorhandenen Ordner einbinden</button>
                <button className="btn" disabled={busy || !selected} onClick={() => void submit("reset")}>Neu aufsetzen …</button>
                <button className="btn danger-outline" disabled={busy || !selected} onClick={() => void submit("delete")}>Endgültig löschen und neu aufsetzen …</button>
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
              <label>Servertyp<select value={type} onChange={(event) => setType(event.target.value)}>
                {["vanilla", "fabric", "paper", "spigot", "custom"].map((value) => <option key={value}>{value}</option>)}
              </select></label>
              <label>Minecraft-Version<input value={mcVersion} onChange={(event) => setMcVersion(event.target.value)} /></label>
              <label>Spielport<input type="number" min="1" max="65535" value={port} onChange={(event) => setPort(event.target.value)} /></label>
            </div>
            <button className="btn pri" disabled={busy || !directory || !mcVersion || !Number(port)} onClick={() => void submit("new")}>Konfiguration speichern</button>
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

      <div className="setup-card-list">
        <h3>Serverordner vollständig leeren</h3>
        <p>Eigene, ausgeschaltete Aktion. Sie startet nicht bei der Einrichtung und hat keine Rücknahme. Zuerst die Löschliste erzeugen, dann den angezeigten Satz exakt eingeben. Die schonende Minimierung darunter bleibt die Alternative.</p>
        <ul>{(clean?.notes ?? []).map((note) => <li key={note}>{note}</li>)}</ul>
        {clean && <p>Identität {clean.identity}. {clean.delete.length} Löschungen, {clean.keep.length} behaltene Pfade.{clean.confirmation ? ` Bestätigung: ${clean.confirmation}` : ""}</p>}
        {clean && clean.delete.length > 0 && <ul>{clean.delete.slice(0, 40).map((path) => <li key={path}>{path}</li>)}{clean.delete.length > 40 && <li>weitere {clean.delete.length - 40} Pfade stehen in der API-Liste</li>}</ul>}
        {clean?.message && <p>{clean.message}</p>}
        <div className="setup-actions">
          <button className="btn" disabled={busy} type="button" onClick={() => void cleanPreview()}>Löschliste erzeugen …</button>
          <button className="btn" disabled={busy || !clean?.confirmation} type="button" onClick={() => void cleanApply()}>Endgültig löschen …</button>
        </div>
      </div>

      <div className="setup-card-list">
        <h3>Äußeren Spigot verkleinern</h3>
        <p>Optional und aus. Es wird nichts automatisch gelöscht. Welten, Plugins, Logs, Backups, der Child-Ordner und dieses Plugin bleiben erhalten. Port, Online-Mode und ein ausgeschaltetes RCON bleiben unverändert. -Xmx wird nicht gesenkt. Der Child bleibt Vanilla-Survival, sofern er so eingerichtet ist, und pausiert nicht im Leerlauf. Solange die Minimierung vorbereitet oder aktiv ist, lehnt der äußere Server jeden Spielerlogin ab. Aktiv wird sie erst, wenn die leere Lobby wirklich geladen ist.</p>
        <p>Status: {host?.status ?? "unbekannt"}{host?.restartRequired ? " · äußerer Neustart im Panel nötig" : ""}{host?.lobbyName ? ` · neue leere Welt ${host.lobbyName}` : ""}</p>
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
