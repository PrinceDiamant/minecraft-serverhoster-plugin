[[00 Start]] › [[Dashboard-UI]] › [[UI-App]] › [[App.App]] › [[App.App.submitDialog]]

# App.App.submitDialog

`App.submitDialog(event: FormEvent)` [ui/src/App.tsx:267–277](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/App.tsx#L267-L277)

```mermaid
flowchart TD
  n1["if Z.269 !dialog"]
  n2["return Z.269 return;"]
  n3["App.App.submitDialog.Z270"]:::internal-link
  n4["App.App.closeDialog"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.269 !dialog
  Zeile 269: prüft `!dialog`.
return Z.269 return;
  Zeile 269: Rückgabe `return;`.
App.App.submitDialog.Z270
  Fortsetzung des Ablaufs ab Zeile 270.
App.App.closeDialog
  Schließt `closeDialog`.
```

- `submitDialog` in `ui/src/App.tsx`
