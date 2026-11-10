[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.applySetupProfile]]

# FabricLauncherPlugin.applySetupProfile

`FabricLauncherPlugin.applySetupProfile(Path directory, String type, String mcVersion, int port)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:670–677](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L670-L677)

```mermaid
flowchart TD
  n1["Schritt Z.671 getConfig().set('type', type);"]
  n2["Schritt Z.672 getConfig().set('mcVersion', mcVersion);"]
  n3["Schritt Z.673 getConfig().set('port', port);"]
  n4["Schritt Z.674 getConfig().set('workingDir', directory.toString(…"]
  n5["Schritt Z.675 getConfig().set('autoStart', true);"]
  n6["Schritt Z.676 getConfig().set('serverProperties', Map.of());"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.671 getConfig().set('type', type);
  Zeile 671: liest die Config. `getConfig().set('type', type);`
Schritt Z.672 getConfig().set('mcVersion', mcVersion);
  Zeile 672: liest die Config. `getConfig().set('mcVersion', mcVersion);`
Schritt Z.673 getConfig().set('port', port);
  Zeile 673: liest die Config. `getConfig().set('port', port);`
Schritt Z.674 getConfig().set('workingDir', directory.toString(…
  Zeile 674: liest die Config. `getConfig().set('workingDir', directory.toString(…`
Schritt Z.675 getConfig().set('autoStart', true);
  Zeile 675: liest die Config. `getConfig().set('autoStart', true);`
Schritt Z.676 getConfig().set('serverProperties', Map.of());
  Zeile 676: liest die Config. `getConfig().set('serverProperties', Map.of());`
```

- `applySetupProfile` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
