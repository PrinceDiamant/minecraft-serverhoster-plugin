[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil1]]

# HosterTest.Teil1

```mermaid
flowchart TD
  n1["HosterTest.ftpAutoDetectionNeverDowngradesAfterTlsIsOffered"]:::internal-link
  n2["HosterTest.ftpCredentialsAreKeptInLocalSecretsFile"]:::internal-link
  n3["HosterTest.ntfyRequiresHttpsAndConstructsTopicEndpoint"]:::internal-link
  n4["HosterTest.defaultDailyBackupUsesServerLocalTime"]:::internal-link
  n5["HosterTest.singleSlotIsTheDefault"]:::internal-link
  n6["HosterTest.profilesKeepLegacyRootAndAddServers"]:::internal-link
  n7["HosterTest.defaultsKeepVanillaGameplayAndNeverPauseWhenEmpty"]:::internal-link
  n8["HosterTest.bindAddressInheritsHostUnlessExplicitlyOverridden"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  n5 -->|"Quelltext"| n6
  n6 -->|"Quelltext"| n7
  n7 -->|"Quelltext"| n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HosterTest.ftpAutoDetectionNeverDowngradesAfterTlsIsOffered
  `ftpAutoDetectionNeverDowngradesAfterTlsIsOffered` in `HosterTest.java`. Ruft `unsupportedAuthTls`. Nur Test.
HosterTest.ftpCredentialsAreKeptInLocalSecretsFile
  `ftpCredentialsAreKeptInLocalSecretsFile` in `HosterTest.java`. Ruft `load`. Nur Test.
HosterTest.ntfyRequiresHttpsAndConstructsTopicEndpoint
  `ntfyRequiresHttpsAndConstructsTopicEndpoint` in `HosterTest.java`. Ruft `target`. Nur Test.
HosterTest.defaultDailyBackupUsesServerLocalTime
  `defaultDailyBackupUsesServerLocalTime` in `HosterTest.java`. Ruft `load`. Nur Test.
HosterTest.singleSlotIsTheDefault
  `singleSlotIsTheDefault` in `HosterTest.java`. Nur Test.
HosterTest.profilesKeepLegacyRootAndAddServers
  Liefert die Profile `profilesKeepLegacyRootAndAddServers`. Ruft `load`, `directory`, `focus`. Nur Test.
HosterTest.defaultsKeepVanillaGameplayAndNeverPauseWhenEmpty
  `defaultsKeepVanillaGameplayAndNeverPauseWhenEmpty` in `HosterTest.java`. Ruft `load`, `forcedProperties`, `updateProperties`. Nur Test.
HosterTest.bindAddressInheritsHostUnlessExplicitlyOverridden
  Bindet `bindAddressInheritsHostUnlessExplicitlyOverridden`. Ruft `effectiveBindAddress`, `load`, `forcedProperties`. Nur Test.
```


