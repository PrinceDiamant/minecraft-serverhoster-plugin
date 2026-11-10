[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]]

# Prozess-Bausteine

```mermaid
flowchart TD
  n1["RestartBackoff"]:::internal-link
  n2["StartFailureStatus"]:::internal-link
  n3["ChildProcessRecord"]:::internal-link
  n4["RestartPolicy"]:::internal-link
  n5["ChildStopSequence"]:::internal-link
  n6["ChildSlot"]:::internal-link
  n7["ConsoleBuffer"]:::internal-link
  n8["SupervisorHealth"]:::internal-link
  n9["ChildLaunchCleanup"]:::internal-link
  n10["TickQueryFilter"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  n5 -->|"Quelltext"| n6
  n6 -->|"Quelltext"| n7
  n7 -->|"Quelltext"| n8
  n8 -->|"Quelltext"| n9
  n9 -->|"Quelltext"| n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RestartBackoff
  Wartezeit aus Versuchen, Basis und Deckel.
StartFailureStatus
  Merkt, woran der Start gescheitert ist.
ChildProcessRecord
  Der gemerkte Prozess: pid, lebendig, zerstören.
RestartPolicy
  Ob und wie oft der Child von allein neu startet.
ChildStopSequence
  Stoppt den Prozess: Poll 250 ms, Befehl erneut, dann TERM.
ChildSlot
  Phase, pid, Konsole und Messwerte des einen Child.
ConsoleBuffer
  Ringpuffer der Konsolenzeilen.
SupervisorHealth
  Phase IDLE, PREPARING, RUNNING, STOPPING und die 5-s-Aufsicht.
ChildLaunchCleanup
  Räumt Dateien und übrige Prozesse nach einem fehlgeschlagenen Start weg.
TickQueryFilter
  Erkennt die Antwort auf tick query und verwirft den Rest.
```

- Slot, Prozessrecord, Stoppsequenz, Restart, Supervisor.
