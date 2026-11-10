[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[HostMemoryProbe]] › [[HostMemoryProbe.keyValues]] › [[HostMemoryProbe.keyValues.Z133]]

# HostMemoryProbe.keyValues.Z133

```mermaid
flowchart TD
  n1["try Z.133"]
  n2["Schritt Z.134 List(String) lines = Files.readAllLines(path);"]
  n3["HostMemoryProbe.keyValues.Z133.Z135"]:::internal-link
  n4["catch Z.141 (IOException ignored)"]
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.133
  Zeile 133: Versuch. Der Fehlerpfad geht in catch.
Schritt Z.134 List(String) lines = Files.readAllLines(path);
  Zeile 134: Dateioperation. `List(String) lines = Files.readAllLines(path);`
HostMemoryProbe.keyValues.Z133.Z135
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 135 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 135.
catch Z.141 (IOException ignored)
  Zeile 141: fängt (IOException ignored).
```

> [!knoten]- Was die Blöcke tun
> - **try Z.133**: Zeile 133: Versuch. Der Fehlerpfad geht in catch.
> - **Schritt Z.134 List(String) lines = Files.readAllLines(path);**: Zeile 134: Dateioperation. `List(String) lines = Files.readAllLines(path);`
> - **HostMemoryProbe.keyValues.Z133.Z135**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 135 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 135.
> - **catch Z.141 (IOException ignored)**: Zeile 141: fängt (IOException ignored).

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 133 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `HostMemoryProbe.keyValues`.
