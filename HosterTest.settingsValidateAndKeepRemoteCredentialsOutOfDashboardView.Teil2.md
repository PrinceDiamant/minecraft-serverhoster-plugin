[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.settingsValidateAndKeepRemoteCredentialsOutOfDashboardView]] › [[HosterTest.settingsValidateAndKeepRemoteCredentialsOutOfDashboardView.Teil2]]

# HosterTest.settingsValidateAndKeepRemoteCredentialsOutOfDashboardView.Teil2

```mermaid
flowchart TD
  n1["ServerHosterSettings.ServerHosterSettings"]:::internal-link
  n2["ServerHosterSettings.apply"]:::internal-link
  n3["ServerHosterSettings.from"]:::internal-link
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ServerHosterSettings.ServerHosterSettings
  `ServerHosterSettings` in `ServerHosterSettings.java`. Ruft `maxAttempts`, `enumValue`, `hasUnsafeHostCharacter`.
ServerHosterSettings.apply
  Wendet an `apply`.
ServerHosterSettings.from
  `from` in `ServerHosterSettings.java`. Ruft `ServerHosterSettings`.
```

- Fortsetzung von `HosterTest.settingsValidateAndKeepRemoteCredentialsOutOfDashboardView`, Quellreihenfolge.
