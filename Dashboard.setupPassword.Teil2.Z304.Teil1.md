[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Auth]] › [[Dashboard.setupPassword]] › [[Dashboard.setupPassword.Teil2.Z304.Teil1]]

# Dashboard.setupPassword.Teil2.Z304.Teil1

```mermaid
flowchart TD
  n1["if Z.306 (password != null // setupCode == null)"]
  n2["Dashboard.json"]:::internal-link
  n3["return Z.307 return;"]
  n4["Dashboard.setupPassword.Teil2.Z304.Teil1.Z309"]:::internal-link
  n5["DashboardPassword.create"]:::internal-link
  n6["Dashboard.passwordFile"]:::internal-link
  n2 --> n3
  n1 -->|"ja"| n2
  n3 --> n4
  n1 --> n4
  n5 -->|"Z.314"| n6
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.306 (password != null // setupCode == null)
  Zeile 306: prüft `(password != null // setupCode == null)`.
Dashboard.json
  Antwortet mit JSON `json`. Ruft `sendBytes`.
return Z.307 return;
  Zeile 307: Rückgabe `return;`.
Dashboard.setupPassword.Teil2.Z304.Teil1.Z309
  Fortsetzung des Ablaufs ab Zeile 309.
DashboardPassword.create
  Legt an `create`.
Dashboard.passwordFile
  `passwordFile` in `Dashboard.java`.
```

- Fortsetzung von `Dashboard.setupPassword.Teil2.Z304`, Quellreihenfolge.
