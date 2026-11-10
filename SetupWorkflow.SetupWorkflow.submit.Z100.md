[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.submit]] › [[SetupWorkflow.SetupWorkflow.submit.Z100]]

# SetupWorkflow.SetupWorkflow.submit.Z100

```mermaid
flowchart TD
  n1["try Z.100"]
  n2["SetupWorkflow.SetupWorkflow.submit.Z100.Teil1"]:::internal-link
  n3["SetupWorkflow.SetupWorkflow.submit.Z100.Teil2"]:::internal-link
  n4["catch Z.164 cause"]
  n5["finally Z.100"]
  n2 -->|"weiter"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n3 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.100
  Zeile 100: Versuch. Der Fehlerpfad geht in catch.
SetupWorkflow.SetupWorkflow.submit.Z100.Teil1
  Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
SetupWorkflow.SetupWorkflow.submit.Z100.Teil2
  Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
catch Z.164 cause
  Zeile 164: fängt cause.
finally Z.100
  Läuft danach immer, auch nach einem Fehler.
```

- Fortsetzung von `SetupWorkflow.SetupWorkflow.submit`, Quellreihenfolge.
