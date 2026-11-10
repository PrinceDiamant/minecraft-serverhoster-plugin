[[00 Start]] › [[Dashboard-HTTP]] › [[API-Setup]] › [[Dashboard.saveConfig]] › [[Dashboard.saveConfig.Teil1.Z765]]

# Dashboard.saveConfig.Teil1.Z765

```mermaid
flowchart TD
  n1["sync Z.765"]
  n2["Schritt Z.767 Files.writeString(f, txt, StandardCharsets.UTF_8);"]
  n3["FabricLauncherPlugin.makeWritable"]:::internal-link
  n4["FabricLauncherPlugin.reloadProfiles"]:::internal-link
  n2 --> n3
  n3 --> n4
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
  style n4 fill:#f88,stroke:#900
```

```knoten
sync Z.765
  Zeile 765: synchronisierter Block.
Schritt Z.767 Files.writeString(f, txt, StandardCharsets.UTF_8);
  Zeile 767: schreibt Text in eine Datei. `Files.writeString(f, txt, StandardCharsets.UTF_8);`
FabricLauncherPlugin.makeWritable
  Setzt POSIX `rwxrwxrwx` für Ordner und `rw-rw-rw-` für Dateien. Befund: Logikrisiko (sicher).
FabricLauncherPlugin.reloadProfiles
  `Profiles.load`, danach nur `getFirst()`. Befund: angemeldet aber nicht umgesetzt (sicher).
```

- Fortsetzung von `Dashboard.saveConfig.Teil1`, Quellreihenfolge.
