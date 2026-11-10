[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]]

# SetupWorkflow.SetupWorkflow

`SetupWorkflow.SetupWorkflow()` [ui/src/components/SetupWorkflow.tsx:44–392](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/SetupWorkflow.tsx#L44-L392)

```mermaid
flowchart TD
  n1["SetupWorkflow.SetupWorkflow.Teil1"]:::internal-link
  n2["SetupWorkflow.SetupWorkflow.Teil2"]:::internal-link
  n3["SetupWorkflow.SetupWorkflow.Teil3"]:::internal-link
  n4["SetupWorkflow.SetupWorkflow.Teil4"]:::internal-link
  n5["SetupWorkflow.SetupWorkflow.onPageChange"]:::internal-link
  n6["SetupWorkflow.SetupWorkflow.submit"]:::internal-link
  n7["SetupWorkflow.SetupWorkflow.cleanupLegacy"]:::internal-link
  n8["SetupWorkflow.SetupWorkflow.hostAction"]:::internal-link
  n9["SetupWorkflow.SetupWorkflow.runHostFirstSetup"]:::internal-link
  n1 -->|"weiter"| n2
  n2 -->|"weiter"| n3
  n3 -->|"weiter"| n4
  n4 -->|"innere Methode"| n5
  n5 -->|"innere Methode"| n6
  n6 -->|"innere Methode"| n7
  n7 -->|"innere Methode"| n8
  n8 -->|"innere Methode"| n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `SetupWorkflow` in `ui/src/components/SetupWorkflow.tsx`
