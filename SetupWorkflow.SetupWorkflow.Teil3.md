[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.Teil3]]

# SetupWorkflow.SetupWorkflow.Teil3

```mermaid
flowchart TD
  n1["if Z.244 !state && !error"]
  n2["return Z.244 return (section className='setup-workflow')(p)Ein…"]
  n3["if Z.245 !state"]
  n4["fileEditor.installFileEditors.refresh"]:::internal-link
  n5["return Z.245 return (section className='setup-workfl…"]
  n6["if Z.246 state.required && !host && !error"]
  n7["return Z.246 return (section className='setup-workflow')(p)Hos…"]
  n8["if Z.247 state.required && !host"]
  n9["fileEditor.installFileEditors.refresh"]:::internal-link
  n10["return Z.247 return (section className='setup-workfl…"]
  n1 -->|"ja"| n2
  n4 --> n5
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n6 -->|"ja"| n7
  n5 --> n6
  n3 --> n6
  n9 --> n10
  n8 -->|"ja"| n9
  n7 --> n8
  n6 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.244 !state && !error
  Zeile 244: prüft `!state && !error`.
return Z.244 return (section className='setup-workflow')(p)Ein…
  Zeile 244: Rückgabe `return (section className='setup-workflow')(p)Ein…`.
if Z.245 !state
  Zeile 245: prüft `!state`.
fileEditor.installFileEditors.refresh
  Lädt neu `refresh`. Ruft `editorFor`.
return Z.245 return (section className='setup-workfl…
  Zeile 245: Rückgabe `return (section className='setup-workfl…`.
if Z.246 state.required && !host && !error
  Zeile 246: prüft `state.required && !host && !error`.
return Z.246 return (section className='setup-workflow')(p)Hos…
  Zeile 246: Rückgabe `return (section className='setup-workflow')(p)Hos…`.
if Z.247 state.required && !host
  Zeile 247: prüft `state.required && !host`.
return Z.247 return (section className='setup-workfl…
  Zeile 247: Rückgabe `return (section className='setup-workfl…`.
```

- Fortsetzung von `SetupWorkflow.SetupWorkflow`, Quellreihenfolge.
