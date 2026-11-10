[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.saveSetupConfigAtomically]] › [[FabricLauncherPlugin.saveSetupConfigAtomically.Z629]]

# FabricLauncherPlugin.saveSetupConfigAtomically.Z629

```mermaid
flowchart TD
  n1["try Z.629"]
  n2["Schritt Z.630 getConfig().save(temporary.toFile());"]
  n3["try Z.631"]
  n4["Schritt Z.632 Files.move(temporary, configFile, java.nio.file.S…"]
  n5["catch Z.634 (java.nio.file.AtomicMoveNotS…"]
  n6["Schritt Z.635 Files.move(temporary, configFile, java.nio.file.S…"]
  n7["FabricLauncherPlugin.makeWritable"]:::internal-link
  n8["finally Z.629"]
  n9["Schritt Z.639 Files.deleteIfExists(temporary);"]
  n3 --> n4
  n3 -->|"Fehler"| n5
  n5 --> n6
  n2 --> n3
  n4 --> n7
  n6 --> n7
  n1 --> n2
  n7 --> n8
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n7 fill:#f88,stroke:#900
```

- Fortsetzung von `FabricLauncherPlugin.saveSetupConfigAtomically`, Quellreihenfolge.
