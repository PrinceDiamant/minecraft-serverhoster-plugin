[[00 Start]] › [[Plugin-Kern]] › [[Slot-Aktionen]] › [[FabricLauncherPlugin.requestRestart()]]

# FabricLauncherPlugin.requestRestart()

`FabricLauncherPlugin.requestRestart()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:320–320](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L320-L320)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.requestRestart(String)"]:::internal-link
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.requestRestart(String)
  Bittet darum, den [[Glossar#Spielserver|Spielserver]] neu zu starten. Im [[Glossar#Quelltext|Quelltext]] heißt das `requestRestart(String)`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.requestRestart(String)**: Bittet darum, den [[Glossar#Spielserver|Spielserver]] neu zu starten. Im [[Glossar#Quelltext|Quelltext]] heißt das `requestRestart(String)`.

- Bittet darum, den [[Glossar#Spielserver|Spielserver]] neu zu starten.
- Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
