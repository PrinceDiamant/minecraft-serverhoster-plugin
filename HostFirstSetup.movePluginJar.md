[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil3]] › [[HostFirstSetup.movePluginJar]]

# HostFirstSetup.movePluginJar

`HostFirstSetup.movePluginJar(PluginJar pluginJar)` [src/main/java/de/aichele/childlauncher/HostFirstSetup.java:299–305](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostFirstSetup.java#L299-L305)

```mermaid
flowchart TD
  n1["try Z.300"]
  n2["Schritt Z.301 Files.move(pluginJar.source(), pluginJar.disabled…"]
  n3["catch Z.302 (AtomicMoveNotSupportedExcept…"]
  n4["Schritt Z.303 Files.move(pluginJar.source(), pluginJar.disabled…"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `movePluginJar` in `src/main/java/de/aichele/childlauncher/HostFirstSetup.java`
