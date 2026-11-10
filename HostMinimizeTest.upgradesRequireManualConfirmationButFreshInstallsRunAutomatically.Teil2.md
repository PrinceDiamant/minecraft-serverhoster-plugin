[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil2]] › [[HostMinimizeTest.upgradesRequireManualConfirmationButFreshInstallsRunAutomatically]] › [[HostMinimizeTest.upgradesRequireManualConfirmationButFreshInstallsRunAutomatically.Teil2]]

# HostMinimizeTest.upgradesRequireManualConfirmationButFreshInstallsRunAutomatically.Teil2

```mermaid
flowchart TD
  n1["HostFirstSetup.apply(Path,Path,Path,Path)"]:::internal-link
  n2["HostFirstSetup.requestManual"]:::internal-link
  n3["HostFirstSetup.readState"]:::internal-link
  n4["HostFirstSetup.shouldRun"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n1 fill:#f88,stroke:#900
  style n4 fill:#f88,stroke:#900
```

- Fortsetzung von `HostMinimizeTest.upgradesRequireManualConfirmationButFreshInstallsRunAutomatically`, Quellreihenfolge.
