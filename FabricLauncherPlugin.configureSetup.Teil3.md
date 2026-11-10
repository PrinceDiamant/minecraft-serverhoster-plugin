[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.configureSetup]] › [[FabricLauncherPlugin.configureSetup.Teil3]]

# FabricLauncherPlugin.configureSetup.Teil3

```mermaid
flowchart TD
  n1["Schritt Z.576 getConfig().set('servers', null);"]
  n2["Schritt Z.577 getConfig().set('metadata.schemaVersion', 2);"]
  n3["Schritt Z.578 getConfig().set('metadata.pluginVersion', getDesc…"]
  n4["Schritt Z.579 getConfig().set('metadata.migrationState', 'compl…"]
  n5["FabricLauncherPlugin.configureSetup.Teil3.Z580"]:::internal-link
  n6["FabricLauncherPlugin.reloadProfiles"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n6 fill:#f88,stroke:#900
```

```knoten
Schritt Z.576 getConfig().set('servers', null);
  Zeile 576: liest die Config. `getConfig().set('servers', null);`
Schritt Z.577 getConfig().set('metadata.schemaVersion', 2);
  Zeile 577: liest die Config. `getConfig().set('metadata.schemaVersion', 2);`
Schritt Z.578 getConfig().set('metadata.pluginVersion', getDesc…
  Zeile 578: liest die Config. `getConfig().set('metadata.pluginVersion', getDesc…`
Schritt Z.579 getConfig().set('metadata.migrationState', 'compl…
  Zeile 579: liest die Config. `getConfig().set('metadata.migrationState', 'compl…`
FabricLauncherPlugin.configureSetup.Teil3.Z580
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 580 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 580.
FabricLauncherPlugin.reloadProfiles
  Liest die Server aus den [[Glossar#Einstellungen|Einstellungen]] neu und behält nur den ersten. `Profiles.load`, danach nur `getFirst()`. [[Glossar#Befund|Befund]]: angemeldet aber nicht umgesetzt, sicher. FabricLauncherPlugin.java:266–272 getFirst verwirft servers.*
```

> [!knoten]- Was die Blöcke tun
> - **Schritt Z.576 getConfig().set('servers', null);**: Zeile 576: liest die Config. `getConfig().set('servers', null);`
> - **Schritt Z.577 getConfig().set('metadata.schemaVersion', 2);**: Zeile 577: liest die Config. `getConfig().set('metadata.schemaVersion', 2);`
> - **Schritt Z.578 getConfig().set('metadata.pluginVersion', getDesc…**: Zeile 578: liest die Config. `getConfig().set('metadata.pluginVersion', getDesc…`
> - **Schritt Z.579 getConfig().set('metadata.migrationState', 'compl…**: Zeile 579: liest die Config. `getConfig().set('metadata.migrationState', 'compl…`
> - **FabricLauncherPlugin.configureSetup.Teil3.Z580**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 580 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 580.
> - **FabricLauncherPlugin.reloadProfiles**: Liest die Server aus den [[Glossar#Einstellungen|Einstellungen]] neu und behält nur den ersten. `Profiles.load`, danach nur `getFirst()`. [[Glossar#Befund|Befund]]: angemeldet aber nicht umgesetzt, sicher. FabricLauncherPlugin.java:266–272 getFirst verwirft servers.*

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.configureSetup`.
