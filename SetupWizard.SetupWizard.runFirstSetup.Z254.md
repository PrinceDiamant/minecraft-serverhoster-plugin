[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]] › [[SetupWizard.SetupWizard.runFirstSetup]] › [[SetupWizard.SetupWizard.runFirstSetup.Z254]]

# SetupWizard.SetupWizard.runFirstSetup.Z254

```mermaid
flowchart TD
  n1["try Z.254"]
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["hostApi.jsonBody"]:::internal-link
  n4["catch Z.260 cause"]
  n2 -->|"Z.257"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWizard.SetupWizard.runFirstSetup`, Quellreihenfolge.
