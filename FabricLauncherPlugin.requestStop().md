[[00 Start]] › [[Plugin-Kern]] › [[Slot-Aktionen]] › [[FabricLauncherPlugin.requestStop()]]

# FabricLauncherPlugin.requestStop()

`FabricLauncherPlugin.requestStop()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:319–319](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L319-L319)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.requestStop(String)"]:::internal-link
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.requestStop(String)
  Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu stoppen. Im [[Glossar#Quelltext|Quelltext]] heißt das `requestStop(String)`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.requestStop(String)**: Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu stoppen. Im [[Glossar#Quelltext|Quelltext]] heißt das `requestStop(String)`.

- Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu stoppen.
- Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
