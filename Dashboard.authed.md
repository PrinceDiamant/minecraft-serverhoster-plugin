[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Auth]] › [[Dashboard.authed]]

# Dashboard.authed

`Dashboard.authed(HttpExchange ex)` [src/main/java/de/aichele/childlauncher/Dashboard.java:486–492](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L486-L492)

```mermaid
flowchart TD
  n1["Dashboard.token"]:::internal-link
  n2["if Z.489 (exp == null)"]
  n3["return Z.489 return false;"]
  n4["if Z.490 (exp ( System.currentTimeMillis())"]
  n5["return Z.490 return false;"]
  n6["return Z.491 return true;"]
  n2 -->|"ja"| n3
  n1 --> n2
  n4 -->|"ja"| n5
  n3 --> n4
  n2 --> n4
  n5 --> n6
  n4 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.token
  `token` in `Dashboard.java`.
if Z.489 (exp == null)
  Zeile 489: prüft `(exp == null)`.
return Z.489 return false;
  Zeile 489: Rückgabe `return false;`.
if Z.490 (exp ( System.currentTimeMillis())
  Zeile 490: prüft `(exp ( System.currentTimeMillis())`.
return Z.490 return false;
  Zeile 490: Rückgabe `return false;`.
return Z.491 return true;
  Zeile 491: Rückgabe `return true;`.
```

- `authed` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
