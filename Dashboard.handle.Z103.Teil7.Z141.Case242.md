[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case242]]

# Dashboard.handle.Z103.Teil7.Z141.Case242

```mermaid
flowchart TD
  n1["Dashboard.parseJsonObject"]:::internal-link
  n2["Dashboard.readBodyText"]:::internal-link
  n3["FabricLauncherPlugin.cleanupLegacyFiles"]:::internal-link
  n4["Dashboard.requiredString"]:::internal-link
  n5["Dashboard.json"]:::internal-link
  n1 -->|"Z.243"| n2
  n3 -->|"Z.244"| n4
  n2 --> n3
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.parseJsonObject
  Wertet aus `parseJsonObject`.
Dashboard.readBodyText
  Liest `readBodyText`.
FabricLauncherPlugin.cleanupLegacyFiles
  Räumt auf `cleanupLegacyFiles`. Ruft `legacyJarNames`, `legacyDataToPreserve`, `cleanupLegacyDirectory`.
Dashboard.requiredString
  Liest verpflichtend `requiredString`.
Dashboard.json
  Antwortet mit JSON `json`. Ruft `sendBytes`.
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`, Quellreihenfolge.
