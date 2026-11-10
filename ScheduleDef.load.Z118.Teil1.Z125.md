[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[ScheduleDef]] › [[ScheduleDef.Teil1]] › [[ScheduleDef.load]] › [[ScheduleDef.load.Z118.Teil1.Z125]]

# ScheduleDef.load.Z118.Teil1.Z125

```mermaid
flowchart TD
  n1["for Z.125 (Object actionItem : actionList)"]
  n2["ScheduleDef.asMap"]:::internal-link
  n3["if Z.127 (action == null)"]
  n4["throw Z.127 throw new IllegalArgumentException('Ungültige Akt…"]
  n5["ScheduleDef.Action.Action"]:::internal-link
  n6["ScheduleDef.string"]:::internal-link
  n7["ScheduleDef.string"]:::internal-link
  n8["ScheduleDef.string"]:::internal-link
  n3 -->|"ja"| n4
  n2 --> n3
  n5 -->|"Z.128"| n6
  n6 -->|"Z.128"| n7
  n7 -->|"Z.128"| n8
  n4 --> n5
  n3 --> n5
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.125 (Object actionItem : actionList)
  Zeile 125: Schleife `(Object actionItem : actionList)`.
ScheduleDef.asMap
  `asMap` in `ScheduleDef.java`.
if Z.127 (action == null)
  Zeile 127: prüft `(action == null)`.
throw Z.127 throw new IllegalArgumentException('Ungültige Akt…
  Zeile 127: Abbruch `throw new IllegalArgumentException('Ungültige Akt…`.
ScheduleDef.Action.Action
  `Action` in `ScheduleDef.java`.
ScheduleDef.string
  `string` in `ScheduleDef.java`.
```

- Fortsetzung von `ScheduleDef.load.Z118.Teil1`, Quellreihenfolge.
