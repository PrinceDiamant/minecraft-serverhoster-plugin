[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil5]] › [[HosterTest.legacyCleanupRetainsBackupsAndMemoryReports]] › [[HosterTest.legacyCleanupRetainsBackupsAndMemoryReports.Teil1]]

# HosterTest.legacyCleanupRetainsBackupsAndMemoryReports.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.662 Files.createDirectories(backups);"]
  n2["Schritt Z.663 Files.createDirectories(reports);"]
  n3["Schritt Z.664 Files.writeString(oldData.resolve('config.yml'), …"]
  n4["Schritt Z.665 Files.writeString(backups.resolve('backup.zip'), …"]
  n5["Schritt Z.666 Files.writeString(reports.resolve('incident.log')…"]
  n6["FabricLauncherPlugin.cleanupLegacyDirectory"]:::internal-link
  n7["Schritt Z.670 assertFalse(Files.exists(oldData.resolve('config.…"]
  n8["Schritt Z.671 assertEquals('backup', Files.readString(backups.r…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HosterTest.legacyCleanupRetainsBackupsAndMemoryReports`, Quellreihenfolge.
