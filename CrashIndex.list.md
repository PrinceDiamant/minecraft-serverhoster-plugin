[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[CrashIndex]] › [[CrashIndex.list]]

# CrashIndex.list

`CrashIndex.list(Path workDir)` [src/main/java/de/aichele/childlauncher/CrashIndex.java:20–36](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/CrashIndex.java#L20-L36)

```mermaid
flowchart TD
  n1["PathGuard.open"]:::internal-link
  n2["PathGuard.resolve"]:::internal-link
  n3["if Z.23 (Files.isSymbolicLink(dir))"]
  n4["throw Z.23 throw new SecurityException('Pfad außerhalb des S…"]
  n5["if Z.24 (!Files.isDirectory(dir, LinkOption.NOFOLLOW_LINK…"]
  n6["return Z.24 return List.of();"]
  n7["CrashIndex.list.Z26"]:::internal-link
  n8["return Z.35 return List.copyOf(names);"]
  n1 --> n2
  n3 -->|"ja"| n4
  n2 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  n5 --> n7
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
PathGuard.open
  Dieser Teil öffnet das. Öffnet `open`. Ruft `PathGuard`.
PathGuard.resolve
  Dieser Teil bestimmt das. Löst auf `resolve`.
if Z.23 (Files.isSymbolicLink(dir))
  Zeile 23: prüft `(Files.isSymbolicLink(dir))`.
throw Z.23 throw new SecurityException('Pfad außerhalb des S…
  Zeile 23: Abbruch `throw new SecurityException('Pfad außerhalb des S…`.
if Z.24 (!Files.isDirectory(dir, LinkOption.NOFOLLOW_LINK…
  Zeile 24: prüft `(!Files.isDirectory(dir, LinkOption.NOFOLLOW_LINK…`.
return Z.24 return List.of();
  Zeile 24: Rückgabe `return List.of();`.
CrashIndex.list.Z26
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 26 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 26.
return Z.35 return List.copyOf(names);
  Zeile 35: Rückgabe `return List.copyOf(names);`.
```

> [!knoten]- Was die Blöcke tun
> - **PathGuard.open**: Dieser Teil öffnet das. Öffnet `open`. Ruft `PathGuard`.
> - **PathGuard.resolve**: Dieser Teil bestimmt das. Löst auf `resolve`.
> - **if Z.23 (Files.isSymbolicLink(dir))**: Zeile 23: prüft `(Files.isSymbolicLink(dir))`.
> - **throw Z.23 throw new SecurityException('Pfad außerhalb des S…**: Zeile 23: Abbruch `throw new SecurityException('Pfad außerhalb des S…`.
> - **if Z.24 (!Files.isDirectory(dir, LinkOption.NOFOLLOW_LINK…**: Zeile 24: prüft `(!Files.isDirectory(dir, LinkOption.NOFOLLOW_LINK…`.
> - **return Z.24 return List.of();**: Zeile 24: Rückgabe `return List.of();`.
> - **CrashIndex.list.Z26**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 26 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 26.
> - **return Z.35 return List.copyOf(names);**: Zeile 35: Rückgabe `return List.copyOf(names);`.

- Dieser Teil zeigt das.
- `list` in `src/main/java/de/aichele/childlauncher/CrashIndex.java`
