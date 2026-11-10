[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Import]] › [[FabricLauncherPlugin.migrateHttpsFile]] › [[FabricLauncherPlugin.migrateHttpsFile.Teil1]]

# FabricLauncherPlugin.migrateHttpsFile.Teil1

```mermaid
flowchart TD
  n1["if Z.759 (path.isAbsolute())"]
  n2["if Z.760 (required && !Files.isRegularFile(path, LinkOptio…"]
  n3["throw Z.761 throw new IOException('Required legacy dashboard …"]
  n4["return Z.762 return;"]
  n5["if Z.766 (!source.startsWith(oldData) // !target.startsWit…"]
  n6["throw Z.767 throw new SecurityException('Legacy dashboard HTT…"]
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 -->|"ja"| n2
  n5 -->|"ja"| n6
  n4 --> n5
  n1 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.759 (path.isAbsolute())
  Zeile 759: prüft `(path.isAbsolute())`.
if Z.760 (required && !Files.isRegularFile(path, LinkOptio…
  Zeile 760: prüft `(required && !Files.isRegularFile(path, LinkOptio…`.
throw Z.761 throw new IOException('Required legacy dashboard …
  Zeile 761: Abbruch `throw new IOException('Required legacy dashboard …`.
return Z.762 return;
  Zeile 762: Rückgabe `return;`.
if Z.766 (!source.startsWith(oldData) // !target.startsWit…
  Zeile 766: prüft `(!source.startsWith(oldData) // !target.startsWit…`.
throw Z.767 throw new SecurityException('Legacy dashboard HTT…
  Zeile 767: Abbruch `throw new SecurityException('Legacy dashboard HTT…`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.759 (path.isAbsolute())**: Zeile 759: prüft `(path.isAbsolute())`.
> - **if Z.760 (required && !Files.isRegularFile(path, LinkOptio…**: Zeile 760: prüft `(required && !Files.isRegularFile(path, LinkOptio…`.
> - **throw Z.761 throw new IOException('Required legacy dashboard …**: Zeile 761: Abbruch `throw new IOException('Required legacy dashboard …`.
> - **return Z.762 return;**: Zeile 762: Rückgabe `return;`.
> - **if Z.766 (!source.startsWith(oldData) // !target.startsWit…**: Zeile 766: prüft `(!source.startsWith(oldData) // !target.startsWit…`.
> - **throw Z.767 throw new SecurityException('Legacy dashboard HTT…**: Zeile 767: Abbruch `throw new SecurityException('Legacy dashboard HTT…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.migrateHttpsFile`.
