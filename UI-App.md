[[00 Start]] › [[Dashboard-UI]] › [[UI-App]]

# UI-App

```mermaid
flowchart TD
  n1["App.tabFromPath"]:::internal-link
  n2["App.readLegacyDashboard"]:::internal-link
  n3["App.App"]:::internal-link
  n3 -->|"Z.147"| n1
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
```

```knoten
App.tabFromPath
  Wechselt den Tab `tabFromPath`.
App.readLegacyDashboard
  Ersetzt Legacy-Abschnitte und löscht vier `load…`-Aufrufe aus dem Script. Befund: doppelte Implementierung (sicher).
App.App
  `App` in `App.tsx`. Ruft `tabFromPath`, `dashboardRequest`, `showDialog`.
```

- `App` liest das Legacy-HTML und hängt Workflows ein.
