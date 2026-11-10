[[00 Start]] › [[Tests]] › [[RemoteBackupBridgeTest]] › [[RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload]] › [[RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload.Z37.Teil2]]

# RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload.Z37.Teil2

```mermaid
flowchart TD
  n1["try Z.51"]
  n2["RemoteBackupBridge.download"]:::internal-link
  n3["Schritt Z.54 byte() archive = Files.readAllBytes(downloaded);"]
  n4["try Z.55"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.51
  Zeile 51: Versuch. Der Fehlerpfad geht in catch.
RemoteBackupBridge.download
  Die Sicherung über das Netz holt das. Liefert zum Herunterladen `download`. Ruft `safeId`, `named`, `connect`.
Schritt Z.54 byte() archive = Files.readAllBytes(downloaded);
  Zeile 54: Dateioperation. `byte() archive = Files.readAllBytes(downloaded);`
try Z.55
  Zeile 55: Versuch. Der Fehlerpfad geht in catch.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.51**: Zeile 51: Versuch. Der Fehlerpfad geht in catch.
> - **RemoteBackupBridge.download**: Die Sicherung über das Netz holt das. Liefert zum Herunterladen `download`. Ruft `safeId`, `named`, `connect`.
> - **Schritt Z.54 byte() archive = Files.readAllBytes(downloaded);**: Zeile 54: Dateioperation. `byte() archive = Files.readAllBytes(downloaded);`
> - **try Z.55**: Zeile 55: Versuch. Der Fehlerpfad geht in catch.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload.Z37`.
