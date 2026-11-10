[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[HostMemoryProbe]] › [[HostMemoryProbe.meminfo]] › [[HostMemoryProbe.meminfo.Z49]]

# HostMemoryProbe.meminfo.Z49

```mermaid
flowchart TD
  n1["try Z.49"]
  n2["HostMemoryProbe.meminfo.Z49.Z50"]:::internal-link
  n3["catch Z.59 (IOException ignored)"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.49
  Zeile 49: Versuch. Der Fehlerpfad geht in catch.
HostMemoryProbe.meminfo.Z49.Z50
  Fortsetzung des Ablaufs ab Zeile 50.
catch Z.59 (IOException ignored)
  Zeile 59: fängt (IOException ignored).
```

- Fortsetzung von `HostMemoryProbe.meminfo`, Quellreihenfolge.
