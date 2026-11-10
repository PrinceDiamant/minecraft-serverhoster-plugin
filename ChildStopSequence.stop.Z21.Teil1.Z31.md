[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildStopSequence]] › [[ChildStopSequence.stop]] › [[ChildStopSequence.stop.Z21.Teil1.Z31]]

# ChildStopSequence.stop.Z21.Teil1.Z31

```mermaid
flowchart TD
  n1["while Z.31 (process.isAlive() && (firstSend // Sys…"]
  n2["if Z.33 (firstSend // now )= nextSendAt)"]
  n3["try Z.35"]
  n4["catch Z.37 (IOException e)"]
  n5["Schritt Z.40 nextSendAt = now + TimeUnit.MILLISECONDS.toNanos(…"]
  n6["if Z.43 (remaining (= 0)"]
  n7["Schritt Z.44 process.waitFor(Math.max(1, Math.min(TimeUnit.NAN…"]
  n3 -->|"Fehler"| n4
  n3 --> n5
  n4 --> n5
  n2 -->|"ja"| n3
  n5 --> n6
  n2 --> n6
  n6 --> n7
  n6 --> n7
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
while Z.31 (process.isAlive() && (firstSend // Sys…
  Zeile 31: Schleife `(process.isAlive() && (firstSend // Sys…`.
if Z.33 (firstSend // now )= nextSendAt)
  Zeile 33: prüft `(firstSend // now )= nextSendAt)`.
try Z.35
  Zeile 35: Versuch. Der Fehlerpfad geht in catch.
catch Z.37 (IOException e)
  Zeile 37: fängt (IOException e).
Schritt Z.40 nextSendAt = now + TimeUnit.MILLISECONDS.toNanos(…
  Zeile 40: rechnet Zeit um oder wartet. `nextSendAt = now + TimeUnit.MILLISECONDS.toNanos(…`
if Z.43 (remaining (= 0)
  Zeile 43: prüft `(remaining (= 0)`.
Schritt Z.44 process.waitFor(Math.max(1, Math.min(TimeUnit.NAN…
  Zeile 44: rechnet Zeit um oder wartet. `process.waitFor(Math.max(1, Math.min(TimeUnit.NAN…`
```

> [!knoten]- Was die Blöcke tun
> - **while Z.31 (process.isAlive() && (firstSend // Sys…**: Zeile 31: Schleife `(process.isAlive() && (firstSend // Sys…`.
> - **if Z.33 (firstSend // now )= nextSendAt)**: Zeile 33: prüft `(firstSend // now )= nextSendAt)`.
> - **try Z.35**: Zeile 35: Versuch. Der Fehlerpfad geht in catch.
> - **catch Z.37 (IOException e)**: Zeile 37: fängt (IOException e).
> - **Schritt Z.40 nextSendAt = now + TimeUnit.MILLISECONDS.toNanos(…**: Zeile 40: rechnet Zeit um oder wartet. `nextSendAt = now + TimeUnit.MILLISECONDS.toNanos(…`
> - **if Z.43 (remaining (= 0)**: Zeile 43: prüft `(remaining (= 0)`.
> - **Schritt Z.44 process.waitFor(Math.max(1, Math.min(TimeUnit.NAN…**: Zeile 44: rechnet Zeit um oder wartet. `process.waitFor(Math.max(1, Math.min(TimeUnit.NAN…`

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 31 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `ChildStopSequence.stop.Z21.Teil1`.
