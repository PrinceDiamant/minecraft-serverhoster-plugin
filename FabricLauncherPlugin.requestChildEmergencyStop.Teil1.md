[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Stopp]] › [[FabricLauncherPlugin.requestChildEmergencyStop]] › [[FabricLauncherPlugin.requestChildEmergencyStop.Teil1]]

# FabricLauncherPlugin.requestChildEmergencyStop.Teil1

```mermaid
flowchart TD
  n1["if Z.1148 (memoryProtectionPolicy.emergencyStopStarted())"]
  n2["MemoryProtectionPolicy.emergencyStopStarted"]:::internal-link
  n3["return Z.1148 return;"]
  n4["FabricLauncherPlugin.requestChildEmergencyStop.Teil1.Z1150"]:::internal-link
  n5["MemoryProtectionPolicy.startEmergencyStop"]:::internal-link
  n6["HostMemoryProbe.Snapshot.cgroupUsePercent"]:::internal-link
  n1 -->|"Z.1148"| n2
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1148 (memoryProtectionPolicy.emergencyStopStarted())
  Zeile 1148: prüft `(memoryProtectionPolicy.emergencyStopStarted())`.
MemoryProtectionPolicy.emergencyStopStarted
  Dieser Teil stoppt hier einen Schritt. Eine Ebene tiefer steht er genauer. `emergencyStopStarted` in `MemoryProtectionPolicy.java`.
return Z.1148 return;
  Zeile 1148: Rückgabe `return;`.
FabricLauncherPlugin.requestChildEmergencyStop.Teil1.Z1150
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1150 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 1150.
MemoryProtectionPolicy.startEmergencyStop
  Dieser Teil startet den [[Glossar#Notstopp|Notstopp]] den [[Glossar#Stopp|Stopp]]. Startet `startEmergencyStop`.
HostMemoryProbe.Snapshot.cgroupUsePercent
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `cgroupUsePercent` in `HostMemoryProbe.java`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.1148 (memoryProtectionPolicy.emergencyStopStarted())**: Zeile 1148: prüft `(memoryProtectionPolicy.emergencyStopStarted())`.
> - **MemoryProtectionPolicy.emergencyStopStarted**: Dieser Teil stoppt hier einen Schritt. Eine Ebene tiefer steht er genauer. `emergencyStopStarted` in `MemoryProtectionPolicy.java`.
> - **return Z.1148 return;**: Zeile 1148: Rückgabe `return;`.
> - **FabricLauncherPlugin.requestChildEmergencyStop.Teil1.Z1150**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1150 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 1150.
> - **MemoryProtectionPolicy.startEmergencyStop**: Dieser Teil startet den [[Glossar#Notstopp|Notstopp]] den [[Glossar#Stopp|Stopp]]. Startet `startEmergencyStop`.
> - **HostMemoryProbe.Snapshot.cgroupUsePercent**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `cgroupUsePercent` in `HostMemoryProbe.java`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.requestChildEmergencyStop`.
