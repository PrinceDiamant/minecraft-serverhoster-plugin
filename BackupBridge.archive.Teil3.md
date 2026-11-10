[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil2]] › [[BackupBridge.archive]] › [[BackupBridge.archive.Teil3]]

# BackupBridge.archive.Teil3

```mermaid
flowchart TD
  n1["if Z.161 (spec.dbEnabled)"]
  n2["try Z.162"]
  n3["BackupBridge.insert"]:::internal-link
  n4["catch Z.163 (Exception e)"]
  n5["return Z.165 return new Result('b-' + safe + '-' + stamp, zip.…"]
  n2 --> n3
  n2 -->|"Fehler"| n4
  n1 -->|"ja"| n2
  n3 --> n5
  n4 --> n5
  n1 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.161 (spec.dbEnabled)
  Zeile 161: prüft `(spec.dbEnabled)`.
try Z.162
  Zeile 162: Versuch. Der Fehlerpfad geht in catch.
BackupBridge.insert
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Fügt ein `insert`. Ruft `connect`, `table`, `ensureTable`.
catch Z.163 (Exception e)
  Zeile 163: fängt (Exception e).
return Z.165 return new Result('b-' + safe + '-' + stamp, zip.…
  Zeile 165: Rückgabe `return new Result('b-' + safe + '-' + stamp, zip.…`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.161 (spec.dbEnabled)**: Zeile 161: prüft `(spec.dbEnabled)`.
> - **try Z.162**: Zeile 162: Versuch. Der Fehlerpfad geht in catch.
> - **BackupBridge.insert**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Fügt ein `insert`. Ruft `connect`, `table`, `ensureTable`.
> - **catch Z.163 (Exception e)**: Zeile 163: fängt (Exception e).
> - **return Z.165 return new Result('b-' + safe + '-' + stamp, zip.…**: Zeile 165: Rückgabe `return new Result('b-' + safe + '-' + stamp, zip.…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `BackupBridge.archive`.
