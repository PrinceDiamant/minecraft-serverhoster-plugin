[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]]

# SetupWizard.SetupWizard

`SetupWizard.SetupWizard({ state, host, onComplete }: {
  state: SetupState;
  host: SetupHostState | null;
  onComplete: () => Promise<boolean>;
})` [ui/src/components/SetupWizard.tsx:45–388](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/SetupWizard.tsx#L45-L388)

```mermaid
flowchart TD
  n1["SetupWizard.SetupWizard.Teil1"]:::internal-link
  n2["SetupWizard.SetupWizard.Teil2"]:::internal-link
  n3["SetupWizard.SetupWizard.Teil3"]:::internal-link
  n4["SetupWizard.SetupWizard.Teil4"]:::internal-link
  n5["SetupWizard.SetupWizard.chooseAction"]:::internal-link
  n6["SetupWizard.SetupWizard.chooseCandidate"]:::internal-link
  n7["SetupWizard.SetupWizard.next"]:::internal-link
  n8["SetupWizard.SetupWizard.finish"]:::internal-link
  n9["SetupWizard.SetupWizard.runFirstSetup"]:::internal-link
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
SetupWizard.SetupWizard.Teil1
  Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
SetupWizard.SetupWizard.Teil2
  Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
SetupWizard.SetupWizard.Teil3
  Abschnitt 3 dieses Ablaufs, in Quellreihenfolge.
SetupWizard.SetupWizard.Teil4
  Abschnitt 4 dieses Ablaufs, in Quellreihenfolge.
SetupWizard.SetupWizard.chooseAction
  Wählt `chooseAction`.
SetupWizard.SetupWizard.chooseCandidate
  Wählt `chooseCandidate`.
SetupWizard.SetupWizard.next
  Geht zum nächsten Schritt `next`. Ruft `versionIsValid`.
SetupWizard.SetupWizard.finish
  Schließt ab `finish`. Ruft `saveBackupSettings`, `createSchedule`, `dashboardRequest`.
SetupWizard.SetupWizard.runFirstSetup
  Führt aus `runFirstSetup`. Ruft `dashboardRequest`, `jsonBody`.
```

- `SetupWizard` in `ui/src/components/SetupWizard.tsx`
