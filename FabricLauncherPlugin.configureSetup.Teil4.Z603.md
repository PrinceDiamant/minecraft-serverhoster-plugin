[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.configureSetup]] › [[FabricLauncherPlugin.configureSetup.Teil4.Z603]]

# FabricLauncherPlugin.configureSetup.Teil4.Z603

```mermaid
flowchart TD
  n1["if Z.603 (pendingDelete != null)"]
  n2["try Z.604"]
  n3["FabricLauncherPlugin.cleanupLegacyDirectory"]:::internal-link
  n4["catch Z.606 (IOException e)"]
  n2 --> n3
  n2 -->|"Fehler"| n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.603 (pendingDelete != null)
  Zeile 603: prüft `(pendingDelete != null)`.
try Z.604
  Zeile 604: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.cleanupLegacyDirectory
  Das [[Glossar#Plugin|Plugin]] räumt auf den alten Weg. Räumt auf `cleanupLegacyDirectory`. Ruft `preVisitDirectory`, `visitFile`, `postVisitDirectory`.
catch Z.606 (IOException e)
  Zeile 606: fängt (IOException e).
```

> [!knoten]- Was die Blöcke tun
> - **if Z.603 (pendingDelete != null)**: Zeile 603: prüft `(pendingDelete != null)`.
> - **try Z.604**: Zeile 604: Versuch. Der Fehlerpfad geht in catch.
> - **FabricLauncherPlugin.cleanupLegacyDirectory**: Das [[Glossar#Plugin|Plugin]] räumt auf den alten Weg. Räumt auf `cleanupLegacyDirectory`. Ruft `preVisitDirectory`, `visitFile`, `postVisitDirectory`.
> - **catch Z.606 (IOException e)**: Zeile 606: fängt (IOException e).

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 603 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.configureSetup.Teil4`.
