[[00 Start]] › [[Plugin-Kern]] › [[Benachrichtigung]] › [[FabricLauncherPlugin.notifyNtfy]]

# FabricLauncherPlugin.notifyNtfy

`FabricLauncherPlugin.notifyNtfy(String title, String message, String priority)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:209–224](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L209-L224)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.ntfySettings"]:::internal-link
  n2["if Z.211 (!settings.enabled() // settings.topic() == null …"]
  n3["return Z.211 return;"]
  n4["FabricLauncherPlugin.notifyNtfy.Z212"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `notifyNtfy` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
