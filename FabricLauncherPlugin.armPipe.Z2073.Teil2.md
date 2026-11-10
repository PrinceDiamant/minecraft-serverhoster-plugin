[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.armPipe]] › [[FabricLauncherPlugin.armPipe.Z2073.Teil2]]

# FabricLauncherPlugin.armPipe.Z2073.Teil2

```mermaid
flowchart TD
  n1["try Z.2087"]
  n2["FabricLauncherPlugin.pipe"]:::internal-link
  n3["catch Z.2089 (RejectedExecutionException e)"]
  n4["if Z.2090 (slot.pipeGeneration.get() == generation)"]
  n5["throw Z.2091 throw e;"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n4 --> n5
  n4 --> n5
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.2087
  Zeile 2087: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.pipe
  Liest die [[Glossar#Konsole|Konsole]] [[Glossar#Zeile|Zeile]] für Zeile mit, bis das Programm endet. Liest eine Prozessausgabe `pipe`. Ruft `parseTick`, `add`, `trackPlayers`.
catch Z.2089 (RejectedExecutionException e)
  Zeile 2089: fängt (RejectedExecutionException e).
if Z.2090 (slot.pipeGeneration.get() == generation)
  Zeile 2090: prüft `(slot.pipeGeneration.get() == generation)`.
throw Z.2091 throw e;
  Zeile 2091: Abbruch `throw e;`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.2087**: Zeile 2087: Versuch. Der Fehlerpfad geht in catch.
> - **FabricLauncherPlugin.pipe**: Liest die [[Glossar#Konsole|Konsole]] [[Glossar#Zeile|Zeile]] für Zeile mit, bis das Programm endet. Liest eine Prozessausgabe `pipe`. Ruft `parseTick`, `add`, `trackPlayers`.
> - **catch Z.2089 (RejectedExecutionException e)**: Zeile 2089: fängt (RejectedExecutionException e).
> - **if Z.2090 (slot.pipeGeneration.get() == generation)**: Zeile 2090: prüft `(slot.pipeGeneration.get() == generation)`.
> - **throw Z.2091 throw e;**: Zeile 2091: Abbruch `throw e;`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.armPipe.Z2073`.
