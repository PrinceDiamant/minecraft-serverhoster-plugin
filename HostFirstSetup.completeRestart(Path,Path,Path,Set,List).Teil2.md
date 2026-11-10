[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.completeRestart(Path,Path,Path,Set,List)]] › [[HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil2]]

# HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil2

```mermaid
flowchart TD
  n1["if Z.128 (!HostMinimize.lobbyNameSafe(lobby) // Files.isSy…"]
  n2["HostMinimize.lobbyNameSafe"]:::internal-link
  n3["HostFirstSetup.readLevelNames"]:::internal-link
  n4["throw Z.131 throw new IOException('Prepared lobby is not the …"]
  n5["try Z.133"]
  n6["for Z.136 (var entry : HostMinimize.firstSetupPro…"]
  n7["HostMinimize.firstSetupProperties"]:::internal-link
  n8["if Z.137 (!entry.getValue().equals(actual.getProperty(entr…"]
  n9["throw Z.138 throw new IOException('Prepared lobby property ' …"]
  n1 -->|"Z.128"| n2
  n2 -->|"Z.130"| n3
  n3 -->|"ja"| n4
  n4 --> n5
  n3 --> n5
  n6 -->|"Z.136"| n7
  n8 -->|"ja"| n9
  n7 -->|"wiederholen"| n8
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostFirstSetup.completeRestart(Path,Path,Path,Set,List)`, Quellreihenfolge.
