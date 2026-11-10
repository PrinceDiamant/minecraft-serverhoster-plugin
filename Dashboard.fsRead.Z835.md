[[00 Start]] › [[Dashboard-HTTP]] › [[API-Dateien]] › [[Dashboard.fsRead]] › [[Dashboard.fsRead.Z835]]

# Dashboard.fsRead.Z835

```mermaid
flowchart TD
  n1["if Z.835 (f.toString().endsWith('.gz'))"]
  n2["Dashboard.fsRead.Z835.Z836"]:::internal-link
  n3["return Z.842 return;"]
  n2 --> n3
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.835 (f.toString().endsWith('.gz'))
  Zeile 835: prüft `(f.toString().endsWith('.gz'))`.
Dashboard.fsRead.Z835.Z836
  Fortsetzung des Ablaufs ab Zeile 836.
return Z.842 return;
  Zeile 842: Rückgabe `return;`.
```

- Fortsetzung von `Dashboard.fsRead`, Quellreihenfolge.
