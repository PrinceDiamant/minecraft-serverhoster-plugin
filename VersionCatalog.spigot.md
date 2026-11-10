[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[VersionCatalog]] › [[VersionCatalog.spigot]]

# VersionCatalog.spigot

`VersionCatalog.spigot(String html, int limit)` [src/main/java/de/aichele/childlauncher/VersionCatalog.java:53–64](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/VersionCatalog.java#L53-L64)

```mermaid
flowchart TD
  n1["while Z.56 (m.find())"]
  n2["if Z.58 (name.equals('latest.json') // name.contains('/'))"]
  n3["VersionCatalog.compare"]:::internal-link
  n4["if Z.62 (ids.size() ) limit)"]
  n5["return Z.62 return new ArrayList()(ids.subList(0, limit));"]
  n6["return Z.63 return ids;"]
  n1 -->|"wiederholen"| n2
  n2 --> n3
  n2 --> n3
  n4 -->|"ja"| n5
  n3 --> n4
  n5 --> n6
  n4 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `spigot` in `src/main/java/de/aichele/childlauncher/VersionCatalog.java`
