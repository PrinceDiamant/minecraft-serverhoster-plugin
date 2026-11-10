[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil2]] › [[HostFirstSetup.decodeWorldNames]] › [[HostFirstSetup.decodeWorldNames.Z178]]

# HostFirstSetup.decodeWorldNames.Z178

```mermaid
flowchart TD
  n1["try Z.178"]
  n2["for Z.179 (String part : encoded.split(','))"]
  n3["if Z.181 (!safeWorldName(name))"]
  n4["HostFirstSetup.safeWorldName"]:::internal-link
  n5["throw Z.181 throw new IOException('Invalid previous host worl…"]
  n6["catch Z.184 (IllegalArgumentException e)"]
  n7["throw Z.185 throw new IOException('Invalid encoded host world…"]
  n3 -->|"Z.181"| n4
  n4 -->|"ja"| n5
  n2 -->|"wiederholen"| n3
  n1 --> n2
  n1 -->|"Fehler"| n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostFirstSetup.decodeWorldNames`, Quellreihenfolge.
