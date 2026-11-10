[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.restore]] › [[HostMinimize.restore.Z203.Teil2]]

# HostMinimize.restore.Z203.Teil2

```mermaid
flowchart TD
  n1["try Z.211"]
  n2["Schritt Z.212 Files.move(temporary, target, StandardCopyOption.…"]
  n3["catch Z.213 (AtomicMoveNotSupportedExcept…"]
  n4["Schritt Z.214 Files.move(temporary, target, StandardCopyOption.…"]
  n5["finally Z.211"]
  n6["Schritt Z.216 Files.deleteIfExists(temporary);"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n3 --> n4
  n2 --> n5
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMinimize.restore.Z203`, Quellreihenfolge.
