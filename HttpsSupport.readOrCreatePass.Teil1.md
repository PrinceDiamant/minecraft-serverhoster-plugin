[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil1]] › [[HttpsSupport.readOrCreatePass]] › [[HttpsSupport.readOrCreatePass.Teil1]]

# HttpsSupport.readOrCreatePass.Teil1

```mermaid
flowchart TD
  n1["if Z.72 (Files.exists(file))"]
  n2["Schritt Z.73 String p = Files.readString(file).trim();"]
  n3["if Z.74 (!p.isEmpty())"]
  n4["return Z.74 return p;"]
  n5["for Z.79 (int i = 0; i ( 24; i++)"]
  n6["Schritt Z.80 Files.createDirectories(file.getParent());"]
  n7["Schritt Z.81 Files.writeString(file, sb + '/n');"]
  n3 -->|"ja"| n4
  n2 --> n3
  n1 -->|"ja"| n2
  n4 --> n5
  n3 --> n5
  n1 --> n5
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.72 (Files.exists(file))
  Zeile 72: prüft `(Files.exists(file))`.
Schritt Z.73 String p = Files.readString(file).trim();
  Zeile 73: liest Text aus einer Datei. `String p = Files.readString(file).trim();`
if Z.74 (!p.isEmpty())
  Zeile 74: prüft `(!p.isEmpty())`.
return Z.74 return p;
  Zeile 74: Rückgabe `return p;`.
for Z.79 (int i = 0; i ( 24; i++)
  Zeile 79: Schleife `(int i = 0; i ( 24; i++)`.
Schritt Z.80 Files.createDirectories(file.getParent());
  Zeile 80: Dateioperation. `Files.createDirectories(file.getParent());`
Schritt Z.81 Files.writeString(file, sb + '/n');
  Zeile 81: schreibt Text in eine Datei. `Files.writeString(file, sb + '/n');`
```

- Fortsetzung von `HttpsSupport.readOrCreatePass`, Quellreihenfolge.
