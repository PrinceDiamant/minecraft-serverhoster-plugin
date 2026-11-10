[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.requestManual]]

# HostFirstSetup.requestManual

`HostFirstSetup.requestManual(Path marker, String confirm)` [src/main/java/de/aichele/childlauncher/HostFirstSetup.java:49–56](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostFirstSetup.java#L49-L56)

```mermaid
flowchart TD
  n1["if Z.50 (!MANUAL_CONFIRM.equals(confirm))"]
  n2["throw Z.51 throw new IllegalArgumentException('Die Bestätigu…"]
  n3["HostFirstSetup.readState"]:::internal-link
  n4["if Z.53 (!'manual-required'.equals(state.get('status')))"]
  n5["throw Z.54 throw new IllegalStateException('Das Host-Grundse…"]
  n6["HostFirstSetup.writeMarker(Path,String,String)"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"ja"| n5
  n3 --> n4
  n5 --> n6
  n4 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `requestManual` in `src/main/java/de/aichele/childlauncher/HostFirstSetup.java`
