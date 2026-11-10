[[00 Start]] › [[Dashboard-HTTP]] › [[API-Dateien]] › [[Dashboard.fsRead]]

# Dashboard.fsRead

`Dashboard.fsRead(HttpExchange ex, Map<String, String> q, String sid)` [src/main/java/de/aichele/childlauncher/Dashboard.java:832–854](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L832-L854)

```mermaid
flowchart TD
  n1["Dashboard.safe"]:::internal-link
  n2["if Z.834 (!Files.isRegularFile(f))"]
  n3["Dashboard.json"]:::internal-link
  n4["return Z.834 return;"]
  n5["Dashboard.fsRead.Z835"]:::internal-link
  n6["Dashboard.fsRead.Z844"]:::internal-link
  n7["Dashboard.text"]:::internal-link
  n3 --> n4
  n2 -->|"ja"| n3
  n1 --> n2
  n4 --> n5
  n2 --> n5
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.safe
  Prüft die Pfadgrenze `safe`. Ruft `guard`, `resolve`.
if Z.834 (!Files.isRegularFile(f))
  Zeile 834: prüft `(!Files.isRegularFile(f))`.
Dashboard.json
  Antwortet mit JSON `json`. Ruft `sendBytes`.
return Z.834 return;
  Zeile 834: Rückgabe `return;`.
Dashboard.fsRead.Z835
  Fortsetzung des Ablaufs ab Zeile 835.
Dashboard.fsRead.Z844
  Fortsetzung des Ablaufs ab Zeile 844.
Dashboard.text
  Antwortet mit Text `text`. Ruft `sendBytes`.
```

- `fsRead` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
