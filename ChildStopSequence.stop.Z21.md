[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildStopSequence]] › [[ChildStopSequence.stop]] › [[ChildStopSequence.stop.Z21]]

# ChildStopSequence.stop.Z21

```mermaid
flowchart TD
  n1["try Z.21"]
  n2["ChildStopSequence.stop.Z21.Teil1"]:::internal-link
  n3["ChildStopSequence.stop.Z21.Teil2"]:::internal-link
  n4["catch Z.67 (InterruptedException e)"]
  n5["return Z.71 return Outcome.INTERRUPTED;"]
  n2 -->|"weiter"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.21
  Zeile 21: Versuch. Der Fehlerpfad geht in catch.
ChildStopSequence.stop.Z21.Teil1
  Ein weiterer Abschnitt derselben Übersicht. Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
ChildStopSequence.stop.Z21.Teil2
  Ein weiterer Abschnitt derselben Übersicht. Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
catch Z.67 (InterruptedException e)
  Zeile 67: fängt (InterruptedException e).
return Z.71 return Outcome.INTERRUPTED;
  Zeile 71: Rückgabe `return Outcome.INTERRUPTED;`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.21**: Zeile 21: Versuch. Der Fehlerpfad geht in catch.
> - **ChildStopSequence.stop.Z21.Teil1**: Ein weiterer Abschnitt derselben Übersicht. Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
> - **ChildStopSequence.stop.Z21.Teil2**: Ein weiterer Abschnitt derselben Übersicht. Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
> - **catch Z.67 (InterruptedException e)**: Zeile 67: fängt (InterruptedException e).
> - **return Z.71 return Outcome.INTERRUPTED;**: Zeile 71: Rückgabe `return Outcome.INTERRUPTED;`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 21 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `ChildStopSequence.stop`.
