[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[HostMemoryProbe]] › [[HostMemoryProbe.keyValues]] › [[HostMemoryProbe.keyValues.Z133.Z135]]

# HostMemoryProbe.keyValues.Z133.Z135

```mermaid
flowchart TD
  n1["if Z.135 (lines.size() == 1 && !lines.get(0).contains(' '))"]
  n2["try Z.136"]
  n3["catch Z.136 (NumberFormatException ignore…"]
  n4["for Z.137 (String line : lines)"]
  n5["if Z.139 (fields.length == 2)"]
  n6["try Z.139"]
  n7["catch Z.139 (NumberFormatException ignore…"]
  n2 -->|"Fehler"| n3
  n6 -->|"Fehler"| n7
  n5 -->|"ja"| n6
  n4 -->|"wiederholen"| n5
  n1 -->|"ja"| n2
  n1 -->|"nein"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.135 (lines.size() == 1 && !lines.get(0).contains(' '))
  Zeile 135: prüft `(lines.size() == 1 && !lines.get(0).contains(' '))`.
try Z.136
  Zeile 136: Versuch. Der Fehlerpfad geht in catch.
catch Z.136 (NumberFormatException ignore…
  Zeile 136: fängt (NumberFormatException ignore….
for Z.137 (String line : lines)
  Zeile 137: Schleife `(String line : lines)`.
if Z.139 (fields.length == 2)
  Zeile 139: prüft `(fields.length == 2)`.
try Z.139
  Zeile 139: Versuch. Der Fehlerpfad geht in catch.
catch Z.139 (NumberFormatException ignore…
  Zeile 139: fängt (NumberFormatException ignore….
```

- Fortsetzung von `HostMemoryProbe.keyValues.Z133`, Quellreihenfolge.
