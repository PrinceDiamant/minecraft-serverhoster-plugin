[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[RestartPolicy]] › [[RestartPolicy.migrateLegacyUnlimited]]

# RestartPolicy.migrateLegacyUnlimited

`RestartPolicy.migrateLegacyUnlimited(Object raw)` [src/main/java/de/aichele/childlauncher/RestartPolicy.java:30–37](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/RestartPolicy.java#L30-L37)

```mermaid
flowchart TD
  n1["if Z.31 (!(raw instanceof Number number))"]
  n2["return Z.31 return false;"]
  n3["try Z.32"]
  n4["return Z.33 return new BigDecimal(number.toString()).intValue…"]
  n5["catch Z.34 (NumberFormatException / Arit…"]
  n6["return Z.35 return false;"]
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
if Z.31 (!(raw instanceof Number number))
  Zeile 31: prüft `(!(raw instanceof Number number))`.
return Z.31 return false;
  Zeile 31: Rückgabe `return false;`.
try Z.32
  Zeile 32: Versuch. Der Fehlerpfad geht in catch.
return Z.33 return new BigDecimal(number.toString()).intValue…
  Zeile 33: Rückgabe `return new BigDecimal(number.toString()).intValue…`.
catch Z.34 (NumberFormatException / Arit…
  Zeile 34: fängt (NumberFormatException / Arit….
return Z.35 return false;
  Zeile 35: Rückgabe `return false;`.
```

- `migrateLegacyUnlimited` in `src/main/java/de/aichele/childlauncher/RestartPolicy.java`
