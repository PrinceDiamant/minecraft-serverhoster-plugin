[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Sitzung]] › [[index.tab]] › [[index.tab.Teil2]]

# index.tab.Teil2

```mermaid
flowchart TD
  n1["if Z.89 t==='config'"]
  n2["index.loadTxt"]:::internal-link
  n3["if Z.89 t==='files'"]
  n4["index.ls"]:::internal-link
  n5["if Z.89 t==='logs'"]
  n6["index.loadLogs"]:::internal-link
  n7["if Z.89 t==='players'"]
  n8["index.loadPlayers"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n7 -->|"ja"| n8
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.89 t==='config'
  Zeile 89: prüft `t==='config'`.
index.loadTxt
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt den Text. Lädt `loadTxt`. Ruft `api`, `$`.
if Z.89 t==='files'
  Zeile 89: prüft `t==='files'`.
index.ls
  Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] den Inhalt eines Ordners. Listet das Verzeichnis `ls`. Ruft `api`, `esc`, `jp`.
if Z.89 t==='logs'
  Zeile 89: prüft `t==='logs'`.
index.loadLogs
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die Protokolle. Lädt `loadLogs`. Ruft `api`, `$`, `esc`.
if Z.89 t==='players'
  Zeile 89: prüft `t==='players'`.
index.loadPlayers
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Spieler|Spieler]]. Lädt `loadPlayers`. Ruft `api`, `$`, `esc`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.89 t==='config'**: Zeile 89: prüft `t==='config'`.
> - **index.loadTxt**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt den Text. Lädt `loadTxt`. Ruft `api`, `$`.
> - **if Z.89 t==='files'**: Zeile 89: prüft `t==='files'`.
> - **index.ls**: Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] den Inhalt eines Ordners. Listet das Verzeichnis `ls`. Ruft `api`, `esc`, `jp`.
> - **if Z.89 t==='logs'**: Zeile 89: prüft `t==='logs'`.
> - **index.loadLogs**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die Protokolle. Lädt `loadLogs`. Ruft `api`, `$`, `esc`.
> - **if Z.89 t==='players'**: Zeile 89: prüft `t==='players'`.
> - **index.loadPlayers**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Spieler|Spieler]]. Lädt `loadPlayers`. Ruft `api`, `$`, `esc`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `index.tab`.
