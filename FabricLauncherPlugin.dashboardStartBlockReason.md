[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.dashboardStartBlockReason]]

# FabricLauncherPlugin.dashboardStartBlockReason

`FabricLauncherPlugin.dashboardStartBlockReason()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:372–378](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L372-L378)

```mermaid
flowchart TD
  n1["if Z.373 (setupRequired)"]
  n2["return Z.373 return 'Bitte zuerst die ServerHoster-Einrichtung…"]
  n3["if Z.374 (hostFirstSetupRestartRequired // hostFirstSetupB…"]
  n4["return Z.375 return 'Die Host-Grundeinrichtung ist noch nicht …"]
  n5["if Z.376 (shuttingDown)"]
  n6["return Z.376 return 'Der Host wird heruntergefahren.';"]
  n7["return Z.377 return '';"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `dashboardStartBlockReason` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
