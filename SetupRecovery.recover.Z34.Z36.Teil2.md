[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupRecovery]] › [[SetupRecovery.recover]] › [[SetupRecovery.recover.Z34.Z36.Teil2]]

# SetupRecovery.recover.Z34.Z36.Teil2

```mermaid
flowchart TD
  n1["try Z.44"]
  n2["catch Z.48 (IllegalArgumentException e)"]
  n3["if Z.52 (Files.isSymbolicLink(pending) // !Files.isDirect…"]
  n4["if Z.57 (!root.equals(original.getParent()) // original.e…"]
  n5["SetupRecovery.recover.Z34.Z36.Teil2.Z61"]:::internal-link
  n1 -->|"Fehler"| n2
  n1 --> n3
  n2 --> n3
  n3 --> n4
  n3 --> n4
  n4 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupRecovery.recover.Z34.Z36`, Quellreihenfolge.
