[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil4]] › [[HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery]] › [[HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery.Teil1]]

# HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery.Teil1

```mermaid
flowchart TD
  n1["MemoryProtectionPolicy.sample"]:::internal-link
  n2["MemoryProtectionPolicy.criticalSamples"]:::internal-link
  n3["MemoryProtectionPolicy.sample"]:::internal-link
  n4["MemoryProtectionPolicy.criticalSamples"]:::internal-link
  n5["MemoryProtectionPolicy.sample"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
MemoryProtectionPolicy.sample
  Misst `sample`.
MemoryProtectionPolicy.criticalSamples
  `criticalSamples` in `MemoryProtectionPolicy.java`.
```

- Fortsetzung von `HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery`, Quellreihenfolge.
