[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil2]] › [[HostMinimizeTest.upgradesRequireManualConfirmationButFreshInstallsRunAutomatically]] › [[HostMinimizeTest.upgradesRequireManualConfirmationButFreshInstallsRunAutomatically.Teil1]]

# HostMinimizeTest.upgradesRequireManualConfirmationButFreshInstallsRunAutomatically.Teil1

```mermaid
flowchart TD
  n1["HostFirstSetup.shouldRun"]:::internal-link
  n2["HostFirstSetup.readState"]:::internal-link
  n3["HostFirstSetup.shouldRun"]:::internal-link
  n4["HostFirstSetup.readState"]:::internal-link
  n5["HostFirstSetup.requestManual"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n1 fill:#f88,stroke:#900
  style n3 fill:#f88,stroke:#900
```

```knoten
HostFirstSetup.shouldRun
  Entscheidet, ob `shouldRun`. Ruft `readState`, `writeMarker`. Befund: Altlast (wahrscheinlich).
HostFirstSetup.readState
  Liest `readState`. Ruft `readState`.
HostFirstSetup.requestManual
  Fordert an `requestManual`. Ruft `readState`, `writeMarker`.
```

- Fortsetzung von `HostMinimizeTest.upgradesRequireManualConfirmationButFreshInstallsRunAutomatically`, Quellreihenfolge.
