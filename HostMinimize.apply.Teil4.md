[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.apply]] › [[HostMinimize.apply.Teil4]]

# HostMinimize.apply.Teil4

```mermaid
flowchart TD
  n1["for Z.172 (Path file : files)"]
  n2["if Z.174 (Files.isSymbolicLink(destination))"]
  n3["throw Z.174 throw new SecurityException('backup target must n…"]
  n4["Schritt Z.175 Files.copy(file, destination, StandardCopyOption.…"]
  n5["HostMinimize.apply.Teil4.Z177"]:::internal-link
  n6["return Z.188 return new ApplyResult(backupDirectory, files.str…"]
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 -->|"wiederholen"| n2
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.172 (Path file : files)
  Zeile 172: Schleife `(Path file : files)`.
if Z.174 (Files.isSymbolicLink(destination))
  Zeile 174: prüft `(Files.isSymbolicLink(destination))`.
throw Z.174 throw new SecurityException('backup target must n…
  Zeile 174: Abbruch `throw new SecurityException('backup target must n…`.
Schritt Z.175 Files.copy(file, destination, StandardCopyOption.…
  Zeile 175: Dateioperation. `Files.copy(file, destination, StandardCopyOption.…`
HostMinimize.apply.Teil4.Z177
  Fortsetzung des Ablaufs ab Zeile 177.
return Z.188 return new ApplyResult(backupDirectory, files.str…
  Zeile 188: Rückgabe `return new ApplyResult(backupDirectory, files.str…`.
```

- Fortsetzung von `HostMinimize.apply`, Quellreihenfolge.
