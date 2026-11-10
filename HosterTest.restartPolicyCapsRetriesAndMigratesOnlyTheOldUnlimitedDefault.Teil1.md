[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil2]] › [[HosterTest.restartPolicyCapsRetriesAndMigratesOnlyTheOldUnlimitedDefault]] › [[HosterTest.restartPolicyCapsRetriesAndMigratesOnlyTheOldUnlimitedDefault.Teil1]]

# HosterTest.restartPolicyCapsRetriesAndMigratesOnlyTheOldUnlimitedDefault.Teil1

```mermaid
flowchart TD
  n1["RestartPolicy.maxAttempts"]:::internal-link
  n2["RestartPolicy.mayRetry"]:::internal-link
  n3["RestartPolicy.mayRetry"]:::internal-link
  n4["RestartPolicy.migrateLegacyUnlimited"]:::internal-link
  n5["RestartPolicy.migrateLegacyUnlimited"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RestartPolicy.maxAttempts
  Begrenzt nach oben `maxAttempts`.
RestartPolicy.mayRetry
  `mayRetry` in `RestartPolicy.java`.
RestartPolicy.migrateLegacyUnlimited
  Übernimmt den alten Wert von `migrateLegacyUnlimited`.
```

- Fortsetzung von `HosterTest.restartPolicyCapsRetriesAndMigratesOnlyTheOldUnlimitedDefault`, Quellreihenfolge.
