[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil2]] › [[HostFirstSetup.worldDirectories]] › [[HostFirstSetup.worldDirectories.Z208]]

# HostFirstSetup.worldDirectories.Z208

```mermaid
flowchart TD
  n1["for Z.208 (String name : previousWorlds)"]
  n2["if Z.209 (!safeWorldName(name))"]
  n3["HostFirstSetup.safeWorldName"]:::internal-link
  n4["HostFirstSetup.addIfDirectory"]:::internal-link
  n5["HostFirstSetup.addIfDirectory"]:::internal-link
  n6["HostFirstSetup.addIfDirectory"]:::internal-link
  n2 -->|"Z.209"| n3
  n3 --> n4
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.208 (String name : previousWorlds)
  Zeile 208: Schleife `(String name : previousWorlds)`.
if Z.209 (!safeWorldName(name))
  Zeile 209: prüft `(!safeWorldName(name))`.
HostFirstSetup.safeWorldName
  Prüft die Pfadgrenze `safeWorldName`.
HostFirstSetup.addIfDirectory
  Fügt hinzu `addIfDirectory`. Ruft `safeWorldName`.
```

- Fortsetzung von `HostFirstSetup.worldDirectories`, Quellreihenfolge.
