[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[ScheduleExecution]]

# ScheduleExecution

```mermaid
flowchart TD
  n1["ScheduleExecution.ScheduleExecution"]:::internal-link
  n2["ScheduleExecution.run"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ScheduleExecution.ScheduleExecution
  Dieser Teil plant die Ausführung. Im [[Glossar#Quelltext|Quelltext]] heißt das `ScheduleExecution`.
ScheduleExecution.run
  Dieser Teil führt aus das. Im [[Glossar#Quelltext|Quelltext]] heißt das `run`.
```

> [!knoten]- Was die Blöcke tun
> - **ScheduleExecution.ScheduleExecution**: Dieser Teil plant die Ausführung. Im [[Glossar#Quelltext|Quelltext]] heißt das `ScheduleExecution`.
> - **ScheduleExecution.run**: Dieser Teil führt aus das. Im [[Glossar#Quelltext|Quelltext]] heißt das `run`.

- Führt einen [[Glossar#Zeitplan|Zeitplan]] aus, wenn er fällig ist.
