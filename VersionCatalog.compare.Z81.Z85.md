[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[VersionCatalog]] › [[VersionCatalog.compare]] › [[VersionCatalog.compare.Z81.Z85]]

# VersionCatalog.compare.Z81.Z85

```mermaid
flowchart TD
  n1["if Z.85 (num(x) && num(y))"]
  n2["VersionCatalog.num"]:::internal-link
  n3["VersionCatalog.num"]:::internal-link
  n4["if Z.86 (num(y))"]
  n5["VersionCatalog.num"]:::internal-link
  n6["if Z.87 (num(x))"]
  n7["VersionCatalog.num"]:::internal-link
  n1 -->|"Z.85"| n2
  n2 -->|"Z.85"| n3
  n4 -->|"Z.86"| n5
  n6 -->|"Z.87"| n7
  n5 -->|"nein"| n6
  n3 -->|"nein"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.85 (num(x) && num(y))
  Zeile 85: prüft `(num(x) && num(y))`.
VersionCatalog.num
  `num` in `VersionCatalog.java`.
if Z.86 (num(y))
  Zeile 86: prüft `(num(y))`.
if Z.87 (num(x))
  Zeile 87: prüft `(num(x))`.
```

- Fortsetzung von `VersionCatalog.compare.Z81`, Quellreihenfolge.
