[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil2]] › [[BackupBridge.write]]

# BackupBridge.write

`BackupBridge.write(ZipOutputStream out, Path root, Path file)` [src/main/java/de/aichele/childlauncher/BackupBridge.java:173–181](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/BackupBridge.java#L173-L181)

```mermaid
flowchart TD
  n1["if Z.174 (file.getFileName().toString().equals('session.lo…"]
  n2["return Z.175 return 0;"]
  n3["try Z.178"]
  n4["return Z.180 return 1;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.174 (file.getFileName().toString().equals('session.lo…
  Zeile 174: prüft `(file.getFileName().toString().equals('session.lo…`.
return Z.175 return 0;
  Zeile 175: Rückgabe `return 0;`.
try Z.178
  Zeile 178: Versuch. Der Fehlerpfad geht in catch.
return Z.180 return 1;
  Zeile 180: Rückgabe `return 1;`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.174 (file.getFileName().toString().equals('session.lo…**: Zeile 174: prüft `(file.getFileName().toString().equals('session.lo…`.
> - **return Z.175 return 0;**: Zeile 175: Rückgabe `return 0;`.
> - **try Z.178**: Zeile 178: Versuch. Der Fehlerpfad geht in catch.
> - **return Z.180 return 1;**: Zeile 180: Rückgabe `return 1;`.

- Die Sicherung auf diesem Rechner schreibt das.
- `write` in `src/main/java/de/aichele/childlauncher/BackupBridge.java`
