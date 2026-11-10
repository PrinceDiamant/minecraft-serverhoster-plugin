[[00 Start]] › [[Dashboard-UI]] › [[UI-App]] › [[App.App]] › [[App.App.Innere]]

# App.App.Innere

```mermaid
flowchart TD
  n1["App.App.onUnauthorized"]:::internal-link
  n2["App.App.onAuthReady"]:::internal-link
  n3["App.App.onTabChange"]:::internal-link
  n4["App.App.onSetupRequired"]:::internal-link
  n5["App.App.onStarted"]:::internal-link
  n6["App.App.onPopState"]:::internal-link
  n7["App.App.showDialog"]:::internal-link
  n8["App.App.navigateTo"]:::internal-link
  n9["App.App.closeDialog"]:::internal-link
  n10["App.App.submitDialog"]:::internal-link
  n11["App.App.generatePassword"]:::internal-link
  n12["App.App.savePassword"]:::internal-link
  n1 -->|"innere Methode"| n2
  n2 -->|"innere Methode"| n3
  n3 -->|"innere Methode"| n4
  n4 -->|"innere Methode"| n5
  n5 -->|"innere Methode"| n6
  n6 -->|"innere Methode"| n7
  n7 -->|"innere Methode"| n8
  n8 -->|"innere Methode"| n9
  n9 -->|"innere Methode"| n10
  n10 -->|"innere Methode"| n11
  n11 -->|"innere Methode"| n12
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
App.App.onUnauthorized
  Reagiert `onUnauthorized`. Ruft `showLogin`.
App.App.onAuthReady
  Reagiert `onAuthReady`.
App.App.onTabChange
  Reagiert `onTabChange`.
App.App.onSetupRequired
  Reagiert `onSetupRequired`. Ruft `navigateTo`.
App.App.onStarted
  Reagiert `onStarted`. Ruft `navigateTo`, `tabFromPath`.
App.App.onPopState
  Reagiert `onPopState`. Ruft `tabFromPath`, `navigateTo`.
App.App.showDialog
  Zeigt `showDialog`.
App.App.navigateTo
  Wechselt die Route `navigateTo`. Ruft `tab`.
App.App.closeDialog
  Schließt `closeDialog`.
App.App.submitDialog
  Gibt ab `submitDialog`. Ruft `closeDialog`.
App.App.generatePassword
  Erzeugt `generatePassword`.
App.App.savePassword
  Speichert `savePassword`. Ruft `dashboardRequest`, `jsonBody`, `start`.
```

- Fortsetzung von `App.App`, Quellreihenfolge.
