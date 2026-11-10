[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil4]] › [[HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery]] › [[HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery.Teil2]]

# HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery.Teil2

```mermaid
flowchart TD
  n1["MemoryProtectionPolicy.sample"]:::internal-link
  n2["MemoryProtectionPolicy.sample"]:::internal-link
  n3["MemoryProtectionPolicy.startEmergencyStop"]:::internal-link
  n4["MemoryProtectionPolicy.emergencyStopStarted"]:::internal-link
  n5["MemoryProtectionPolicy.sample"]:::internal-link
  n6["MemoryProtectionPolicy.sample"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
MemoryProtectionPolicy.sample
  Misst `sample`.
MemoryProtectionPolicy.startEmergencyStop
  Startet `startEmergencyStop`.
MemoryProtectionPolicy.emergencyStopStarted
  `emergencyStopStarted` in `MemoryProtectionPolicy.java`.
```

- Fortsetzung von `HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery`, Quellreihenfolge.
