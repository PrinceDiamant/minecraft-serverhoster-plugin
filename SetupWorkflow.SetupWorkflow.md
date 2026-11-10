[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]]

# SetupWorkflow.SetupWorkflow

`SetupWorkflow.SetupWorkflow()` [ui/src/components/SetupWorkflow.tsx:44–392](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/SetupWorkflow.tsx#L44-L392)

```mermaid
flowchart TD
  n1["SetupWorkflow.SetupWorkflow.Teil1"]:::internal-link
  n2["SetupWorkflow.SetupWorkflow.Teil2"]:::internal-link
  n3["SetupWorkflow.SetupWorkflow.Teil3"]:::internal-link
  n4["SetupWorkflow.SetupWorkflow.Teil4"]:::internal-link
  n5["SetupWorkflow.SetupWorkflow.onPageChange"]:::internal-link
  n6["SetupWorkflow.SetupWorkflow.submit"]:::internal-link
  n7["SetupWorkflow.SetupWorkflow.cleanupLegacy"]:::internal-link
  n8["SetupWorkflow.SetupWorkflow.hostAction"]:::internal-link
  n9["SetupWorkflow.SetupWorkflow.runHostFirstSetup"]:::internal-link
  n1 -->|"weiter"| n2
  n2 -->|"weiter"| n3
  n3 -->|"weiter"| n4
  n4 -->|"innere Methode"| n5
  n5 -->|"innere Methode"| n6
  n6 -->|"innere Methode"| n7
  n7 -->|"innere Methode"| n8
  n8 -->|"innere Methode"| n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SetupWorkflow.SetupWorkflow.Teil1
  Ein weiterer Abschnitt derselben Übersicht. Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
SetupWorkflow.SetupWorkflow.Teil2
  Ein weiterer Abschnitt derselben Übersicht. Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
SetupWorkflow.SetupWorkflow.Teil3
  Ein weiterer Abschnitt derselben Übersicht. Abschnitt 3 dieses Ablaufs, in Quellreihenfolge.
SetupWorkflow.SetupWorkflow.Teil4
  Ein weiterer Abschnitt derselben Übersicht. Abschnitt 4 dieses Ablaufs, in Quellreihenfolge.
SetupWorkflow.SetupWorkflow.onPageChange
  Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Reagiert `onPageChange`. Ruft `refresh`.
SetupWorkflow.SetupWorkflow.submit
  Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Gibt ab `submit`. Ruft `versionIsValid`, `dashboardRequest`, `jsonBody`.
SetupWorkflow.SetupWorkflow.cleanupLegacy
  Die [[Glossar#Bedienseite|Bedienseite]] räumt auf den alten Weg. Räumt auf `cleanupLegacy`. Ruft `dashboardRequest`, `jsonBody`, `refresh`.
SetupWorkflow.SetupWorkflow.hostAction
  Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um die Tätigkeit. Betrifft den [[Glossar#Host|Host]] `hostAction`. Ruft `dashboardRequest`, `jsonBody`.
SetupWorkflow.SetupWorkflow.runHostFirstSetup
  Die [[Glossar#Bedienseite|Bedienseite]] führt aus den [[Glossar#Host|Host]] die erste die [[Glossar#Einrichtung|Einrichtung]]. Führt aus `runHostFirstSetup`. Ruft `dashboardRequest`, `jsonBody`.
```

> [!knoten]- Was die Blöcke tun
> - **SetupWorkflow.SetupWorkflow.Teil1**: Ein weiterer Abschnitt derselben Übersicht. Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
> - **SetupWorkflow.SetupWorkflow.Teil2**: Ein weiterer Abschnitt derselben Übersicht. Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
> - **SetupWorkflow.SetupWorkflow.Teil3**: Ein weiterer Abschnitt derselben Übersicht. Abschnitt 3 dieses Ablaufs, in Quellreihenfolge.
> - **SetupWorkflow.SetupWorkflow.Teil4**: Ein weiterer Abschnitt derselben Übersicht. Abschnitt 4 dieses Ablaufs, in Quellreihenfolge.
> - **SetupWorkflow.SetupWorkflow.onPageChange**: Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Reagiert `onPageChange`. Ruft `refresh`.
> - **SetupWorkflow.SetupWorkflow.submit**: Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Gibt ab `submit`. Ruft `versionIsValid`, `dashboardRequest`, `jsonBody`.
> - **SetupWorkflow.SetupWorkflow.cleanupLegacy**: Die [[Glossar#Bedienseite|Bedienseite]] räumt auf den alten Weg. Räumt auf `cleanupLegacy`. Ruft `dashboardRequest`, `jsonBody`, `refresh`.
> - **SetupWorkflow.SetupWorkflow.hostAction**: Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um die Tätigkeit. Betrifft den [[Glossar#Host|Host]] `hostAction`. Ruft `dashboardRequest`, `jsonBody`.
> - **SetupWorkflow.SetupWorkflow.runHostFirstSetup**: Die [[Glossar#Bedienseite|Bedienseite]] führt aus den [[Glossar#Host|Host]] die erste die [[Glossar#Einrichtung|Einrichtung]]. Führt aus `runHostFirstSetup`. Ruft `dashboardRequest`, `jsonBody`.

- Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um den Ablauf.
- `SetupWorkflow` in `ui/src/components/SetupWorkflow.tsx`
