[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil1]] › [[BackupBridge.list]]

# BackupBridge.list

`BackupBridge.list(Spec spec, String serverId)` [src/main/java/de/aichele/childlauncher/BackupBridge.java:43–57](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/BackupBridge.java#L43-L57)

```mermaid
flowchart TD
  n1["BackupBridge.directory"]:::internal-link
  n2["if Z.45 (!Files.isDirectory(dir))"]
  n3["return Z.45 return List.of();"]
  n4["BackupBridge.safeId"]:::internal-link
  n5["BackupBridge.list.Z48"]:::internal-link
  n6["return Z.56 return out;"]
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupBridge.directory
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `directory` in `BackupBridge.java`.
if Z.45 (!Files.isDirectory(dir))
  Zeile 45: prüft `(!Files.isDirectory(dir))`.
return Z.45 return List.of();
  Zeile 45: Rückgabe `return List.of();`.
BackupBridge.safeId
  Die Sicherung auf diesem Rechner kümmert sich um die Kennung. Prüft die Pfadgrenze `safeId`.
BackupBridge.list.Z48
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 48 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 48.
return Z.56 return out;
  Zeile 56: Rückgabe `return out;`.
```

> [!knoten]- Was die Blöcke tun
> - **BackupBridge.directory**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `directory` in `BackupBridge.java`.
> - **if Z.45 (!Files.isDirectory(dir))**: Zeile 45: prüft `(!Files.isDirectory(dir))`.
> - **return Z.45 return List.of();**: Zeile 45: Rückgabe `return List.of();`.
> - **BackupBridge.safeId**: Die Sicherung auf diesem Rechner kümmert sich um die Kennung. Prüft die Pfadgrenze `safeId`.
> - **BackupBridge.list.Z48**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 48 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 48.
> - **return Z.56 return out;**: Zeile 56: Rückgabe `return out;`.

- Die Sicherung auf diesem Rechner zeigt das.
- `list` in `src/main/java/de/aichele/childlauncher/BackupBridge.java`
