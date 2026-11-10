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

```knoten
DashboardPassword.read
  Dieser Teil liest das. Liest `read`.
DashboardPassword.create
  Dieser Teil legt an das. Legt an `create`.
Schritt Z.73 assertFalse(Files.exists(file));
  Zeile 73: Dateioperation. `assertFalse(Files.exists(file));`
```

> [!knoten]- Was die Blöcke tun
> - **DashboardPassword.read**: Dieser Teil liest das. Liest `read`.
> - **DashboardPassword.create**: Dieser Teil legt an das. Legt an `create`.
> - **Schritt Z.73 assertFalse(Files.exists(file));**: Zeile 73: Dateioperation. `assertFalse(Files.exists(file));`

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `CoreAdminTest.dashboardPasswordSetupPreservesExistingAndFailsClosed`.
