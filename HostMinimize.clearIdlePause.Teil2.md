[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.clearIdlePause]] › [[HostMinimize.clearIdlePause.Teil2]]

# HostMinimize.clearIdlePause.Teil2

```mermaid
flowchart TD
  n1["if Z.116 (updated.equals(text))"]
  n2["return Z.116 return false;"]
  n3["Schritt Z.117 Files.writeString(properties, updated);"]
  n4["return Z.118 return true;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMinimize.clearIdlePause`, Quellreihenfolge.
