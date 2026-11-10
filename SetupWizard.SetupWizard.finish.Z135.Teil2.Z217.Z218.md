[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]] › [[SetupWizard.SetupWizard.finish]] › [[SetupWizard.SetupWizard.finish.Z135.Teil2.Z217.Z218]]

# SetupWizard.SetupWizard.finish.Z135.Teil2.Z217.Z218

```mermaid
flowchart TD
  n1["try Z.218"]
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["hostApi.jsonBody"]:::internal-link
  n4["catch Z.224 cause"]
  n2 -->|"Z.221"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWizard.SetupWizard.finish.Z135.Teil2.Z217`, Quellreihenfolge.
