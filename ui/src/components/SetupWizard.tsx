import { useState } from "react";
import { dashboardRequest, jsonBody } from "../lib/hostApi";

export interface SetupCandidate {
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

export interface SetupState {
  required: boolean;
  legacyDataFound: boolean;
  completed: boolean;
  candidates: SetupCandidate[];
  cleanupAvailable: boolean;
  legacyJars: string[];
  ntfy: { enabled: boolean; server: string; topic: string };
}

type Action = "new" | "attach" | "import" | "reset" | "delete";

export interface SetupHostState {
  status: string;
  firstSetupStatus: string;
  firstSetupConfirmation: string;
  confirmation: string;
}

const descriptions: Record<Action, string> = {
  new: "Einen neuen Child-Server in einem eigenen Ordner einrichten.",
  attach: "Einen erkannten Server weiterverwenden. Seine Dateien bleiben erhalten.",
  import: "Einstellungen aus einer unterstützten FabricLauncher-Installation übernehmen.",
  reset: "Den vorhandenen Serverordner archivieren und am gleichen Ort neu beginnen.",
  delete: "Den vorhandenen Serverordner und seine Welten endgültig löschen und neu beginnen.",
};

export default function SetupWizard({ state, host, onComplete }: {
  state: SetupState;
  host: SetupHostState | null;
  onComplete: () => Promise<boolean>;
}) {
  const [step, setStep] = useState(0);
  const [action, setAction] = useState<Action>("new");
  const [selected, setSelected] = useState("");
  const [directory, setDirectory] = useState("./child-server");
  const [type, setType] = useState("vanilla");
  const [mcVersion, setMcVersion] = useState("26.3");
  const [port, setPort] = useState("2063");
  const [ntfy, setNtfy] = useState(state.ntfy);
  const [minimize, setMinimize] = useState(false);
  const [busy, setBusy] = useState(false);
  const [error, setError] = useState("");
  const availableCandidates = action === "import"
    ? state.candidates.filter((candidate) => candidate.legacyConfigured)
    : state.candidates;
  const candidate = availableCandidates.find((item) => item.path === selected);
  const path = action === "new" ? directory.trim() : selected;
  const labels = ["Ausgangslage", "Server", "Benachrichtigungen", "Host", "Prüfen"];
  const actionLabels: Record<Action, string> = {
    new: "Neuen Server erstellen",
    attach: "Vorhandenen Server einbinden",
    import: "Alte Konfiguration übernehmen",
    reset: "Vorhandenen Server archivieren und neu starten",
    delete: "Vorhandenen Server endgültig löschen",
  };

  const chooseAction = (value: Action) => {
    setAction(value);
    setSelected("");
    setError("");
  };

  const chooseCandidate = (value: string) => {
    setSelected(value);
    const chosen = availableCandidates.find((item) => item.path === value);
    if (chosen?.configured) {
      setType(chosen.type);
      setMcVersion(chosen.mcVersion);
      setPort(String(chosen.port));
    }
  };

  const next = () => {
    setError("");
    if (step === 1) {
      if (!path) {
        setError(action === "new" ? "Bitte gib einen Serverordner an." : "Bitte wähle einen erkannten Serverordner.");
        return;
      }
      if (!mcVersion.trim() || !Number.isInteger(Number(port)) || Number(port) < 1 || Number(port) > 65535) {
        setError("Bitte gib eine Minecraft-Version und einen gültigen Spielport von 1 bis 65535 an.");
        return;
      }
    }
    if (step === 2 && ntfy.enabled && (!ntfy.server.trim() || !ntfy.topic.trim())) {
      setError("Bitte gib den ntfy-Server und ein Thema an oder deaktiviere die Benachrichtigungen.");
      return;
    }
    setStep((current) => current + 1);
  };

  const finish = async () => {
    setBusy(true);
    setError("");
    try {
      let confirm = "";
      const name = path.split(/[\\/]/).filter(Boolean).at(-1) || path;
      if (action === "delete" || action === "reset") {
        const required = action === "delete" ? `DELETE ${name}` : `ARCHIVIEREN ${name}`;
        const typed = await window.dashboardUi?.prompt({
          title: action === "delete" ? "Server endgültig löschen?" : "Serverordner archivieren?",
          description: action === "delete"
            ? `Der gesamte Ordner ${path} einschließlich Welten und Spielerdaten wird unwiderruflich gelöscht.`
            : `Der gesamte Ordner ${path} wird archiviert. Am ursprünglichen Pfad wird ein neuer Server eingerichtet.`,
          placeholder: required,
          requiredValue: required,
          confirmLabel: action === "delete" ? "Endgültig löschen" : "Archivieren",
          destructive: true,
        });
        if (typed !== required) return;
        confirm = typed;
      } else if (action === "import" && !candidate?.legacyVersion) {
        const typed = await window.dashboardUi?.prompt({
          title: "Alte Plugin-Version bestätigen",
          description: "Die alte Version konnte nicht festgestellt werden. Importiere nur, wenn die Konfiguration aus ServerHoster 1.10.1 oder neuer stammt.",
          placeholder: "IMPORT 1.10.1+",
          requiredValue: "IMPORT 1.10.1+",
          confirmLabel: "Version bestätigen",
        });
        if (typed !== "IMPORT 1.10.1+") return;
        confirm = typed;
      }
      let minimizeConfirmation = "";
      if (minimize) {
        const required = host?.confirmation || "HOST MINIMIEREN";
        const typed = await window.dashboardUi?.prompt({
          title: "Host-Minimierung vorbereiten?",
          description: "Die Host-Einstellungen werden gesichert und minimiert. Welten, Child-Daten und Backups werden nicht gelöscht. Anschließend ist ein Host-Neustart im Panel nötig.",
          placeholder: required,
          requiredValue: required,
          confirmLabel: "Minimierung bestätigen",
        });
        if (typed !== required) return;
        minimizeConfirmation = typed;
      }
      const result = await dashboardRequest<{ warning?: string }>("/api/setup", {
        method: "POST",
        body: jsonBody({ action, path, type, mcVersion, port: Number(port), confirm, ntfy }),
      });
      let notice = result.warning ?? "Einrichtung gespeichert. Der Child kann jetzt gestartet werden.";
      let warning = !!result.warning;
      if (minimizeConfirmation) {
        try {
          const minimized = await dashboardRequest<{ message?: string }>("/api/host-minimize", {
            method: "POST",
            body: jsonBody({ action: "apply", confirm: minimizeConfirmation }),
          });
          notice = `Einrichtung gespeichert. ${minimized.message ?? "Host-Minimierung vorbereitet; starte den Host im Panel neu."}`;
        } catch (cause) {
          warning = true;
          notice = `Einrichtung gespeichert, aber Host-Minimierung fehlgeschlagen: ${cause instanceof Error ? cause.message : String(cause)}. Du kannst sie unter Einrichtung erneut versuchen.`;
        }
      }
      if (!await onComplete()) {
        warning = true;
        notice += " Der aktuelle Einrichtungsstatus konnte nicht neu geladen werden. Bitte lade das Dashboard neu.";
      }
      window.dispatchEvent(new CustomEvent("dashboard:setup-required", { detail: false }));
      window.dashboardUi?.navigate("status");
      window.dashboardUi?.notify(notice, warning);
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : "Einrichtung fehlgeschlagen.");
    } finally {
      setBusy(false);
    }
  };

  const runFirstSetup = async () => {
    const required = host?.firstSetupConfirmation || "HOST GRUNDSETUP";
    const typed = await window.dashboardUi?.prompt({
      title: "Einmalige Host-Grundeinrichtung ausführen?",
      description: "Erkannte äußere Minecraft-Welten werden unwiderruflich gelöscht und andere Host-Plugin-JARs deaktiviert. Child-Daten, Konfiguration und Backups bleiben erhalten. Der Host fährt herunter und muss nach der Bestätigung und nach der Vorbereitung im Panel gestartet werden. Noch nicht gespeicherte Eingaben in diesem Assistenten gehen verloren.",
      placeholder: required,
      requiredValue: required,
      confirmLabel: "Host-Grundeinrichtung starten",
      destructive: true,
    });
    if (typed !== required) return;
    setBusy(true);
    setError("");
    try {
      await dashboardRequest("/api/host-first-setup", {
        method: "POST",
        body: jsonBody({ confirm: typed }),
      });
      window.dashboardUi?.notify("Der Host fährt herunter. Bitte folge den Neustart-Hinweisen im Panel.");
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : "Host-Grundeinrichtung konnte nicht gestartet werden.");
      setBusy(false);
    }
  };

  return (
    <section className="onboarding">
      <header className="onboarding-header">
        <p className="eyebrow">SERVERHOSTER · ERSTE SCHRITTE</p>
        <h1>Richten wir deinen Server ein</h1>
        <p>Wir führen dich durch die Entscheidungen, die für deine Situation nötig sind. Es wird noch kein Child gestartet.</p>
        <ol className="onboarding-progress" aria-label="Einrichtungsschritte">
          {labels.map((label, index) => <li key={label} aria-current={index === step ? "step" : undefined}><span>{index + 1}</span>{label}</li>)}
        </ol>
      </header>
      <div className="setup-card-list onboarding-panel">
        {step === 0 && <>
          <h2>Was möchtest du einrichten?</h2>
          <p>Wähle den Weg, der zu deinem Server passt.</p>
          {(["new", ...(state.candidates.length ? ["attach", "reset", "delete"] : []),
            ...(state.candidates.some((item) => item.legacyConfigured) ? ["import"] : [])] as Action[]).map((value) => (
            <label className="setup-card onboarding-choice" key={value}>
              <input type="radio" name="setup-action" checked={action === value} onChange={() => chooseAction(value)} />
              <span><strong>{actionLabels[value]}</strong><small>{descriptions[value]}</small></span>
            </label>
          ))}
          {!state.candidates.length && <p className="muted">Es wurde kein vorhandener Child-Server erkannt.</p>}
        </>}
        {step === 1 && <>
          <h2>{action === "new" ? "Neuen Server konfigurieren" : "Server auswählen"}</h2>
          <p>{descriptions[action]}</p>
          {action === "new" ? (
            <label>Serverordner<input value={directory} onChange={(event) => setDirectory(event.target.value)} /></label>
          ) : <>
            <label>Erkannter Serverordner
              <select value={selected} onChange={(event) => chooseCandidate(event.target.value)}>
                <option value="">Bitte auswählen</option>
                {availableCandidates.map((item) => <option value={item.path} key={item.path}>{item.path}</option>)}
              </select>
            </label>
            {candidate && <p className="muted">Erkannt: {candidate.contents.join(", ") || "keine Einträge"}</p>}
          </>}
          {action === "import" ? (
            <p>Typ, Version, Port und unterstützte Einstellungen werden aus der alten Konfiguration übernommen.</p>
          ) : (
            <div className="setup-form-grid">
              <label>Servertyp<select value={type} onChange={(event) => setType(event.target.value)}>
                {["vanilla", "fabric", "paper", "spigot", "custom"].map((value) => <option key={value}>{value}</option>)}
              </select></label>
              <label>Minecraft-Version<input value={mcVersion} onChange={(event) => setMcVersion(event.target.value)} /></label>
              <label>Spielport<input type="number" min="1" max="65535" value={port} onChange={(event) => setPort(event.target.value)} /></label>
            </div>
          )}
          <p className="muted">Der Spielport muss beim Hoster freigegeben sein und sich vom Host- und Dashboard-Port unterscheiden.</p>
        </>}
        {step === 2 && <>
          <h2>Benachrichtigungen</h2>
          <p>Optional kannst du Warnungen und Wiederherstellungsmeldungen über ntfy erhalten. Das lässt sich später ändern.</p>
          <label className="setup-checkbox"><input type="checkbox" checked={ntfy.enabled}
            onChange={(event) => setNtfy({ ...ntfy, enabled: event.target.checked })} /> ntfy aktivieren</label>
          {ntfy.enabled && <div className="setup-form-grid">
            <label>ntfy-Server-URL<input value={ntfy.server} onChange={(event) => setNtfy({ ...ntfy, server: event.target.value })} /></label>
            <label>Thema<input value={ntfy.topic} onChange={(event) => setNtfy({ ...ntfy, topic: event.target.value })} /></label>
          </div>}
          {ntfy.enabled && <p className="muted">Ein optionales Zugangstoken bleibt in der lokalen secrets.yml.</p>}
        </>}
        {step === 3 && <>
          <h2>Äußeren Host vorbereiten</h2>
          <p>ServerHoster läuft auf einem äußeren Spigot-Host. Dessen Einstellungen können unabhängig vom Child minimiert werden.</p>
          <label className="setup-checkbox"><input type="checkbox" checked={minimize}
            onChange={(event) => setMinimize(event.target.checked)} /> Host-Minimierung nach dem Speichern vorbereiten</label>
          <p className="muted">Die Minimierung sichert Host-Dateien, löscht keine Welten und benötigt einen anschließenden Host-Neustart im Panel. Die maximale Host-Heapgröße bleibt unverändert.</p>
          {host?.firstSetupStatus === "manual-required" && <div>
            <h3>Einmalige Grundeinrichtung für ein Upgrade</h3>
            <p>Optional: Void-Lobby vorbereiten, andere Host-Plugins deaktivieren und alte Host-Welten endgültig entfernen. Das ist nicht rückgängig zu machen. Der Host fährt herunter und muss im Panel mehrfach gestartet werden.</p>
            <button className="btn" type="button" disabled={busy} onClick={() => void runFirstSetup()}>Einmalige Grundeinrichtung starten …</button>
          </div>}
          {host?.firstSetupStatus === "restart-required" && <p>Die einmalige Grundeinrichtung wartet auf einen Host-Neustart im Panel.</p>}
        </>}
        {step === 4 && <>
          <h2>Alles prüfen</h2>
          <dl className="onboarding-summary">
            <dt>Vorhaben</dt><dd>{actionLabels[action]}</dd>
            <dt>Serverordner</dt><dd>{path}</dd>
            <dt>Server</dt><dd>{action === "import" ? "Aus alter Konfiguration" : `${type} ${mcVersion} · Port ${port}`}</dd>
            <dt>Benachrichtigungen</dt><dd>{ntfy.enabled ? `ntfy · ${ntfy.server} · ${ntfy.topic}` : "Ausgeschaltet"}</dd>
            <dt>Host-Minimierung</dt><dd>{minimize ? "Nach Bestätigung vorbereiten" : "Unverändert lassen"}</dd>
          </dl>
          <p>{descriptions[action]} Beim Speichern wird noch kein Server-JAR heruntergeladen oder Child gestartet.</p>
          <p>Die Host-Aktionen kannst du auch später unter „Einrichtung“ verwalten.</p>
        </>}
        {error && <p className="workflow-error" role="alert">{error}</p>}
        <div className="onboarding-actions">
          {step > 0 && <button className="btn" type="button" disabled={busy} onClick={() => { setError(""); setStep(step - 1); }}>Zurück</button>}
          {step < 4
            ? <button className="btn pri" type="button" disabled={busy} onClick={next}>Weiter</button>
            : <button className="btn pri" type="button" disabled={busy} onClick={() => void finish()}>{busy ? "Speichere …" : "Einrichtung abschließen"}</button>}
        </div>
      </div>
    </section>
  );
}
