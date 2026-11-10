[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[ProcessProbe]] › [[ProcessProbe.disk]]

# ProcessProbe.disk

`ProcessProbe.disk(Path root, int maxEntries)` [src/main/java/de/aichele/childlauncher/ProcessProbe.java:53–68](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ProcessProbe.java#L53-L68)

```mermaid
flowchart TD
  n1["if Z.54 (root == null // !Files.isDirectory(root))"]
  n2["return Z.54 return new Disk(0, 0, false);"]
  n3["ProcessProbe.disk.Z57"]:::internal-link
  n4["return Z.67 return new Disk(bytes, files, partial);"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.54 (root == null // !Files.isDirectory(root))
  Zeile 54: prüft `(root == null // !Files.isDirectory(root))`.
return Z.54 return new Disk(0, 0, false);
  Zeile 54: Rückgabe `return new Disk(0, 0, false);`.
ProcessProbe.disk.Z57
  Fortsetzung des Ablaufs ab Zeile 57.
return Z.67 return new Disk(bytes, files, partial);
  Zeile 67: Rückgabe `return new Disk(bytes, files, partial);`.
```

- `disk` in `src/main/java/de/aichele/childlauncher/ProcessProbe.java`
