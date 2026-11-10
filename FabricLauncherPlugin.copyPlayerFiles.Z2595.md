[[00 Start]] › [[Plugin-Kern]] › [[Properties]] › [[FabricLauncherPlugin.copyPlayerFiles]] › [[FabricLauncherPlugin.copyPlayerFiles.Z2595]]

# FabricLauncherPlugin.copyPlayerFiles.Z2595

```mermaid
flowchart TD
  n1["for Z.2595 (String n : List.of('ops.json', 'whitel…"]
  n2["try Z.2597"]
  n3["if Z.2598 (Files.exists(src) && !Files.exists(dst))"]
  n4["Schritt Z.2598 Files.copy(src, dst);"]
  n5["catch Z.2599 (IOException e)"]
  n3 -->|"ja"| n4
  n2 --> n3
  n2 -->|"Fehler"| n5
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.copyPlayerFiles`, Quellreihenfolge.
