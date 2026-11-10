[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]] › [[SetupWizard.SetupWizard.finish]] › [[SetupWizard.finish.createSchedule]]

# SetupWizard.finish.createSchedule

`SetupWizard.createSchedule()` [ui/src/components/SetupWizard.tsx:171–184](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/SetupWizard.tsx#L171-L184)

```mermaid
flowchart TD
  n1["if Z.172 !schedule // scheduleCreated"]
  n2["return Z.172 return;"]
  n3["hostApi.dashboardRequest"]:::internal-link
  n4["hostApi.jsonBody"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"Z.176"| n4
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `createSchedule` in `ui/src/components/SetupWizard.tsx`
