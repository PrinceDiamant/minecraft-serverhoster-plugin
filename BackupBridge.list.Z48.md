[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil1]] › [[BackupBridge.list]] › [[BackupBridge.list.Z48]]

# BackupBridge.list.Z48

```mermaid
flowchart TD
  n1["try Z.48"]
  n2["for Z.49 (Path p : ds)"]
  n3["if Z.50 (!named(safe, p.getFileName().toString()) // !Fil…"]
  n4["BackupBridge.named"]:::internal-link
  n5["Schritt Z.51 BasicFileAttributes a = Files.readAttributes(p, B…"]
  n3 -->|"Z.50"| n4
  n4 --> n5
  n4 --> n5
  n2 -->|"wiederholen"| n3
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.48
  Zeile 48: Versuch. Der Fehlerpfad geht in catch.
for Z.49 (Path p : ds)
  Zeile 49: Schleife `(Path p : ds)`.
if Z.50 (!named(safe, p.getFileName().toString()) // !Fil…
  Zeile 50: prüft `(!named(safe, p.getFileName().toString()) // !Fil…`.
BackupBridge.named
  `named` in `BackupBridge.java`.
Schritt Z.51 BasicFileAttributes a = Files.readAttributes(p, B…
  Zeile 51: Dateioperation. `BasicFileAttributes a = Files.readAttributes(p, B…`
```

- Fortsetzung von `BackupBridge.list`, Quellreihenfolge.
