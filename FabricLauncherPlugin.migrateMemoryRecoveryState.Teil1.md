[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Import]] › [[FabricLauncherPlugin.migrateMemoryRecoveryState]] › [[FabricLauncherPlugin.migrateMemoryRecoveryState.Teil1]]

# FabricLauncherPlugin.migrateMemoryRecoveryState.Teil1

```mermaid
flowchart TD
  n1["if Z.777 (!Files.exists(source, LinkOption.NOFOLLOW_LINKS))"]
  n2["return Z.777 return;"]
  n3["if Z.778 (Files.isSymbolicLink(source) // !Files.isRegular…"]
  n4["throw Z.779 throw new SecurityException('Legacy memory recove…"]
  n5["if Z.780 (Files.size(source) ) 64)"]
  n6["throw Z.780 throw new IOException('Legacy memory recovery sta…"]
  n7["Schritt Z.781 String value = Files.readString(source).trim();"]
  n8["try Z.783"]
  n9["catch Z.785 (NumberFormatException e)"]
  n10["throw Z.786 throw new IOException('Legacy memory recovery sta…"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  n5 --> n7
  n8 -->|"Fehler"| n9
  n9 --> n10
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.migrateMemoryRecoveryState`, Quellreihenfolge.
