[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil2]] › [[BackupBridge.archive]] › [[BackupBridge.archive.Teil2.Z136]]

# BackupBridge.archive.Teil2.Z136

```mermaid
flowchart TD
  n1["try Z.136"]
  n2["BackupBridge.archive.Teil2.Z136.Z138"]:::internal-link
  n3["catch Z.152 (Exception e)"]
  n4["try Z.153"]
  n5["Schritt Z.153 Files.deleteIfExists(zip);"]
  n6["catch Z.153 (IOException cleanupError)"]
  n7["throw Z.154 throw e;"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n4 --> n5
  n4 -->|"Fehler"| n6
  n5 --> n7
  n6 --> n7
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.136
  Zeile 136: Versuch. Der Fehlerpfad geht in catch.
BackupBridge.archive.Teil2.Z136.Z138
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 138 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 138.
catch Z.152 (Exception e)
  Zeile 152: fängt (Exception e).
try Z.153
  Zeile 153: Versuch. Der Fehlerpfad geht in catch.
Schritt Z.153 Files.deleteIfExists(zip);
  Zeile 153: Dateioperation. `Files.deleteIfExists(zip);`
catch Z.153 (IOException cleanupError)
  Zeile 153: fängt (IOException cleanupError).
throw Z.154 throw e;
  Zeile 154: Abbruch `throw e;`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.136**: Zeile 136: Versuch. Der Fehlerpfad geht in catch.
> - **BackupBridge.archive.Teil2.Z136.Z138**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 138 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 138.
> - **catch Z.152 (Exception e)**: Zeile 152: fängt (Exception e).
> - **try Z.153**: Zeile 153: Versuch. Der Fehlerpfad geht in catch.
> - **Schritt Z.153 Files.deleteIfExists(zip);**: Zeile 153: Dateioperation. `Files.deleteIfExists(zip);`
> - **catch Z.153 (IOException cleanupError)**: Zeile 153: fängt (IOException cleanupError).
> - **throw Z.154 throw e;**: Zeile 154: Abbruch `throw e;`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 136 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `BackupBridge.archive.Teil2`.
