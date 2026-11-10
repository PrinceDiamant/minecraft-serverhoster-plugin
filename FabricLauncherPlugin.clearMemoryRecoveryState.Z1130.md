[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Stopp]] › [[FabricLauncherPlugin.clearMemoryRecoveryState]] › [[FabricLauncherPlugin.clearMemoryRecoveryState.Z1130]]

# FabricLauncherPlugin.clearMemoryRecoveryState.Z1130

```mermaid
flowchart TD
  n1["try Z.1130"]
  n2["FabricLauncherPlugin.memoryRecoveryFile"]:::internal-link
  n3["MemoryProtectionPolicy.finishRecovery"]:::internal-link
  n4["catch Z.1135 (IOException e)"]
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.1130
  Zeile 1130: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.memoryRecoveryFile
  Betrifft den Speicher `memoryRecoveryFile`.
MemoryProtectionPolicy.finishRecovery
  Schließt ab `finishRecovery`.
catch Z.1135 (IOException e)
  Zeile 1135: fängt (IOException e).
```

- Fortsetzung von `FabricLauncherPlugin.clearMemoryRecoveryState`, Quellreihenfolge.
