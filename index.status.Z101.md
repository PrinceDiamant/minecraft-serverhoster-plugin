[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Status]] › [[index.status]] › [[index.status.Z101]]

# index.status.Z101

```mermaid
flowchart TD
  n1["try Z.101"]
  n2["index.status.Z101.Teil1"]:::internal-link
  n3["index.status.Z101.Teil2"]:::internal-link
  n4["index.status.Z101.Teil3"]:::internal-link
  n5["index.status.Z101.Teil4"]:::internal-link
  n6["index.status.Z101.Teil5"]:::internal-link
  n7["catch Z.115 e"]
  n8["index.status.Z101.Z115"]:::internal-link
  n2 -->|"weiter"| n3
  n3 -->|"weiter"| n4
  n4 -->|"weiter"| n5
  n5 -->|"weiter"| n6
  n1 --> n2
  n1 -->|"Fehler"| n7
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.101
  Zeile 101: Versuch. Der Fehlerpfad geht in catch.
index.status.Z101.Teil1
  Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
index.status.Z101.Teil2
  Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
index.status.Z101.Teil3
  Abschnitt 3 dieses Ablaufs, in Quellreihenfolge.
index.status.Z101.Teil4
  Abschnitt 4 dieses Ablaufs, in Quellreihenfolge.
index.status.Z101.Teil5
  Abschnitt 5 dieses Ablaufs, in Quellreihenfolge.
catch Z.115 e
  Zeile 115: fängt e.
index.status.Z101.Z115
  Fortsetzung des Ablaufs ab Zeile 115.
```

- Fortsetzung von `index.status`, Quellreihenfolge.
