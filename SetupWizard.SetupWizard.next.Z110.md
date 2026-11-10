[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]] › [[SetupWizard.SetupWizard.next]] › [[SetupWizard.SetupWizard.next.Z110]]

# SetupWizard.SetupWizard.next.Z110

```mermaid
flowchart TD
  n1["if Z.110 step === 1"]
  n2["if Z.111 !path"]
  n3["return Z.113 return;"]
  n4["if Z.115 action !== 'import' && (!versionIsValid(type, mcV…"]
  n5["VersionSelect.versionIsValid"]:::internal-link
  n6["return Z.118 return;"]
  n2 -->|"ja"| n3
  n4 -->|"Z.115"| n5
  n5 -->|"ja"| n6
  n3 --> n4
  n2 --> n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.110 step === 1
  Zeile 110: prüft `step === 1`.
if Z.111 !path
  Zeile 111: prüft `!path`.
return Z.113 return;
  Zeile 113: Rückgabe `return;`.
if Z.115 action !== 'import' && (!versionIsValid(type, mcV…
  Zeile 115: prüft `action !== 'import' && (!versionIsValid(type, mcV…`.
VersionSelect.versionIsValid
  Die [[Glossar#Bedienseite|Bedienseite]] prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. `versionIsValid` in `VersionSelect.tsx`.
return Z.118 return;
  Zeile 118: Rückgabe `return;`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.110 step === 1**: Zeile 110: prüft `step === 1`.
> - **if Z.111 !path**: Zeile 111: prüft `!path`.
> - **return Z.113 return;**: Zeile 113: Rückgabe `return;`.
> - **if Z.115 action !== 'import' && (!versionIsValid(type, mcV…**: Zeile 115: prüft `action !== 'import' && (!versionIsValid(type, mcV…`.
> - **VersionSelect.versionIsValid**: Die [[Glossar#Bedienseite|Bedienseite]] prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. `versionIsValid` in `VersionSelect.tsx`.
> - **return Z.118 return;**: Zeile 118: Rückgabe `return;`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 110 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `SetupWizard.SetupWizard.next`.
