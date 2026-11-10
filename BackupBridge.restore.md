[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil1]] › [[BackupBridge.restore]]

# BackupBridge.restore

`BackupBridge.restore(Path work, Spec spec, String serverId, String name)` [src/main/java/de/aichele/childlauncher/BackupBridge.java:74–77](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/BackupBridge.java#L74-L77)

```mermaid
flowchart TD
  n1["BackupBridge.file"]:::internal-link
  n2["BackupBridge.restoreZip"]:::internal-link
  n3["return Z.76 return restoreZip(work, zip);"]
  n2 --> n3
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupBridge.file
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert die Datei `file`. Ruft `safeId`, `named`, `directory`.
BackupBridge.restoreZip
  Die Sicherung auf diesem Rechner stellt wieder her hier einen Schritt. Eine Ebene tiefer steht er genauer. Stellt wieder her `restoreZip`. Ruft `open`, `resolve`.
return Z.76 return restoreZip(work, zip);
  Zeile 76: Rückgabe `return restoreZip(work, zip);`.
```

> [!knoten]- Was die Blöcke tun
> - **BackupBridge.file**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert die Datei `file`. Ruft `safeId`, `named`, `directory`.
> - **BackupBridge.restoreZip**: Die Sicherung auf diesem Rechner stellt wieder her hier einen Schritt. Eine Ebene tiefer steht er genauer. Stellt wieder her `restoreZip`. Ruft `open`, `resolve`.
> - **return Z.76 return restoreZip(work, zip);**: Zeile 76: Rückgabe `return restoreZip(work, zip);`.

- Die Sicherung auf diesem Rechner stellt wieder her das.
- `restore` in `src/main/java/de/aichele/childlauncher/BackupBridge.java`
