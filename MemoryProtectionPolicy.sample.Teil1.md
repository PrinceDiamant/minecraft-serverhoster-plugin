[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[MemoryProtectionPolicy]] › [[MemoryProtectionPolicy.sample]] › [[MemoryProtectionPolicy.sample.Teil1]]

# MemoryProtectionPolicy.sample.Teil1

```mermaid
flowchart TD
  n1["if Z.23 (!Double.isFinite(usagePercent) // usagePercent (…"]
  n2["return Z.26 return recoveryBlockedSince ) 0 && elapsedRecover…"]
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.23 (!Double.isFinite(usagePercent) // usagePercent (…
  Zeile 23: prüft `(!Double.isFinite(usagePercent) // usagePercent (…`.
return Z.26 return recoveryBlockedSince ) 0 && elapsedRecover…
  Zeile 26: Rückgabe `return recoveryBlockedSince ) 0 && elapsedRecover…`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.23 (!Double.isFinite(usagePercent) // usagePercent (…**: Zeile 23: prüft `(!Double.isFinite(usagePercent) // usagePercent (…`.
> - **return Z.26 return recoveryBlockedSince ) 0 && elapsedRecover…**: Zeile 26: Rückgabe `return recoveryBlockedSince ) 0 && elapsedRecover…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `MemoryProtectionPolicy.sample`.
