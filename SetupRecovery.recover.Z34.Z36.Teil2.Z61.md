[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupRecovery]] › [[SetupRecovery.recover]] › [[SetupRecovery.recover.Z34.Z36.Teil2.Z61]]

# SetupRecovery.recover.Z34.Z36.Teil2.Z61

```mermaid
flowchart TD
  n1["if Z.61 (setupRequired)"]
  n2["if Z.62 (Files.exists(original, LinkOption.NOFOLLOW_LINKS…"]
  n3["Schritt Z.65 Files.move(pending, original);"]
  n4["if Z.68 (deleting)"]
  n5["Schritt Z.76 Files.move(pending, archive);"]
  n2 -->|"nein"| n3
  n4 -->|"nein"| n5
  n1 -->|"ja"| n2
  n1 -->|"nein"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.61 (setupRequired)
  Zeile 61: prüft `(setupRequired)`.
if Z.62 (Files.exists(original, LinkOption.NOFOLLOW_LINKS…
  Zeile 62: prüft `(Files.exists(original, LinkOption.NOFOLLOW_LINKS…`.
Schritt Z.65 Files.move(pending, original);
  Zeile 65: Dateioperation. `Files.move(pending, original);`
if Z.68 (deleting)
  Zeile 68: prüft `(deleting)`.
Schritt Z.76 Files.move(pending, archive);
  Zeile 76: Dateioperation. `Files.move(pending, archive);`
```

> [!knoten]- Was die Blöcke tun
> - **if Z.61 (setupRequired)**: Zeile 61: prüft `(setupRequired)`.
> - **if Z.62 (Files.exists(original, LinkOption.NOFOLLOW_LINKS…**: Zeile 62: prüft `(Files.exists(original, LinkOption.NOFOLLOW_LINKS…`.
> - **Schritt Z.65 Files.move(pending, original);**: Zeile 65: Dateioperation. `Files.move(pending, original);`
> - **if Z.68 (deleting)**: Zeile 68: prüft `(deleting)`.
> - **Schritt Z.76 Files.move(pending, archive);**: Zeile 76: Dateioperation. `Files.move(pending, archive);`

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 61 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `SetupRecovery.recover.Z34.Z36.Teil2`.
