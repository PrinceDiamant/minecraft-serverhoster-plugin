[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Import]] › [[FabricLauncherPlugin.migrateLegacyHttpsMaterial]] › [[FabricLauncherPlugin.migrateLegacyHttpsMaterial.Z744.Z747]]

# FabricLauncherPlugin.migrateLegacyHttpsMaterial.Z744.Z747

```mermaid
flowchart TD
  n1["if Z.747 ('pem'.equalsIgnoreCase(mode))"]
  n2["FabricLauncherPlugin.migrateHttpsFile"]:::internal-link
  n3["FabricLauncherPlugin.migrateHttpsFile"]:::internal-link
  n4["FabricLauncherPlugin.migrateHttpsFile"]:::internal-link
  n5["throw Z.752 throw new IOException('Unsupported legacy dashboa…"]
  n2 --> n3
  n3 --> n4
  n1 -->|"ja"| n2
  n1 -->|"nein"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.747 ('pem'.equalsIgnoreCase(mode))
  Zeile 747: prüft `('pem'.equalsIgnoreCase(mode))`.
FabricLauncherPlugin.migrateHttpsFile
  Das [[Glossar#Plugin|Plugin]] übernimmt den alten Wert von die [[Glossar#Verschlüsselung|Verschlüsselung]] die Datei. Übernimmt den alten Wert von `migrateHttpsFile`. Ruft `copyLegacyFile`.
throw Z.752 throw new IOException('Unsupported legacy dashboa…
  Zeile 752: Abbruch `throw new IOException('Unsupported legacy dashboa…`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.747 ('pem'.equalsIgnoreCase(mode))**: Zeile 747: prüft `('pem'.equalsIgnoreCase(mode))`.
> - **FabricLauncherPlugin.migrateHttpsFile**: Das [[Glossar#Plugin|Plugin]] übernimmt den alten Wert von die [[Glossar#Verschlüsselung|Verschlüsselung]] die Datei. Übernimmt den alten Wert von `migrateHttpsFile`. Ruft `copyLegacyFile`.
> - **throw Z.752 throw new IOException('Unsupported legacy dashboa…**: Zeile 752: Abbruch `throw new IOException('Unsupported legacy dashboa…`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 747 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.migrateLegacyHttpsMaterial.Z744`.
