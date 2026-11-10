[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Status]] › [[index.status]] › [[index.status.Z101.Teil1]]

# index.status.Z101.Teil1

```mermaid
flowchart TD
  n1["index.api"]:::internal-link
  n2["if Z.101 generation!==statusGeneration"]
  n3["return Z.101 return;"]
  n4["index.updateChildActions"]:::internal-link
  n5["if Z.101 $('host-connection')"]
  n6["index.$"]:::internal-link
  n7["index.$"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  n5 -->|"Z.101"| n6
  n6 -->|"ja"| n7
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.api
  Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]]. Sendet einen Dashboard-Request `api`. Ruft `scoped`, `showLogin`, `toast`.
if Z.101 generation!==statusGeneration
  Zeile 101: prüft `generation!==statusGeneration`.
return Z.101 return;
  Zeile 101: Rückgabe `return;`.
index.updateChildActions
  Die ältere [[Glossar#Bedienseite|Bedienseite]] ändert den [[Glossar#Spielserver|Spielserver]] die Tätigkeiten. Aktualisiert `updateChildActions`. Ruft `$`.
if Z.101 $('host-connection')
  Zeile 101: prüft `$('host-connection')`.
index.$
  Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
```

> [!knoten]- Was die Blöcke tun
> - **index.api**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]]. Sendet einen Dashboard-Request `api`. Ruft `scoped`, `showLogin`, `toast`.
> - **if Z.101 generation!==statusGeneration**: Zeile 101: prüft `generation!==statusGeneration`.
> - **return Z.101 return;**: Zeile 101: Rückgabe `return;`.
> - **index.updateChildActions**: Die ältere [[Glossar#Bedienseite|Bedienseite]] ändert den [[Glossar#Spielserver|Spielserver]] die Tätigkeiten. Aktualisiert `updateChildActions`. Ruft `$`.
> - **if Z.101 $('host-connection')**: Zeile 101: prüft `$('host-connection')`.
> - **index.$**: Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `index.status.Z101`.
