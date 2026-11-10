[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil2]]

# HosterTest.Teil2

```mermaid
flowchart TD
  n1["HosterTest.propertiesPreviewShowsStartupDiffWithoutWriting"]:::internal-link
  n2["HosterTest.dashboardKeepsHosterDataAndBundledVoxelDashAttribution"]:::internal-link
  n3["HosterTest.cronRespectsZoneAndSunday"]:::internal-link
  n4["HosterTest.tasksParse"]:::internal-link
  n5["HosterTest.schedulesValidateVoxelDashIntervalsAndKeepOrderedActions"]:::internal-link
  n6["HosterTest.scheduleExecutionPreservesOrderAndStopsAfterFailure"]:::internal-link
  n7["HosterTest.restartPolicyCapsRetriesAndMigratesOnlyTheOldUnlimitedDefault"]:::internal-link
  n8["HosterTest.restartPolicyMigrationChangesOnlyThe2_0_0UnlimitedDefault"]:::internal-link
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
HosterTest.propertiesPreviewShowsStartupDiffWithoutWriting
  `propertiesPreviewShowsStartupDiffWithoutWriting` in `HosterTest.java`. Ruft `preview`. Nur Test.
HosterTest.dashboardKeepsHosterDataAndBundledVoxelDashAttribution
  `dashboardKeepsHosterDataAndBundledVoxelDashAttribution` in `HosterTest.java`. Nur Test.
HosterTest.cronRespectsZoneAndSunday
  `cronRespectsZoneAndSunday` in `HosterTest.java`. Ruft `matches`, `next`. Nur Test.
HosterTest.tasksParse
  `tasksParse` in `HosterTest.java`. Ruft `load`. Nur Test.
HosterTest.schedulesValidateVoxelDashIntervalsAndKeepOrderedActions
  `schedulesValidateVoxelDashIntervalsAndKeepOrderedActions` in `HosterTest.java`. Ruft `ScheduleDef`, `cron`, `load`. Nur Test.
HosterTest.scheduleExecutionPreservesOrderAndStopsAfterFailure
  Plant `scheduleExecutionPreservesOrderAndStopsAfterFailure`. Ruft `ScheduleDef`, `run`. Nur Test.
HosterTest.restartPolicyCapsRetriesAndMigratesOnlyTheOldUnlimitedDefault
  `restartPolicyCapsRetriesAndMigratesOnlyTheOldUnlimitedDefault` in `HosterTest.java`. Ruft `maxAttempts`, `mayRetry`, `migrateLegacyUnlimited`. Nur Test.
HosterTest.restartPolicyMigrationChangesOnlyThe2_0_0UnlimitedDefault
  `restartPolicyMigrationChangesOnlyThe2_0_0UnlimitedDefault` in `HosterTest.java`. Ruft `migrateLegacyRestartPolicy`. Nur Test.
```


