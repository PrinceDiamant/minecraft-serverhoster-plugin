[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildSlot]]

# ChildSlot

```mermaid
flowchart TD
  n1["ChildSlot.ChildSlot"]:::internal-link
  n2["ChildSlot.running"]:::internal-link
  n3["ChildSlot.pid"]:::internal-link
  n4["ChildSlot.uptimeMillis"]:::internal-link
  n5["ChildSlot.isReadyLine"]:::internal-link
  n6["ChildSlot.pushMspt"]:::internal-link
  n7["ChildSlot.msptHistory"]:::internal-link
  n4 -->|"Z.49"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ChildSlot.ChildSlot
  Betrifft den Child `ChildSlot`. Ruft `ConsoleBuffer`.
ChildSlot.running
  Sagt, ob der Prozess läuft `running`.
ChildSlot.pid
  Liefert die Prozessnummer `pid`.
ChildSlot.uptimeMillis
  Liefert die Laufzeit `uptimeMillis`. Ruft `running`.
ChildSlot.isReadyLine
  Prüft `isReadyLine`.
ChildSlot.pushMspt
  Schiebt einen Wert in `pushMspt`.
ChildSlot.msptHistory
  Liefert die Tickzeiten `msptHistory`.
```


