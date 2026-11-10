[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.settingsValidateAndKeepRemoteCredentialsOutOfDashboardView]] › [[HosterTest.settingsValidateAndKeepRemoteCredentialsOutOfDashboardView.Teil1]]

# HosterTest.settingsValidateAndKeepRemoteCredentialsOutOfDashboardView.Teil1

```mermaid
flowchart TD
  n1["ServerHosterSettings.ServerHosterSettings"]:::internal-link
  n2["ServerHosterSettings.view"]:::internal-link
  n3["ServerHosterSettings.view"]:::internal-link
  n4["ServerHosterSettings.view"]:::internal-link
  n5["ServerHosterSettings.ServerHosterSettings"]:::internal-link
  n6["ServerHosterSettings.ServerHosterSettings"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ServerHosterSettings.ServerHosterSettings
  `ServerHosterSettings` in `ServerHosterSettings.java`. Ruft `maxAttempts`, `enumValue`, `hasUnsafeHostCharacter`.
ServerHosterSettings.view
  Liefert die Sicht `view`.
```

- Fortsetzung von `HosterTest.settingsValidateAndKeepRemoteCredentialsOutOfDashboardView`, Quellreihenfolge.
