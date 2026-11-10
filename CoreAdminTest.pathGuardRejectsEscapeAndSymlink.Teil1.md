[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil2]] › [[CoreAdminTest.pathGuardRejectsEscapeAndSymlink]] › [[CoreAdminTest.pathGuardRejectsEscapeAndSymlink.Teil1]]

# CoreAdminTest.pathGuardRejectsEscapeAndSymlink.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.240 Path root = Files.createDirectories(tmp.resolve('…"]
  n2["PathGuard.open"]:::internal-link
  n3["PathGuard.resolve"]:::internal-link
  n4["PathGuard.root"]:::internal-link
  n5["PathGuard.resolve"]:::internal-link
  n6["Schritt Z.245 Path outside = Files.createDirectories(tmp.resolv…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `CoreAdminTest.pathGuardRejectsEscapeAndSymlink`, Quellreihenfolge.
