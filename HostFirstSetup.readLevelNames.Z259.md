[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil3]] › [[HostFirstSetup.readLevelNames]] › [[HostFirstSetup.readLevelNames.Z259]]

# HostFirstSetup.readLevelNames.Z259

```mermaid
flowchart TD
  n1["for Z.259 (String line : Files.readAllLines(prope…"]
  n2["if Z.261 (!trimmed.startsWith('level-name='))"]
  n3["if Z.263 (safeWorldName(name) && !names.contains(name))"]
  n4["HostFirstSetup.safeWorldName"]:::internal-link
  n3 -->|"Z.263"| n4
  n2 --> n3
  n2 --> n3
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.259 (String line : Files.readAllLines(prope…
  Zeile 259: Schleife `(String line : Files.readAllLines(prope…`.
if Z.261 (!trimmed.startsWith('level-name='))
  Zeile 261: prüft `(!trimmed.startsWith('level-name='))`.
if Z.263 (safeWorldName(name) && !names.contains(name))
  Zeile 263: prüft `(safeWorldName(name) && !names.contains(name))`.
HostFirstSetup.safeWorldName
  Prüft die Pfadgrenze `safeWorldName`.
```

- Fortsetzung von `HostFirstSetup.readLevelNames`, Quellreihenfolge.
