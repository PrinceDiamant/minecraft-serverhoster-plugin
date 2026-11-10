[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[GcDiagnostics]] › [[GcDiagnostics.snapshot(List)]]

# GcDiagnostics.snapshot(List)

`GcDiagnostics.snapshot(List<GarbageCollectorMXBean> beans)` [src/main/java/de/aichele/childlauncher/GcDiagnostics.java:20–33](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/GcDiagnostics.java#L20-L33)

```mermaid
flowchart TD
  n1["if Z.22 (beans == null)"]
  n2["return Z.22 return List.of();"]
  n3["GcDiagnostics.snapshot(List).Z23"]:::internal-link
  n4["return Z.32 return List.copyOf(out);"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.22 (beans == null)
  Zeile 22: prüft `(beans == null)`.
return Z.22 return List.of();
  Zeile 22: Rückgabe `return List.of();`.
GcDiagnostics.snapshot(List).Z23
  Fortsetzung des Ablaufs ab Zeile 23.
return Z.32 return List.copyOf(out);
  Zeile 32: Rückgabe `return List.copyOf(out);`.
```

- `snapshot` in `src/main/java/de/aichele/childlauncher/GcDiagnostics.java`
