[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.restore]] › [[HostMinimize.restore.Z197]]

# HostMinimize.restore.Z197

```mermaid
flowchart TD
  n1["if Z.197 (Files.isRegularFile(realBackup.resolve(WHITELIST…"]
  n2["HostMinimize.assertEditable"]:::internal-link
  n3["if Z.200 (Files.isSymbolicLink(created))"]
  n4["throw Z.200 throw new SecurityException('refusing symbolic li…"]
  n5["Schritt Z.201 Files.deleteIfExists(created);"]
  n3 -->|"ja"| n4
  n2 --> n3
  n4 --> n5
  n3 --> n5
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.197 (Files.isRegularFile(realBackup.resolve(WHITELIST…
  Zeile 197: prüft `(Files.isRegularFile(realBackup.resolve(WHITELIST…`.
HostMinimize.assertEditable
  Prüft `assertEditable`.
if Z.200 (Files.isSymbolicLink(created))
  Zeile 200: prüft `(Files.isSymbolicLink(created))`.
throw Z.200 throw new SecurityException('refusing symbolic li…
  Zeile 200: Abbruch `throw new SecurityException('refusing symbolic li…`.
Schritt Z.201 Files.deleteIfExists(created);
  Zeile 201: Dateioperation. `Files.deleteIfExists(created);`
```

- Fortsetzung von `HostMinimize.restore`, Quellreihenfolge.
