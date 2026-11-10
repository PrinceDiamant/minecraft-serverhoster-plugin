[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.startSampler]]

# FabricLauncherPlugin.startSampler

`FabricLauncherPlugin.startSampler()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1799–1816](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1799-L1816)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.startSampler.Z1802"]:::internal-link
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.startSampler.Z1802
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1802 weiter. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `Z1802`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.startSampler.Z1802**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1802 weiter. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `Z1802`.

```mermaid
sequenceDiagram
  participant Main as Server-Thread
  Main->>Main: runTaskTimer Verzoegerung 1 Tick, Periode 1 Tick, Z.1815
  Note over Main: outerMspt nur wenn tickIdx % 20 == 0, Z.1806
```

- Lässt regelmäßig aufschreiben, wie der [[Glossar#Spielserver|Spielserver]] gerade läuft. Der Abstand ist ein [[Glossar#Spielschritt|Spielschritt]] des [[Glossar#Host|Host]].
- Auffällig: ein Kommentar oder eine Meldung sagt etwas anderes als der Ablauf. Das nennt man [[Glossar#Widerspruch|Widerspruch]].
