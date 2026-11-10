[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[MemoryProtectionPolicy]] › [[MemoryProtectionPolicy.sample]] › [[MemoryProtectionPolicy.sample.Teil2]]

# MemoryProtectionPolicy.sample.Teil2

```mermaid
flowchart TD
  n1["if Z.29 (recoveryBlockedSince ) 0)"]
  n2["if Z.31 (usagePercent (= recoveryPercent)"]
  n3["return Z.33 return elapsedRecovery )= recoveryCooldownMillis …"]
  n4["if Z.37 (usagePercent )= criticalPercent)"]
  n5["if Z.39 (criticalSamples ( requiredCritical)"]
  n6["return Z.39 return Decision.NONE;"]
  n2 --> n3
  n2 --> n3
  n1 -->|"ja"| n2
  n3 --> n4
  n1 --> n4
  n5 -->|"ja"| n6
  n4 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `MemoryProtectionPolicy.sample`, Quellreihenfolge.
