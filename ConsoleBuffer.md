[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ConsoleBuffer]]

# ConsoleBuffer

```mermaid
flowchart TD
  n1["ConsoleBuffer.ConsoleBuffer"]:::internal-link
  n2["ConsoleBuffer.add"]:::internal-link
  n3["ConsoleBuffer.snapshot"]:::internal-link
  n4["ConsoleBuffer.subscribe"]:::internal-link
  n5["ConsoleBuffer.unsubscribe"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ConsoleBuffer.ConsoleBuffer
  Liefert die Konsole `ConsoleBuffer`.
ConsoleBuffer.add
  Fügt hinzu `add`.
ConsoleBuffer.snapshot
  `snapshot` in `ConsoleBuffer.java`.
ConsoleBuffer.subscribe
  Hängt einen Hörer an `subscribe`.
ConsoleBuffer.unsubscribe
  Hängt den Hörer ab `unsubscribe`.
```


