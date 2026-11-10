[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.apply(Path,Path,Path,Path,List)]] › [[HostFirstSetup.apply(Path,Path,Path,Path,List).Teil2]]

# HostFirstSetup.apply(Path,Path,Path,Path,List).Teil2

```mermaid
flowchart TD
  n1["if Z.74 (Files.isSymbolicLink(properties) // !Files.isReg…"]
  n2["throw Z.76 throw new IOException('server.properties must exi…"]
  n3["if Z.80 (dataDirectory == null // Files.isSymbolicLink(da…"]
  n4["throw Z.83 throw new SecurityException('host setup marker mu…"]
  n5["HostFirstSetup.otherPluginJars"]:::internal-link
  n6["HostFirstSetup.parseCount"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.74 (Files.isSymbolicLink(properties) // !Files.isReg…
  Zeile 74: prüft `(Files.isSymbolicLink(properties) // !Files.isReg…`.
throw Z.76 throw new IOException('server.properties must exi…
  Zeile 76: Abbruch `throw new IOException('server.properties must exi…`.
if Z.80 (dataDirectory == null // Files.isSymbolicLink(da…
  Zeile 80: prüft `(dataDirectory == null // Files.isSymbolicLink(da…`.
throw Z.83 throw new SecurityException('host setup marker mu…
  Zeile 83: Abbruch `throw new SecurityException('host setup marker mu…`.
HostFirstSetup.otherPluginJars
  `otherPluginJars` in `HostFirstSetup.java`.
HostFirstSetup.parseCount
  Wertet aus `parseCount`.
```

- Fortsetzung von `HostFirstSetup.apply(Path,Path,Path,Path,List)`, Quellreihenfolge.
