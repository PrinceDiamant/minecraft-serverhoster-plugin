[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.armPipe]] › [[FabricLauncherPlugin.armPipe.Z2073.Teil1]]

# FabricLauncherPlugin.armPipe.Z2073.Teil1

```mermaid
flowchart TD
  n1["if Z.2075 (process == null // !process.isAlive())"]
  n2["return Z.2075 return;"]
  n3["if Z.2076 (slot.pipeFailures )= 3)"]
  n4["if Z.2077 (slot.pipeFailures == 3)"]
  n5["return Z.2082 return;"]
  n6["if Z.2084 (slot.pipeArmed.get())"]
  n7["return Z.2084 return;"]
  n1 -->|"ja"| n2
  n4 --> n5
  n4 --> n5
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n6 -->|"ja"| n7
  n5 --> n6
  n3 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.2075 (process == null // !process.isAlive())
  Zeile 2075: prüft `(process == null // !process.isAlive())`.
return Z.2075 return;
  Zeile 2075: Rückgabe `return;`.
if Z.2076 (slot.pipeFailures )= 3)
  Zeile 2076: prüft `(slot.pipeFailures )= 3)`.
if Z.2077 (slot.pipeFailures == 3)
  Zeile 2077: prüft `(slot.pipeFailures == 3)`.
return Z.2082 return;
  Zeile 2082: Rückgabe `return;`.
if Z.2084 (slot.pipeArmed.get())
  Zeile 2084: prüft `(slot.pipeArmed.get())`.
return Z.2084 return;
  Zeile 2084: Rückgabe `return;`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.2075 (process == null // !process.isAlive())**: Zeile 2075: prüft `(process == null // !process.isAlive())`.
> - **return Z.2075 return;**: Zeile 2075: Rückgabe `return;`.
> - **if Z.2076 (slot.pipeFailures )= 3)**: Zeile 2076: prüft `(slot.pipeFailures )= 3)`.
> - **if Z.2077 (slot.pipeFailures == 3)**: Zeile 2077: prüft `(slot.pipeFailures == 3)`.
> - **return Z.2082 return;**: Zeile 2082: Rückgabe `return;`.
> - **if Z.2084 (slot.pipeArmed.get())**: Zeile 2084: prüft `(slot.pipeArmed.get())`.
> - **return Z.2084 return;**: Zeile 2084: Rückgabe `return;`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.armPipe.Z2073`.
