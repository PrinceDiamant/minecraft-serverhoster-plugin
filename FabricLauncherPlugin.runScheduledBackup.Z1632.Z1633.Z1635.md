[[00 Start]] › [[Backup]] › [[Backup-Lauf]] › [[FabricLauncherPlugin.runScheduledBackup]] › [[FabricLauncherPlugin.runScheduledBackup.Z1632.Z1633.Z1635]]

# FabricLauncherPlugin.runScheduledBackup.Z1632.Z1633.Z1635

```mermaid
flowchart TD
  n1["if Z.1635 (System.nanoTime() )= nextWaitNotice)"]
  n2["ConsoleBuffer.add"]:::internal-link
  n3["FabricLauncherPlugin.noteTask"]:::internal-link
  n4["Schritt Z.1640 nextWaitNotice = System.nanoTime() + TimeUnit.MIN…"]
  n2 --> n3
  n3 --> n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1635 (System.nanoTime() )= nextWaitNotice)
  Zeile 1635: prüft `(System.nanoTime() )= nextWaitNotice)`.
ConsoleBuffer.add
  Dieser Teil fügt hinzu das. Fügt hinzu `add`.
FabricLauncherPlugin.noteTask
  Schreibt auf, dass eine [[Glossar#Aufgabe|Aufgabe]] gelaufen ist. Merkt `noteTask`.
Schritt Z.1640 nextWaitNotice = System.nanoTime() + TimeUnit.MIN…
  Zeile 1640: rechnet Zeit um oder wartet. `nextWaitNotice = System.nanoTime() + TimeUnit.MIN…`
```

> [!knoten]- Was die Blöcke tun
> - **if Z.1635 (System.nanoTime() )= nextWaitNotice)**: Zeile 1635: prüft `(System.nanoTime() )= nextWaitNotice)`.
> - **ConsoleBuffer.add**: Dieser Teil fügt hinzu das. Fügt hinzu `add`.
> - **FabricLauncherPlugin.noteTask**: Schreibt auf, dass eine [[Glossar#Aufgabe|Aufgabe]] gelaufen ist. Merkt `noteTask`.
> - **Schritt Z.1640 nextWaitNotice = System.nanoTime() + TimeUnit.MIN…**: Zeile 1640: rechnet Zeit um oder wartet. `nextWaitNotice = System.nanoTime() + TimeUnit.MIN…`

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1635 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.runScheduledBackup.Z1632.Z1633`.
