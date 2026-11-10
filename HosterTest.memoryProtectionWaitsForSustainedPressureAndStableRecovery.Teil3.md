[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil4]] › [[HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery]] › [[HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery.Teil3]]

# HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery.Teil3

```mermaid
flowchart TD
  n1["MemoryProtectionPolicy.finishRecovery"]:::internal-link
  n2["MemoryProtectionPolicy.emergencyStopStarted"]:::internal-link
  n3["MemoryProtectionPolicy.sample"]:::internal-link
  n4["MemoryProtectionPolicy.startEmergencyStop"]:::internal-link
  n5["MemoryProtectionPolicy.emergencyStopStarted"]:::internal-link
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
MemoryProtectionPolicy.finishRecovery
  Dieser Teil beendet die Wiederherstellung. Schließt ab `finishRecovery`.
MemoryProtectionPolicy.emergencyStopStarted
  Dieser Teil stoppt hier einen Schritt. Eine Ebene tiefer steht er genauer. `emergencyStopStarted` in `MemoryProtectionPolicy.java`.
MemoryProtectionPolicy.sample
  Dieser Teil misst das. Misst `sample`.
MemoryProtectionPolicy.startEmergencyStop
  Dieser Teil startet den [[Glossar#Notstopp|Notstopp]] den [[Glossar#Stopp|Stopp]]. Startet `startEmergencyStop`.
```

> [!knoten]- Was die Blöcke tun
> - **MemoryProtectionPolicy.finishRecovery**: Dieser Teil beendet die Wiederherstellung. Schließt ab `finishRecovery`.
> - **MemoryProtectionPolicy.emergencyStopStarted**: Dieser Teil stoppt hier einen Schritt. Eine Ebene tiefer steht er genauer. `emergencyStopStarted` in `MemoryProtectionPolicy.java`.
> - **MemoryProtectionPolicy.sample**: Dieser Teil misst das. Misst `sample`.
> - **MemoryProtectionPolicy.startEmergencyStop**: Dieser Teil startet den [[Glossar#Notstopp|Notstopp]] den [[Glossar#Stopp|Stopp]]. Startet `startEmergencyStop`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HosterTest.memoryProtectionWaitsForSustainedPressureAndStableRecovery`.
