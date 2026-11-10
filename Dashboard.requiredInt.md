[[00 Start]] › [[Dashboard-HTTP]] › [[API-Setup]] › [[Dashboard.requiredInt]]

# Dashboard.requiredInt

`Dashboard.requiredInt(JsonObject request, String key)` [src/main/java/de/aichele/childlauncher/Dashboard.java:796–801](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L796-L801)

```mermaid
flowchart TD
  n1["Dashboard.requiredLong"]:::internal-link
  n2["if Z.798 (value ( Integer.MIN_VALUE // value ) Integer.MAX…"]
  n3["throw Z.799 throw new IllegalArgumentException(key + ' liegt …"]
  n4["return Z.800 return (int) value;"]
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.requiredLong
  Liest verpflichtend `requiredLong`.
if Z.798 (value ( Integer.MIN_VALUE // value ) Integer.MAX…
  Zeile 798: prüft `(value ( Integer.MIN_VALUE // value ) Integer.MAX…`.
throw Z.799 throw new IllegalArgumentException(key + ' liegt …
  Zeile 799: Abbruch `throw new IllegalArgumentException(key + ' liegt …`.
return Z.800 return (int) value;
  Zeile 800: Rückgabe `return (int) value;`.
```

- `requiredInt` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
