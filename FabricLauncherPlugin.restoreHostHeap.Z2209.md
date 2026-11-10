[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]] › [[FabricLauncherPlugin.restoreHostHeap]] › [[FabricLauncherPlugin.restoreHostHeap.Z2209]]

# FabricLauncherPlugin.restoreHostHeap.Z2209

```mermaid
flowchart TD
  n1["for Z.2209 (String part : encoded.split(';'))"]
  n2["if Z.2211 (colon (= 0)"]
  n3["try Z.2214"]
  n4["if Z.2215 (options.manageable(name))"]
  n5["catch Z.2216 (Exception e)"]
  n3 --> n4
  n3 -->|"Fehler"| n5
  n2 --> n3
  n2 --> n3
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.restoreHostHeap`, Quellreihenfolge.
