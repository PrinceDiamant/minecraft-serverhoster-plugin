[[00 Start]] › [[Dashboard-HTTP]] › [[API-Setup]] › [[Dashboard.setup]] › [[Dashboard.setup.Teil1]]

# Dashboard.setup.Teil1

```mermaid
flowchart TD
  n1["Dashboard.parseJsonObject"]:::internal-link
  n2["Dashboard.readBodyText"]:::internal-link
  n3["Dashboard.requiredString"]:::internal-link
  n4["Dashboard.requiredString"]:::internal-link
  n5["Dashboard.optionalString"]:::internal-link
  n6["Dashboard.optionalString"]:::internal-link
  n1 -->|"Z.535"| n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.parseJsonObject
  Wertet aus `parseJsonObject`.
Dashboard.readBodyText
  Liest `readBodyText`.
Dashboard.requiredString
  Liest verpflichtend `requiredString`.
Dashboard.optionalString
  Liest optional `optionalString`.
```

- Fortsetzung von `Dashboard.setup`, Quellreihenfolge.
