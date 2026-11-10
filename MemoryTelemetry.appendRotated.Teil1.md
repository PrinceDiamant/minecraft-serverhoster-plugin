[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[MemoryTelemetry]] › [[MemoryTelemetry.appendRotated]] › [[MemoryTelemetry.appendRotated.Teil1]]

# MemoryTelemetry.appendRotated.Teil1

```mermaid
flowchart TD
  n1["if Z.95 (Files.isSymbolicLink(file))"]
  n2["throw Z.95 throw new IOException('telemetry log must not be …"]
  n3["if Z.97 (Files.isSymbolicLink(previous))"]
  n4["throw Z.97 throw new IOException('telemetry rotation target …"]
  n5["if Z.99 (parent != null)"]
  n6["if Z.100 (Files.isSymbolicLink(parent))"]
  n7["throw Z.100 throw new IOException('telemetry directory must n…"]
  n8["Schritt Z.101 Files.createDirectories(parent);"]
  n9["if Z.103 (maxBytes ) 0 && Files.exists(file) && Files.size…"]
  n10["Schritt Z.104 Files.move(file, previous, java.nio.file.Standard…"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n6 -->|"ja"| n7
  n7 --> n8
  n6 --> n8
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n9 -->|"ja"| n10
  n8 --> n9
  n5 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `MemoryTelemetry.appendRotated`, Quellreihenfolge.
