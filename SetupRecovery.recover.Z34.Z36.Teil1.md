[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupRecovery]] › [[SetupRecovery.recover]] › [[SetupRecovery.recover.Z34.Z36.Teil1]]

# SetupRecovery.recover.Z34.Z36.Teil1

```mermaid
flowchart TD
  n1["if Z.37 (++examined ) 2_048)"]
  n2["throw Z.37 throw new IOException('Server root exceeds the bo…"]
  n3["if Z.43 (marker (= 0)"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.37 (++examined ) 2_048)
  Zeile 37: prüft `(++examined ) 2_048)`.
throw Z.37 throw new IOException('Server root exceeds the bo…
  Zeile 37: Abbruch `throw new IOException('Server root exceeds the bo…`.
if Z.43 (marker (= 0)
  Zeile 43: prüft `(marker (= 0)`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.37 (++examined ) 2_048)**: Zeile 37: prüft `(++examined ) 2_048)`.
> - **throw Z.37 throw new IOException('Server root exceeds the bo…**: Zeile 37: Abbruch `throw new IOException('Server root exceeds the bo…`.
> - **if Z.43 (marker (= 0)**: Zeile 43: prüft `(marker (= 0)`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `SetupRecovery.recover.Z34.Z36`.
