[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[LogQuery]] › [[LogQuery.query]] › [[LogQuery.query.Teil2.Z56]]

# LogQuery.query.Teil2.Z56

```mermaid
flowchart TD
  n1["for Z.56 (String line : data.split('/n', -1))"]
  n2["if Z.57 (!levelOk(line, lv) // (!needle.isEmpty() && !lin…"]
  n3["LogQuery.levelOk"]:::internal-link
  n4["if Z.59 (keep.size() ) limit)"]
  n2 -->|"Z.57"| n3
  n3 --> n4
  n3 --> n4
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.56 (String line : data.split('/n', -1))
  Zeile 56: Schleife `(String line : data.split('/n', -1))`.
if Z.57 (!levelOk(line, lv) // (!needle.isEmpty() && !lin…
  Zeile 57: prüft `(!levelOk(line, lv) // (!needle.isEmpty() && !lin…`.
LogQuery.levelOk
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `levelOk` in `LogQuery.java`. Ruft `isError`, `isWarn`.
if Z.59 (keep.size() ) limit)
  Zeile 59: prüft `(keep.size() ) limit)`.
```

> [!knoten]- Was die Blöcke tun
> - **for Z.56 (String line : data.split('/n', -1))**: Zeile 56: Schleife `(String line : data.split('/n', -1))`.
> - **if Z.57 (!levelOk(line, lv) // (!needle.isEmpty() && !lin…**: Zeile 57: prüft `(!levelOk(line, lv) // (!needle.isEmpty() && !lin…`.
> - **LogQuery.levelOk**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `levelOk` in `LogQuery.java`. Ruft `isError`, `isWarn`.
> - **if Z.59 (keep.size() ) limit)**: Zeile 59: prüft `(keep.size() ) limit)`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 56 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `LogQuery.query.Teil2`.
