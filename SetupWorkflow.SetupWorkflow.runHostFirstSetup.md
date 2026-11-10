[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.runHostFirstSetup]]

# SetupWorkflow.SetupWorkflow.runHostFirstSetup

`SetupWorkflow.runHostFirstSetup(required: string)` [ui/src/components/SetupWorkflow.tsx:220–242](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/SetupWorkflow.tsx#L220-L242)

```mermaid
flowchart TD
  n1["if Z.227 !accepted"]
  n2["return Z.227 return;"]
  n3["SetupWorkflow.SetupWorkflow.runHostFirstSetup.Z230"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.227 !accepted
  Zeile 227: prüft `!accepted`.
return Z.227 return;
  Zeile 227: Rückgabe `return;`.
SetupWorkflow.SetupWorkflow.runHostFirstSetup.Z230
  Fortsetzung des Ablaufs ab Zeile 230.
```

- `runHostFirstSetup` in `ui/src/components/SetupWorkflow.tsx`
