[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[PlayerWorkflow]] › [[PlayerWorkflow.PlayerWorkflow]] › [[PlayerWorkflow.PlayerWorkflow.Teil2.Calls153]]

# PlayerWorkflow.PlayerWorkflow.Teil2.Calls153

```mermaid
flowchart TD
  n1["PlayerWorkflow.PlayerWorkflow.runPlayerAction"]:::internal-link
  n2["PlayerWorkflow.PlayerWorkflow.runPlayerAction"]:::internal-link
  n3["PlayerWorkflow.PlayerWorkflow.runPlayerAction"]:::internal-link
  n4["PlayerWorkflow.sendCommand"]:::internal-link
  n5["PlayerWorkflow.sendCommand"]:::internal-link
  n6["PlayerWorkflow.sendCommand"]:::internal-link
  n1 -->|"Z.154"| n2
  n2 -->|"Z.155"| n3
  n3 -->|"Z.160"| n4
  n4 -->|"Z.161"| n5
  n5 -->|"Z.162"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
PlayerWorkflow.PlayerWorkflow.runPlayerAction
  Führt aus `runPlayerAction`. Ruft `sendCommand`, `refresh`.
PlayerWorkflow.sendCommand
  Sendet `sendCommand`. Ruft `dashboardRequest`, `jsonBody`.
```

- Fortsetzung von `PlayerWorkflow.PlayerWorkflow.Teil2`, Quellreihenfolge.
