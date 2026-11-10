[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[VersionCatalog]] › [[VersionCatalog.fetch]] › [[VersionCatalog.fetch.Z68.Teil1]]

# VersionCatalog.fetch.Z68.Teil1

```mermaid
flowchart TD
  n1["VersionCatalog.vanilla"]:::internal-link
  n2["Upstream.getJson"]:::internal-link
  n3["VersionCatalog.fabric"]:::internal-link
  n4["Upstream.getJson"]:::internal-link
  n5["VersionCatalog.paper"]:::internal-link
  n6["Upstream.getJson"]:::internal-link
  n7["VersionCatalog.spigot"]:::internal-link
  n8["Upstream.getText"]:::internal-link
  n1 -->|"Z.69"| n2
  n3 -->|"Z.70"| n4
  n2 --> n3
  n5 -->|"Z.71"| n6
  n4 --> n5
  n7 -->|"Z.72"| n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `VersionCatalog.fetch.Z68`, Quellreihenfolge.
