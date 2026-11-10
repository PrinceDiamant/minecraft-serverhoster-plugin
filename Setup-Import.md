[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Import]]

# Setup-Import

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.importLegacyConfiguration"]:::internal-link
  n2["FabricLauncherPlugin.migrateLegacySecrets"]:::internal-link
  n3["FabricLauncherPlugin.migrateLegacyHttpsMaterial"]:::internal-link
  n4["FabricLauncherPlugin.migrateHttpsFile"]:::internal-link
  n5["FabricLauncherPlugin.migrateMemoryRecoveryState"]:::internal-link
  n6["FabricLauncherPlugin.recoverPendingSetupDirectories"]:::internal-link
  n1 -->|"Z.710"| n2
  n1 -->|"Z.711"| n3
  n1 -->|"Z.712"| n5
  n3 -->|"Z.745"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.importLegacyConfiguration
  Das [[Glossar#Plugin|Plugin]] übernimmt den alten Weg. Im [[Glossar#Quelltext|Quelltext]] heißt das `importLegacyConfiguration`.
FabricLauncherPlugin.migrateLegacySecrets
  Das [[Glossar#Plugin|Plugin]] übernimmt den alten Wert von den alten Weg die Zugangsdaten. Im [[Glossar#Quelltext|Quelltext]] heißt das `migrateLegacySecrets`.
FabricLauncherPlugin.migrateLegacyHttpsMaterial
  Das [[Glossar#Plugin|Plugin]] übernimmt den alten Wert von den alten Weg die [[Glossar#Verschlüsselung|Verschlüsselung]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `migrateLegacyHttpsMaterial`.
FabricLauncherPlugin.migrateHttpsFile
  Das [[Glossar#Plugin|Plugin]] übernimmt den alten Wert von die [[Glossar#Verschlüsselung|Verschlüsselung]] die Datei. Im [[Glossar#Quelltext|Quelltext]] heißt das `migrateHttpsFile`.
FabricLauncherPlugin.migrateMemoryRecoveryState
  Das [[Glossar#Plugin|Plugin]] übernimmt den alten Wert von den [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] die Wiederherstellung den Zustand. Im [[Glossar#Quelltext|Quelltext]] heißt das `migrateMemoryRecoveryState`.
FabricLauncherPlugin.recoverPendingSetupDirectories
  Das [[Glossar#Plugin|Plugin]] rückt wieder gerade die [[Glossar#Einrichtung|Einrichtung]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `recoverPendingSetupDirectories`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.importLegacyConfiguration**: Das [[Glossar#Plugin|Plugin]] übernimmt den alten Weg. Im [[Glossar#Quelltext|Quelltext]] heißt das `importLegacyConfiguration`.
> - **FabricLauncherPlugin.migrateLegacySecrets**: Das [[Glossar#Plugin|Plugin]] übernimmt den alten Wert von den alten Weg die Zugangsdaten. Im [[Glossar#Quelltext|Quelltext]] heißt das `migrateLegacySecrets`.
> - **FabricLauncherPlugin.migrateLegacyHttpsMaterial**: Das [[Glossar#Plugin|Plugin]] übernimmt den alten Wert von den alten Weg die [[Glossar#Verschlüsselung|Verschlüsselung]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `migrateLegacyHttpsMaterial`.
> - **FabricLauncherPlugin.migrateHttpsFile**: Das [[Glossar#Plugin|Plugin]] übernimmt den alten Wert von die [[Glossar#Verschlüsselung|Verschlüsselung]] die Datei. Im [[Glossar#Quelltext|Quelltext]] heißt das `migrateHttpsFile`.
> - **FabricLauncherPlugin.migrateMemoryRecoveryState**: Das [[Glossar#Plugin|Plugin]] übernimmt den alten Wert von den [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] die Wiederherstellung den Zustand. Im [[Glossar#Quelltext|Quelltext]] heißt das `migrateMemoryRecoveryState`.
> - **FabricLauncherPlugin.recoverPendingSetupDirectories**: Das [[Glossar#Plugin|Plugin]] rückt wieder gerade die [[Glossar#Einrichtung|Einrichtung]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `recoverPendingSetupDirectories`.

- Übernimmt Dateien aus einer älteren Anlage desselben [[Glossar#Plugin|Plugins]].
