[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[TaskWorkflow]]

# TaskWorkflow

```mermaid
flowchart TD
  n1["TaskWorkflow.newId"]:::internal-link
  n2["TaskWorkflow.newDraft"]:::internal-link
  n3["TaskWorkflow.draftFrom"]:::internal-link
  n4["TaskWorkflow.describeSchedule"]:::internal-link
  n5["TaskWorkflow.dateLabel"]:::internal-link
  n6["TaskWorkflow.askBeforeDelete"]:::internal-link
  n7["TaskWorkflow.TaskWorkflow"]:::internal-link
  n2 -->|"Z.70"| n1
  n7 -->|"Z.257"| n2
  n7 -->|"Z.315"| n4
  n7 -->|"Z.329"| n3
  n7 -->|"Z.341"| n5
  n7 -->|"Z.428"| n1
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
TaskWorkflow.newId
  Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um die Kennung. Im [[Glossar#Quelltext|Quelltext]] heißt das `newId`.
TaskWorkflow.newDraft
  Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `newDraft`.
TaskWorkflow.draftFrom
  Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um aus. Im [[Glossar#Quelltext|Quelltext]] heißt das `draftFrom`.
TaskWorkflow.describeSchedule
  Die [[Glossar#Bedienseite|Bedienseite]] plant das. Im [[Glossar#Quelltext|Quelltext]] heißt das `describeSchedule`.
TaskWorkflow.dateLabel
  Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um die Beschriftung. Im [[Glossar#Quelltext|Quelltext]] heißt das `dateLabel`.
TaskWorkflow.askBeforeDelete
  Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `askBeforeDelete`.
TaskWorkflow.TaskWorkflow
  Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um den Ablauf. Im [[Glossar#Quelltext|Quelltext]] heißt das `TaskWorkflow`.
```

> [!knoten]- Was die Blöcke tun
> - **TaskWorkflow.newId**: Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um die Kennung. Im [[Glossar#Quelltext|Quelltext]] heißt das `newId`.
> - **TaskWorkflow.newDraft**: Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `newDraft`.
> - **TaskWorkflow.draftFrom**: Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um aus. Im [[Glossar#Quelltext|Quelltext]] heißt das `draftFrom`.
> - **TaskWorkflow.describeSchedule**: Die [[Glossar#Bedienseite|Bedienseite]] plant das. Im [[Glossar#Quelltext|Quelltext]] heißt das `describeSchedule`.
> - **TaskWorkflow.dateLabel**: Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um die Beschriftung. Im [[Glossar#Quelltext|Quelltext]] heißt das `dateLabel`.
> - **TaskWorkflow.askBeforeDelete**: Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `askBeforeDelete`.
> - **TaskWorkflow.TaskWorkflow**: Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um den Ablauf. Im [[Glossar#Quelltext|Quelltext]] heißt das `TaskWorkflow`.

- Der Ablauf in der [[Glossar#Bedienseite|Bedienseite]] für Zeitpläne und die ältere Aufgabenliste.
