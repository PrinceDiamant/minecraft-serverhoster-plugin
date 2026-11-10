[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[PlayerWorkflow]]

# PlayerWorkflow

```mermaid
flowchart TD
  n1["PlayerWorkflow.sendCommand"]:::internal-link
  n2["PlayerWorkflow.PlayerWorkflow"]:::internal-link
  n2 -->|"Z.160"| n1
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
PlayerWorkflow.sendCommand
  Die [[Glossar#Bedienseite|Bedienseite]] schickt den [[Glossar#Befehl|Befehl]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `sendCommand`.
PlayerWorkflow.PlayerWorkflow
  Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um den Ablauf. Im [[Glossar#Quelltext|Quelltext]] heißt das `PlayerWorkflow`.
```

> [!knoten]- Was die Blöcke tun
> - **PlayerWorkflow.sendCommand**: Die [[Glossar#Bedienseite|Bedienseite]] schickt den [[Glossar#Befehl|Befehl]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `sendCommand`.
> - **PlayerWorkflow.PlayerWorkflow**: Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um den Ablauf. Im [[Glossar#Quelltext|Quelltext]] heißt das `PlayerWorkflow`.

- Der Ablauf in der [[Glossar#Bedienseite|Bedienseite]], mit dem man etwas für einen [[Glossar#Spieler|Spieler]] tut.
