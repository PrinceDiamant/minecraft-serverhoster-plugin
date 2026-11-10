[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupDiscovery]] › [[SetupDiscovery.loadLegacyConfig]]

# SetupDiscovery.loadLegacyConfig

`SetupDiscovery.loadLegacyConfig(Path path)` [src/main/java/de/aichele/childlauncher/SetupDiscovery.java:91–99](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/SetupDiscovery.java#L91-L99)

```mermaid
flowchart TD
  n1["try Z.93"]
  n2["catch Z.95 (org.bukkit.configuration.Inv…"]
  n3["throw Z.96 throw new IOException('Legacy ServerHoster config…"]
  n4["return Z.98 return config;"]
  n1 -->|"Fehler"| n2
  n2 --> n3
  n1 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `loadLegacyConfig` in `src/main/java/de/aichele/childlauncher/SetupDiscovery.java`
