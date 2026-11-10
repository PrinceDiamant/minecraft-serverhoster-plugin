[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onDisable]] › [[FabricLauncherPlugin.onDisable.Teil2]]

# FabricLauncherPlugin.onDisable.Teil2

```mermaid
flowchart TD
  n1["try Z.233"]
  n2["if Z.234 (shutdownHook != null)"]
  n3["Schritt Z.234 Runtime.getRuntime().removeShutdownHook(shutdownH…"]
  n4["catch Z.235 (IllegalStateException ignore…"]
  n5["if Z.236 (dashboard != null)"]
  n6["Dashboard.stop"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n5 -->|"ja"| n6
  n3 --> n5
  n2 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.onDisable`, Quellreihenfolge.
