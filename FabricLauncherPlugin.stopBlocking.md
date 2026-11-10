[[00 Start]] › [[Child-Prozess]] › [[Stopp]] › [[FabricLauncherPlugin.stopBlocking]]

# FabricLauncherPlugin.stopBlocking

`FabricLauncherPlugin.stopBlocking(ChildSlot slot)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1980–1991](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1980-L1991)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.invalidateRestarts"]:::internal-link
  n2["FabricLauncherPlugin.stopBlocking.Z1985"]:::internal-link
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.invalidateRestarts
  Vergisst geplante [[Glossar#Neustart|Neustarts]], damit ein absichtlicher [[Glossar#Stopp|Stopp]] nicht gleich wieder startet. Im [[Glossar#Quelltext|Quelltext]] heißt das `invalidateRestarts`.
FabricLauncherPlugin.stopBlocking.Z1985
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1985 weiter. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `Z1985`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.invalidateRestarts**: Vergisst geplante [[Glossar#Neustart|Neustarts]], damit ein absichtlicher [[Glossar#Stopp|Stopp]] nicht gleich wieder startet. Im [[Glossar#Quelltext|Quelltext]] heißt das `invalidateRestarts`.
> - **FabricLauncherPlugin.stopBlocking.Z1985**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1985 weiter. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `Z1985`.

- Setzt den Zustand auf „stoppt“ und wartet, bis der [[Glossar#Spielserver|Spielserver]] wirklich aus ist.
