[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.configureSetup]] › [[FabricLauncherPlugin.configureSetup.Teil4.Z603]]

# FabricLauncherPlugin.configureSetup.Teil4.Z603

```mermaid
flowchart TD
  n1["if Z.603 (pendingDelete != null)"]
  n2["try Z.604"]
  n3["FabricLauncherPlugin.cleanupLegacyDirectory"]:::internal-link
  n4["catch Z.606 (IOException e)"]
  n2 --> n3
  n2 -->|"Fehler"| n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.configureSetup.Teil4`, Quellreihenfolge.
