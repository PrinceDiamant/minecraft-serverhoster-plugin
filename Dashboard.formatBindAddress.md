[[00 Start]] › [[Dashboard-HTTP]] › [[API-Status]] › [[Dashboard.formatBindAddress]]

# Dashboard.formatBindAddress

`Dashboard.formatBindAddress(String address, int port)` [src/main/java/de/aichele/childlauncher/Dashboard.java:528–532](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L528-L532)

```mermaid
flowchart TD
  n1["if Z.529 (address.isBlank() // address.equals('0.0.0.0') /…"]
  n2["return Z.530 return 'Alle Interfaces (Port ' + port + ')';"]
  n3["return Z.531 return (address.contains(':') && !address.startsW…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `formatBindAddress` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
