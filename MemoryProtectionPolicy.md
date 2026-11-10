[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[MemoryProtectionPolicy]]

# MemoryProtectionPolicy

```mermaid
flowchart TD
  n1["MemoryProtectionPolicy.sample"]:::internal-link
  n2["MemoryProtectionPolicy.criticalSamples"]:::internal-link
  n3["MemoryProtectionPolicy.resetCriticalSamples"]:::internal-link
  n4["MemoryProtectionPolicy.emergencyStopStarted"]:::internal-link
  n5["MemoryProtectionPolicy.startEmergencyStop"]:::internal-link
  n6["MemoryProtectionPolicy.finishRecovery"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  n5 -->|"Kapitel im Text"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
MemoryProtectionPolicy.sample
  Dieser Teil misst das. Im [[Glossar#Quelltext|Quelltext]] heißt das `sample`.
MemoryProtectionPolicy.criticalSamples
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `criticalSamples`.
MemoryProtectionPolicy.resetCriticalSamples
  Dieser Teil setzt zurück hier einen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `resetCriticalSamples`.
MemoryProtectionPolicy.emergencyStopStarted
  Dieser Teil stoppt hier einen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `emergencyStopStarted`.
MemoryProtectionPolicy.startEmergencyStop
  Dieser Teil startet den [[Glossar#Notstopp|Notstopp]] den [[Glossar#Stopp|Stopp]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `startEmergencyStop`.
MemoryProtectionPolicy.finishRecovery
  Dieser Teil beendet die Wiederherstellung. Im [[Glossar#Quelltext|Quelltext]] heißt das `finishRecovery`.
```

> [!knoten]- Was die Blöcke tun
> - **MemoryProtectionPolicy.sample**: Dieser Teil misst das. Im [[Glossar#Quelltext|Quelltext]] heißt das `sample`.
> - **MemoryProtectionPolicy.criticalSamples**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `criticalSamples`.
> - **MemoryProtectionPolicy.resetCriticalSamples**: Dieser Teil setzt zurück hier einen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `resetCriticalSamples`.
> - **MemoryProtectionPolicy.emergencyStopStarted**: Dieser Teil stoppt hier einen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `emergencyStopStarted`.
> - **MemoryProtectionPolicy.startEmergencyStop**: Dieser Teil startet den [[Glossar#Notstopp|Notstopp]] den [[Glossar#Stopp|Stopp]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `startEmergencyStop`.
> - **MemoryProtectionPolicy.finishRecovery**: Dieser Teil beendet die Wiederherstellung. Im [[Glossar#Quelltext|Quelltext]] heißt das `finishRecovery`.

```mermaid
stateDiagram-v2
  [*] --> NONE
  NONE --> STOP_CHILD: genug kritische Samples Z.44
  STOP_CHILD --> RELEASE_AFTER_STABLE_MEMORY: Z.34
  STOP_CHILD --> RELEASE_WITHOUT_MEMORY_GUARANTEE: Z.27
  RELEASE_AFTER_STABLE_MEMORY --> NONE
  RELEASE_WITHOUT_MEMORY_GUARANTEE --> NONE
```

- Die Entscheidung bei Speichermangel: nichts tun, den [[Glossar#Spielserver|Spielserver]] stoppen, oder eine zuvor vergebene Reserve wieder freigeben.
