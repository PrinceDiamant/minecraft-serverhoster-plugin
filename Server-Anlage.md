[[00 Start]] › [[Server-Anlage]]

# Server-Anlage

```mermaid
flowchart TD
  n1["Versionen"]:::internal-link
  n2["Profile"]:::internal-link
  n3["Startplan"]:::internal-link
  n4["Setup-Suche"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `Profiles.load` liest `servers.*`, der Plugin-Kern behält einen Server.
