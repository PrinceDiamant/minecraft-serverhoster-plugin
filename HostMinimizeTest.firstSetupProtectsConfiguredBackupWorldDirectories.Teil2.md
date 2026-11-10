[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil2]] › [[HostMinimizeTest.firstSetupProtectsConfiguredBackupWorldDirectories]] › [[HostMinimizeTest.firstSetupProtectsConfiguredBackupWorldDirectories.Teil2]]

# HostMinimizeTest.firstSetupProtectsConfiguredBackupWorldDirectories.Teil2

```mermaid
flowchart TD
  n1["HostFirstSetup.apply(Path,Path,Path,Path,List)"]:::internal-link
  n2["Schritt Z.286 assertEquals('backup', Files.readString(backup.re…"]
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostFirstSetup.apply(Path,Path,Path,Path,List)
  Wendet an `apply`. Ruft `readState`, `requireRoot`, `otherPluginJars`.
Schritt Z.286 assertEquals('backup', Files.readString(backup.re…
  Zeile 286: liest Text aus einer Datei. `assertEquals('backup', Files.readString(backup.re…`
```

- Fortsetzung von `HostMinimizeTest.firstSetupProtectsConfiguredBackupWorldDirectories`, Quellreihenfolge.
