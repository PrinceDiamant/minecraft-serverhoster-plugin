import { useEffect, useState } from "react";
import { dashboardRequest } from "../lib/hostApi";

type Catalog = { type: string; versions: string[]; error: string };

export function useVersionCatalog(type: string, enabled: boolean) {
  const [catalog, setCatalog] = useState<Catalog | null>(null);
  const [attempt, setAttempt] = useState(0);

  useEffect(() => {
    if (!enabled || type === "custom") return;
    const controller = new AbortController();
    setCatalog(null);
    dashboardRequest<{ type: string; versions: string[] }>(
      `/api/versions?type=${encodeURIComponent(type)}`,
      { signal: controller.signal },
    ).then((result) => {
      if (controller.signal.aborted) return;
      if (result.type !== type || !Array.isArray(result.versions) ||
          !result.versions.every((version) => typeof version === "string" && version.length > 0)) {
        throw new Error("Ungültige Versionsliste vom Server.");
      }
      setCatalog({ type, versions: [...new Set(result.versions)], error: "" });
    }).catch((cause: unknown) => {
      if (!controller.signal.aborted) {
        setCatalog({ type, versions: [], error: cause instanceof Error ? cause.message : String(cause) });
      }
    });
    return () => controller.abort();
  }, [type, enabled, attempt]);

  const current = enabled && catalog?.type === type ? catalog : null;
  return {
    versions: current?.versions ?? [],
    loading: enabled && type !== "custom" && !current,
    error: current?.error || (current && !current.versions.length ? "Keine Versionen verfügbar." : ""),
    retry: () => { setCatalog(null); setAttempt((value) => value + 1); },
  };
}

export function versionIsValid(type: string, version: string, versions: string[], preserve: boolean) {
  return type === "custom" ? !!version.trim() : versions.includes(version) || (preserve && !!version);
}

export default function VersionSelect({ type, value, onChange, preserve, catalog }: {
  type: string;
  value: string;
  onChange: (value: string) => void;
  preserve: boolean;
  catalog: ReturnType<typeof useVersionCatalog>;
}) {
  useEffect(() => {
    if (type !== "custom" && !catalog.loading && !catalog.error &&
        !catalog.versions.includes(value) && !preserve) {
      onChange(catalog.versions[0] ?? "");
    }
  }, [type, value, onChange, preserve, catalog.loading, catalog.error, catalog.versions]);

  if (type === "custom") {
    return <label>Minecraft-Version<input value={value} onChange={(event) => onChange(event.target.value)} />
      <small>Für eigene JARs ist keine Versionsliste verfügbar.</small>
    </label>;
  }
  const existing = preserve && value && !catalog.versions.includes(value);
  return <div>
    <label>Minecraft-Version
      <select value={existing ? value : catalog.versions.includes(value) ? value : ""}
        onChange={(event) => onChange(event.target.value)} disabled={catalog.loading || (!catalog.versions.length && !existing)}>
        {!existing && !catalog.versions.includes(value) && <option value="">{catalog.loading ? "Versionen werden geladen …" : "Bitte Version auswählen"}</option>}
        {existing && <option value={value}>{value} (bereits konfiguriert)</option>}
        {catalog.versions.map((version) => <option value={version} key={version}>{version}</option>)}
      </select>
    </label>
    {catalog.error && <p className="workflow-error" role="alert">Versionen konnten nicht geladen werden: {catalog.error} <button type="button" className="btn" onClick={catalog.retry}>Erneut versuchen</button></p>}
  </div>;
}
