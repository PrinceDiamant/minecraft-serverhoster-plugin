[[00 Start]] › [[Plugin-Kern]] › [[Benachrichtigung]] › [[NtfyNotifier]] › [[NtfyNotifier.target]]

# NtfyNotifier.target

`NtfyNotifier.target(String server, String topic)` [src/main/java/de/aichele/childlauncher/NtfyNotifier.java:43–58](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/NtfyNotifier.java#L43-L58)

```mermaid
flowchart TD
  n1["if Z.44 (server == null // server.isBlank())"]
  n2["throw Z.44 throw new IOException('notifications.ntfy.server …"]
  n3["if Z.45 (topic == null // !topic.matches('(A-Za-z0-9_-)(1…"]
  n4["throw Z.46 throw new IOException('notifications.ntfy.topic m…"]
  n5["NtfyNotifier.target.Z47"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `target` in `src/main/java/de/aichele/childlauncher/NtfyNotifier.java`
