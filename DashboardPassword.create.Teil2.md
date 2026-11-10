[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[DashboardPassword]] › [[DashboardPassword.create]] › [[DashboardPassword.create.Teil2]]

# DashboardPassword.create.Teil2

```mermaid
flowchart TD
  n1["try Z.35"]
  n2["Schritt Z.36 Files.writeString(file, password + '/n', Standard…"]
  n3["catch Z.37 (IOException e)"]
  n4["try Z.38"]
  n5["Schritt Z.38 Files.deleteIfExists(file);"]
  n6["catch Z.38 (IOException cleanup)"]
  n7["throw Z.39 throw e;"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n4 --> n5
  n4 -->|"Fehler"| n6
  n5 --> n7
  n6 --> n7
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.35
  Zeile 35: Versuch. Der Fehlerpfad geht in catch.
Schritt Z.36 Files.writeString(file, password + '/n', Standard…
  Zeile 36: schreibt Text in eine Datei. `Files.writeString(file, password + '/n', Standard…`
catch Z.37 (IOException e)
  Zeile 37: fängt (IOException e).
try Z.38
  Zeile 38: Versuch. Der Fehlerpfad geht in catch.
Schritt Z.38 Files.deleteIfExists(file);
  Zeile 38: Dateioperation. `Files.deleteIfExists(file);`
catch Z.38 (IOException cleanup)
  Zeile 38: fängt (IOException cleanup).
throw Z.39 throw e;
  Zeile 39: Abbruch `throw e;`.
```

- Fortsetzung von `DashboardPassword.create`, Quellreihenfolge.
