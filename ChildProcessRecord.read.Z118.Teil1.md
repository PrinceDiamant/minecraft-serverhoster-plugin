[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.read]] › [[ChildProcessRecord.read.Z118.Teil1]]

# ChildProcessRecord.read.Z118.Teil1

```mermaid
flowchart TD
  n1["if Z.119 (file == null // !Files.exists(file))"]
  n2["return Z.119 return new Loaded(null, '');"]
  n3["if Z.120 (Files.isSymbolicLink(file))"]
  n4["return Z.120 return new Loaded(null, 'process record is a syml…"]
  n5["if Z.121 (!Files.isRegularFile(file))"]
  n6["return Z.121 return new Loaded(null, 'process record is not a …"]
  n7["Schritt Z.122 List(String) lines = Files.readAllLines(file, Sta…"]
  n8["if Z.123 (lines.isEmpty() // !HEADER.equals(lines.getFirst…"]
  n9["return Z.124 return new Loaded(null, 'process record header is…"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  n5 --> n7
  n8 -->|"ja"| n9
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.119 (file == null // !Files.exists(file))
  Zeile 119: prüft `(file == null // !Files.exists(file))`.
return Z.119 return new Loaded(null, '');
  Zeile 119: Rückgabe `return new Loaded(null, '');`.
if Z.120 (Files.isSymbolicLink(file))
  Zeile 120: prüft `(Files.isSymbolicLink(file))`.
return Z.120 return new Loaded(null, 'process record is a syml…
  Zeile 120: Rückgabe `return new Loaded(null, 'process record is a syml…`.
if Z.121 (!Files.isRegularFile(file))
  Zeile 121: prüft `(!Files.isRegularFile(file))`.
return Z.121 return new Loaded(null, 'process record is not a …
  Zeile 121: Rückgabe `return new Loaded(null, 'process record is not a …`.
Schritt Z.122 List(String) lines = Files.readAllLines(file, Sta…
  Zeile 122: Dateioperation. `List(String) lines = Files.readAllLines(file, Sta…`
if Z.123 (lines.isEmpty() // !HEADER.equals(lines.getFirst…
  Zeile 123: prüft `(lines.isEmpty() // !HEADER.equals(lines.getFirst…`.
return Z.124 return new Loaded(null, 'process record header is…
  Zeile 124: Rückgabe `return new Loaded(null, 'process record header is…`.
```

- Fortsetzung von `ChildProcessRecord.read.Z118`, Quellreihenfolge.
