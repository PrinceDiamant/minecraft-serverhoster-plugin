[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.trackPlayers]] › [[FabricLauncherPlugin.trackPlayers.Teil2]]

# FabricLauncherPlugin.trackPlayers.Teil2

```mermaid
flowchart TD
  n1["if Z.1844 (m.find())"]
  n2["for Z.1846 (String n : m.group(1).split(','))"]
  n3["if Z.1846 (!n.isEmpty())"]
  n2 -->|"wiederholen"| n3
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1844 (m.find())
  Zeile 1844: prüft `(m.find())`.
for Z.1846 (String n : m.group(1).split(','))
  Zeile 1846: Schleife `(String n : m.group(1).split(','))`.
if Z.1846 (!n.isEmpty())
  Zeile 1846: prüft `(!n.isEmpty())`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.1844 (m.find())**: Zeile 1844: prüft `(m.find())`.
> - **for Z.1846 (String n : m.group(1).split(','))**: Zeile 1846: Schleife `(String n : m.group(1).split(','))`.
> - **if Z.1846 (!n.isEmpty())**: Zeile 1846: prüft `(!n.isEmpty())`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.trackPlayers`.
