[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[CrashIndex]] › [[CrashIndex.list]] › [[CrashIndex.list.Z26.Z27]]

# CrashIndex.list.Z26.Z27

```mermaid
flowchart TD
  n1["for Z.27 (Path p : ds)"]
  n2["if Z.29 (!NAME.matcher(name).matches())"]
  n3["if Z.30 (Files.isSymbolicLink(p) // !Files.isRegularFile(…"]
  n2 --> n3
  n2 --> n3
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.27 (Path p : ds)
  Zeile 27: Schleife `(Path p : ds)`.
if Z.29 (!NAME.matcher(name).matches())
  Zeile 29: prüft `(!NAME.matcher(name).matches())`.
if Z.30 (Files.isSymbolicLink(p) // !Files.isRegularFile(…
  Zeile 30: prüft `(Files.isSymbolicLink(p) // !Files.isRegularFile(…`.
```

- Fortsetzung von `CrashIndex.list.Z26`, Quellreihenfolge.
