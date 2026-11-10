[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Altlast]]

# Legacy-Altlast

```mermaid
flowchart TD
  n1["index.pc"]:::internal-link
  n2["index.loadPlayers"]:::internal-link
  n3["index.loadTasks"]:::internal-link
  n4["index.runTask"]:::internal-link
  n5["index.loadBackup"]:::internal-link
  n6["index.delBackup"]:::internal-link
  n7["index.restoreBackup"]:::internal-link
  n8["index.doBackup"]:::internal-link
  n9["index.testBackup"]:::internal-link
  n6 -->|"Zeile 216"| n5
  n7 -->|"Zeile 217"| n5
  n8 -->|"Zeile 218"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.pc
  Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] einen [[Glossar#Befehl|Befehl]], der einen [[Glossar#Spieler|Spieler]] betrifft.
index.loadPlayers
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Spieler|Spieler]].
index.loadTasks
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Aufgabe|Aufgaben]].
index.runTask
  Die ältere [[Glossar#Bedienseite|Bedienseite]] führt aus die [[Glossar#Aufgabe|Aufgabe]].
index.loadBackup
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Sicherungskopie|Sicherungskopie]].
index.delBackup
  Die ältere [[Glossar#Bedienseite|Bedienseite]] löscht die [[Glossar#Sicherungskopie|Sicherungskopie]].
index.restoreBackup
  Die ältere [[Glossar#Bedienseite|Bedienseite]] stellt wieder her die [[Glossar#Sicherungskopie|Sicherungskopie]].
index.doBackup
  Die ältere [[Glossar#Bedienseite|Bedienseite]] führt aus die [[Glossar#Sicherungskopie|Sicherungskopie]].
index.testBackup
  Die ältere [[Glossar#Bedienseite|Bedienseite]] prüft die [[Glossar#Sicherungskopie|Sicherungskopie]].
```

> [!knoten] Was die Blöcke tun
> - **index.pc**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] einen [[Glossar#Befehl|Befehl]], der einen [[Glossar#Spieler|Spieler]] betrifft.
> - **index.loadPlayers**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Spieler|Spieler]].
> - **index.loadTasks**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Aufgabe|Aufgaben]].
> - **index.runTask**: Die ältere [[Glossar#Bedienseite|Bedienseite]] führt aus die [[Glossar#Aufgabe|Aufgabe]].
> - **index.loadBackup**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Sicherungskopie|Sicherungskopie]].
> - **index.delBackup**: Die ältere [[Glossar#Bedienseite|Bedienseite]] löscht die [[Glossar#Sicherungskopie|Sicherungskopie]].
> - **index.restoreBackup**: Die ältere [[Glossar#Bedienseite|Bedienseite]] stellt wieder her die [[Glossar#Sicherungskopie|Sicherungskopie]].
> - **index.doBackup**: Die ältere [[Glossar#Bedienseite|Bedienseite]] führt aus die [[Glossar#Sicherungskopie|Sicherungskopie]].
> - **index.testBackup**: Die ältere [[Glossar#Bedienseite|Bedienseite]] prüft die [[Glossar#Sicherungskopie|Sicherungskopie]].

- Bereiche der älteren [[Glossar#Bedienseite|Bedienseite]], die die neuere Seite aus dem laufenden Text herausschneidet. Sie bleiben in der Datei, laufen aber nicht mit.
