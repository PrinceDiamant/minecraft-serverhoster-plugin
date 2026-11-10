[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil2]] › [[CoreAdminTest.pathGuardRejectsEscapeAndSymlink]] › [[CoreAdminTest.pathGuardRejectsEscapeAndSymlink.Teil2]]

# CoreAdminTest.pathGuardRejectsEscapeAndSymlink.Teil2

```mermaid
flowchart TD
  n1["try Z.246"]
  n2["Schritt Z.247 Files.createSymbolicLink(root.resolve('link'), ou…"]
  n3["PathGuard.resolve"]:::internal-link
  n4["catch Z.249 (UnsupportedOperationExceptio…"]
  n5["Schritt Z.250 assertTrue(Files.isDirectory(outside));"]
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `CoreAdminTest.pathGuardRejectsEscapeAndSymlink`, Quellreihenfolge.
