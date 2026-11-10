[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.firstSetupRetriesPendingStateAndRejectsProtectedWorlds]] › [[HostMinimizeTest.firstSetupRetriesPendingStateAndRejectsProtectedWorlds.Teil1]]

# HostMinimizeTest.firstSetupRetriesPendingStateAndRejectsProtectedWorlds.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.211 Files.createDirectories(data);"]
  n2["Schritt Z.212 Files.writeString(root.resolve('plugins/ServerHos…"]
  n3["Schritt Z.213 Files.createDirectories(child.resolve('world'));"]
  n4["Schritt Z.214 Files.writeString(root.resolve('server.properties…"]
  n5["Schritt Z.216 Files.writeString(marker, 'status=pending/n');"]
  n6["HostFirstSetup.shouldRun"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n6 fill:#f88,stroke:#900
```

```knoten
Schritt Z.211 Files.createDirectories(data);
  Zeile 211: Dateioperation. `Files.createDirectories(data);`
Schritt Z.212 Files.writeString(root.resolve('plugins/ServerHos…
  Zeile 212: schreibt Text in eine Datei. `Files.writeString(root.resolve('plugins/ServerHos…`
Schritt Z.213 Files.createDirectories(child.resolve('world'));
  Zeile 213: Dateioperation. `Files.createDirectories(child.resolve('world'));`
Schritt Z.214 Files.writeString(root.resolve('server.properties…
  Zeile 214: schreibt Text in eine Datei. `Files.writeString(root.resolve('server.properties…`
Schritt Z.216 Files.writeString(marker, 'status=pending/n');
  Zeile 216: schreibt Text in eine Datei. `Files.writeString(marker, 'status=pending/n');`
HostFirstSetup.shouldRun
  Entscheidet, ob `shouldRun`. Ruft `readState`, `writeMarker`. Befund: Altlast (wahrscheinlich).
```

- Fortsetzung von `HostMinimizeTest.firstSetupRetriesPendingStateAndRejectsProtectedWorlds`, Quellreihenfolge.
