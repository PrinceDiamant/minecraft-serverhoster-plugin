[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onEnable]] › [[FabricLauncherPlugin.onEnable.Teil6]]

# FabricLauncherPlugin.onEnable.Teil6

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.refreshHostMinimize"]:::internal-link
  n2["FabricLauncherPlugin.ntfySettings"]:::internal-link
  n3["if Z.177 (ntfy.enabled() && (ntfy.topic() == null // ntfy.…"]
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.refreshHostMinimize
  Lädt neu `refreshHostMinimize`. Ruft `readHostMinimizeState`, `worldNameSafe`, `apply`.
FabricLauncherPlugin.ntfySettings
  `ntfySettings` in `FabricLauncherPlugin.java`.
if Z.177 (ntfy.enabled() && (ntfy.topic() == null // ntfy.…
  Zeile 177: prüft `(ntfy.enabled() && (ntfy.topic() == null // ntfy.…`.
```

- Fortsetzung von `FabricLauncherPlugin.onEnable`, Quellreihenfolge.
