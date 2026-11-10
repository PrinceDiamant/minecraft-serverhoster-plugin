[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]] › [[SetupWizard.SetupWizard.next]]

# SetupWizard.SetupWizard.next

`SetupWizard.next()` [ui/src/components/SetupWizard.tsx:108–130](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/SetupWizard.tsx#L108-L130)

```mermaid
flowchart TD
  n1["SetupWizard.SetupWizard.next.Z110"]:::internal-link
  n2["if Z.121 step === 2 && (!backupSettings // (schedule && !/…"]
  n3["return Z.123 return;"]
  n4["if Z.125 step === 3 && ntfy.enabled && (!ntfy.server.trim(…"]
  n5["return Z.127 return;"]
  n2 -->|"ja"| n3
  n1 --> n2
  n4 -->|"ja"| n5
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SetupWizard.SetupWizard.next.Z110
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 110 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 110.
if Z.121 step === 2 && (!backupSettings // (schedule && !/…
  Zeile 121: prüft `step === 2 && (!backupSettings // (schedule && !/…`.
return Z.123 return;
  Zeile 123: Rückgabe `return;`.
if Z.125 step === 3 && ntfy.enabled && (!ntfy.server.trim(…
  Zeile 125: prüft `step === 3 && ntfy.enabled && (!ntfy.server.trim(…`.
return Z.127 return;
  Zeile 127: Rückgabe `return;`.
```

> [!knoten]- Was die Blöcke tun
> - **SetupWizard.SetupWizard.next.Z110**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 110 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 110.
> - **if Z.121 step === 2 && (!backupSettings // (schedule && !/…**: Zeile 121: prüft `step === 2 && (!backupSettings // (schedule && !/…`.
> - **return Z.123 return;**: Zeile 123: Rückgabe `return;`.
> - **if Z.125 step === 3 && ntfy.enabled && (!ntfy.server.trim(…**: Zeile 125: prüft `step === 3 && ntfy.enabled && (!ntfy.server.trim(…`.
> - **return Z.127 return;**: Zeile 127: Rückgabe `return;`.

- Der [[Glossar#Assistent|Assistent]] geht weiter bei das.
- `next` in `ui/src/components/SetupWizard.tsx`
