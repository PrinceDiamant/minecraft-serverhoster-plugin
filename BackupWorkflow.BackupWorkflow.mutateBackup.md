[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[BackupWorkflow]] › [[BackupWorkflow.BackupWorkflow]] › [[BackupWorkflow.BackupWorkflow.mutateBackup]]

# BackupWorkflow.BackupWorkflow.mutateBackup

`BackupWorkflow.mutateBackup(backup: BackupEntry, operation: "restore" | "delete")` [ui/src/components/BackupWorkflow.tsx:98–126](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/BackupWorkflow.tsx#L98-L126)

```mermaid
flowchart TD
  n1["if Z.108 !accepted"]
  n2["return Z.108 return;"]
  n3["BackupWorkflow.BackupWorkflow.mutateBackup.Z112"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `mutateBackup` in `ui/src/components/BackupWorkflow.tsx`
