[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Auth]]

# HTTP-Auth

```mermaid
flowchart TD
  n1["Dashboard.ip"]:::internal-link
  n2["Dashboard.createSession"]:::internal-link
  n3["Dashboard.setupPassword"]:::internal-link
  n4["Dashboard.login"]:::internal-link
  n5["Dashboard.token"]:::internal-link
  n6["Dashboard.authed"]:::internal-link
  n7["Dashboard.csrfRejected"]:::internal-link
  n3 -->|"Z.295"| n7
  n3 -->|"Z.298"| n1
  n3 -->|"Z.318"| n2
  n4 -->|"Z.325"| n1
  n4 -->|"Z.333"| n2
  n6 -->|"Z.487"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.ip
  `ip` in `Dashboard.java`.
Dashboard.createSession
  Legt an `createSession`. Ruft `cookie`.
Dashboard.setupPassword
  `setupPassword` in `Dashboard.java`. Ruft `csrfRejected`, `json`, `ip`.
Dashboard.login
  Meldet an `login`. Ruft `ip`, `json`, `body`.
Dashboard.token
  `token` in `Dashboard.java`.
Dashboard.authed
  `authed` in `Dashboard.java`. Ruft `token`.
Dashboard.csrfRejected
  `csrfRejected` in `Dashboard.java`.
```


