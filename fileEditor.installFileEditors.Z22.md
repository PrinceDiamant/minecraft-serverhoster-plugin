[[00 Start]] › [[Dashboard-UI]] › [[UI-Client]] › [[fileEditor.installFileEditors]] › [[fileEditor.installFileEditors.Z22]]

# fileEditor.installFileEditors.Z22

```mermaid
flowchart TD
  n1["for Z.22 ('etext', 'props', 'config') as const"]
  n2["if Z.24 !(textarea instanceof HTMLTextAreaElement)"]
  n3["throw Z.24 throw new Error('Editor $(id) is missing');"]
  n4["fileEditor.installFileEditors.set"]:::internal-link
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `fileEditor.installFileEditors`, Quellreihenfolge.
