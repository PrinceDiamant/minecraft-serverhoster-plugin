[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.validateNtfySetup]]

# FabricLauncherPlugin.validateNtfySetup

`FabricLauncherPlugin.validateNtfySetup(boolean enabled, String server, String topic)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:643–660](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L643-L660)

```mermaid
flowchart TD
  n1["try Z.645"]
  n2["catch Z.647 (IllegalArgumentException e)"]
  n3["throw Z.648 throw new IllegalArgumentException('Ungültige ntf…"]
  n4["if Z.650 (!('https'.equalsIgnoreCase(uri.getScheme()) // '…"]
  n5["throw Z.652 throw new IllegalArgumentException('ntfy-Server m…"]
  n6["if Z.654 (normalizedTopic.length() ) 128 // (!normalizedTo…"]
  n7["throw Z.656 throw new IllegalArgumentException('ntfy-Thema da…"]
  n8["if Z.657 (enabled && normalizedTopic.isEmpty())"]
  n9["throw Z.658 throw new IllegalArgumentException('Für ntfy muss…"]
  n10["return Z.659 return new NtfySetup(enabled, uri.toString().repl…"]
  n1 -->|"Fehler"| n2
  n2 --> n3
  n4 -->|"ja"| n5
  n1 --> n4
  n3 --> n4
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n6
  n8 -->|"ja"| n9
  n7 --> n8
  n6 --> n8
  n9 --> n10
  n8 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `validateNtfySetup` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
