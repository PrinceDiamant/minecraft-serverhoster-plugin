[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]]

# HosterTest.Teil3

```mermaid
flowchart TD
  n1["HosterTest.settingsValidateAndKeepRemoteCredentialsOutOfDashboardView"]:::internal-link
  n2["HosterTest.legacySchedulesMigrateOnlySupportedTasksAndPreserveTheRest"]:::internal-link
  n3["HosterTest.versionParsers"]:::internal-link
  n4["HosterTest.versionCatalogCanIncludeMoreThanFortyReleases"]:::internal-link
  n5["HosterTest.spigotCommandIsArgv"]:::internal-link
  n6["HosterTest.backupZipAndExternalJdbc"]:::internal-link
  n7["HosterTest.launchPlanDropsDeadFlagAndNamesJars"]:::internal-link
  n8["HosterTest.jarProbeStatsRegularFileAndSkipsSymlink"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  n5 -->|"Quelltext"| n6
  n6 -->|"Quelltext"| n7
  n7 -->|"Quelltext"| n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HosterTest.settingsValidateAndKeepRemoteCredentialsOutOfDashboardView
  `settingsValidateAndKeepRemoteCredentialsOutOfDashboardView` in `HosterTest.java`. Ruft `ServerHosterSettings`, `view`, `apply`. Nur Test.
HosterTest.legacySchedulesMigrateOnlySupportedTasksAndPreserveTheRest
  `legacySchedulesMigrateOnlySupportedTasksAndPreserveTheRest` in `HosterTest.java`. Ruft `migrate`, `load`. Nur Test.
HosterTest.versionParsers
  `versionParsers` in `HosterTest.java`. Ruft `vanilla`, `fabric`, `paper`. Nur Test.
HosterTest.versionCatalogCanIncludeMoreThanFortyReleases
  `versionCatalogCanIncludeMoreThanFortyReleases` in `HosterTest.java`. Ruft `vanilla`. Nur Test.
HosterTest.spigotCommandIsArgv
  `spigotCommandIsArgv` in `HosterTest.java`. Ruft `command`, `assertRev`. Nur Test.
HosterTest.backupZipAndExternalJdbc
  Sichert `backupZipAndExternalJdbc`. Ruft `tryCreateSymbolicLink`, `archive`, `count`. Nur Test.
HosterTest.launchPlanDropsDeadFlagAndNamesJars
  Startet den Prozess `launchPlanDropsDeadFlagAndNamesJars`. Ruft `profile`, `argv`, `jarName`. Nur Test.
HosterTest.jarProbeStatsRegularFileAndSkipsSymlink
  Betrifft das Jar `jarProbeStatsRegularFileAndSkipsSymlink`. Ruft `profile`, `inspect`, `text`. Nur Test.
```


