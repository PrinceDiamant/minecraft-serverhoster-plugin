[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil4]]

# HosterTest.Teil4

```mermaid
flowchart TD
  n1["HosterTest.crashIndexReadsAndRejectsEscape"]:::internal-link
  n2["HosterTest.setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration"]:::internal-link
  n3["HosterTest.setupDiscoveryReportsAmbiguousDirectChildrenWithoutLegacyData"]:::internal-link
  n4["HosterTest.setupDiscoveryDoesNotOfferOuterWorldsAsChildServers"]:::internal-link
  n5["HosterTest.setupRecoveryRollsBackPendingDirectoriesBeforeSetupCompletes"]:::internal-link
  n6["HosterTest.setupRecoveryFinishesOnlyConfirmedDeleteAndArchivesReset"]:::internal-link
  n7["HosterTest.setupRecoveryPreservesPendingDataWhenDestinationCollides"]:::internal-link
  n8["HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery"]:::internal-link
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
HosterTest.crashIndexReadsAndRejectsEscape
  Betrifft Crash-Reports `crashIndexReadsAndRejectsEscape`. Ruft `tryCreateSymbolicLink`, `list`, `read`. Nur Test.
HosterTest.setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration
  `setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration` in `HosterTest.java`. Ruft `writeLegacyPluginJar`, `scan`, `resolveNewDirectory`. Nur Test.
HosterTest.setupDiscoveryReportsAmbiguousDirectChildrenWithoutLegacyData
  `setupDiscoveryReportsAmbiguousDirectChildrenWithoutLegacyData` in `HosterTest.java`. Ruft `scan`. Nur Test.
HosterTest.setupDiscoveryDoesNotOfferOuterWorldsAsChildServers
  `setupDiscoveryDoesNotOfferOuterWorldsAsChildServers` in `HosterTest.java`. Ruft `scan`. Nur Test.
HosterTest.setupRecoveryRollsBackPendingDirectoriesBeforeSetupCompletes
  `setupRecoveryRollsBackPendingDirectoriesBeforeSetupCompletes` in `HosterTest.java`. Ruft `recover`. Nur Test.
HosterTest.setupRecoveryFinishesOnlyConfirmedDeleteAndArchivesReset
  `setupRecoveryFinishesOnlyConfirmedDeleteAndArchivesReset` in `HosterTest.java`. Ruft `recover`. Nur Test.
HosterTest.setupRecoveryPreservesPendingDataWhenDestinationCollides
  `setupRecoveryPreservesPendingDataWhenDestinationCollides` in `HosterTest.java`. Ruft `recover`. Nur Test.
HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery
  Betrifft den Speicher `memoryProtectionWaitsForSustainedPressureAndStableRecovery`. Ruft `sample`, `criticalSamples`, `startEmergencyStop`. Nur Test.
```


