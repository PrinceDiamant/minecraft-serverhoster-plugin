[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostHeapTune]] › [[HostHeapTune.hotspot]]

# HostHeapTune.hotspot

`HostHeapTune.hotspot()` [src/main/java/de/aichele/childlauncher/HostHeapTune.java:56–82](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostHeapTune.java#L56-L82)

```mermaid
flowchart TD
  n1["return Z.57 return new Options() ( private final HotSpotDiagn…"]
  n2["HostHeapTune.hotspot.manageable"]:::internal-link
  n3["HostHeapTune.hotspot.get"]:::internal-link
  n4["HostHeapTune.hotspot.set"]:::internal-link
  n5["HostHeapTune.hotspot.manageable"]:::internal-link
  n6["HostHeapTune.hotspot.get"]:::internal-link
  n7["HostHeapTune.hotspot.set"]:::internal-link
  n2 -->|"Z.69"| n3
  n3 -->|"Z.78"| n4
  n1 --> n2
  n4 -->|"innere Methode"| n5
  n5 -->|"innere Methode"| n6
  n6 -->|"innere Methode"| n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `hotspot` in `src/main/java/de/aichele/childlauncher/HostHeapTune.java`
