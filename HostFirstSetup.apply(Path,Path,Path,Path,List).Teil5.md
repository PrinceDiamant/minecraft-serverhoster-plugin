[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.apply(Path,Path,Path,Path,List)]] › [[HostFirstSetup.apply(Path,Path,Path,Path,List).Teil5]]

# HostFirstSetup.apply(Path,Path,Path,Path,List).Teil5

```mermaid
flowchart TD
  n1["PropertiesFile.update"]:::internal-link
  n2["HostMinimize.firstSetupProperties"]:::internal-link
  n3["HostFirstSetup.writeMarker(Path,String,String,int,String)"]:::internal-link
  n4["return Z.113 return new Result(true, worldName, List.of(), dis…"]
  n1 -->|"Z.109"| n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
PropertiesFile.update
  Dieser Teil ändert das. Aktualisiert `update`.
HostMinimize.firstSetupProperties
  Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um die [[Glossar#Einrichtung|Einrichtung]] die Eigenschaften. `firstSetupProperties` in `HostMinimize.java`.
HostFirstSetup.writeMarker(Path,String,String,int,String)
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] schreibt die Merkdatei. Schreibt `writeMarker`.
return Z.113 return new Result(true, worldName, List.of(), dis…
  Zeile 113: Rückgabe `return new Result(true, worldName, List.of(), dis…`.
```

> [!knoten]- Was die Blöcke tun
> - **PropertiesFile.update**: Dieser Teil ändert das. Aktualisiert `update`.
> - **HostMinimize.firstSetupProperties**: Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um die [[Glossar#Einrichtung|Einrichtung]] die Eigenschaften. `firstSetupProperties` in `HostMinimize.java`.
> - **HostFirstSetup.writeMarker(Path,String,String,int,String)**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] schreibt die Merkdatei. Schreibt `writeMarker`.
> - **return Z.113 return new Result(true, worldName, List.of(), dis…**: Zeile 113: Rückgabe `return new Result(true, worldName, List.of(), dis…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HostFirstSetup.apply(Path,Path,Path,Path,List)`.
