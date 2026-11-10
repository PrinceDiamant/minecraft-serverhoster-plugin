[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupRecovery]] › [[SetupRecovery.recover]] › [[SetupRecovery.recover.Z34.Z36.Teil2.Z61]]

# SetupRecovery.recover.Z34.Z36.Teil2.Z61

```mermaid
flowchart TD
  n1["if Z.61 (setupRequired)"]
  n2["if Z.62 (Files.exists(original, LinkOption.NOFOLLOW_LINKS…"]
  n3["Schritt Z.65 Files.move(pending, original);"]
  n4["if Z.68 (deleting)"]
  n5["Schritt Z.76 Files.move(pending, archive);"]
  n2 -->|"nein"| n3
  n4 -->|"nein"| n5
  n1 -->|"ja"| n2
  n1 -->|"nein"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupRecovery.recover.Z34.Z36.Teil2`, Quellreihenfolge.
