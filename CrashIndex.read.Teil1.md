[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[CrashIndex]] › [[CrashIndex.read]] › [[CrashIndex.read.Teil1]]

# CrashIndex.read.Teil1

```mermaid
flowchart TD
  n1["if Z.39 (file == null // !NAME.matcher(file).matches())"]
  n2["throw Z.39 throw new SecurityException('Pfad außerhalb des S…"]
  n3["PathGuard.open"]:::internal-link
  n4["PathGuard.resolve"]:::internal-link
  n5["if Z.42 (Files.isSymbolicLink(dir))"]
  n6["throw Z.42 throw new SecurityException('Pfad außerhalb des S…"]
  n7["PathGuard.resolve"]:::internal-link
  n8["if Z.44 (Files.isSymbolicLink(p))"]
  n9["throw Z.44 throw new SecurityException('Pfad außerhalb des S…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n5 -->|"ja"| n6
  n4 --> n5
  n6 --> n7
  n5 --> n7
  n8 -->|"ja"| n9
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `CrashIndex.read`, Quellreihenfolge.
