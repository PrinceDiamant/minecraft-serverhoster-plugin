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

```knoten
for Z.22 (JsonElement e : manifest.getAsJsonArra…
  Zeile 22: Schleife `(JsonElement e : manifest.getAsJsonArra…`.
if Z.24 ('release'.equals(str(o, 'type')))
  Zeile 24: prüft `('release'.equals(str(o, 'type')))`.
VersionCatalog.str
  `str` in `VersionCatalog.java`.
if Z.25 (ids.size() )= limit)
  Zeile 25: prüft `(ids.size() )= limit)`.
```

- Fortsetzung von `VersionCatalog.vanilla`, Quellreihenfolge.
