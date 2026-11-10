[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2449]]

# FabricLauncherPlugin.onCommand.Z2401.Case2449

```mermaid
flowchart TD
  n1["try Z.2450"]
  n2["FabricLauncherPlugin.jarText"]:::internal-link
  n3["catch Z.2451 (IOException e)"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.2450
  Zeile 2450: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.jarText
  Zeigt Einzelheiten aus der [[Glossar#Programmdatei|Programmdatei]]. Betrifft das Jar `jarText`. Ruft `text`, `inspect`, `profile`.
catch Z.2451 (IOException e)
  Zeile 2451: fängt (IOException e).
```

> [!knoten]- Was die Blöcke tun
> - **try Z.2450**: Zeile 2450: Versuch. Der Fehlerpfad geht in catch.
> - **FabricLauncherPlugin.jarText**: Zeigt Einzelheiten aus der [[Glossar#Programmdatei|Programmdatei]]. Betrifft das Jar `jarText`. Ruft `text`, `inspect`, `profile`.
> - **catch Z.2451 (IOException e)**: Zeile 2451: fängt (IOException e).

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 2449.
- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401`.
