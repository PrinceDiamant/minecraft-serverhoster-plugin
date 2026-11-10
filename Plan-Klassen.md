[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]]

# Plan-Klassen

```mermaid
flowchart TD
  n1["TaskDef"]:::internal-link
  n2["ScheduleDef"]:::internal-link
  n3["ScheduleExecution"]:::internal-link
  n4["LegacyTaskMigration"]:::internal-link
  n5["CronExpr"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
TaskDef
  Eine [[Glossar#Aufgabe|Aufgabe]] aus der älteren Liste.
ScheduleDef
  Die Beschreibung eines [[Glossar#Zeitplan|Zeitplans]]: wann, was, und ob er an ist.
ScheduleExecution
  Führt einen [[Glossar#Zeitplan|Zeitplan]] aus, wenn er fällig ist.
LegacyTaskMigration
  Übernimmt Einträge aus der älteren Aufgabenliste in die Zeitpläne.
CronExpr
  Liest die Uhrzeitregel und sagt, ob der Zeitpunkt jetzt gekommen ist.
```

> [!knoten] Was die Blöcke tun
> - **TaskDef**: Eine [[Glossar#Aufgabe|Aufgabe]] aus der älteren Liste.
> - **ScheduleDef**: Die Beschreibung eines [[Glossar#Zeitplan|Zeitplans]]: wann, was, und ob er an ist.
> - **ScheduleExecution**: Führt einen [[Glossar#Zeitplan|Zeitplan]] aus, wenn er fällig ist.
> - **LegacyTaskMigration**: Übernimmt Einträge aus der älteren Aufgabenliste in die Zeitpläne.
> - **CronExpr**: Liest die Uhrzeitregel und sagt, ob der Zeitpunkt jetzt gekommen ist.

- Die Bausteine eines [[Glossar#Zeitplan|Zeitplans]]: die Beschreibung, die Ausführung, die Uhrzeitregel und die Übernahme alter [[Glossar#Aufgabe|Aufgaben]].
