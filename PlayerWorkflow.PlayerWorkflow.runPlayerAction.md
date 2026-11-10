[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[PlayerWorkflow]] › [[PlayerWorkflow.PlayerWorkflow]] › [[PlayerWorkflow.PlayerWorkflow.runPlayerAction]]

# PlayerWorkflow.PlayerWorkflow.runPlayerAction

`PlayerWorkflow.runPlayerAction(action: string, dangerous = false)` [ui/src/components/PlayerWorkflow.tsx:80–108](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/PlayerWorkflow.tsx#L80-L108)

```mermaid
flowchart TD
  n1["if Z.82 !/^/w(1,16)$/.test(name)"]
  n2["return Z.84 return;"]
  n3["if Z.86 dangerous"]
  n4["if Z.93 !accepted"]
  n5["return Z.93 return;"]
  n6["PlayerWorkflow.PlayerWorkflow.runPlayerAction.Z98"]:::internal-link
  n1 -->|"ja"| n2
  n4 -->|"ja"| n5
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 --> n6
  n4 --> n6
  n3 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.82 !/^/w(1,16)$/.test(name)
  Zeile 82: prüft `!/^/w(1,16)$/.test(name)`.
return Z.84 return;
  Zeile 84: Rückgabe `return;`.
if Z.86 dangerous
  Zeile 86: prüft `dangerous`.
if Z.93 !accepted
  Zeile 93: prüft `!accepted`.
return Z.93 return;
  Zeile 93: Rückgabe `return;`.
PlayerWorkflow.PlayerWorkflow.runPlayerAction.Z98
  Fortsetzung des Ablaufs ab Zeile 98.
```

- `runPlayerAction` in `ui/src/components/PlayerWorkflow.tsx`
