[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.backupZipAndExternalJdbc]] › [[HosterTest.backupZipAndExternalJdbc.Teil5]]

# HosterTest.backupZipAndExternalJdbc.Teil5

```mermaid
flowchart TD
  n1["try Z.427"]
  n2["BackupBridge.restore"]:::internal-link
  n3["Schritt Z.433 assertFalse(Files.exists(tmp.resolve('secret.txt'…"]
  n4["BackupBridge.delete"]:::internal-link
  n5["BackupBridge.delete"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.427
  Zeile 427: Versuch. Der Fehlerpfad geht in catch.
BackupBridge.restore
  Die Sicherung auf diesem Rechner stellt wieder her das. Stellt wieder her `restore`. Ruft `file`, `restoreZip`.
Schritt Z.433 assertFalse(Files.exists(tmp.resolve('secret.txt'…
  Zeile 433: Dateioperation. `assertFalse(Files.exists(tmp.resolve('secret.txt'…`
BackupBridge.delete
  Die Sicherung auf diesem Rechner löscht das. Löscht `delete`. Ruft `file`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.427**: Zeile 427: Versuch. Der Fehlerpfad geht in catch.
> - **BackupBridge.restore**: Die Sicherung auf diesem Rechner stellt wieder her das. Stellt wieder her `restore`. Ruft `file`, `restoreZip`.
> - **Schritt Z.433 assertFalse(Files.exists(tmp.resolve('secret.txt'…**: Zeile 433: Dateioperation. `assertFalse(Files.exists(tmp.resolve('secret.txt'…`
> - **BackupBridge.delete**: Die Sicherung auf diesem Rechner löscht das. Löscht `delete`. Ruft `file`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HosterTest.backupZipAndExternalJdbc`.
