[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.Teil4.Calls328]]

# SetupWorkflow.SetupWorkflow.Teil4.Calls328

```mermaid
flowchart TD
  n1["SetupWorkflow.SetupWorkflow.submit"]:::internal-link
  n2["VersionSelect.versionIsValid"]:::internal-link
  n3["SetupWorkflow.SetupWorkflow.submit"]:::internal-link
  n4["VersionSelect.VersionSelect"]:::internal-link
  n5["VersionSelect.versionIsValid"]:::internal-link
  n6["SetupWorkflow.SetupWorkflow.submit"]:::internal-link
  n1 -->|"Z.329"| n2
  n2 -->|"Z.329"| n3
  n3 -->|"Z.346"| n4
  n4 -->|"Z.349"| n5
  n5 -->|"Z.349"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SetupWorkflow.SetupWorkflow.submit
  Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Gibt ab `submit`. Ruft `versionIsValid`, `dashboardRequest`, `jsonBody`.
VersionSelect.versionIsValid
  Die [[Glossar#Bedienseite|Bedienseite]] prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. `versionIsValid` in `VersionSelect.tsx`.
VersionSelect.VersionSelect
  Die [[Glossar#Bedienseite|Bedienseite]] wählt das. `VersionSelect` in `VersionSelect.tsx`.
```

> [!knoten]- Was die Blöcke tun
> - **SetupWorkflow.SetupWorkflow.submit**: Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Gibt ab `submit`. Ruft `versionIsValid`, `dashboardRequest`, `jsonBody`.
> - **VersionSelect.versionIsValid**: Die [[Glossar#Bedienseite|Bedienseite]] prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. `versionIsValid` in `VersionSelect.tsx`.
> - **VersionSelect.VersionSelect**: Die [[Glossar#Bedienseite|Bedienseite]] wählt das. `VersionSelect` in `VersionSelect.tsx`.

- Weitere [[Glossar#Funktion|Funktionen]], die ab [[Glossar#Zeile|Zeile]] 328 aufgerufen werden.
- Fortsetzung von `SetupWorkflow.SetupWorkflow.Teil4`.
