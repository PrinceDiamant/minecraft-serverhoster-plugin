[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.applyKeepsWorldSelectionChildBackupsAndSecurityKeys]] › [[HostMinimizeTest.applyKeepsWorldSelectionChildBackupsAndSecurityKeys.Teil1]]

# HostMinimizeTest.applyKeepsWorldSelectionChildBackupsAndSecurityKeys.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.29 Files.createDirectories(child.resolve('world'));"]
  n2["Schritt Z.30 Files.createDirectories(backups);"]
  n3["Schritt Z.31 Files.writeString(child.resolve('world/level.dat'…"]
  n4["Schritt Z.32 Files.writeString(child.resolve('server.propertie…"]
  n5["Schritt Z.33 Files.writeString(child.resolve('whitelist.json')…"]
  n6["Schritt Z.34 Files.writeString(root.resolve('whitelist.json'),…"]
  n7["Schritt Z.35 Files.writeString(backups.resolve('world.zip'), '…"]
  n8["Schritt Z.36 Files.writeString(root.resolve('server.properties…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.29 Files.createDirectories(child.resolve('world'));
  Zeile 29: Dateioperation. `Files.createDirectories(child.resolve('world'));`
Schritt Z.30 Files.createDirectories(backups);
  Zeile 30: Dateioperation. `Files.createDirectories(backups);`
Schritt Z.31 Files.writeString(child.resolve('world/level.dat'…
  Zeile 31: schreibt Text in eine Datei. `Files.writeString(child.resolve('world/level.dat'…`
Schritt Z.32 Files.writeString(child.resolve('server.propertie…
  Zeile 32: schreibt Text in eine Datei. `Files.writeString(child.resolve('server.propertie…`
Schritt Z.33 Files.writeString(child.resolve('whitelist.json')…
  Zeile 33: schreibt Text in eine Datei. `Files.writeString(child.resolve('whitelist.json')…`
Schritt Z.34 Files.writeString(root.resolve('whitelist.json'),…
  Zeile 34: schreibt Text in eine Datei. `Files.writeString(root.resolve('whitelist.json'),…`
Schritt Z.35 Files.writeString(backups.resolve('world.zip'), '…
  Zeile 35: schreibt Text in eine Datei. `Files.writeString(backups.resolve('world.zip'), '…`
Schritt Z.36 Files.writeString(root.resolve('server.properties…
  Zeile 36: schreibt Text in eine Datei. `Files.writeString(root.resolve('server.properties…`
```

- Fortsetzung von `HostMinimizeTest.applyKeepsWorldSelectionChildBackupsAndSecurityKeys`, Quellreihenfolge.
