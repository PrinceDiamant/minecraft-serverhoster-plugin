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

```knoten
if Z.29 (recoveryBlockedSince ) 0)
  Zeile 29: prüft `(recoveryBlockedSince ) 0)`.
if Z.31 (usagePercent (= recoveryPercent)
  Zeile 31: prüft `(usagePercent (= recoveryPercent)`.
return Z.33 return elapsedRecovery )= recoveryCooldownMillis …
  Zeile 33: Rückgabe `return elapsedRecovery )= recoveryCooldownMillis …`.
if Z.37 (usagePercent )= criticalPercent)
  Zeile 37: prüft `(usagePercent )= criticalPercent)`.
if Z.39 (criticalSamples ( requiredCritical)
  Zeile 39: prüft `(criticalSamples ( requiredCritical)`.
return Z.39 return Decision.NONE;
  Zeile 39: Rückgabe `return Decision.NONE;`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.29 (recoveryBlockedSince ) 0)**: Zeile 29: prüft `(recoveryBlockedSince ) 0)`.
> - **if Z.31 (usagePercent (= recoveryPercent)**: Zeile 31: prüft `(usagePercent (= recoveryPercent)`.
> - **return Z.33 return elapsedRecovery )= recoveryCooldownMillis …**: Zeile 33: Rückgabe `return elapsedRecovery )= recoveryCooldownMillis …`.
> - **if Z.37 (usagePercent )= criticalPercent)**: Zeile 37: prüft `(usagePercent )= criticalPercent)`.
> - **if Z.39 (criticalSamples ( requiredCritical)**: Zeile 39: prüft `(criticalSamples ( requiredCritical)`.
> - **return Z.39 return Decision.NONE;**: Zeile 39: Rückgabe `return Decision.NONE;`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `MemoryProtectionPolicy.sample`.
