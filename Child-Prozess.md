[[00 Start]] › [[Child-Prozess]]

# Child-Prozess

```mermaid
flowchart TD
  n1["Startablauf"]:::internal-link
  n2["Pipe-Watch"]:::internal-link
  n3["Neustart"]:::internal-link
  n4["Stopp"]:::internal-link
  n5["Prozess-Bausteine"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Startablauf
  startAsync öffnet den Child, launch schreibt Dateien und startet den Prozess, danach Pipes und Watch; bei Abbruch reapLeftover oder abandonFailedStart.
Pipe-Watch
  Liest stdout und stderr, Tick-Antworten und Spielerliste. tick query frühestens 30 s nach Start, dann höchstens alle 10 s. Sampler jeden Tick, recoverChildSupervision alle 5 s.
Neustart
  scheduleRestart wartet delay mal 1000 ms (initialDelaySeconds Standard 5 s, Deckel maxDelaySeconds Standard 300 s) und ruft restartSingle.
Stopp
  stopBlocking setzt STOPPING. stopProcess ruft ChildStopSequence: Poll 250 ms, Stop erneut alle 5 s, TERM-Gnade 10 s. startupStopTimeoutSeconds Standard 180 s, stopTimeoutSeconds Standard 60 s.
Prozess-Bausteine
  Daten und Hilfsklassen ohne eigenen Ablauf: Slot, Prozess, Stopp, Puffer, Restart, Supervisor.
```

```mermaid
stateDiagram-v2
  [*] --> IDLE
  IDLE --> PREPARING: launch Z.1731
  PREPARING --> RUNNING: launch Z.1760
  PREPARING --> IDLE: Start abgebrochen Z.1773 / Fehler Z.1696
  RUNNING --> IDLE: watch Ende Z.1878
  PREPARING --> IDLE: abandonFailedStart Z.2139
  RUNNING --> STOPPING: stopBlocking Z.1984 / Backup Z.1654
  STOPPING --> IDLE: nicht mehr running Z.1989 / Z.1662
  STOPPING --> RUNNING: Host-Minimize Stopp fehlgeschlagen Z.2279
```

- Phase `IDLE`, `PREPARING`, `RUNNING`, `STOPPING` an `ChildSlot`.
