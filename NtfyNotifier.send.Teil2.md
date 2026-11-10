[[00 Start]] › [[Plugin-Kern]] › [[Benachrichtigung]] › [[NtfyNotifier]] › [[NtfyNotifier.send]] › [[NtfyNotifier.send.Teil2]]

# NtfyNotifier.send.Teil2

```mermaid
flowchart TD
  n1["try Z.33"]
  n2["if Z.35 (response.statusCode() ( 200 // response.statusCo…"]
  n3["throw Z.36 throw new IOException('ntfy returned HTTP ' + res…"]
  n4["catch Z.37 (InterruptedException e)"]
  n5["throw Z.39 throw new IOException('ntfy request interrupted',…"]
  n2 -->|"ja"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `NtfyNotifier.send`, Quellreihenfolge.
