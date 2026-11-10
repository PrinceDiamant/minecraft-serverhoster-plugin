[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onEnable]] › [[FabricLauncherPlugin.onEnable.Teil2]]

# FabricLauncherPlugin.onEnable.Teil2

```mermaid
flowchart TD
  n1["Schritt Z.118 consoleCap = Math.max(200, Math.min(getConfig().g…"]
  n2["Upstream.Upstream"]:::internal-link
  n3["FabricLauncherPlugin.reloadProfiles"]:::internal-link
  n4["FabricLauncherPlugin.startSampler"]:::internal-link
  n5["FabricLauncherPlugin.makeWritable"]:::internal-link
  n6["FabricLauncherPlugin.makeWritable"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
  style n4 fill:#f88,stroke:#900
  style n5 fill:#f88,stroke:#900
  style n6 fill:#f88,stroke:#900
```

```knoten
Schritt Z.118 consoleCap = Math.max(200, Math.min(getConfig().g…
  Zeile 118: liest die Config. `consoleCap = Math.max(200, Math.min(getConfig().g…`
Upstream.Upstream
  Holt Daten vom Netz `Upstream`.
FabricLauncherPlugin.reloadProfiles
  `Profiles.load`, danach nur `getFirst()`. Befund: angemeldet aber nicht umgesetzt (sicher).
FabricLauncherPlugin.startSampler
  Server-Thread, `runTaskTimer` 1 Tick / 1 Tick. Befund: Kommentar widerspricht Code (sicher).
FabricLauncherPlugin.makeWritable
  Setzt POSIX `rwxrwxrwx` für Ordner und `rw-rw-rw-` für Dateien. Befund: Logikrisiko (sicher).
```

- Fortsetzung von `FabricLauncherPlugin.onEnable`, Quellreihenfolge.
