[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[CrashIndex]] › [[CrashIndex.read]] › [[CrashIndex.read.Teil1]]

# CrashIndex.read.Teil1

```mermaid
flowchart TD
  n1["if Z.39 (file == null // !NAME.matcher(file).matches())"]
  n2["throw Z.39 throw new SecurityException('Pfad außerhalb des S…"]
  n3["PathGuard.open"]:::internal-link
  n4["PathGuard.resolve"]:::internal-link
  n5["if Z.42 (Files.isSymbolicLink(dir))"]
  n6["throw Z.42 throw new SecurityException('Pfad außerhalb des S…"]
  n7["PathGuard.resolve"]:::internal-link
  n8["if Z.44 (Files.isSymbolicLink(p))"]
  n9["throw Z.44 throw new SecurityException('Pfad außerhalb des S…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n5 -->|"ja"| n6
  n4 --> n5
  n6 --> n7
  n5 --> n7
  n8 -->|"ja"| n9
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.39 (file == null // !NAME.matcher(file).matches())
  Zeile 39: prüft `(file == null // !NAME.matcher(file).matches())`.
throw Z.39 throw new SecurityException('Pfad außerhalb des S…
  Zeile 39: Abbruch `throw new SecurityException('Pfad außerhalb des S…`.
PathGuard.open
  Dieser Teil öffnet das. Öffnet `open`. Ruft `PathGuard`.
PathGuard.resolve
  Dieser Teil bestimmt das. Löst auf `resolve`.
if Z.42 (Files.isSymbolicLink(dir))
  Zeile 42: prüft `(Files.isSymbolicLink(dir))`.
throw Z.42 throw new SecurityException('Pfad außerhalb des S…
  Zeile 42: Abbruch `throw new SecurityException('Pfad außerhalb des S…`.
if Z.44 (Files.isSymbolicLink(p))
  Zeile 44: prüft `(Files.isSymbolicLink(p))`.
throw Z.44 throw new SecurityException('Pfad außerhalb des S…
  Zeile 44: Abbruch `throw new SecurityException('Pfad außerhalb des S…`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.39 (file == null // !NAME.matcher(file).matches())**: Zeile 39: prüft `(file == null // !NAME.matcher(file).matches())`.
> - **throw Z.39 throw new SecurityException('Pfad außerhalb des S…**: Zeile 39: Abbruch `throw new SecurityException('Pfad außerhalb des S…`.
> - **PathGuard.open**: Dieser Teil öffnet das. Öffnet `open`. Ruft `PathGuard`.
> - **PathGuard.resolve**: Dieser Teil bestimmt das. Löst auf `resolve`.
> - **if Z.42 (Files.isSymbolicLink(dir))**: Zeile 42: prüft `(Files.isSymbolicLink(dir))`.
> - **throw Z.42 throw new SecurityException('Pfad außerhalb des S…**: Zeile 42: Abbruch `throw new SecurityException('Pfad außerhalb des S…`.
> - **if Z.44 (Files.isSymbolicLink(p))**: Zeile 44: prüft `(Files.isSymbolicLink(p))`.
> - **throw Z.44 throw new SecurityException('Pfad außerhalb des S…**: Zeile 44: Abbruch `throw new SecurityException('Pfad außerhalb des S…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `CrashIndex.read`.
