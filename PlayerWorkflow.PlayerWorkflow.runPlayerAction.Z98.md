[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[PlayerWorkflow]] › [[PlayerWorkflow.PlayerWorkflow]] › [[PlayerWorkflow.PlayerWorkflow.runPlayerAction]] › [[PlayerWorkflow.PlayerWorkflow.runPlayerAction.Z98]]

# PlayerWorkflow.PlayerWorkflow.runPlayerAction.Z98

```mermaid
flowchart TD
  n1["try Z.98"]
  n2["PlayerWorkflow.sendCommand"]:::internal-link
  n3["for Z.102 (1200, 3500, 7000)"]
  n4["fileEditor.installFileEditors.refresh"]:::internal-link
  n5["catch Z.103 cause"]
  n6["finally Z.98"]
  n3 -->|"wiederholen"| n4
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n5
  n4 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `PlayerWorkflow.PlayerWorkflow.runPlayerAction`, Quellreihenfolge.
