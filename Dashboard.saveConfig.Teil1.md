[[00 Start]] › [[Dashboard-HTTP]] › [[API-Setup]] › [[Dashboard.saveConfig]] › [[Dashboard.saveConfig.Teil1]]

# Dashboard.saveConfig.Teil1

```mermaid
flowchart TD
  n1["Dashboard.readBodyText"]:::internal-link
  n2["try Z.764"]
  n3["catch Z.764 (Exception e)"]
  n4["Dashboard.json"]:::internal-link
  n5["return Z.764 return;"]
  n6["Dashboard.saveConfig.Teil1.Z765"]:::internal-link
  n7["FabricLauncherPlugin.info(String)"]:::internal-link
  n2 -->|"Fehler"| n3
  n4 --> n5
  n3 --> n4
  n1 --> n2
  n2 --> n6
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.readBodyText
  Liest `readBodyText`.
try Z.764
  Zeile 764: Versuch. Der Fehlerpfad geht in catch.
catch Z.764 (Exception e)
  Zeile 764: fängt (Exception e).
Dashboard.json
  Antwortet mit JSON `json`. Ruft `sendBytes`.
return Z.764 return;
  Zeile 764: Rückgabe `return;`.
Dashboard.saveConfig.Teil1.Z765
  Fortsetzung des Ablaufs ab Zeile 765.
FabricLauncherPlugin.info(String)
  Schreibt eine Infozeile `info`. Ruft `info`.
```

- Fortsetzung von `Dashboard.saveConfig`, Quellreihenfolge.
