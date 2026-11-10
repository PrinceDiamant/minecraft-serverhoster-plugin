[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil2]] › [[HostFirstSetup.addIfDirectory]]

# HostFirstSetup.addIfDirectory

`HostFirstSetup.addIfDirectory(Path root, String name, Set<Path> worlds)` [src/main/java/de/aichele/childlauncher/HostFirstSetup.java:225–230](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostFirstSetup.java#L225-L230)

```mermaid
flowchart TD
  n1["if Z.226 (!safeWorldName(name))"]
  n2["HostFirstSetup.safeWorldName"]:::internal-link
  n3["return Z.226 return;"]
  n4["if Z.228 (candidate.getParent() != null && candidate.getPa…"]
  n1 -->|"Z.226"| n2
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `addIfDirectory` in `src/main/java/de/aichele/childlauncher/HostFirstSetup.java`
