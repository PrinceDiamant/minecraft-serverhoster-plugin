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

```knoten
for Z.70 (Path p : ancestors(dir, root))
  Zeile 70: Schleife `(Path p : ancestors(dir, root))`.
HostMemoryProbe.ancestors
  `ancestors` in `HostMemoryProbe.java`.
HostMemoryProbe.number
  `number` in `HostMemoryProbe.java`.
if Z.73 (limit ) 0 && current )= 0)
  Zeile 73: prüft `(limit ) 0 && current )= 0)`.
HostMemoryProbe.keyValues
  `keyValues` in `HostMemoryProbe.java`.
return Z.76 return new Cgroup('v2', current / MB, limit / MB,…
  Zeile 76: Rückgabe `return new Cgroup('v2', current / MB, limit / MB,…`.
```

- Fortsetzung von `HostMemoryProbe.cgroup.Z64.Z65.Z68`, Quellreihenfolge.
