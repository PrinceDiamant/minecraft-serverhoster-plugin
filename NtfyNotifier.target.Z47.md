[[00 Start]] › [[Plugin-Kern]] › [[Benachrichtigung]] › [[NtfyNotifier]] › [[NtfyNotifier.target]] › [[NtfyNotifier.target.Z47]]

# NtfyNotifier.target.Z47

```mermaid
flowchart TD
  n1["try Z.47"]
  n2["if Z.49 (!'https'.equalsIgnoreCase(base.getScheme()) // b…"]
  n3["throw Z.51 throw new IOException('ntfy server must be an HTT…"]
  n4["return Z.54 return URI.create('https://' + base.getRawAuthori…"]
  n5["catch Z.55 (IllegalArgumentException e)"]
  n6["throw Z.56 throw new IOException('notifications.ntfy.server …"]
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `NtfyNotifier.target`, Quellreihenfolge.
