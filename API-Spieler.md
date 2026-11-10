[[00 Start]] › [[Dashboard-HTTP]] › [[API-Spieler]]

# API-Spieler

```mermaid
flowchart TD
  n1["Dashboard.players"]:::internal-link
  n2["Dashboard.readPlayerNames"]:::internal-link
  n1 -->|"Zeile 696"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.players
  Liefert die [[Glossar#Spieler|Spieler]] an die [[Glossar#Bedienseite|Bedienseite]].
Dashboard.readPlayerNames
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den [[Glossar#Spieler|Spieler]] die Namen.
```

> [!knoten] Was die Blöcke tun
> - **Dashboard.players**: Liefert die [[Glossar#Spieler|Spieler]] an die [[Glossar#Bedienseite|Bedienseite]].
> - **Dashboard.readPlayerNames**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den [[Glossar#Spieler|Spieler]] die Namen.

- Liefert die [[Glossar#Spieler|Spieler]] und schickt einen [[Glossar#Befehl|Befehl]] zu einem Spieler.
