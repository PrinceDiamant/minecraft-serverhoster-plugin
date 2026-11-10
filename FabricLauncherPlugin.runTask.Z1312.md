[[00 Start]] › [[Zeitplaene]] › [[Tasks]] › [[FabricLauncherPlugin.runTask]] › [[FabricLauncherPlugin.runTask.Z1312]]

# FabricLauncherPlugin.runTask.Z1312

```mermaid
flowchart TD
  n1["try Z.1312"]
  n2["FabricLauncherPlugin.executeTask"]:::internal-link
  n3["FabricLauncherPlugin.noteTask"]:::internal-link
  n4["catch Z.1315 (InterruptedException e)"]
  n5["FabricLauncherPlugin.noteTask"]:::internal-link
  n6["catch Z.1319 (Exception e)"]
  n7["FabricLauncherPlugin.noteTask"]:::internal-link
  n8["if Z.1322 (!'backup'.equals(task.action))"]
  n9["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  n1 -->|"Fehler"| n6
  n8 -->|"ja"| n9
  n7 --> n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.1312
  Zeile 1312: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.executeTask
  Das [[Glossar#Plugin|Plugin]] führt aus die [[Glossar#Aufgabe|Aufgabe]]. Führt aus `executeTask`. Ruft `startAsync`, `slot`, `stopBlocking`.
FabricLauncherPlugin.noteTask
  Schreibt auf, dass eine [[Glossar#Aufgabe|Aufgabe]] gelaufen ist. Merkt `noteTask`.
catch Z.1315 (InterruptedException e)
  Zeile 1315: fängt (InterruptedException e).
catch Z.1319 (Exception e)
  Zeile 1319: fängt (Exception e).
if Z.1322 (!'backup'.equals(task.action))
  Zeile 1322: prüft `(!'backup'.equals(task.action))`.
FabricLauncherPlugin.notifyNtfy
  Das [[Glossar#Plugin|Plugin]] meldet den Mitteilungsdienst. Meldet `notifyNtfy`. Ruft `ntfySettings`, `backupCredentials`, `send`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.1312**: Zeile 1312: Versuch. Der Fehlerpfad geht in catch.
> - **FabricLauncherPlugin.executeTask**: Das [[Glossar#Plugin|Plugin]] führt aus die [[Glossar#Aufgabe|Aufgabe]]. Führt aus `executeTask`. Ruft `startAsync`, `slot`, `stopBlocking`.
> - **FabricLauncherPlugin.noteTask**: Schreibt auf, dass eine [[Glossar#Aufgabe|Aufgabe]] gelaufen ist. Merkt `noteTask`.
> - **catch Z.1315 (InterruptedException e)**: Zeile 1315: fängt (InterruptedException e).
> - **catch Z.1319 (Exception e)**: Zeile 1319: fängt (Exception e).
> - **if Z.1322 (!'backup'.equals(task.action))**: Zeile 1322: prüft `(!'backup'.equals(task.action))`.
> - **FabricLauncherPlugin.notifyNtfy**: Das [[Glossar#Plugin|Plugin]] meldet den Mitteilungsdienst. Meldet `notifyNtfy`. Ruft `ntfySettings`, `backupCredentials`, `send`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1312 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.runTask`.
