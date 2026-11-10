[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildStopSequence]] › [[ChildStopSequence.stop]] › [[ChildStopSequence.stop.Z21.Teil1.Z47]]

# ChildStopSequence.stop.Z21.Teil1.Z47

```mermaid
flowchart TD
  n1["if Z.47 (!process.isAlive())"]
  n2["if Z.49 (exitCode == 0)"]
  n3["return Z.51 return Outcome.CLEAN;"]
  n4["return Z.54 return Outcome.UNCLEAN;"]
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.47 (!process.isAlive())
  Zeile 47: prüft `(!process.isAlive())`.
if Z.49 (exitCode == 0)
  Zeile 49: prüft `(exitCode == 0)`.
return Z.51 return Outcome.CLEAN;
  Zeile 51: Rückgabe `return Outcome.CLEAN;`.
return Z.54 return Outcome.UNCLEAN;
  Zeile 54: Rückgabe `return Outcome.UNCLEAN;`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.47 (!process.isAlive())**: Zeile 47: prüft `(!process.isAlive())`.
> - **if Z.49 (exitCode == 0)**: Zeile 49: prüft `(exitCode == 0)`.
> - **return Z.51 return Outcome.CLEAN;**: Zeile 51: Rückgabe `return Outcome.CLEAN;`.
> - **return Z.54 return Outcome.UNCLEAN;**: Zeile 54: Rückgabe `return Outcome.UNCLEAN;`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 47 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `ChildStopSequence.stop.Z21.Teil1`.
