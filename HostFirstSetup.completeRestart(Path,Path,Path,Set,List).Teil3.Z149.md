[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.completeRestart(Path,Path,Path,Set,List)]] › [[HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil3.Z149]]

# HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil3.Z149

```mermaid
flowchart TD
  n1["for Z.149 (Path world : worlds)"]
  n2["if Z.151 (name.equals(lobby) // name.equals(lobby + '_neth…"]
  n3["if Z.152 (protectedPath(world, data) // protectedPath(worl…"]
  n4["HostFirstSetup.protectedPath"]:::internal-link
  n5["HostFirstSetup.protectedPath"]:::internal-link
  n6["HostFirstSetup.protectedPath"]:::internal-link
  n7["HostFirstSetup.protectedByAny"]:::internal-link
  n8["throw Z.154 throw new SecurityException('refusing to remove p…"]
  n9["if Z.155 (Files.isSymbolicLink(world) // loadedWorlds.cont…"]
  n10["throw Z.156 throw new SecurityException('refusing to remove l…"]
  n3 -->|"Z.152"| n4
  n4 -->|"Z.152"| n5
  n5 -->|"Z.152"| n6
  n6 -->|"Z.153"| n7
  n7 -->|"ja"| n8
  n2 --> n3
  n2 --> n3
  n9 -->|"ja"| n10
  n8 --> n9
  n7 --> n9
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil3`, Quellreihenfolge.
