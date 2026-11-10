[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case238]]

# Dashboard.handle.Z103.Teil7.Z141.Case238

```mermaid
flowchart TD
  n1["Dashboard.json"]:::internal-link
  n2["FabricLauncherPlugin.hostFirstSetupRequest"]:::internal-link
  n3["Dashboard.requiredString"]:::internal-link
  n4["Dashboard.parseJsonObject"]:::internal-link
  n5["Dashboard.readBodyText"]:::internal-link
  n1 -->|"Z.239"| n2
  n2 -->|"Z.239"| n3
  n3 -->|"Z.239"| n4
  n4 -->|"Z.239"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.json
  Antwortet mit JSON `json`. Ruft `sendBytes`.
FabricLauncherPlugin.hostFirstSetupRequest
  Betrifft den Host `hostFirstSetupRequest`. Ruft `requestManual`, `hostFirstSetupMarker`.
Dashboard.requiredString
  Liest verpflichtend `requiredString`.
Dashboard.parseJsonObject
  Wertet aus `parseJsonObject`.
Dashboard.readBodyText
  Liest `readBodyText`.
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`, Quellreihenfolge.
