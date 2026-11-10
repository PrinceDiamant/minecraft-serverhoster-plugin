[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[PlayerWorkflow]] › [[PlayerWorkflow.PlayerWorkflow]] › [[PlayerWorkflow.PlayerWorkflow.Teil2.Calls125]]

# PlayerWorkflow.PlayerWorkflow.Teil2.Calls125

```mermaid
flowchart TD
  n1["fileEditor.installFileEditors.refresh"]:::internal-link
  n2["PlayerWorkflow.PlayerWorkflow.runPlayerAction"]:::internal-link
  n3["PlayerWorkflow.PlayerWorkflow.runPlayerAction"]:::internal-link
  n4["PlayerWorkflow.PlayerWorkflow.runPlayerAction"]:::internal-link
  n5["PlayerWorkflow.PlayerWorkflow.runPlayerAction"]:::internal-link
  n6["PlayerWorkflow.PlayerWorkflow.runPlayerAction"]:::internal-link
  n1 -->|"Z.141"| n2
  n2 -->|"Z.149"| n3
  n3 -->|"Z.150"| n4
  n4 -->|"Z.151"| n5
  n5 -->|"Z.152"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
fileEditor.installFileEditors.refresh
  Die [[Glossar#Bedienseite|Bedienseite]] lädt neu das. Lädt neu `refresh`. Ruft `editorFor`.
PlayerWorkflow.PlayerWorkflow.runPlayerAction
  Die [[Glossar#Bedienseite|Bedienseite]] führt aus den [[Glossar#Spieler|Spieler]] die Tätigkeit. Führt aus `runPlayerAction`. Ruft `sendCommand`, `refresh`.
```

> [!knoten]- Was die Blöcke tun
> - **fileEditor.installFileEditors.refresh**: Die [[Glossar#Bedienseite|Bedienseite]] lädt neu das. Lädt neu `refresh`. Ruft `editorFor`.
> - **PlayerWorkflow.PlayerWorkflow.runPlayerAction**: Die [[Glossar#Bedienseite|Bedienseite]] führt aus den [[Glossar#Spieler|Spieler]] die Tätigkeit. Führt aus `runPlayerAction`. Ruft `sendCommand`, `refresh`.

- Weitere [[Glossar#Funktion|Funktionen]], die ab [[Glossar#Zeile|Zeile]] 125 aufgerufen werden.
- Fortsetzung von `PlayerWorkflow.PlayerWorkflow.Teil2`.
