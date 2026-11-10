[[00 Start]] › [[Plugin-Kern]] › [[Benachrichtigung]] › [[NtfyNotifier]] › [[NtfyNotifier.send]] › [[NtfyNotifier.send.Teil1]]

# NtfyNotifier.send.Teil1

```mermaid
flowchart TD
  n1["if Z.24 (!settings.enabled())"]
  n2["return Z.24 return;"]
  n3["NtfyNotifier.target"]:::internal-link
  n4["NtfyNotifier.encodeHeader"]:::internal-link
  n5["NtfyNotifier.validPriority"]:::internal-link
  n6["if Z.32 (token != null && !token.isBlank())"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"Z.29"| n5
  n3 --> n4
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `NtfyNotifier.send`, Quellreihenfolge.
