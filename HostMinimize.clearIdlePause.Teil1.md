[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.clearIdlePause]] › [[HostMinimize.clearIdlePause.Teil1]]

# HostMinimize.clearIdlePause.Teil1

```mermaid
flowchart TD
  n1["if Z.107 (properties == null // !Files.isRegularFile(prope…"]
  n2["return Z.108 return false;"]
  n3["Schritt Z.109 String text = Files.readString(properties);"]
  n4["for Z.111 (String line : text.split('/n'))"]
  n5["if Z.111 (line.startsWith('level-name='))"]
  n6["if Z.112 (!lobbyNameSafe(level))"]
  n7["HostMinimize.lobbyNameSafe"]:::internal-link
  n8["return Z.112 return false;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"wiederholen"| n5
  n3 --> n4
  n6 -->|"Z.112"| n7
  n7 -->|"ja"| n8
  n5 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMinimize.clearIdlePause`, Quellreihenfolge.
