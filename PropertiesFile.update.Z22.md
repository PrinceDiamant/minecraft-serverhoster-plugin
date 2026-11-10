[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[PropertiesFile]] › [[PropertiesFile.update]] › [[PropertiesFile.update.Z22]]

# PropertiesFile.update.Z22

```mermaid
flowchart TD
  n1["for Z.22 (int i = 0; i ( lines.size(); i++)"]
  n2["if Z.24 (t.isEmpty() // t.startsWith('') // t.startsWith(…"]
  n3["if Z.28 (force.containsKey(k))"]
  n2 --> n3
  n2 --> n3
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `PropertiesFile.update`, Quellreihenfolge.
