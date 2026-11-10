[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onEnable]] › [[FabricLauncherPlugin.onEnable.Teil5.Z162.Z165.Z167]]

# FabricLauncherPlugin.onEnable.Teil5.Z162.Z165.Z167

```mermaid
flowchart TD
  n1["if Z.167 (setupRequired)"]
  n2["if Z.169 (recoveryBlockedSince == 0)"]
  n3["for Z.170 (ServerProfile p : profiles)"]
  n4["if Z.170 (p.autoStart)"]
  n5["FabricLauncherPlugin.startAsync"]:::internal-link
  n4 -->|"ja"| n5
  n3 -->|"wiederholen"| n4
  n2 -->|"ja"| n3
  n1 -->|"nein"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.onEnable.Teil5.Z162.Z165`, Quellreihenfolge.
