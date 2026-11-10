[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2495.Z2497]]

# FabricLauncherPlugin.onCommand.Z2401.Case2495.Z2497

```mermaid
flowchart TD
  n1["try Z.2497"]
  n2["FabricLauncherPlugin.jcmd(String)"]:::internal-link
  n3["for Z.2501 (int i = 0; i ( n; i++)"]
  n4["if Z.2502 (lines.length ) n)"]
  n5["catch Z.2503 (IOException e)"]
  n2 --> n3
  n3 --> n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.2497
  Zeile 2497: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.jcmd(String)
  `jcmd` in `FabricLauncherPlugin.java`. Ruft `jcmd`.
for Z.2501 (int i = 0; i ( n; i++)
  Zeile 2501: Schleife `(int i = 0; i ( n; i++)`.
if Z.2502 (lines.length ) n)
  Zeile 2502: prüft `(lines.length ) n)`.
catch Z.2503 (IOException e)
  Zeile 2503: fängt (IOException e).
```

- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401.Case2495`, Quellreihenfolge.
