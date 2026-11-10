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
  Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Reagiert `onUnauthorized`. Ruft `showLogin`.
App.App.onAuthReady
  Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Reagiert `onAuthReady`.
App.App.onTabChange
  Die [[Glossar#Bedienseite|Bedienseite]] wechselt zu hier einen Schritt. Eine Ebene tiefer steht er genauer. Reagiert `onTabChange`.
App.App.onSetupRequired
  Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um die [[Glossar#Einrichtung|Einrichtung]] einen Pflichtwert. Reagiert `onSetupRequired`. Ruft `navigateTo`.
App.App.onStarted
  Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Reagiert `onStarted`. Ruft `navigateTo`, `tabFromPath`.
App.App.onPopState
  Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Reagiert `onPopState`. Ruft `tabFromPath`, `navigateTo`.
App.App.showDialog
  Die [[Glossar#Bedienseite|Bedienseite]] zeigt den Dialog. Zeigt `showDialog`.
App.App.navigateTo
  Die [[Glossar#Bedienseite|Bedienseite]] wechselt zu das. Wechselt die Route `navigateTo`. Ruft `tab`.
App.App.closeDialog
  Die [[Glossar#Bedienseite|Bedienseite]] schließt den Dialog. Schließt `closeDialog`.
App.App.submitDialog
  Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um den Dialog. Gibt ab `submitDialog`. Ruft `closeDialog`.
App.App.generatePassword
  Die [[Glossar#Bedienseite|Bedienseite]] erzeugt das Passwort. Erzeugt `generatePassword`.
App.App.savePassword
  Die [[Glossar#Bedienseite|Bedienseite]] speichert das Passwort. Speichert `savePassword`. Ruft `dashboardRequest`, `jsonBody`, `start`.
```

> [!knoten]- Was die Blöcke tun
> - **App.App.onUnauthorized**: Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Reagiert `onUnauthorized`. Ruft `showLogin`.
> - **App.App.onAuthReady**: Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Reagiert `onAuthReady`.
> - **App.App.onTabChange**: Die [[Glossar#Bedienseite|Bedienseite]] wechselt zu hier einen Schritt. Eine Ebene tiefer steht er genauer. Reagiert `onTabChange`.
> - **App.App.onSetupRequired**: Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um die [[Glossar#Einrichtung|Einrichtung]] einen Pflichtwert. Reagiert `onSetupRequired`. Ruft `navigateTo`.
> - **App.App.onStarted**: Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Reagiert `onStarted`. Ruft `navigateTo`, `tabFromPath`.
> - **App.App.onPopState**: Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Reagiert `onPopState`. Ruft `tabFromPath`, `navigateTo`.
> - **App.App.showDialog**: Die [[Glossar#Bedienseite|Bedienseite]] zeigt den Dialog. Zeigt `showDialog`.
> - **App.App.navigateTo**: Die [[Glossar#Bedienseite|Bedienseite]] wechselt zu das. Wechselt die Route `navigateTo`. Ruft `tab`.
> - **App.App.closeDialog**: Die [[Glossar#Bedienseite|Bedienseite]] schließt den Dialog. Schließt `closeDialog`.
> - **App.App.submitDialog**: Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um den Dialog. Gibt ab `submitDialog`. Ruft `closeDialog`.
> - **App.App.generatePassword**: Die [[Glossar#Bedienseite|Bedienseite]] erzeugt das Passwort. Erzeugt `generatePassword`.
> - **App.App.savePassword**: Die [[Glossar#Bedienseite|Bedienseite]] speichert das Passwort. Speichert `savePassword`. Ruft `dashboardRequest`, `jsonBody`, `start`.

- [[Glossar#Funktion|Funktionen]], die nur innen in diesem Block gebraucht werden.
- Fortsetzung von `App.App`.
