[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[VersionCatalog]] › [[VersionCatalog.vanilla]] › [[VersionCatalog.vanilla.Z22]]

# VersionCatalog.vanilla.Z22

```mermaid
flowchart TD
  n1["for Z.22 (JsonElement e : manifest.getAsJsonArra…"]
  n2["if Z.24 ('release'.equals(str(o, 'type')))"]
  n3["VersionCatalog.str"]:::internal-link
  n4["VersionCatalog.str"]:::internal-link
  n5["if Z.25 (ids.size() )= limit)"]
  n2 -->|"Z.24"| n3
  n3 -->|"ja"| n4
  n4 --> n5
  n3 --> n5
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `VersionCatalog.vanilla`, Quellreihenfolge.
