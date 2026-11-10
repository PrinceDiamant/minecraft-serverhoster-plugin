[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupDiscovery]] › [[SetupDiscovery.topLevelEntries]]

# SetupDiscovery.topLevelEntries

`SetupDiscovery.topLevelEntries(Path path)` [src/main/java/de/aichele/childlauncher/SetupDiscovery.java:191–203](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/SetupDiscovery.java#L191-L203)

```mermaid
flowchart TD
  n1["try Z.193"]
  n2["for Z.194 (Path entry : entries)"]
  n3["if Z.195 (names.size() == 20)"]
  n4["Schritt Z.199 names.add(entry.getFileName().toString() + (Files…"]
  n5["return Z.202 return List.copyOf(names);"]
  n3 --> n4
  n3 --> n4
  n2 -->|"wiederholen"| n3
  n1 --> n2
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.193
  Zeile 193: Versuch. Der Fehlerpfad geht in catch.
for Z.194 (Path entry : entries)
  Zeile 194: Schleife `(Path entry : entries)`.
if Z.195 (names.size() == 20)
  Zeile 195: prüft `(names.size() == 20)`.
Schritt Z.199 names.add(entry.getFileName().toString() + (Files…
  Zeile 199: `names.add(entry.getFileName().toString() + (Files…`
return Z.202 return List.copyOf(names);
  Zeile 202: Rückgabe `return List.copyOf(names);`.
```

- `topLevelEntries` in `src/main/java/de/aichele/childlauncher/SetupDiscovery.java`
