[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[VersionCatalog]] › [[VersionCatalog.compare]] › [[VersionCatalog.compare.Z81]]

# VersionCatalog.compare.Z81

```mermaid
flowchart TD
  n1["for Z.81 (int i = 0; i ( n; i++)"]
  n2["VersionCatalog.compare.Z81.Z85"]:::internal-link
  n3["if Z.89 (c != 0)"]
  n4["return Z.89 return c;"]
  n3 -->|"ja"| n4
  n2 --> n3
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.81 (int i = 0; i ( n; i++)
  Zeile 81: Schleife `(int i = 0; i ( n; i++)`.
VersionCatalog.compare.Z81.Z85
  Fortsetzung des Ablaufs ab Zeile 85.
if Z.89 (c != 0)
  Zeile 89: prüft `(c != 0)`.
return Z.89 return c;
  Zeile 89: Rückgabe `return c;`.
```

- Fortsetzung von `VersionCatalog.compare`, Quellreihenfolge.
