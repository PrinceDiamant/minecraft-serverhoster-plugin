[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil3]] › [[HostMinimize.assertRoot]]

# HostMinimize.assertRoot

`HostMinimize.assertRoot(Path root, List<Path> protectedPaths)` [src/main/java/de/aichele/childlauncher/HostMinimize.java:253–266](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostMinimize.java#L253-L266)

```mermaid
flowchart TD
  n1["if Z.254 (protectedPaths.isEmpty())"]
  n2["throw Z.254 throw new SecurityException('protected paths are …"]
  n3["if Z.255 (!Files.isDirectory(root))"]
  n4["throw Z.255 throw new IOException('server root is not a direc…"]
  n5["if Z.256 (Files.isSymbolicLink(root))"]
  n6["throw Z.256 throw new SecurityException('server root must not…"]
  n7["HostMinimize.assertRoot.Z257"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `assertRoot` in `src/main/java/de/aichele/childlauncher/HostMinimize.java`
