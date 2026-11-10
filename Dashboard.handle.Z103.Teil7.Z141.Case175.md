[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case175]]

# Dashboard.handle.Z103.Teil7.Z141.Case175

```mermaid
flowchart TD
  n1["BackupSecrets.readExisting"]:::internal-link
  n2["Dashboard.json"]:::internal-link
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupSecrets.readExisting
  Liest `readExisting`. Ruft `load`.
Dashboard.json
  Antwortet mit JSON `json`. Ruft `sendBytes`.
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`, Quellreihenfolge.
