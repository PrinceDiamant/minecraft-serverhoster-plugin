[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.submit]] › [[SetupWorkflow.SetupWorkflow.submit.Z100.Teil1.Z106]]

# SetupWorkflow.SetupWorkflow.submit.Z100.Teil1.Z106

```mermaid
flowchart TD
  n1["if Z.106 action === 'reset'"]
  n2["if Z.115 !accepted"]
  n3["return Z.115 return;"]
  n4["SetupWorkflow.SetupWorkflow.submit.Z100.Teil1.Z106.Z117"]:::internal-link
  n2 -->|"ja"| n3
  n1 -->|"ja"| n2
  n1 -->|"nein"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.106 action === 'reset'
  Zeile 106: prüft `action === 'reset'`.
if Z.115 !accepted
  Zeile 115: prüft `!accepted`.
return Z.115 return;
  Zeile 115: Rückgabe `return;`.
SetupWorkflow.SetupWorkflow.submit.Z100.Teil1.Z106.Z117
  Fortsetzung des Ablaufs ab Zeile 117.
```

- Fortsetzung von `SetupWorkflow.SetupWorkflow.submit.Z100.Teil1`, Quellreihenfolge.
