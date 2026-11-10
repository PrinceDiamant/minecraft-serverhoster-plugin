[[00 Start]] › [[Plugin-Kern]] › [[Konfiguration]] › [[ServerHosterSettings]]

# ServerHosterSettings

```mermaid
flowchart TD
  n1["ServerHosterSettings.from"]:::internal-link
  n2["ServerHosterSettings.view"]:::internal-link
  n3["ServerHosterSettings.apply"]:::internal-link
  n4["ServerHosterSettings.enumValue"]:::internal-link
  n5["ServerHosterSettings.hasUnsafeHostCharacter"]:::internal-link
  n6["ServerHosterSettings.containsControlCharacter"]:::internal-link
  n7["ServerHosterSettings.ServerHosterSettings"]:::internal-link
  n1 -->|"Z.45"| n7
  n7 -->|"Z.28"| n4
  n7 -->|"Z.34"| n5
  n7 -->|"Z.36"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ServerHosterSettings.from
  `from` in `ServerHosterSettings.java`. Ruft `ServerHosterSettings`.
ServerHosterSettings.view
  Liefert die Sicht `view`.
ServerHosterSettings.apply
  Wendet an `apply`.
ServerHosterSettings.enumValue
  `enumValue` in `ServerHosterSettings.java`.
ServerHosterSettings.hasUnsafeHostCharacter
  Prüft `hasUnsafeHostCharacter`.
ServerHosterSettings.containsControlCharacter
  Prüft, ob enthalten `containsControlCharacter`.
ServerHosterSettings.ServerHosterSettings
  `ServerHosterSettings` in `ServerHosterSettings.java`. Ruft `maxAttempts`, `enumValue`, `hasUnsafeHostCharacter`.
```


