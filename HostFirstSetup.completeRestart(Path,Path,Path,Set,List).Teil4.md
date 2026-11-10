[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.completeRestart(Path,Path,Path,Set,List)]] › [[HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil4]]

# HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil4

```mermaid
flowchart TD
  n1["for Z.160 (Path world : removable)"]
  n2["HostFirstSetup.deleteTree"]:::internal-link
  n3["HostFirstSetup.writeMarker(Path,String,String,int)"]:::internal-link
  n4["HostFirstSetup.parseCount"]:::internal-link
  n5["return Z.166 return List.copyOf(removed);"]
  n1 -->|"wiederholen"| n2
  n3 -->|"Z.165"| n4
  n2 --> n3
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostFirstSetup.completeRestart(Path,Path,Path,Set,List)`, Quellreihenfolge.
