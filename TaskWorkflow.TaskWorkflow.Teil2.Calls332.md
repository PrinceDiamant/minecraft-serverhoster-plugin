[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow.Teil2.Calls332]]

# TaskWorkflow.TaskWorkflow.Teil2.Calls332

```mermaid
flowchart TD
  n1["TaskWorkflow.TaskWorkflow.deleteSchedule"]:::internal-link
  n2["TaskWorkflow.TaskWorkflow.runSchedule"]:::internal-link
  n3["TaskWorkflow.dateLabel"]:::internal-link
  n4["TaskWorkflow.dateLabel"]:::internal-link
  n5["TaskWorkflow.dateLabel"]:::internal-link
  n6["TaskWorkflow.TaskWorkflow.runLegacyTask"]:::internal-link
  n1 -->|"Z.335"| n2
  n2 -->|"Z.341"| n3
  n3 -->|"Z.342"| n4
  n4 -->|"Z.342"| n5
  n5 -->|"Z.366"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
TaskWorkflow.TaskWorkflow.deleteSchedule
  Die [[Glossar#Bedienseite|Bedienseite]] löscht den [[Glossar#Zeitplan|Zeitplan]]. Löscht `deleteSchedule`. Ruft `askBeforeDelete`, `dashboardRequest`, `refresh`.
TaskWorkflow.TaskWorkflow.runSchedule
  Die [[Glossar#Bedienseite|Bedienseite]] führt aus den [[Glossar#Zeitplan|Zeitplan]]. Führt aus `runSchedule`. Ruft `dashboardRequest`, `refresh`.
TaskWorkflow.dateLabel
  Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um die Beschriftung. `dateLabel` in `TaskWorkflow.tsx`.
TaskWorkflow.TaskWorkflow.runLegacyTask
  Die [[Glossar#Bedienseite|Bedienseite]] führt aus den alten Weg die [[Glossar#Aufgabe|Aufgabe]]. Führt aus `runLegacyTask`. Ruft `dashboardRequest`, `refresh`.
```

> [!knoten]- Was die Blöcke tun
> - **TaskWorkflow.TaskWorkflow.deleteSchedule**: Die [[Glossar#Bedienseite|Bedienseite]] löscht den [[Glossar#Zeitplan|Zeitplan]]. Löscht `deleteSchedule`. Ruft `askBeforeDelete`, `dashboardRequest`, `refresh`.
> - **TaskWorkflow.TaskWorkflow.runSchedule**: Die [[Glossar#Bedienseite|Bedienseite]] führt aus den [[Glossar#Zeitplan|Zeitplan]]. Führt aus `runSchedule`. Ruft `dashboardRequest`, `refresh`.
> - **TaskWorkflow.dateLabel**: Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um die Beschriftung. `dateLabel` in `TaskWorkflow.tsx`.
> - **TaskWorkflow.TaskWorkflow.runLegacyTask**: Die [[Glossar#Bedienseite|Bedienseite]] führt aus den alten Weg die [[Glossar#Aufgabe|Aufgabe]]. Führt aus `runLegacyTask`. Ruft `dashboardRequest`, `refresh`.

- Weitere [[Glossar#Funktion|Funktionen]], die ab [[Glossar#Zeile|Zeile]] 332 aufgerufen werden.
- Fortsetzung von `TaskWorkflow.TaskWorkflow.Teil2`.
