[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.configureSetup]] › [[FabricLauncherPlugin.configureSetup.Teil1]]

# FabricLauncherPlugin.configureSetup.Teil1

```mermaid
flowchart TD
  n1["if Z.504 (!setupRequired)"]
  n2["throw Z.504 throw new IllegalStateException('Die Einrichtung …"]
  n3["if Z.505 (port ( 1 // port ) 65535)"]
  n4["throw Z.505 throw new IllegalArgumentException('Ungültiger Sp…"]
  n5["if Z.506 (!Set.of('vanilla', 'fabric', 'paper', 'spigot', …"]
  n6["throw Z.507 throw new IllegalArgumentException('Ungültiger Se…"]
  n7["if Z.508 (mcVersion == null // !mcVersion.matches('(A-Za-z…"]
  n8["throw Z.509 throw new IllegalArgumentException('Ungültige Min…"]
  n9["FabricLauncherPlugin.validateNtfySetup"]:::internal-link
  n10["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n7 -->|"ja"| n8
  n6 --> n7
  n5 --> n7
  n8 --> n9
  n7 --> n9
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.504 (!setupRequired)
  Zeile 504: prüft `(!setupRequired)`.
throw Z.504 throw new IllegalStateException('Die Einrichtung …
  Zeile 504: Abbruch `throw new IllegalStateException('Die Einrichtung …`.
if Z.505 (port ( 1 // port ) 65535)
  Zeile 505: prüft `(port ( 1 // port ) 65535)`.
throw Z.505 throw new IllegalArgumentException('Ungültiger Sp…
  Zeile 505: Abbruch `throw new IllegalArgumentException('Ungültiger Sp…`.
if Z.506 (!Set.of('vanilla', 'fabric', 'paper', 'spigot', …
  Zeile 506: prüft `(!Set.of('vanilla', 'fabric', 'paper', 'spigot', …`.
throw Z.507 throw new IllegalArgumentException('Ungültiger Se…
  Zeile 507: Abbruch `throw new IllegalArgumentException('Ungültiger Se…`.
if Z.508 (mcVersion == null // !mcVersion.matches('(A-Za-z…
  Zeile 508: prüft `(mcVersion == null // !mcVersion.matches('(A-Za-z…`.
throw Z.509 throw new IllegalArgumentException('Ungültige Min…
  Zeile 509: Abbruch `throw new IllegalArgumentException('Ungültige Min…`.
FabricLauncherPlugin.validateNtfySetup
  Prüft `validateNtfySetup`.
FabricLauncherPlugin.getWorldRoot
  Liefert `getWorldRoot`.
```

- Fortsetzung von `FabricLauncherPlugin.configureSetup`, Quellreihenfolge.
