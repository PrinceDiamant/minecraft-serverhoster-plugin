[[00 Start]] › [[Tests]] › [[RemoteBackupBridgeTest]] › [[RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload]] › [[RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload.Z37.Teil3]]

# RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload.Z37.Teil3

```mermaid
flowchart TD
  n1["Schritt Z.63 Files.createDirectories(restore);"]
  n2["BackupBridge.restoreZip"]:::internal-link
  n3["Schritt Z.65 assertEquals('world-data', Files.readString(resto…"]
  n4["RemoteBackupBridge.delete"]:::internal-link
  n5["RemoteBackupBridge.list"]:::internal-link
  n6["Schritt Z.68 assertFalse(Files.exists(work.resolve('backups'))…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.63 Files.createDirectories(restore);
  Zeile 63: Dateioperation. `Files.createDirectories(restore);`
BackupBridge.restoreZip
  Die Sicherung auf diesem Rechner stellt wieder her hier einen Schritt. Eine Ebene tiefer steht er genauer. Stellt wieder her `restoreZip`. Ruft `open`, `resolve`.
Schritt Z.65 assertEquals('world-data', Files.readString(resto…
  Zeile 65: liest Text aus einer Datei. `assertEquals('world-data', Files.readString(resto…`
RemoteBackupBridge.delete
  Die Sicherung über das Netz löscht das. Löscht `delete`. Ruft `safeId`, `named`, `connect`.
RemoteBackupBridge.list
  Die Sicherung über das Netz zeigt das. Listet `list`. Ruft `safeId`, `connect`, `enterDirectory`.
Schritt Z.68 assertFalse(Files.exists(work.resolve('backups'))…
  Zeile 68: Dateioperation. `assertFalse(Files.exists(work.resolve('backups'))…`
```

> [!knoten]- Was die Blöcke tun
> - **Schritt Z.63 Files.createDirectories(restore);**: Zeile 63: Dateioperation. `Files.createDirectories(restore);`
> - **BackupBridge.restoreZip**: Die Sicherung auf diesem Rechner stellt wieder her hier einen Schritt. Eine Ebene tiefer steht er genauer. Stellt wieder her `restoreZip`. Ruft `open`, `resolve`.
> - **Schritt Z.65 assertEquals('world-data', Files.readString(resto…**: Zeile 65: liest Text aus einer Datei. `assertEquals('world-data', Files.readString(resto…`
> - **RemoteBackupBridge.delete**: Die Sicherung über das Netz löscht das. Löscht `delete`. Ruft `safeId`, `named`, `connect`.
> - **RemoteBackupBridge.list**: Die Sicherung über das Netz zeigt das. Listet `list`. Ruft `safeId`, `connect`, `enterDirectory`.
> - **Schritt Z.68 assertFalse(Files.exists(work.resolve('backups'))…**: Zeile 68: Dateioperation. `assertFalse(Files.exists(work.resolve('backups'))…`

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload.Z37`.
