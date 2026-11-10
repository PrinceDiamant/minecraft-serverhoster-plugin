[[00 Start]] › [[Server-Anlage]] › [[Profile]] › [[Profiles]] › [[Profiles.load]] › [[Profiles.load.Teil2]]

# Profiles.load.Teil2

```mermaid
flowchart TD
  n1["for Z.72 (String id : serverIds(flat))"]
  n2["Profiles.serverIds"]:::internal-link
  n3["if Z.73 (id.isBlank())"]
  n4["ProfileMerge.inherit"]:::internal-link
  n5["Profiles.one"]:::internal-link
  n6["return Z.76 return List.copyOf(out.values());"]
  n1 -->|"Z.72"| n2
  n4 -->|"Z.74"| n5
  n3 --> n4
  n3 --> n4
  n2 -->|"wiederholen"| n3
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n5 fill:#f88,stroke:#900
```

- Fortsetzung von `Profiles.load`, Quellreihenfolge.
