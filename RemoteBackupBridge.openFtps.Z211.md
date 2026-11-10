[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]] › [[RemoteBackupBridge.openFtps]] › [[RemoteBackupBridge.openFtps.Z211]]

# RemoteBackupBridge.openFtps.Z211

```mermaid
flowchart TD
  n1["try Z.211"]
  n2["RemoteBackupBridge.openFtps.Z211.Teil1"]:::internal-link
  n3["RemoteBackupBridge.openFtps.Z211.Teil2"]:::internal-link
  n4["catch Z.219 (IOException / RuntimeExcepti…"]
  n5["RemoteBackupBridge.disconnectAfterFailure"]:::internal-link
  n6["throw Z.221 throw e;"]
  n2 -->|"weiter"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n5 --> n6
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.211
  Zeile 211: Versuch. Der Fehlerpfad geht in catch.
RemoteBackupBridge.openFtps.Z211.Teil1
  Ein weiterer Abschnitt derselben Übersicht. Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
RemoteBackupBridge.openFtps.Z211.Teil2
  Ein weiterer Abschnitt derselben Übersicht. Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
catch Z.219 (IOException / RuntimeExcepti…
  Zeile 219: fängt (IOException / RuntimeExcepti….
RemoteBackupBridge.disconnectAfterFailure
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Trennt `disconnectAfterFailure`. Ruft `disconnect`.
throw Z.221 throw e;
  Zeile 221: Abbruch `throw e;`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.211**: Zeile 211: Versuch. Der Fehlerpfad geht in catch.
> - **RemoteBackupBridge.openFtps.Z211.Teil1**: Ein weiterer Abschnitt derselben Übersicht. Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
> - **RemoteBackupBridge.openFtps.Z211.Teil2**: Ein weiterer Abschnitt derselben Übersicht. Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
> - **catch Z.219 (IOException / RuntimeExcepti…**: Zeile 219: fängt (IOException / RuntimeExcepti….
> - **RemoteBackupBridge.disconnectAfterFailure**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Trennt `disconnectAfterFailure`. Ruft `disconnect`.
> - **throw Z.221 throw e;**: Zeile 221: Abbruch `throw e;`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 211 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `RemoteBackupBridge.openFtps`.
