[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Import]] › [[FabricLauncherPlugin.migrateHttpsFile]] › [[FabricLauncherPlugin.migrateHttpsFile.Teil2]]

# FabricLauncherPlugin.migrateHttpsFile.Teil2

```mermaid
flowchart TD
  n1["if Z.768 (!Files.exists(source, LinkOption.NOFOLLOW_LINKS))"]
  n2["if Z.769 (required)"]
  n3["throw Z.769 throw new IOException('Required legacy dashboard …"]
  n4["return Z.770 return;"]
  n5["FabricLauncherPlugin.copyLegacyFile"]:::internal-link
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 -->|"ja"| n2
  n4 --> n5
  n1 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.768 (!Files.exists(source, LinkOption.NOFOLLOW_LINKS))
  Zeile 768: prüft `(!Files.exists(source, LinkOption.NOFOLLOW_LINKS))`.
if Z.769 (required)
  Zeile 769: prüft `(required)`.
throw Z.769 throw new IOException('Required legacy dashboard …
  Zeile 769: Abbruch `throw new IOException('Required legacy dashboard …`.
return Z.770 return;
  Zeile 770: Rückgabe `return;`.
FabricLauncherPlugin.copyLegacyFile
  Kopiert `copyLegacyFile`. Ruft `rejectSymbolicLinkSegments`.
```

- Fortsetzung von `FabricLauncherPlugin.migrateHttpsFile`, Quellreihenfolge.
