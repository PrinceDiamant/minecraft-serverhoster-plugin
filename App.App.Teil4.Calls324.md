[[00 Start]] › [[Dashboard-UI]] › [[UI-App]] › [[App.App]] › [[App.App.Teil4.Calls324]]

# App.App.Teil4.Calls324

```mermaid
flowchart TD
  n1["App.App.savePassword"]:::internal-link
  n2["index.doLogin"]:::internal-link
  n3["App.App.navigateTo"]:::internal-link
  n4["index.logout"]:::internal-link
  n5["App.App.closeDialog"]:::internal-link
  n6["App.App.closeDialog"]:::internal-link
  n1 -->|"Z.325"| n2
  n2 -->|"Z.390"| n3
  n3 -->|"Z.403"| n4
  n4 -->|"Z.427"| n5
  n5 -->|"Z.430"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
App.App.savePassword
  Speichert `savePassword`. Ruft `dashboardRequest`, `jsonBody`, `start`.
index.doLogin
  Führt aus `doLogin`. Ruft `$`, `start`.
App.App.navigateTo
  Wechselt die Route `navigateTo`. Ruft `tab`.
index.logout
  Meldet ab `logout`. Ruft `post`, `showLogin`.
App.App.closeDialog
  Schließt `closeDialog`.
```

- Fortsetzung von `App.App.Teil4`, Quellreihenfolge.
