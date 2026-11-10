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

```knoten
if Z.270 dialog.kind === 'prompt'
  Zeile 270: prüft `dialog.kind === 'prompt'`.
if Z.272 prompt.requiredValue && dialogValue !== prompt.re…
  Zeile 272: prüft `prompt.requiredValue && dialogValue !== prompt.re…`.
return Z.272 return;
  Zeile 272: Rückgabe `return;`.
App.App.closeDialog
  Schließt `closeDialog`.
return Z.274 return;
  Zeile 274: Rückgabe `return;`.
```

- Fortsetzung von `App.App.submitDialog`, Quellreihenfolge.
