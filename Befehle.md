[[00 Start]] › [[Plugin-Kern]] › [[Befehle]]

# Befehle

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.onCommand"]:::internal-link
  n2["FabricLauncherPlugin.onTabComplete"]:::internal-link
  n3["FabricLauncherPlugin.msg"]:::internal-link
  n1 -->|"Z.2403"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.onCommand
  Befehl `/child` auf dem Server-Thread.
FabricLauncherPlugin.onTabComplete
  Reagiert `onTabComplete`. Ruft `crashFiles`.
FabricLauncherPlugin.msg
  Sendet eine Chat-Zeile `msg`.
```

- `plugin.yml` Befehl `child`, Permission `serverhoster.admin` (Default op).
