[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]] › [[SetupWizard.SetupWizard.finish]] › [[SetupWizard.SetupWizard.finish.Z135]]

# SetupWizard.SetupWizard.finish.Z135

```mermaid
flowchart TD
  n1["try Z.135"]
  n2["SetupWizard.SetupWizard.finish.Z135.Teil1"]:::internal-link
  n3["SetupWizard.SetupWizard.finish.Z135.Teil2"]:::internal-link
  n4["SetupWizard.SetupWizard.finish.Z135.Teil3"]:::internal-link
  n5["catch Z.236 cause"]
  n6["finally Z.135"]
  n2 -->|"weiter"| n3
  n3 -->|"weiter"| n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  n4 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.135
  Zeile 135: Versuch. Der Fehlerpfad geht in catch.
SetupWizard.SetupWizard.finish.Z135.Teil1
  Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
SetupWizard.SetupWizard.finish.Z135.Teil2
  Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
SetupWizard.SetupWizard.finish.Z135.Teil3
  Abschnitt 3 dieses Ablaufs, in Quellreihenfolge.
catch Z.236 cause
  Zeile 236: fängt cause.
finally Z.135
  Läuft danach immer, auch nach einem Fehler.
```

- Fortsetzung von `SetupWizard.SetupWizard.finish`, Quellreihenfolge.
