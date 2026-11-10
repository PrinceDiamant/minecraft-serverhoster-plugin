[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case146]]

# Dashboard.handle.Z103.Teil7.Z141.Case146

```mermaid
flowchart TD
  n1["Dashboard.body"]:::internal-link
  n2["if Z.148 (c.isEmpty())"]
  n3["Dashboard.json"]:::internal-link
  n4["return Z.148 return;"]
  n5["FabricLauncherPlugin.console(String)"]:::internal-link
  n6["ConsoleBuffer.add"]:::internal-link
  n7["Dashboard.json"]:::internal-link
  n8["FabricLauncherPlugin.sendCommand(String,String)"]:::internal-link
  n3 --> n4
  n2 -->|"ja"| n3
  n1 --> n2
  n5 -->|"Z.149"| n6
  n4 --> n5
  n2 --> n5
  n7 -->|"Z.150"| n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`, Quellreihenfolge.
