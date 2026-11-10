[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil1]] › [[CoreAdminTest.dashboardPasswordSetupPreservesExistingAndFailsClosed]] › [[CoreAdminTest.dashboardPasswordSetupPreservesExistingAndFailsClosed.Teil1]]

# CoreAdminTest.dashboardPasswordSetupPreservesExistingAndFailsClosed.Teil1

```mermaid
flowchart TD
  n1["DashboardPassword.read"]:::internal-link
  n2["DashboardPassword.read"]:::internal-link
  n3["DashboardPassword.create"]:::internal-link
  n4["DashboardPassword.create"]:::internal-link
  n5["DashboardPassword.create"]:::internal-link
  n6["Schritt Z.73 assertFalse(Files.exists(file));"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `CoreAdminTest.dashboardPasswordSetupPreservesExistingAndFailsClosed`, Quellreihenfolge.
