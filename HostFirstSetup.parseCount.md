[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil3]] › [[HostFirstSetup.parseCount]]

# HostFirstSetup.parseCount

`HostFirstSetup.parseCount(String value)` [src/main/java/de/aichele/childlauncher/HostFirstSetup.java:350–356](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostFirstSetup.java#L350-L356)

```mermaid
flowchart TD
  n1["try Z.351"]
  n2["return Z.352 return Math.max(0, Integer.parseInt(value == null…"]
  n3["catch Z.353 (NumberFormatException e)"]
  n4["return Z.354 return 0;"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `parseCount` in `src/main/java/de/aichele/childlauncher/HostFirstSetup.java`
