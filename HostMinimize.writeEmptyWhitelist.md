[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.writeEmptyWhitelist]]

# HostMinimize.writeEmptyWhitelist

`HostMinimize.writeEmptyWhitelist(Path root, List<Path> protectedPaths)` [src/main/java/de/aichele/childlauncher/HostMinimize.java:221–226](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostMinimize.java#L221-L226)

```mermaid
flowchart TD
  n1["HostMinimize.assertEditable"]:::internal-link
  n2["if Z.224 (Files.isSymbolicLink(whitelist))"]
  n3["throw Z.224 throw new SecurityException('refusing symbolic li…"]
  n4["Schritt Z.225 Files.writeString(whitelist, '()/n');"]
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `writeEmptyWhitelist` in `src/main/java/de/aichele/childlauncher/HostMinimize.java`
