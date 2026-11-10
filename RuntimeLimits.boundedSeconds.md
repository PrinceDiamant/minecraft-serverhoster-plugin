[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[RuntimeLimits]] › [[RuntimeLimits.boundedSeconds]]

# RuntimeLimits.boundedSeconds

`RuntimeLimits.boundedSeconds(long configured, long fallback)` [src/main/java/de/aichele/childlauncher/RuntimeLimits.java:19–29](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/RuntimeLimits.java#L19-L29)

```mermaid
flowchart TD
  n1["if Z.20 (configured ( 0)"]
  n2["return Z.21 return new Bounded(0, List.of('A negative wait of…"]
  n3["if Z.23 (configured ) MAX_WAIT_SECONDS)"]
  n4["return Z.24 return new Bounded(MAX_WAIT_SECONDS, List.of('A w…"]
  n5["if Z.27 (fallback ( 0)"]
  n6["throw Z.27 throw new IllegalArgumentException('fallback');"]
  n7["return Z.28 return new Bounded(configured, List.of());"]
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

```knoten
if Z.20 (configured ( 0)
  Zeile 20: prüft `(configured ( 0)`.
return Z.21 return new Bounded(0, List.of('A negative wait of…
  Zeile 21: Rückgabe `return new Bounded(0, List.of('A negative wait of…`.
if Z.23 (configured ) MAX_WAIT_SECONDS)
  Zeile 23: prüft `(configured ) MAX_WAIT_SECONDS)`.
return Z.24 return new Bounded(MAX_WAIT_SECONDS, List.of('A w…
  Zeile 24: Rückgabe `return new Bounded(MAX_WAIT_SECONDS, List.of('A w…`.
if Z.27 (fallback ( 0)
  Zeile 27: prüft `(fallback ( 0)`.
throw Z.27 throw new IllegalArgumentException('fallback');
  Zeile 27: Abbruch `throw new IllegalArgumentException('fallback');`.
return Z.28 return new Bounded(configured, List.of());
  Zeile 28: Rückgabe `return new Bounded(configured, List.of());`.
```

- `boundedSeconds` in `src/main/java/de/aichele/childlauncher/RuntimeLimits.java`
