[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildStopSequence]] › [[ChildStopSequence.stop]] › [[ChildStopSequence.stop.Z21.Teil2]]

# ChildStopSequence.stop.Z21.Teil2

```mermaid
flowchart TD
  n1["ChildStopSequence.signal"]:::internal-link
  n2["if Z.60 (!process.waitFor(Math.max(0, termGraceSeconds), …"]
  n3["ChildStopSequence.signal"]:::internal-link
  n4["Schritt Z.63 process.waitFor(Math.max(0, termGraceSeconds), Ti…"]
  n5["return Z.66 return Outcome.KILLED;"]
  n3 --> n4
  n2 -->|"ja"| n3
  n1 --> n2
  n4 --> n5
  n2 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ChildStopSequence.signal
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `signal` in `ChildStopSequence.java`.
if Z.60 (!process.waitFor(Math.max(0, termGraceSeconds), …
  Zeile 60: prüft `(!process.waitFor(Math.max(0, termGraceSeconds), …`.
Schritt Z.63 process.waitFor(Math.max(0, termGraceSeconds), Ti…
  Zeile 63: `process.waitFor(Math.max(0, termGraceSeconds), Ti…`
return Z.66 return Outcome.KILLED;
  Zeile 66: Rückgabe `return Outcome.KILLED;`.
```

> [!knoten]- Was die Blöcke tun
> - **ChildStopSequence.signal**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `signal` in `ChildStopSequence.java`.
> - **if Z.60 (!process.waitFor(Math.max(0, termGraceSeconds), …**: Zeile 60: prüft `(!process.waitFor(Math.max(0, termGraceSeconds), …`.
> - **Schritt Z.63 process.waitFor(Math.max(0, termGraceSeconds), Ti…**: Zeile 63: `process.waitFor(Math.max(0, termGraceSeconds), Ti…`
> - **return Z.66 return Outcome.KILLED;**: Zeile 66: Rückgabe `return Outcome.KILLED;`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `ChildStopSequence.stop.Z21`.
