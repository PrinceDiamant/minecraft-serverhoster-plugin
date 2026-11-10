[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]] › [[SetupWizard.SetupWizard.finish]] › [[SetupWizard.SetupWizard.finish.Z135.Teil2]]

# SetupWizard.SetupWizard.finish.Z135.Teil2

```mermaid
flowchart TD
  n1["SetupWizard.SetupWizard.finish.Z135.Teil2.Z185"]:::internal-link
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["hostApi.jsonBody"]:::internal-link
  n4["SetupWizard.SetupWizard.finish.Z135.Teil2.Z196"]:::internal-link
  n5["SetupWizard.SetupWizard.finish.Z135.Teil2.Z217"]:::internal-link
  n6["if Z.229 !await onComplete()"]
  n2 -->|"Z.192"| n3
  n1 --> n2
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SetupWizard.SetupWizard.finish.Z135.Teil2.Z185
  Fortsetzung des Ablaufs ab Zeile 185.
hostApi.dashboardRequest
  `dashboardRequest` in `hostApi.ts`.
hostApi.jsonBody
  Antwortet mit JSON `jsonBody`.
SetupWizard.SetupWizard.finish.Z135.Teil2.Z196
  Fortsetzung des Ablaufs ab Zeile 196.
SetupWizard.SetupWizard.finish.Z135.Teil2.Z217
  Fortsetzung des Ablaufs ab Zeile 217.
if Z.229 !await onComplete()
  Zeile 229: prüft `!await onComplete()`.
```

- Fortsetzung von `SetupWizard.SetupWizard.finish.Z135`, Quellreihenfolge.
