[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil1]] › [[RemoteBackupBridge.archive]] › [[RemoteBackupBridge.archive.Z92.Teil2]]

# RemoteBackupBridge.archive.Z92.Teil2

```mermaid
flowchart TD
  n1["RemoteBackupBridge.retain"]:::internal-link
  n2["RemoteBackupBridge.remotePath"]:::internal-link
  n3["if Z.142 (backup.dbEnabled())"]
  n4["try Z.143"]
  n5["BackupBridge.insert"]:::internal-link
  n6["catch Z.144 (Exception e)"]
  n7["return Z.146 return new Result(id, remotePath, bytes, sha, db,…"]
  n1 --> n2
  n4 --> n5
  n4 -->|"Fehler"| n6
  n3 -->|"ja"| n4
  n2 --> n3
  n5 --> n7
  n6 --> n7
  n3 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridge.retain
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Behält die letzten Stücke `retain`. Ruft `named`, `replyError`.
RemoteBackupBridge.remotePath
  Die Sicherung über das Netz kümmert sich um den Pfad. `remotePath` in `RemoteBackupBridge.java`.
if Z.142 (backup.dbEnabled())
  Zeile 142: prüft `(backup.dbEnabled())`.
try Z.143
  Zeile 143: Versuch. Der Fehlerpfad geht in catch.
BackupBridge.insert
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Fügt ein `insert`. Ruft `connect`, `table`, `ensureTable`.
catch Z.144 (Exception e)
  Zeile 144: fängt (Exception e).
return Z.146 return new Result(id, remotePath, bytes, sha, db,…
  Zeile 146: Rückgabe `return new Result(id, remotePath, bytes, sha, db,…`.
```

> [!knoten]- Was die Blöcke tun
> - **RemoteBackupBridge.retain**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Behält die letzten Stücke `retain`. Ruft `named`, `replyError`.
> - **RemoteBackupBridge.remotePath**: Die Sicherung über das Netz kümmert sich um den Pfad. `remotePath` in `RemoteBackupBridge.java`.
> - **if Z.142 (backup.dbEnabled())**: Zeile 142: prüft `(backup.dbEnabled())`.
> - **try Z.143**: Zeile 143: Versuch. Der Fehlerpfad geht in catch.
> - **BackupBridge.insert**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Fügt ein `insert`. Ruft `connect`, `table`, `ensureTable`.
> - **catch Z.144 (Exception e)**: Zeile 144: fängt (Exception e).
> - **return Z.146 return new Result(id, remotePath, bytes, sha, db,…**: Zeile 146: Rückgabe `return new Result(id, remotePath, bytes, sha, db,…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `RemoteBackupBridge.archive.Z92`.
