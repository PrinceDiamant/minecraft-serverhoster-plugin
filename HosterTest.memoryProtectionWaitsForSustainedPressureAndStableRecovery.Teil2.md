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
  Dieser Teil misst das. Misst `sample`.
MemoryProtectionPolicy.startEmergencyStop
  Dieser Teil startet den [[Glossar#Notstopp|Notstopp]] den [[Glossar#Stopp|Stopp]]. Startet `startEmergencyStop`.
MemoryProtectionPolicy.emergencyStopStarted
  Dieser Teil stoppt hier einen Schritt. Eine Ebene tiefer steht er genauer. `emergencyStopStarted` in `MemoryProtectionPolicy.java`.
```

> [!knoten]- Was die Blöcke tun
> - **MemoryProtectionPolicy.sample**: Dieser Teil misst das. Misst `sample`.
> - **MemoryProtectionPolicy.startEmergencyStop**: Dieser Teil startet den [[Glossar#Notstopp|Notstopp]] den [[Glossar#Stopp|Stopp]]. Startet `startEmergencyStop`.
> - **MemoryProtectionPolicy.emergencyStopStarted**: Dieser Teil stoppt hier einen Schritt. Eine Ebene tiefer steht er genauer. `emergencyStopStarted` in `MemoryProtectionPolicy.java`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery`.
