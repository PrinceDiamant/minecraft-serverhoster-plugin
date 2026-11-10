[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.configureSetup]] › [[FabricLauncherPlugin.configureSetup.Teil3.Z580]]

# FabricLauncherPlugin.configureSetup.Teil3.Z580

```mermaid
flowchart TD
  n1["try Z.580"]
  n2["FabricLauncherPlugin.saveSetupConfigAtomically"]:::internal-link
  n3["catch Z.582 (IOException / RuntimeExcepti…"]
  n4["if Z.583 (rollbackSource != null && Files.exists(rollbackS…"]
  n5["try Z.585"]
  n6["Schritt Z.586 Files.move(rollbackSource, rollbackTarget);"]
  n7["catch Z.587 (IOException rollbackError)"]
  n8["FabricLauncherPlugin.reloadProfiles"]:::internal-link
  n9["throw Z.594 throw e;"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n5 --> n6
  n5 -->|"Fehler"| n7
  n4 -->|"ja"| n5
  n6 --> n8
  n7 --> n8
  n4 --> n8
  n8 --> n9
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n8 fill:#f88,stroke:#900
```

- Fortsetzung von `FabricLauncherPlugin.configureSetup.Teil3`, Quellreihenfolge.
