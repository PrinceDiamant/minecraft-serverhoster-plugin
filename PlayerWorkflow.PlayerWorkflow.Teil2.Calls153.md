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
  Die [[Glossar#Bedienseite|Bedienseite]] führt aus den [[Glossar#Spieler|Spieler]] die Tätigkeit. Führt aus `runPlayerAction`. Ruft `sendCommand`, `refresh`.
PlayerWorkflow.sendCommand
  Die [[Glossar#Bedienseite|Bedienseite]] schickt den [[Glossar#Befehl|Befehl]]. Sendet `sendCommand`. Ruft `dashboardRequest`, `jsonBody`.
```

> [!knoten]- Was die Blöcke tun
> - **PlayerWorkflow.PlayerWorkflow.runPlayerAction**: Die [[Glossar#Bedienseite|Bedienseite]] führt aus den [[Glossar#Spieler|Spieler]] die Tätigkeit. Führt aus `runPlayerAction`. Ruft `sendCommand`, `refresh`.
> - **PlayerWorkflow.sendCommand**: Die [[Glossar#Bedienseite|Bedienseite]] schickt den [[Glossar#Befehl|Befehl]]. Sendet `sendCommand`. Ruft `dashboardRequest`, `jsonBody`.

- Weitere [[Glossar#Funktion|Funktionen]], die ab [[Glossar#Zeile|Zeile]] 153 aufgerufen werden.
- Fortsetzung von `PlayerWorkflow.PlayerWorkflow.Teil2`.
