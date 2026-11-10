[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[PropertiesFile]] › [[PropertiesFile.preview]] › [[PropertiesFile.preview.Z37]]

# PropertiesFile.preview.Z37

```mermaid
flowchart TD
  n1["if Z.37 (f != null && Files.exists(f))"]
  n2["if Z.38 (!Files.isRegularFile(f))"]
  n3["throw Z.38 throw new IOException('server.properties is not a…"]
  n4["PropertiesFile.preview.Z37.Z39"]:::internal-link
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `PropertiesFile.preview`, Quellreihenfolge.
