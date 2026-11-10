[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.parseMemoryBytes]] › [[FabricLauncherPlugin.parseMemoryBytes.Teil3]]

# FabricLauncherPlugin.parseMemoryBytes.Teil3

```mermaid
flowchart TD
  n1["try Z.1120"]
  n2["for Z.1122 (int i = 0; i ( power; i++)"]
  n3["return Z.1123 return bytes ) 0 ? bytes : -1;"]
  n4["catch Z.1124 (NumberFormatException / Arit…"]
  n5["return Z.1125 return -1;"]
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.1120
  Zeile 1120: Versuch. Der Fehlerpfad geht in catch.
for Z.1122 (int i = 0; i ( power; i++)
  Zeile 1122: Schleife `(int i = 0; i ( power; i++)`.
return Z.1123 return bytes ) 0 ? bytes : -1;
  Zeile 1123: Rückgabe `return bytes ) 0 ? bytes : -1;`.
catch Z.1124 (NumberFormatException / Arit…
  Zeile 1124: fängt (NumberFormatException / Arit….
return Z.1125 return -1;
  Zeile 1125: Rückgabe `return -1;`.
```

- Fortsetzung von `FabricLauncherPlugin.parseMemoryBytes`, Quellreihenfolge.
