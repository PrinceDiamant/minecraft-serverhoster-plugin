[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupDiscovery]] › [[SetupDiscovery.scan]] › [[SetupDiscovery.scan.Teil2.Z62.Z64]]

# SetupDiscovery.scan.Teil2.Z62.Z64

```mermaid
flowchart TD
  n1["for Z.64 (Path entry : entries)"]
  n2["if Z.65 (++examined ) 2_048)"]
  n3["throw Z.65 throw new IOException('Server root exceeds the bo…"]
  n4["if Z.67 (entryName.contains('.serverhoster-delete-pending…"]
  n5["if Z.77 (isServerDirectory(path))"]
  n6["SetupDiscovery.isServerDirectory"]:::internal-link
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n5 -->|"Z.77"| n6
  n4 --> n5
  n4 --> n5
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.64 (Path entry : entries)
  Zeile 64: Schleife `(Path entry : entries)`.
if Z.65 (++examined ) 2_048)
  Zeile 65: prüft `(++examined ) 2_048)`.
throw Z.65 throw new IOException('Server root exceeds the bo…
  Zeile 65: Abbruch `throw new IOException('Server root exceeds the bo…`.
if Z.67 (entryName.contains('.serverhoster-delete-pending…
  Zeile 67: prüft `(entryName.contains('.serverhoster-delete-pending…`.
if Z.77 (isServerDirectory(path))
  Zeile 77: prüft `(isServerDirectory(path))`.
SetupDiscovery.isServerDirectory
  Prüft `isServerDirectory`. Ruft `hasServerFiles`.
```

- Fortsetzung von `SetupDiscovery.scan.Teil2.Z62`, Quellreihenfolge.
