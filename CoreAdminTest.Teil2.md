[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil2]]

# CoreAdminTest.Teil2

```mermaid
flowchart TD
  n1["CoreAdminTest.childReadinessRequiresTheVanillaDoneLine"]:::internal-link
  n2["CoreAdminTest.heapSizeParserHandlesJvmSuffixesAndInvalidValues"]:::internal-link
  n3["CoreAdminTest.hostMemoryProbeReadsCgroupV2AndHostSwapWithoutCommands"]:::internal-link
  n4["CoreAdminTest.hostMemoryProbeSeparatesCgroupV1LimitHitsFromOomEvents"]:::internal-link
  n5["CoreAdminTest.memoryIncidentReportWritesTimelineFactsAndReadOnlyDiagnostics"]:::internal-link
  n6["CoreAdminTest.hostMemoryProbeReportsUnknownCgroupLimits"]:::internal-link
  n7["CoreAdminTest.propertiesKeepCommentsAndForeignKeys"]:::internal-link
  n8["CoreAdminTest.pathGuardRejectsEscapeAndSymlink"]:::internal-link
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
CoreAdminTest.childReadinessRequiresTheVanillaDoneLine
  Betrifft den Child `childReadinessRequiresTheVanillaDoneLine`. Ruft `isReadyLine`. Nur Test.
CoreAdminTest.heapSizeParserHandlesJvmSuffixesAndInvalidValues
  Betrifft den Heap `heapSizeParserHandlesJvmSuffixesAndInvalidValues`. Ruft `parseMemoryBytes`. Nur Test.
CoreAdminTest.hostMemoryProbeReadsCgroupV2AndHostSwapWithoutCommands
  Betrifft den Host `hostMemoryProbeReadsCgroupV2AndHostSwapWithoutCommands`. Ruft `snapshot`, `cgroupUsePercent`. Nur Test.
CoreAdminTest.hostMemoryProbeSeparatesCgroupV1LimitHitsFromOomEvents
  Betrifft den Host `hostMemoryProbeSeparatesCgroupV1LimitHitsFromOomEvents`. Ruft `snapshot`. Nur Test.
CoreAdminTest.memoryIncidentReportWritesTimelineFactsAndReadOnlyDiagnostics
  Betrifft den Speicher `memoryIncidentReportWritesTimelineFactsAndReadOnlyDiagnostics`. Ruft `write`. Nur Test.
CoreAdminTest.hostMemoryProbeReportsUnknownCgroupLimits
  Betrifft den Host `hostMemoryProbeReportsUnknownCgroupLimits`. Ruft `snapshot`, `cgroupUsePercent`. Nur Test.
CoreAdminTest.propertiesKeepCommentsAndForeignKeys
  `propertiesKeepCommentsAndForeignKeys` in `CoreAdminTest.java`. Ruft `update`. Nur Test.
CoreAdminTest.pathGuardRejectsEscapeAndSymlink
  Liefert den Pfad `pathGuardRejectsEscapeAndSymlink`. Ruft `open`, `resolve`, `root`. Nur Test.
```


