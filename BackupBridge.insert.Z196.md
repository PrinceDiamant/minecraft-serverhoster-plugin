[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil2]] › [[BackupBridge.insert]] › [[BackupBridge.insert.Z196]]

# BackupBridge.insert.Z196

```mermaid
flowchart TD
  n1["try Z.196"]
  n2["BackupBridge.connect"]:::internal-link
  n3["BackupBridge.table"]:::internal-link
  n4["BackupBridge.ensureTable"]:::internal-link
  n5["BackupBridge.insert.Z196.Z199"]:::internal-link
  n1 -->|"Z.196"| n2
  n3 --> n4
  n4 --> n5
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.196
  Zeile 196: Versuch. Der Fehlerpfad geht in catch.
BackupBridge.connect
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Verbindet `connect`.
BackupBridge.table
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `table` in `BackupBridge.java`.
BackupBridge.ensureTable
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Stellt sicher `ensureTable`.
BackupBridge.insert.Z196.Z199
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 199 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 199.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.196**: Zeile 196: Versuch. Der Fehlerpfad geht in catch.
> - **BackupBridge.connect**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Verbindet `connect`.
> - **BackupBridge.table**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `table` in `BackupBridge.java`.
> - **BackupBridge.ensureTable**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Stellt sicher `ensureTable`.
> - **BackupBridge.insert.Z196.Z199**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 199 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 199.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 196 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `BackupBridge.insert`.
