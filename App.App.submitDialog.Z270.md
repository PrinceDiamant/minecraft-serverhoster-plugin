[[00 Start]] › [[Dashboard-UI]] › [[UI-App]] › [[App.App]] › [[App.App.submitDialog]] › [[App.App.submitDialog.Z270]]

# App.App.submitDialog.Z270

```mermaid
flowchart TD
  n1["if Z.270 dialog.kind === 'prompt'"]
  n2["if Z.272 prompt.requiredValue && dialogValue !== prompt.re…"]
  n3["return Z.272 return;"]
  n4["App.App.closeDialog"]:::internal-link
  n5["return Z.274 return;"]
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n4 --> n5
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `App.App.submitDialog`, Quellreihenfolge.
