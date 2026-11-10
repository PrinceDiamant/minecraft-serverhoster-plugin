[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil1]] › [[CoreAdminTest.dashboardPasswordSetupPreservesExistingAndFailsClosed]] › [[CoreAdminTest.dashboardPasswordSetupPreservesExistingAndFailsClosed.Teil2]]

# CoreAdminTest.dashboardPasswordSetupPreservesExistingAndFailsClosed.Teil2

```mermaid
flowchart TD
  n1["DashboardPassword.create"]:::internal-link
  n2["DashboardPassword.read"]:::internal-link
  n3["DashboardPassword.create"]:::internal-link
  n4["DashboardPassword.read"]:::internal-link
  n5["if Z.78 (Files.getFileStore(tmp).supportsFileAttributeVie…"]
  n6["Schritt Z.80 Files.writeString(file, '');"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
DashboardPassword.create
  Dieser Teil legt an das. Legt an `create`.
DashboardPassword.read
  Dieser Teil liest das. Liest `read`.
if Z.78 (Files.getFileStore(tmp).supportsFileAttributeVie…
  Zeile 78: prüft `(Files.getFileStore(tmp).supportsFileAttributeVie…`.
Schritt Z.80 Files.writeString(file, '');
  Zeile 80: schreibt Text in eine Datei. `Files.writeString(file, '');`
```

> [!knoten]- Was die Blöcke tun
> - **DashboardPassword.create**: Dieser Teil legt an das. Legt an `create`.
> - **DashboardPassword.read**: Dieser Teil liest das. Liest `read`.
> - **if Z.78 (Files.getFileStore(tmp).supportsFileAttributeVie…**: Zeile 78: prüft `(Files.getFileStore(tmp).supportsFileAttributeVie…`.
> - **Schritt Z.80 Files.writeString(file, '');**: Zeile 80: schreibt Text in eine Datei. `Files.writeString(file, '');`

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `CoreAdminTest.dashboardPasswordSetupPreservesExistingAndFailsClosed`.
