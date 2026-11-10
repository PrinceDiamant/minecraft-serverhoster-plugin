[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[ProcessProbe]] › [[ProcessProbe.disk]] › [[ProcessProbe.disk.Z57]]

# ProcessProbe.disk.Z57

```mermaid
flowchart TD
  n1["try Z.57"]
  n2["ProcessProbe.disk.Z57.Z59"]:::internal-link
  n3["catch Z.66 (IOException ignored)"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.57
  Zeile 57: Versuch. Der Fehlerpfad geht in catch.
ProcessProbe.disk.Z57.Z59
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 59 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 59.
catch Z.66 (IOException ignored)
  Zeile 66: fängt (IOException ignored).
```

> [!knoten]- Was die Blöcke tun
> - **try Z.57**: Zeile 57: Versuch. Der Fehlerpfad geht in catch.
> - **ProcessProbe.disk.Z57.Z59**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 59 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 59.
> - **catch Z.66 (IOException ignored)**: Zeile 66: fängt (IOException ignored).

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 57 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `ProcessProbe.disk`.
