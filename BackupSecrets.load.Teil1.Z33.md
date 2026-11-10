[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupSecrets]] › [[BackupSecrets.load]] › [[BackupSecrets.load.Teil1.Z33]]

# BackupSecrets.load.Teil1.Z33

```mermaid
flowchart TD
  n1["if Z.33 (!Files.exists(path))"]
  n2["Schritt Z.34 Files.createFile(path);"]
  n3["BackupSecrets.restrict"]:::internal-link
  n2 --> n3
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.33 (!Files.exists(path))
  Zeile 33: prüft `(!Files.exists(path))`.
Schritt Z.34 Files.createFile(path);
  Zeile 34: Dateioperation. `Files.createFile(path);`
BackupSecrets.restrict
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `restrict` in `BackupSecrets.java`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.33 (!Files.exists(path))**: Zeile 33: prüft `(!Files.exists(path))`.
> - **Schritt Z.34 Files.createFile(path);**: Zeile 34: Dateioperation. `Files.createFile(path);`
> - **BackupSecrets.restrict**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `restrict` in `BackupSecrets.java`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 33 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `BackupSecrets.load.Teil1`.
