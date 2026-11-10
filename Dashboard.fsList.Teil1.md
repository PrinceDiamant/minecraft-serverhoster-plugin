[[00 Start]] › [[Dashboard-HTTP]] › [[API-Dateien]] › [[Dashboard.fsList]] › [[Dashboard.fsList.Teil1]]

# Dashboard.fsList.Teil1

```mermaid
flowchart TD
  n1["Dashboard.safe"]:::internal-link
  n2["if Z.820 (!Files.isDirectory(d))"]
  n3["Dashboard.json"]:::internal-link
  n4["return Z.820 return;"]
  n5["try Z.822"]
  n6["for Z.823 (Path c : ds)"]
  n7["Schritt Z.824 BasicFileAttributes a = Files.readAttributes(c, B…"]
  n3 --> n4
  n2 -->|"ja"| n3
  n1 --> n2
  n6 -->|"wiederholen"| n7
  n5 --> n6
  n4 --> n5
  n2 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.safe
  Prüft die Pfadgrenze `safe`. Ruft `guard`, `resolve`.
if Z.820 (!Files.isDirectory(d))
  Zeile 820: prüft `(!Files.isDirectory(d))`.
Dashboard.json
  Antwortet mit JSON `json`. Ruft `sendBytes`.
return Z.820 return;
  Zeile 820: Rückgabe `return;`.
try Z.822
  Zeile 822: Versuch. Der Fehlerpfad geht in catch.
for Z.823 (Path c : ds)
  Zeile 823: Schleife `(Path c : ds)`.
Schritt Z.824 BasicFileAttributes a = Files.readAttributes(c, B…
  Zeile 824: Dateioperation. `BasicFileAttributes a = Files.readAttributes(c, B…`
```

- Fortsetzung von `Dashboard.fsList`, Quellreihenfolge.
