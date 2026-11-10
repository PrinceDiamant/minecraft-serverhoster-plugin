[[00 Start]] › [[Child-Prozess]]

# Child-Prozess

```mermaid
flowchart TD
  n1["Startablauf"]:::internal-link
  n2["Pipe-Watch"]:::internal-link
  n3["Neustart"]:::internal-link
  n4["Stopp"]:::internal-link
  n5["Prozess-Bausteine"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Startablauf
  Der [[Glossar#Spielserver|Spielserver]] wird eingeschaltet. Das [[Glossar#Plugin|Plugin]] legt Dateien bereit, startet das Programm und beginnt, die Ausgabe mitzulesen. Scheitert der Start, räumt es wieder auf.
Pipe-Watch
  Das [[Glossar#Plugin|Plugin]] liest mit, was der [[Glossar#Spielserver|Spielserver]] schreibt. Es erkennt [[Glossar#Spieler|Spieler]], die Dauer eines [[Glossar#Spielschritt|Spielschritts]], und ob die [[Glossar#Aufsicht|Aufsicht]] hängen geblieben ist.
Neustart
  Endet der [[Glossar#Spielserver|Spielserver]] unerwartet, wartet das [[Glossar#Plugin|Plugin]] eine [[Glossar#Pause|Pause]] und schaltet ihn wieder ein. Die Pause wird länger, wenn das kurz hintereinander oft passiert.
Stopp
  Der [[Glossar#Spielserver|Spielserver]] wird heruntergefahren. Erst mit der Bitte aufzuhören, dann mit Warten, und nach einer Frist hart. Ein absichtlicher [[Glossar#Stopp|Stopp]] soll nicht gleich wieder starten.
Prozess-Bausteine
  Die Zettel, auf denen Zustand, Programmnummer, [[Glossar#Konsole|Konsole]] und [[Glossar#Pause|Pausen]] stehen. Hier läuft nichts von selbst ab.
```

> [!knoten] Was die Blöcke tun
> - **Startablauf**: Der [[Glossar#Spielserver|Spielserver]] wird eingeschaltet. Das [[Glossar#Plugin|Plugin]] legt Dateien bereit, startet das Programm und beginnt, die Ausgabe mitzulesen. Scheitert der Start, räumt es wieder auf.
> - **Pipe-Watch**: Das [[Glossar#Plugin|Plugin]] liest mit, was der [[Glossar#Spielserver|Spielserver]] schreibt. Es erkennt [[Glossar#Spieler|Spieler]], die Dauer eines [[Glossar#Spielschritt|Spielschritts]], und ob die [[Glossar#Aufsicht|Aufsicht]] hängen geblieben ist.
> - **Neustart**: Endet der [[Glossar#Spielserver|Spielserver]] unerwartet, wartet das [[Glossar#Plugin|Plugin]] eine [[Glossar#Pause|Pause]] und schaltet ihn wieder ein. Die Pause wird länger, wenn das kurz hintereinander oft passiert.
> - **Stopp**: Der [[Glossar#Spielserver|Spielserver]] wird heruntergefahren. Erst mit der Bitte aufzuhören, dann mit Warten, und nach einer Frist hart. Ein absichtlicher [[Glossar#Stopp|Stopp]] soll nicht gleich wieder starten.
> - **Prozess-Bausteine**: Die Zettel, auf denen Zustand, Programmnummer, [[Glossar#Konsole|Konsole]] und [[Glossar#Pause|Pausen]] stehen. Hier läuft nichts von selbst ab.

```mermaid
stateDiagram-v2
  state "aus" as aus
  state "startet" as startet
  state "läuft" as laeuft
  state "stoppt" as stoppt
  [*] --> aus
  aus --> startet: Programm wird gestartet, Zeile 1731
  startet --> laeuft: Programm läuft, Zeile 1760
  startet --> aus: Start abgebrochen, Zeile 1773, oder Fehler, Zeile 1696
  laeuft --> aus: Programm endet, Zeile 1878
  startet --> aus: Fehlstart wird aufgeräumt, Zeile 2139
  laeuft --> stoppt: Stopp oder Sicherungskopie, Zeile 1984 oder 1654
  stoppt --> aus: Programm ist aus, Zeile 1989 oder 1662
  stoppt --> laeuft: Stopp beim Verkleinern gescheitert, Zeile 2279
```

- Der [[Glossar#Spielserver|Spielserver]] als eigenes Programm: einschalten, Meldungen mitlesen, neu starten, ausschalten. Pfeile mit [[Glossar#Kapitel|Kapitel]] im Text sind keine zeitliche Reihenfolge. Im Zustandsbild heißen die Zustände aus, startet, läuft und stoppt. Im [[Glossar#Quelltext|Quelltext]] heißen sie IDLE, PREPARING, RUNNING und STOPPING.
