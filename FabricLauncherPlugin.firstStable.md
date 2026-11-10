[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[FabricLauncherPlugin.firstStable]]

# FabricLauncherPlugin.firstStable

`FabricLauncherPlugin.firstStable(JsonArray arr, boolean loaderWrapped)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:2583–2591](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L2583-L2591)

```mermaid
flowchart TD
  n1["for Z.2584 (JsonElement e : arr)"]
  n2["if Z.2586 (loaderWrapped)"]
  n3["if Z.2587 (o.get('stable').getAsBoolean())"]
  n4["return Z.2587 return o.get('version').getAsString();"]
  n5["return Z.2590 return (loaderWrapped ? o.getAsJsonObject('loader…"]
  n3 -->|"ja"| n4
  n2 --> n3
  n2 --> n3
  n1 -->|"wiederholen"| n2
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `firstStable` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
