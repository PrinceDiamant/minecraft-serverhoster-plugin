[[00 Start]] › [[Plugin-Kern]] › [[Setup]]

# Setup

```mermaid
flowchart TD
  n1["Setup-Dialog"]:::internal-link
  n2["Setup-Aufraeumen"]:::internal-link
  n3["Setup-Import"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Setup-Dialog
  Die Einrichtungsschritte, die der Kern selbst ausführt.
Setup-Aufraeumen
  Räumt Dateien und Reste nach der Einrichtung weg.
Setup-Import
  Übernimmt Daten aus einer alten FabricLauncher-Anlage.
```

- Einrichtung, Aufräumen und Import der alten FabricLauncher-Daten.
