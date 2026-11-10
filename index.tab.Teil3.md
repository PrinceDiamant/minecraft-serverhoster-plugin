[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Sitzung]] › [[index.tab]] › [[index.tab.Teil3]]

# index.tab.Teil3

```mermaid
flowchart TD
  n1["if Z.89 t==='console'"]
  n2["index.scrollCon"]:::internal-link
  n3["if Z.89 t==='diag'"]
  n4["index.loadDiag"]:::internal-link
  n5["if Z.89 t==='tasks'"]
  n6["index.loadTasks"]:::internal-link
  n7["if Z.89 t==='backup'"]
  n8["index.loadBackup"]:::internal-link
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
if Z.89 t==='console'
  Zeile 89: prüft `t==='console'`.
index.scrollCon
  Die ältere [[Glossar#Bedienseite|Bedienseite]] rollt die [[Glossar#Konsole|Konsole]]. Scrollt die Konsole `scrollCon`. Ruft `$`.
if Z.89 t==='diag'
  Zeile 89: prüft `t==='diag'`.
index.loadDiag
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Diagnose|Diagnose]]. Lädt `loadDiag`. Ruft `api`, `$`, `row`.
if Z.89 t==='tasks'
  Zeile 89: prüft `t==='tasks'`.
index.loadTasks
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Aufgabe|Aufgaben]]. Lädt `loadTasks`. Ruft `api`, `$`, `esc`.
if Z.89 t==='backup'
  Zeile 89: prüft `t==='backup'`.
index.loadBackup
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Sicherungskopie|Sicherungskopie]]. Lädt `loadBackup`. Ruft `api`, `$`, `esc`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.89 t==='console'**: Zeile 89: prüft `t==='console'`.
> - **index.scrollCon**: Die ältere [[Glossar#Bedienseite|Bedienseite]] rollt die [[Glossar#Konsole|Konsole]]. Scrollt die Konsole `scrollCon`. Ruft `$`.
> - **if Z.89 t==='diag'**: Zeile 89: prüft `t==='diag'`.
> - **index.loadDiag**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Diagnose|Diagnose]]. Lädt `loadDiag`. Ruft `api`, `$`, `row`.
> - **if Z.89 t==='tasks'**: Zeile 89: prüft `t==='tasks'`.
> - **index.loadTasks**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Aufgabe|Aufgaben]]. Lädt `loadTasks`. Ruft `api`, `$`, `esc`.
> - **if Z.89 t==='backup'**: Zeile 89: prüft `t==='backup'`.
> - **index.loadBackup**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Sicherungskopie|Sicherungskopie]]. Lädt `loadBackup`. Ruft `api`, `$`, `esc`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `index.tab`.
