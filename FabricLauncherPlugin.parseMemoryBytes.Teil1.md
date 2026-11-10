[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.parseMemoryBytes]] › [[FabricLauncherPlugin.parseMemoryBytes.Teil1]]

# FabricLauncherPlugin.parseMemoryBytes.Teil1

```mermaid
flowchart TD
  n1["if Z.1107 (value == null)"]
  n2["return Z.1107 return -1;"]
  n3["if Z.1109 (normalized.endsWith('B'))"]
  n4["if Z.1110 (normalized.isEmpty())"]
  n5["return Z.1110 return -1;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"ja"| n5
  n3 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1107 (value == null)
  Zeile 1107: prüft `(value == null)`.
return Z.1107 return -1;
  Zeile 1107: Rückgabe `return -1;`.
if Z.1109 (normalized.endsWith('B'))
  Zeile 1109: prüft `(normalized.endsWith('B'))`.
if Z.1110 (normalized.isEmpty())
  Zeile 1110: prüft `(normalized.isEmpty())`.
return Z.1110 return -1;
  Zeile 1110: Rückgabe `return -1;`.
```

- Fortsetzung von `FabricLauncherPlugin.parseMemoryBytes`, Quellreihenfolge.
