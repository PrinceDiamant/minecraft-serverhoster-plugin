[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil3]] › [[HostFirstSetup.writeMarker(Path,String,String,int,String)]] › [[HostFirstSetup.writeMarker(Path,String,String,int,String).Teil2]]

# HostFirstSetup.writeMarker(Path,String,String,int,String).Teil2

```mermaid
flowchart TD
  n1["try Z.343"]
  n2["Schritt Z.344 Files.move(temporary, marker, StandardCopyOption.…"]
  n3["catch Z.345 (AtomicMoveNotSupportedExcept…"]
  n4["Schritt Z.346 Files.move(temporary, marker, StandardCopyOption.…"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostFirstSetup.writeMarker(Path,String,String,int,String)`, Quellreihenfolge.
