[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.pipe]] › [[FabricLauncherPlugin.pipe.Z1778.Z1780.Teil1]]

# FabricLauncherPlugin.pipe.Z1778.Z1780.Teil1

```mermaid
flowchart TD
  n1["if Z.1782 (parseTick(slot, line))"]
  n2["FabricLauncherPlugin.parseTick"]:::internal-link
  n3["ConsoleBuffer.add"]:::internal-link
  n4["FabricLauncherPlugin.trackPlayers"]:::internal-link
  n1 -->|"Z.1782"| n2
  n2 --> n3
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1782 (parseTick(slot, line))
  Zeile 1782: prüft `(parseTick(slot, line))`.
FabricLauncherPlugin.parseTick
  Liest aus einer Antwort, wie lange der letzte [[Glossar#Spielschritt|Spielschritt]] gedauert hat. Wertet aus `parseTick`. Ruft `consume`, `pushMspt`.
ConsoleBuffer.add
  Dieser Teil fügt hinzu das. Fügt hinzu `add`.
FabricLauncherPlugin.trackPlayers
  Merkt sich, welche [[Glossar#Spieler|Spieler]] gerade auf dem [[Glossar#Spielserver|Spielserver]] sind. Führt mit `trackPlayers`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.1782 (parseTick(slot, line))**: Zeile 1782: prüft `(parseTick(slot, line))`.
> - **FabricLauncherPlugin.parseTick**: Liest aus einer Antwort, wie lange der letzte [[Glossar#Spielschritt|Spielschritt]] gedauert hat. Wertet aus `parseTick`. Ruft `consume`, `pushMspt`.
> - **ConsoleBuffer.add**: Dieser Teil fügt hinzu das. Fügt hinzu `add`.
> - **FabricLauncherPlugin.trackPlayers**: Merkt sich, welche [[Glossar#Spieler|Spieler]] gerade auf dem [[Glossar#Spielserver|Spielserver]] sind. Führt mit `trackPlayers`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.pipe.Z1778.Z1780`.
