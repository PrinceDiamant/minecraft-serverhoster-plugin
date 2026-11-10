[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.apply(Path,Path,Path,Path,List)]] › [[HostFirstSetup.apply(Path,Path,Path,Path,List).Teil3]]

# HostFirstSetup.apply(Path,Path,Path,Path,List).Teil3

```mermaid
flowchart TD
  n1["HostFirstSetup.decodeWorldNames"]:::internal-link
  n2["HostFirstSetup.readLevelNames"]:::internal-link
  n3["if Z.91 (!'preparing'.equals(previousStatus))"]
  n4["HostMinimize.newLobbyName(Path)"]:::internal-link
  n5["if Z.92 (!HostMinimize.lobbyNameSafe(worldName))"]
  n6["HostMinimize.lobbyNameSafe"]:::internal-link
  n7["throw Z.92 throw new IOException('Invalid prepared lobby nam…"]
  n8["HostFirstSetup.worldDirectories"]:::internal-link
  n1 -->|"Z.89"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n5 -->|"Z.92"| n6
  n6 -->|"ja"| n7
  n4 --> n5
  n3 --> n5
  n7 --> n8
  n6 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostFirstSetup.apply(Path,Path,Path,Path,List)`, Quellreihenfolge.
