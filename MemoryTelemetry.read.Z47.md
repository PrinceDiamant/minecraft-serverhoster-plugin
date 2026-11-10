[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[MemoryTelemetry]] › [[MemoryTelemetry.read]] › [[MemoryTelemetry.read.Z47]]

# MemoryTelemetry.read.Z47

```mermaid
flowchart TD
  n1["if Z.47 (childPid ) 0)"]
  n2["ProcessProbe.snapshot"]:::internal-link
  n3["MemoryTelemetry.number"]:::internal-link
  n4["MemoryTelemetry.number"]:::internal-link
  n2 --> n3
  n3 --> n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.47 (childPid ) 0)
  Zeile 47: prüft `(childPid ) 0)`.
ProcessProbe.snapshot
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `snapshot` in `ProcessProbe.java`. Ruft `kb`.
MemoryTelemetry.number
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `number` in `MemoryTelemetry.java`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.47 (childPid ) 0)**: Zeile 47: prüft `(childPid ) 0)`.
> - **ProcessProbe.snapshot**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `snapshot` in `ProcessProbe.java`. Ruft `kb`.
> - **MemoryTelemetry.number**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `number` in `MemoryTelemetry.java`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 47 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `MemoryTelemetry.read`.
