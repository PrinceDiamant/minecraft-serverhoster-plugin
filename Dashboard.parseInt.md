[[00 Start]] › [[Dashboard-HTTP]] › [[API-Antworten]] › [[Dashboard.parseInt]]

# Dashboard.parseInt

`Dashboard.parseInt(String s, int fallback)` [src/main/java/de/aichele/childlauncher/Dashboard.java:927–930](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L927-L930)

```mermaid
flowchart TD
  n1["if Z.928 (s == null // s.isBlank())"]
  n2["return Z.928 return fallback;"]
  n3["try Z.929"]
  n4["return Z.929 return Integer.parseInt(s);"]
  n5["catch Z.929 (NumberFormatException e)"]
  n6["return Z.929 return fallback;"]
  n1 -->|"ja"| n2
  n3 --> n4
  n3 -->|"Fehler"| n5
  n5 --> n6
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.928 (s == null // s.isBlank())
  Zeile 928: prüft `(s == null // s.isBlank())`.
return Z.928 return fallback;
  Zeile 928: Rückgabe `return fallback;`.
try Z.929
  Zeile 929: Versuch. Der Fehlerpfad geht in catch.
return Z.929 return Integer.parseInt(s);
  Zeile 929: Rückgabe `return Integer.parseInt(s);`.
catch Z.929 (NumberFormatException e)
  Zeile 929: fängt (NumberFormatException e).
return Z.929 return fallback;
  Zeile 929: Rückgabe `return fallback;`.
```

- `parseInt` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
