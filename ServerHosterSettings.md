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
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `from`.
ServerHosterSettings.view
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `view`.
ServerHosterSettings.apply
  Dieser Teil wendet an das. Im [[Glossar#Quelltext|Quelltext]] heißt das `apply`.
ServerHosterSettings.enumValue
  Dieser Teil kümmert sich um den Wert. Im [[Glossar#Quelltext|Quelltext]] heißt das `enumValue`.
ServerHosterSettings.hasUnsafeHostCharacter
  Dieser Teil prüft den [[Glossar#Host|Host]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `hasUnsafeHostCharacter`.
ServerHosterSettings.containsControlCharacter
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `containsControlCharacter`.
ServerHosterSettings.ServerHosterSettings
  Dieser Teil kümmert sich um das [[Glossar#Plugin|Plugin]] die [[Glossar#Einstellungen|Einstellungen]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `ServerHosterSettings`.
```

> [!knoten]- Was die Blöcke tun
> - **ServerHosterSettings.from**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `from`.
> - **ServerHosterSettings.view**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `view`.
> - **ServerHosterSettings.apply**: Dieser Teil wendet an das. Im [[Glossar#Quelltext|Quelltext]] heißt das `apply`.
> - **ServerHosterSettings.enumValue**: Dieser Teil kümmert sich um den Wert. Im [[Glossar#Quelltext|Quelltext]] heißt das `enumValue`.
> - **ServerHosterSettings.hasUnsafeHostCharacter**: Dieser Teil prüft den [[Glossar#Host|Host]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `hasUnsafeHostCharacter`.
> - **ServerHosterSettings.containsControlCharacter**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `containsControlCharacter`.
> - **ServerHosterSettings.ServerHosterSettings**: Dieser Teil kümmert sich um das [[Glossar#Plugin|Plugin]] die [[Glossar#Einstellungen|Einstellungen]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `ServerHosterSettings`.

- Prüft die [[Glossar#Einstellungen|Einstellungen]], bevor sie benutzt werden, zum Beispiel [[Glossar#Pause|Pausen]] und die Angaben für eine Sicherung über das Netz.
