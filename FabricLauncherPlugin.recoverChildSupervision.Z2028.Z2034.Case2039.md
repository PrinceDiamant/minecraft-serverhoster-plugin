[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.recoverChildSupervision]] › [[FabricLauncherPlugin.recoverChildSupervision.Z2028.Z2034.Case2039]]

# FabricLauncherPlugin.recoverChildSupervision.Z2028.Z2034.Case2039

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.armPipe"]:::internal-link
  n2["FabricLauncherPlugin.consolePrefix"]:::internal-link
  n1 -->|"Z.2041"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.armPipe
  Schaltet das Mitlesen der [[Glossar#Konsole|Konsole]] an. Hängt die Überwachung an `armPipe`. Ruft `pipe`.
FabricLauncherPlugin.consolePrefix
  Setzt eine kurze Kennung vor jede [[Glossar#Zeile|Zeile]], damit man sie dem [[Glossar#Spielserver|Spielserver]] zuordnen kann. Liefert die [[Glossar#Konsole|Konsole]] `consolePrefix`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.armPipe**: Schaltet das Mitlesen der [[Glossar#Konsole|Konsole]] an. Hängt die Überwachung an `armPipe`. Ruft `pipe`.
> - **FabricLauncherPlugin.consolePrefix**: Setzt eine kurze Kennung vor jede [[Glossar#Zeile|Zeile]], damit man sie dem [[Glossar#Spielserver|Spielserver]] zuordnen kann. Liefert die [[Glossar#Konsole|Konsole]] `consolePrefix`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 2039.
- Fortsetzung von `FabricLauncherPlugin.recoverChildSupervision.Z2028.Z2034`.
