[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[LogQuery]] › [[LogQuery.query]] › [[LogQuery.query.Teil1.Z31.Z40]]

# LogQuery.query.Teil1.Z31.Z40

```mermaid
flowchart TD
  n1["if Z.40 (!truncated)"]
  n2["Schritt Z.40 data = Files.readString(file, StandardCharsets.UT…"]
  n3["LogQuery.query.Teil1.Z31.Z40.Z42"]:::internal-link
  n1 -->|"ja"| n2
  n1 -->|"nein"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.40 (!truncated)
  Zeile 40: prüft `(!truncated)`.
Schritt Z.40 data = Files.readString(file, StandardCharsets.UT…
  Zeile 40: liest Text aus einer Datei. `data = Files.readString(file, StandardCharsets.UT…`
LogQuery.query.Teil1.Z31.Z40.Z42
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 42 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 42.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.40 (!truncated)**: Zeile 40: prüft `(!truncated)`.
> - **Schritt Z.40 data = Files.readString(file, StandardCharsets.UT…**: Zeile 40: liest Text aus einer Datei. `data = Files.readString(file, StandardCharsets.UT…`
> - **LogQuery.query.Teil1.Z31.Z40.Z42**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 42 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 42.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 40 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `LogQuery.query.Teil1.Z31`.
