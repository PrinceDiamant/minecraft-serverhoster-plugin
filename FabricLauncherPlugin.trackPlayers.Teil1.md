[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.trackPlayers]] › [[FabricLauncherPlugin.trackPlayers.Teil1]]

# FabricLauncherPlugin.trackPlayers.Teil1

```mermaid
flowchart TD
  n1["if Z.1841 (m.find())"]
  n2["return Z.1841 return;"]
  n3["if Z.1842 (m.find())"]
  n4["return Z.1842 return;"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1841 (m.find())
  Zeile 1841: prüft `(m.find())`.
return Z.1841 return;
  Zeile 1841: Rückgabe `return;`.
if Z.1842 (m.find())
  Zeile 1842: prüft `(m.find())`.
return Z.1842 return;
  Zeile 1842: Rückgabe `return;`.
```

- Fortsetzung von `FabricLauncherPlugin.trackPlayers`, Quellreihenfolge.
