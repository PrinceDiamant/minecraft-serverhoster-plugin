[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil2]] › [[HostFirstSetup.requireRoot]]

# HostFirstSetup.requireRoot

`HostFirstSetup.requireRoot(Path root)` [src/main/java/de/aichele/childlauncher/HostFirstSetup.java:196–204](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostFirstSetup.java#L196-L204)

```mermaid
flowchart TD
  n1["if Z.197 (root == null // Files.isSymbolicLink(root) // !F…"]
  n2["throw Z.198 throw new SecurityException('server root must be …"]
  n3["if Z.200 (real.getNameCount() ( 2 // 'LiteStorage'.equalsI…"]
  n4["throw Z.202 throw new SecurityException('refusing to prepare …"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `requireRoot` in `src/main/java/de/aichele/childlauncher/HostFirstSetup.java`
