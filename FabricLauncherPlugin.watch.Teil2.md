[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.watch]] › [[FabricLauncherPlugin.watch.Teil2]]

# FabricLauncherPlugin.watch.Teil2

```mermaid
flowchart TD
  n1["ConsoleBuffer.add"]:::internal-link
  n2["try Z.1883"]
  n3["if Z.1884 (ChildProcessRecord.deleteIfMatch(processRecord()…"]
  n4["ChildProcessRecord.deleteIfMatch"]:::internal-link
  n5["FabricLauncherPlugin.processRecord"]:::internal-link
  n6["catch Z.1886 (IOException e)"]
  n7["if Z.1889 (up )= getConfig().getLong('autoRestart.resetAfte…"]
  n3 -->|"Z.1884"| n4
  n4 -->|"Z.1884"| n5
  n2 --> n3
  n2 -->|"Fehler"| n6
  n1 --> n2
  n5 --> n7
  n5 --> n7
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.watch`, Quellreihenfolge.
