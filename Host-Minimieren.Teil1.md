[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]]

# Host-Minimieren.Teil1

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.hostMinimizeStateFile"]:::internal-link
  n2["FabricLauncherPlugin.readHostMinimizeState"]:::internal-link
  n3["FabricLauncherPlugin.writeHostMinimizeState"]:::internal-link
  n4["FabricLauncherPlugin.heapPrevious"]:::internal-link
  n5["FabricLauncherPlugin.restoreHostHeap"]:::internal-link
  n6["FabricLauncherPlugin.hostMinimizeView"]:::internal-link
  n7["FabricLauncherPlugin.hostMinimizeApply"]:::internal-link
  n8["FabricLauncherPlugin.hostMinimizeRollback"]:::internal-link
  n2 -->|"Z.2184"| n1
  n3 -->|"Z.2191"| n1
  n6 -->|"Z.2229"| n2
  n7 -->|"Z.2303"| n3
  n7 -->|"Z.2303"| n4
  n7 -->|"Z.2312"| n6
  n8 -->|"Z.2322"| n2
  n8 -->|"Z.2329"| n5
  n8 -->|"Z.2330"| n1
  n8 -->|"Z.2331"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.hostMinimizeStateFile
  Das [[Glossar#Plugin|Plugin]] kümmert sich um das Verkleinern den Zustand die Datei. Im [[Glossar#Quelltext|Quelltext]] heißt das `hostMinimizeStateFile`.
FabricLauncherPlugin.readHostMinimizeState
  Das [[Glossar#Plugin|Plugin]] liest den [[Glossar#Host|Host]] das Verkleinern den Zustand. Im [[Glossar#Quelltext|Quelltext]] heißt das `readHostMinimizeState`.
FabricLauncherPlugin.writeHostMinimizeState
  Das [[Glossar#Plugin|Plugin]] schreibt den [[Glossar#Host|Host]] das Verkleinern den Zustand. Im [[Glossar#Quelltext|Quelltext]] heißt das `writeHostMinimizeState`.
FabricLauncherPlugin.heapPrevious
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `heapPrevious`.
FabricLauncherPlugin.restoreHostHeap
  Das [[Glossar#Plugin|Plugin]] stellt wieder her den [[Glossar#Host|Host]] den Programmspeicher. Im [[Glossar#Quelltext|Quelltext]] heißt das `restoreHostHeap`.
FabricLauncherPlugin.hostMinimizeView
  Das [[Glossar#Plugin|Plugin]] kümmert sich um das Verkleinern die Ansicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `hostMinimizeView`.
FabricLauncherPlugin.hostMinimizeApply
  Das [[Glossar#Plugin|Plugin]] kümmert sich um das Verkleinern das Anwenden. Im [[Glossar#Quelltext|Quelltext]] heißt das `hostMinimizeApply`.
FabricLauncherPlugin.hostMinimizeRollback
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `hostMinimizeRollback`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.hostMinimizeStateFile**: Das [[Glossar#Plugin|Plugin]] kümmert sich um das Verkleinern den Zustand die Datei. Im [[Glossar#Quelltext|Quelltext]] heißt das `hostMinimizeStateFile`.
> - **FabricLauncherPlugin.readHostMinimizeState**: Das [[Glossar#Plugin|Plugin]] liest den [[Glossar#Host|Host]] das Verkleinern den Zustand. Im [[Glossar#Quelltext|Quelltext]] heißt das `readHostMinimizeState`.
> - **FabricLauncherPlugin.writeHostMinimizeState**: Das [[Glossar#Plugin|Plugin]] schreibt den [[Glossar#Host|Host]] das Verkleinern den Zustand. Im [[Glossar#Quelltext|Quelltext]] heißt das `writeHostMinimizeState`.
> - **FabricLauncherPlugin.heapPrevious**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `heapPrevious`.
> - **FabricLauncherPlugin.restoreHostHeap**: Das [[Glossar#Plugin|Plugin]] stellt wieder her den [[Glossar#Host|Host]] den Programmspeicher. Im [[Glossar#Quelltext|Quelltext]] heißt das `restoreHostHeap`.
> - **FabricLauncherPlugin.hostMinimizeView**: Das [[Glossar#Plugin|Plugin]] kümmert sich um das Verkleinern die Ansicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `hostMinimizeView`.
> - **FabricLauncherPlugin.hostMinimizeApply**: Das [[Glossar#Plugin|Plugin]] kümmert sich um das Verkleinern das Anwenden. Im [[Glossar#Quelltext|Quelltext]] heißt das `hostMinimizeApply`.
> - **FabricLauncherPlugin.hostMinimizeRollback**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `hostMinimizeRollback`.

- Ein weiterer Abschnitt derselben Übersicht.
