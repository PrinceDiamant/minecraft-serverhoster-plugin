[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.addProcessDiagnostics]] › [[FabricLauncherPlugin.addProcessDiagnostics.Teil1]]

# FabricLauncherPlugin.addProcessDiagnostics.Teil1

```mermaid
flowchart TD
  n1["if Z.1245 (pid (= 0)"]
  n2["return Z.1247 return;"]
  n3["ProcessProbe.snapshot"]:::internal-link
  n4["for Z.1251 (String key : List.of('rssMb', 'hwmMb',…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.addProcessDiagnostics`, Quellreihenfolge.
