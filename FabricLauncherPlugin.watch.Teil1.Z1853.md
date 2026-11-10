[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.watch]] › [[FabricLauncherPlugin.watch.Teil1.Z1853]]

# FabricLauncherPlugin.watch.Teil1.Z1853

```mermaid
flowchart TD
  n1["try Z.1853"]
  n2["catch Z.1856 (InterruptedException e)"]
  n3["FabricLauncherPlugin.watch.Teil1.Z1853.Z1858"]:::internal-link
  n4["if Z.1872 (!exited)"]
  n5["return Z.1872 return;"]
  n6["finally Z.1853"]
  n7["if Z.1874 (slot.watchGeneration.get() == generation)"]
  n1 -->|"Fehler"| n2
  n4 -->|"ja"| n5
  n3 --> n4
  n2 --> n3
  n1 --> n6
  n5 --> n6
  n4 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.watch.Teil1`, Quellreihenfolge.
