[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Stopp]] › [[FabricLauncherPlugin.resumeConfiguredAutoStart]]

# FabricLauncherPlugin.resumeConfiguredAutoStart

`FabricLauncherPlugin.resumeConfiguredAutoStart()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1140–1145](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1140-L1145)

```mermaid
flowchart TD
  n1["if Z.1141 (!autoStartInitialized // recoveryBlockedSince !=…"]
  n2["return Z.1141 return;"]
  n3["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n4["for Z.1143 (ServerProfile p : profiles)"]
  n5["if Z.1144 (p.autoStart)"]
  n6["FabricLauncherPlugin.startAsync"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 -->|"wiederholen"| n5
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1141 (!autoStartInitialized // recoveryBlockedSince !=…
  Zeile 1141: prüft `(!autoStartInitialized // recoveryBlockedSince !=…`.
return Z.1141 return;
  Zeile 1141: Rückgabe `return;`.
FabricLauncherPlugin.notifyNtfy
  Meldet `notifyNtfy`. Ruft `ntfySettings`, `backupCredentials`, `send`.
for Z.1143 (ServerProfile p : profiles)
  Zeile 1143: Schleife `(ServerProfile p : profiles)`.
if Z.1144 (p.autoStart)
  Zeile 1144: prüft `(p.autoStart)`.
FabricLauncherPlugin.startAsync
  Startet `startAsync`. Ruft `msg`, `slot`, `invalidateRestarts`.
```

- `resumeConfiguredAutoStart` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
