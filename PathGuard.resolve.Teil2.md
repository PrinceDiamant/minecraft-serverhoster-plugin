[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[PathGuard]] › [[PathGuard.resolve]] › [[PathGuard.resolve.Teil2]]

# PathGuard.resolve.Teil2

```mermaid
flowchart TD
  n1["if Z.29 (check == null // !check.toRealPath().startsWith(…"]
  n2["throw Z.29 throw new SecurityException('Pfad außerhalb des S…"]
  n3["return Z.30 return p;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `PathGuard.resolve`, Quellreihenfolge.
