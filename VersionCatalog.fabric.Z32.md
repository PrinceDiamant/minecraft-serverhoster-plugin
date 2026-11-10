[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[VersionCatalog]] › [[VersionCatalog.fabric]] › [[VersionCatalog.fabric.Z32]]

# VersionCatalog.fabric.Z32

```mermaid
flowchart TD
  n1["for Z.32 (JsonElement e : games)"]
  n2["if Z.34 (o.has('stable') && o.get('stable').getAsBoolean(…"]
  n3["VersionCatalog.str"]:::internal-link
  n4["if Z.35 (ids.size() )= limit)"]
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `VersionCatalog.fabric`, Quellreihenfolge.
