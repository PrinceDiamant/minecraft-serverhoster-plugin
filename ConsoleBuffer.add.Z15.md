[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ConsoleBuffer]] › [[ConsoleBuffer.add]] › [[ConsoleBuffer.add.Z15]]

# ConsoleBuffer.add.Z15

```mermaid
flowchart TD
  n1["sync Z.15"]
  n2["while Z.17 (lines.size() ) cap)"]
  n3["for Z.18 (Consumer(String) l : listeners)"]
  n4["try Z.18"]
  n5["catch Z.18 (Exception ignored)"]
  n4 -->|"Fehler"| n5
  n3 -->|"wiederholen"| n4
  n2 --> n3
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ConsoleBuffer.add`, Quellreihenfolge.
