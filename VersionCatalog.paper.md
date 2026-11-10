[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[VersionCatalog]] › [[VersionCatalog.paper]]

# VersionCatalog.paper

`VersionCatalog.paper(JsonObject project, int limit)` [src/main/java/de/aichele/childlauncher/VersionCatalog.java:40–51](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/VersionCatalog.java#L40-L51)

```mermaid
flowchart TD
  n1["if Z.43 (versions == null)"]
  n2["return Z.43 return ids;"]
  n3["for Z.44 (String group : versions.keySet())"]
  n4["for Z.45 (JsonElement e : versions.getAsJsonArra…"]
  n5["if Z.47 (ids.size() )= limit)"]
  n6["return Z.47 return ids;"]
  n7["return Z.50 return ids;"]
  n1 -->|"ja"| n2
  n5 -->|"ja"| n6
  n4 -->|"wiederholen"| n5
  n3 -->|"wiederholen"| n4
  n2 --> n3
  n1 --> n3
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `paper` in `src/main/java/de/aichele/childlauncher/VersionCatalog.java`
