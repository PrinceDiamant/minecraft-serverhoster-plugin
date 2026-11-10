[[00 Start]] › [[Dashboard-HTTP]] › [[API-Status]] › [[Dashboard.cpu]] › [[Dashboard.cpu.Z667]]

# Dashboard.cpu.Z667

```mermaid
flowchart TD
  n1["try Z.667"]
  n2["Schritt Z.668 String st = Files.readString(Paths.get('/proc/' +…"]
  n3["Dashboard.cpu.Z667.Z671"]:::internal-link
  n4["return Z.680 return lastCpuPct;"]
  n5["catch Z.681 (Exception e)"]
  n6["return Z.681 return -1;"]
  n2 --> n3
  n3 --> n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.667
  Zeile 667: Versuch. Der Fehlerpfad geht in catch.
Schritt Z.668 String st = Files.readString(Paths.get('/proc/' +…
  Zeile 668: liest Text aus einer Datei. `String st = Files.readString(Paths.get('/proc/' +…`
Dashboard.cpu.Z667.Z671
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 671 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 671.
return Z.680 return lastCpuPct;
  Zeile 680: Rückgabe `return lastCpuPct;`.
catch Z.681 (Exception e)
  Zeile 681: fängt (Exception e).
return Z.681 return -1;
  Zeile 681: Rückgabe `return -1;`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.667**: Zeile 667: Versuch. Der Fehlerpfad geht in catch.
> - **Schritt Z.668 String st = Files.readString(Paths.get('/proc/' +…**: Zeile 668: liest Text aus einer Datei. `String st = Files.readString(Paths.get('/proc/' +…`
> - **Dashboard.cpu.Z667.Z671**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 671 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 671.
> - **return Z.680 return lastCpuPct;**: Zeile 680: Rückgabe `return lastCpuPct;`.
> - **catch Z.681 (Exception e)**: Zeile 681: fängt (Exception e).
> - **return Z.681 return -1;**: Zeile 681: Rückgabe `return -1;`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 667 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `Dashboard.cpu`.
