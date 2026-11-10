[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Import]] › [[FabricLauncherPlugin.migrateLegacyHttpsMaterial]] › [[FabricLauncherPlugin.migrateLegacyHttpsMaterial.Z744]]

# FabricLauncherPlugin.migrateLegacyHttpsMaterial.Z744

```mermaid
flowchart TD
  n1["if Z.744 ('self-signed'.equalsIgnoreCase(mode) // 'keystor…"]
  n2["FabricLauncherPlugin.migrateHttpsFile"]:::internal-link
  n3["FabricLauncherPlugin.migrateHttpsFile"]:::internal-link
  n4["FabricLauncherPlugin.migrateLegacyHttpsMaterial.Z744.Z747"]:::internal-link
  n2 --> n3
  n1 -->|"ja"| n2
  n1 -->|"nein"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.744 ('self-signed'.equalsIgnoreCase(mode) // 'keystor…
  Zeile 744: prüft `('self-signed'.equalsIgnoreCase(mode) // 'keystor…`.
FabricLauncherPlugin.migrateHttpsFile
  Übernimmt den alten Wert von `migrateHttpsFile`. Ruft `copyLegacyFile`.
FabricLauncherPlugin.migrateLegacyHttpsMaterial.Z744.Z747
  Fortsetzung des Ablaufs ab Zeile 747.
```

- Fortsetzung von `FabricLauncherPlugin.migrateLegacyHttpsMaterial`, Quellreihenfolge.
