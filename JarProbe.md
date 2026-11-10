[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[JarProbe]]

# JarProbe

```mermaid
flowchart TD
  n1["JarProbe.JarProbe"]:::internal-link
  n2["JarProbe.inspect"]:::internal-link
  n3["JarProbe.view"]:::internal-link
  n4["JarProbe.text"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
JarProbe.JarProbe
  Betrifft das Jar `JarProbe`.
JarProbe.inspect
  `inspect` in `JarProbe.java`. Ruft `jarPath`, `jarName`.
JarProbe.view
  Liefert die Sicht `view`.
JarProbe.text
  Antwortet mit Text `text`.
```


