[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.submit]] › [[SetupWorkflow.SetupWorkflow.submit.Z100.Teil1]]

# SetupWorkflow.SetupWorkflow.submit.Z100.Teil1

```mermaid
flowchart TD
  n1["if Z.102 !path"]
  n2["throw Z.102 throw new Error('Bitte zuerst einen Serverordner …"]
  n3["if Z.103 action !== 'import' && !versionIsValid(type, mcVe…"]
  n4["VersionSelect.versionIsValid"]:::internal-link
  n5["throw Z.104 throw new Error('Bitte eine verfügbare Minecraft-…"]
  n6["SetupWorkflow.SetupWorkflow.submit.Z100.Teil1.Z106"]:::internal-link
  n7["hostApi.dashboardRequest"]:::internal-link
  n8["hostApi.jsonBody"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"Z.103"| n4
  n4 -->|"ja"| n5
  n2 --> n3
  n1 --> n3
  n5 --> n6
  n4 --> n6
  n7 -->|"Z.148"| n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWorkflow.SetupWorkflow.submit.Z100`, Quellreihenfolge.
