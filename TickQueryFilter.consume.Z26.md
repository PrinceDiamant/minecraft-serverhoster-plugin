[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[TickQueryFilter]] › [[TickQueryFilter.consume]] › [[TickQueryFilter.consume.Z26]]

# TickQueryFilter.consume.Z26

```mermaid
flowchart TD
  n1["if Z.26 (avg.find())"]
  n2["try Z.27"]
  n3["catch Z.32 (NumberFormatException ignore…"]
  n4["return Z.33 return true;"]
  n2 -->|"Fehler"| n3
  n2 --> n4
  n3 --> n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.26 (avg.find())
  Zeile 26: prüft `(avg.find())`.
try Z.27
  Zeile 27: Versuch. Der Fehlerpfad geht in catch.
catch Z.32 (NumberFormatException ignore…
  Zeile 32: fängt (NumberFormatException ignore….
return Z.33 return true;
  Zeile 33: Rückgabe `return true;`.
```

- Fortsetzung von `TickQueryFilter.consume`, Quellreihenfolge.
