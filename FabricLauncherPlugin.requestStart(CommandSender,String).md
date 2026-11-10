[[00 Start]] › [[Plugin-Kern]] › [[Slot-Aktionen]] › [[FabricLauncherPlugin.requestStart(CommandSender,String)]]

# FabricLauncherPlugin.requestStart(CommandSender,String)

`FabricLauncherPlugin.requestStart(CommandSender sender, String id)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:325–327](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L325-L327)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.startAsync"]:::internal-link
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.startAsync
  Beginnt den Start des [[Glossar#Spielserver|Spielservers]] im Hintergrund, damit der [[Glossar#Host|Host]] dabei nicht stehen bleibt. Im [[Glossar#Quelltext|Quelltext]] heißt das `startAsync`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.startAsync**: Beginnt den Start des [[Glossar#Spielserver|Spielservers]] im Hintergrund, damit der [[Glossar#Host|Host]] dabei nicht stehen bleibt. Im [[Glossar#Quelltext|Quelltext]] heißt das `startAsync`.

- Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu starten.
