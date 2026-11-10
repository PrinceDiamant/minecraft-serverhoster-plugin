[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Import]] › [[FabricLauncherPlugin.recoverPendingSetupDirectories]] › [[FabricLauncherPlugin.recoverPendingSetupDirectories.Z837]]

# FabricLauncherPlugin.recoverPendingSetupDirectories.Z837

```mermaid
flowchart TD
  n1["try Z.837"]
  n2["SetupRecovery.recover"]:::internal-link
  n3["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n4["FabricLauncherPlugin.cleanupLegacyDirectory"]:::internal-link
  n5["for Z.840 (SetupRecovery.Result result : recovere…"]
  n6["switch Z.841 (result.action())"]
  n7["case Z.842 RESTORED"]
  n8["case Z.843 DELETED"]
  n9["case Z.844 ARCHIVED"]
  n10["case Z.845 PRESERVED"]
  n11["catch Z.848 (IOException e)"]
  n2 -->|"Z.838"| n3
  n3 -->|"Z.839"| n4
  n6 --> n7
  n6 --> n8
  n6 --> n9
  n6 --> n10
  n5 -->|"wiederholen"| n6
  n4 --> n5
  n1 --> n2
  n1 -->|"Fehler"| n11
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.recoverPendingSetupDirectories`, Quellreihenfolge.
