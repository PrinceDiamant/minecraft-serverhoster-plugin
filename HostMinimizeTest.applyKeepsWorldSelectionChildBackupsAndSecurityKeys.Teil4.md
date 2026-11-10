[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.applyKeepsWorldSelectionChildBackupsAndSecurityKeys]] › [[HostMinimizeTest.applyKeepsWorldSelectionChildBackupsAndSecurityKeys.Teil4]]

# HostMinimizeTest.applyKeepsWorldSelectionChildBackupsAndSecurityKeys.Teil4

```mermaid
flowchart TD
  n1["Schritt Z.70 assertEquals('child-world', Files.readString(chil…"]
  n2["Schritt Z.71 assertTrue(Files.readString(child.resolve('server…"]
  n3["Schritt Z.72 assertEquals('backup', Files.readString(backups.r…"]
  n4["Schritt Z.73 assertEquals('eula=true/n', Files.readString(root…"]
  n5["Schritt Z.74 assertEquals('runtime', Files.readString(root.res…"]
  n6["Schritt Z.75 assertTrue(Files.isDirectory(root.resolve('server…"]
  n7["Schritt Z.76 assertTrue(Files.readString(root.resolve('bukkit.…"]
  n8["HostMinimize.restore"]:::internal-link
  n9["Schritt Z.81 String restored = Files.readString(root.resolve('…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  n7 --> n8
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.70 assertEquals('child-world', Files.readString(chil…
  Zeile 70: liest Text aus einer Datei. `assertEquals('child-world', Files.readString(chil…`
Schritt Z.71 assertTrue(Files.readString(child.resolve('server…
  Zeile 71: liest Text aus einer Datei. `assertTrue(Files.readString(child.resolve('server…`
Schritt Z.72 assertEquals('backup', Files.readString(backups.r…
  Zeile 72: liest Text aus einer Datei. `assertEquals('backup', Files.readString(backups.r…`
Schritt Z.73 assertEquals('eula=true/n', Files.readString(root…
  Zeile 73: liest Text aus einer Datei. `assertEquals('eula=true/n', Files.readString(root…`
Schritt Z.74 assertEquals('runtime', Files.readString(root.res…
  Zeile 74: liest Text aus einer Datei. `assertEquals('runtime', Files.readString(root.res…`
Schritt Z.75 assertTrue(Files.isDirectory(root.resolve('server…
  Zeile 75: Dateioperation. `assertTrue(Files.isDirectory(root.resolve('server…`
Schritt Z.76 assertTrue(Files.readString(root.resolve('bukkit.…
  Zeile 76: liest Text aus einer Datei. `assertTrue(Files.readString(root.resolve('bukkit.…`
HostMinimize.restore
  Stellt wieder her `restore`. Ruft `assertEditable`.
Schritt Z.81 String restored = Files.readString(root.resolve('…
  Zeile 81: liest Text aus einer Datei. `String restored = Files.readString(root.resolve('…`
```

- Fortsetzung von `HostMinimizeTest.applyKeepsWorldSelectionChildBackupsAndSecurityKeys`, Quellreihenfolge.
