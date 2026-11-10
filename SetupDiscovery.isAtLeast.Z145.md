[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupDiscovery]] › [[SetupDiscovery.isAtLeast]] › [[SetupDiscovery.isAtLeast.Z145]]

# SetupDiscovery.isAtLeast.Z145

```mermaid
flowchart TD
  n1["try Z.145"]
  n2["for Z.148 (int i = 0; i ( required.length; i++)"]
  n3["if Z.151 (a != b)"]
  n4["return Z.151 return a ) b;"]
  n5["return Z.153 return true;"]
  n6["catch Z.154 (RuntimeException e)"]
  n7["return Z.155 return false;"]
  n3 -->|"ja"| n4
  n2 -->|"wiederholen"| n3
  n4 --> n5
  n3 --> n5
  n1 --> n2
  n1 -->|"Fehler"| n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.145
  Zeile 145: Versuch. Der Fehlerpfad geht in catch.
for Z.148 (int i = 0; i ( required.length; i++)
  Zeile 148: Schleife `(int i = 0; i ( required.length; i++)`.
if Z.151 (a != b)
  Zeile 151: prüft `(a != b)`.
return Z.151 return a ) b;
  Zeile 151: Rückgabe `return a ) b;`.
return Z.153 return true;
  Zeile 153: Rückgabe `return true;`.
catch Z.154 (RuntimeException e)
  Zeile 154: fängt (RuntimeException e).
return Z.155 return false;
  Zeile 155: Rückgabe `return false;`.
```

- Fortsetzung von `SetupDiscovery.isAtLeast`, Quellreihenfolge.
