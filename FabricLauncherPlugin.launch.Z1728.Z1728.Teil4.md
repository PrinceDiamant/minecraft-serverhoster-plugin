[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.launch]] › [[FabricLauncherPlugin.launch.Z1728.Z1728.Teil4]]

# FabricLauncherPlugin.launch.Z1728.Z1728.Teil4

```mermaid
flowchart TD
  n1["ConsoleBuffer.add"]:::internal-link
  n2["FabricLauncherPlugin.rememberProcess"]:::internal-link
  n3["FabricLauncherPlugin.armPipe"]:::internal-link
  n4["FabricLauncherPlugin.consolePrefix"]:::internal-link
  n1 --> n2
  n3 -->|"Z.1762"| n4
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ConsoleBuffer.add
  Dieser Teil fügt hinzu das. Fügt hinzu `add`.
FabricLauncherPlugin.rememberProcess
  Merkt sich Programmnummer und [[Glossar#Programmdatei|Programmdatei]], damit das [[Glossar#Plugin|Plugin]] den [[Glossar#Spielserver|Spielserver]] später wiederfindet. Merkt sich den [[Glossar#Prozess|Prozess]] `rememberProcess`. Ruft `write`, `processRecord`, `directory`.
FabricLauncherPlugin.armPipe
  Schaltet das Mitlesen der [[Glossar#Konsole|Konsole]] an. Hängt die Überwachung an `armPipe`. Ruft `pipe`.
FabricLauncherPlugin.consolePrefix
  Setzt eine kurze Kennung vor jede [[Glossar#Zeile|Zeile]], damit man sie dem [[Glossar#Spielserver|Spielserver]] zuordnen kann. Liefert die [[Glossar#Konsole|Konsole]] `consolePrefix`.
```

> [!knoten]- Was die Blöcke tun
> - **ConsoleBuffer.add**: Dieser Teil fügt hinzu das. Fügt hinzu `add`.
> - **FabricLauncherPlugin.rememberProcess**: Merkt sich Programmnummer und [[Glossar#Programmdatei|Programmdatei]], damit das [[Glossar#Plugin|Plugin]] den [[Glossar#Spielserver|Spielserver]] später wiederfindet. Merkt sich den [[Glossar#Prozess|Prozess]] `rememberProcess`. Ruft `write`, `processRecord`, `directory`.
> - **FabricLauncherPlugin.armPipe**: Schaltet das Mitlesen der [[Glossar#Konsole|Konsole]] an. Hängt die Überwachung an `armPipe`. Ruft `pipe`.
> - **FabricLauncherPlugin.consolePrefix**: Setzt eine kurze Kennung vor jede [[Glossar#Zeile|Zeile]], damit man sie dem [[Glossar#Spielserver|Spielserver]] zuordnen kann. Liefert die [[Glossar#Konsole|Konsole]] `consolePrefix`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.launch.Z1728.Z1728`.
