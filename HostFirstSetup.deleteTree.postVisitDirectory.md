[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil3]] › [[HostFirstSetup.deleteTree]] › [[HostFirstSetup.deleteTree.postVisitDirectory]]

# HostFirstSetup.deleteTree.postVisitDirectory

`HostFirstSetup.postVisitDirectory(Path directory, IOException error)` [src/main/java/de/aichele/childlauncher/HostFirstSetup.java:316–321](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostFirstSetup.java#L316-L321)

```mermaid
flowchart TD
  n1["if Z.318 (error != null)"]
  n2["throw Z.318 throw error;"]
  n3["Schritt Z.319 Files.delete(directory);"]
  n4["return Z.320 return FileVisitResult.CONTINUE;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `postVisitDirectory` in `src/main/java/de/aichele/childlauncher/HostFirstSetup.java`
