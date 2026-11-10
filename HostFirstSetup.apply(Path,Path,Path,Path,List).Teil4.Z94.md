[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.apply(Path,Path,Path,Path,List)]] › [[HostFirstSetup.apply(Path,Path,Path,Path,List).Teil4.Z94]]

# HostFirstSetup.apply(Path,Path,Path,Path,List).Teil4.Z94

```mermaid
flowchart TD
  n1["for Z.94 (Path world : worlds)"]
  n2["if Z.95 (protectedPath(world, dataDirectory) // protected…"]
  n3["HostFirstSetup.protectedPath"]:::internal-link
  n4["HostFirstSetup.protectedPath"]:::internal-link
  n5["HostFirstSetup.protectedByAny"]:::internal-link
  n6["throw Z.97 throw new SecurityException('refusing to remove p…"]
  n7["if Z.98 (Files.isSymbolicLink(world))"]
  n8["throw Z.99 throw new SecurityException('refusing symbolic li…"]
  n2 -->|"Z.95"| n3
  n3 -->|"Z.95"| n4
  n4 -->|"Z.96"| n5
  n5 -->|"ja"| n6
  n7 -->|"ja"| n8
  n6 --> n7
  n5 --> n7
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.94 (Path world : worlds)
  Zeile 94: Schleife `(Path world : worlds)`.
if Z.95 (protectedPath(world, dataDirectory) // protected…
  Zeile 95: prüft `(protectedPath(world, dataDirectory) // protected…`.
HostFirstSetup.protectedPath
  `protectedPath` in `HostFirstSetup.java`.
HostFirstSetup.protectedByAny
  `protectedByAny` in `HostFirstSetup.java`. Ruft `protectedPath`.
throw Z.97 throw new SecurityException('refusing to remove p…
  Zeile 97: Abbruch `throw new SecurityException('refusing to remove p…`.
if Z.98 (Files.isSymbolicLink(world))
  Zeile 98: prüft `(Files.isSymbolicLink(world))`.
throw Z.99 throw new SecurityException('refusing symbolic li…
  Zeile 99: Abbruch `throw new SecurityException('refusing symbolic li…`.
```

- Fortsetzung von `HostFirstSetup.apply(Path,Path,Path,Path,List).Teil4`, Quellreihenfolge.
