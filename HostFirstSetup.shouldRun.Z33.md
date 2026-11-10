[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.shouldRun]] › [[HostFirstSetup.shouldRun.Z33]]

# HostFirstSetup.shouldRun.Z33

```mermaid
flowchart TD
  n1["if Z.33 (Files.isRegularFile(marker, LinkOption.NOFOLLOW_…"]
  n2["HostMinimize.readState"]:::internal-link
  n3["if Z.35 ('pending'.equals(status) // 'preparing'.equals(s…"]
  n4["return Z.35 return true;"]
  n5["if Z.36 ('done'.equals(status) // 'restart-required'.equa…"]
  n6["return Z.36 return false;"]
  n7["throw Z.37 throw new IOException('host setup marker has an u…"]
  n3 -->|"ja"| n4
  n2 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  n5 --> n7
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostFirstSetup.shouldRun`, Quellreihenfolge.
