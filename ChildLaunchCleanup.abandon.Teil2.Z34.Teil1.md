[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildLaunchCleanup]] › [[ChildLaunchCleanup.abandon]] › [[ChildLaunchCleanup.abandon.Teil2.Z34.Teil1]]

# ChildLaunchCleanup.abandon.Teil2.Z34.Teil1

```mermaid
flowchart TD
  n1["if Z.35 (!process.waitFor(wait, TimeUnit.MILLISECONDS))"]
  n2["if Z.37 (!process.waitFor(wait, TimeUnit.MILLISECONDS))"]
  n3["return Z.40 return new Result(false, -1, detail + 'process st…"]
  n4["if Z.44 (drain.isAlive())"]
  n5["if Z.45 (!drainError.get().isBlank())"]
  n2 -->|"ja"| n3
  n1 -->|"ja"| n2
  n3 --> n4
  n2 --> n4
  n1 --> n4
  n4 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.35 (!process.waitFor(wait, TimeUnit.MILLISECONDS))
  Zeile 35: prüft `(!process.waitFor(wait, TimeUnit.MILLISECONDS))`.
if Z.37 (!process.waitFor(wait, TimeUnit.MILLISECONDS))
  Zeile 37: prüft `(!process.waitFor(wait, TimeUnit.MILLISECONDS))`.
return Z.40 return new Result(false, -1, detail + 'process st…
  Zeile 40: Rückgabe `return new Result(false, -1, detail + 'process st…`.
if Z.44 (drain.isAlive())
  Zeile 44: prüft `(drain.isAlive())`.
if Z.45 (!drainError.get().isBlank())
  Zeile 45: prüft `(!drainError.get().isBlank())`.
```

- Fortsetzung von `ChildLaunchCleanup.abandon.Teil2.Z34`, Quellreihenfolge.
