[[00 Start]] › [[Plugin-Kern]] › [[Slot-Aktionen]] › [[FabricLauncherPlugin.send]] › [[FabricLauncherPlugin.send.Z1975]]

# FabricLauncherPlugin.send.Z1975

```mermaid
flowchart TD
  n1["try Z.1975"]
  n2["sync Z.1975"]
  n3["return Z.1975 return true;"]
  n4["catch Z.1976 (IOException e)"]
  n5["return Z.1976 return false;"]
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.1975
  Zeile 1975: Versuch. Der Fehlerpfad geht in catch.
sync Z.1975
  Zeile 1975: synchronisierter Block.
return Z.1975 return true;
  Zeile 1975: Rückgabe `return true;`.
catch Z.1976 (IOException e)
  Zeile 1976: fängt (IOException e).
return Z.1976 return false;
  Zeile 1976: Rückgabe `return false;`.
```

- Fortsetzung von `FabricLauncherPlugin.send`, Quellreihenfolge.
