[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[LaunchPlan]] › [[LaunchPlan.jarPath]]

# LaunchPlan.jarPath

`LaunchPlan.jarPath(ServerProfile profile)` [src/main/java/de/aichele/childlauncher/LaunchPlan.java:25–28](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/LaunchPlan.java#L25-L28)

```mermaid
flowchart TD
  n1["if Z.26 ('custom'.equalsIgnoreCase(profile.type))"]
  n2["return Z.26 return Paths.get(profile.customJar == null // pro…"]
  n3["ServerProfile.directory"]:::internal-link
  n4["LaunchPlan.jarName"]:::internal-link
  n5["return Z.27 return profile.directory().resolve(jarN…"]
  n1 -->|"ja"| n2
  n3 -->|"Z.27"| n4
  n4 --> n5
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `jarPath` in `src/main/java/de/aichele/childlauncher/LaunchPlan.java`
