[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[HostMemoryProbe]] › [[HostMemoryProbe.cgroup]] › [[HostMemoryProbe.cgroup.Z64.Z65.Z68.Z70]]

# HostMemoryProbe.cgroup.Z64.Z65.Z68.Z70

```mermaid
flowchart TD
  n1["for Z.70 (Path p : ancestors(dir, root))"]
  n2["HostMemoryProbe.ancestors"]:::internal-link
  n3["HostMemoryProbe.number"]:::internal-link
  n4["HostMemoryProbe.number"]:::internal-link
  n5["if Z.73 (limit ) 0 && current )= 0)"]
  n6["HostMemoryProbe.keyValues"]:::internal-link
  n7["HostMemoryProbe.number"]:::internal-link
  n8["return Z.76 return new Cgroup('v2', current / MB, limit / MB,…"]
  n1 -->|"Z.70"| n2
  n3 --> n4
  n6 --> n7
  n7 --> n8
  n5 -->|"ja"| n6
  n4 --> n5
  n2 -->|"wiederholen"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMemoryProbe.cgroup.Z64.Z65.Z68`, Quellreihenfolge.
