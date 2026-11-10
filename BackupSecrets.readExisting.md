[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupSecrets]] › [[BackupSecrets.readExisting]]

# BackupSecrets.readExisting

`BackupSecrets.readExisting(Path pluginDirectory)` [src/main/java/de/aichele/childlauncher/BackupSecrets.java:19–24](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/BackupSecrets.java#L19-L24)

```mermaid
flowchart TD
  n1["if Z.21 (Files.isSymbolicLink(path))"]
  n2["throw Z.21 throw new IOException('Invalid secrets.yml path');"]
  n3["if Z.22 (!Files.exists(path))"]
  n4["return Z.22 return new Credentials('', '', '');"]
  n5["BackupSecrets.load"]:::internal-link
  n6["return Z.23 return load(pluginDirectory);"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 --> n6
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.21 (Files.isSymbolicLink(path))
  Zeile 21: prüft `(Files.isSymbolicLink(path))`.
throw Z.21 throw new IOException('Invalid secrets.yml path');
  Zeile 21: Abbruch `throw new IOException('Invalid secrets.yml path');`.
if Z.22 (!Files.exists(path))
  Zeile 22: prüft `(!Files.exists(path))`.
return Z.22 return new Credentials('', '', '');
  Zeile 22: Rückgabe `return new Credentials('', '', '');`.
BackupSecrets.load
  Lädt `load`. Ruft `restrict`.
return Z.23 return load(pluginDirectory);
  Zeile 23: Rückgabe `return load(pluginDirectory);`.
```

- `readExisting` in `src/main/java/de/aichele/childlauncher/BackupSecrets.java`
