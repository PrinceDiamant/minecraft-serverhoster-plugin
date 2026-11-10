[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]] › [[RemoteBackupBridge.openFtps]]

# RemoteBackupBridge.openFtps

`RemoteBackupBridge.openFtps(Settings settings, String username, String password)` [src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java:207–223](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java#L207-L223)

```mermaid
flowchart TD
  n1["RemoteBackupBridge.configure"]:::internal-link
  n2["RemoteBackupBridge.openFtps.Z211"]:::internal-link
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridge.configure
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `configure` in `RemoteBackupBridge.java`.
RemoteBackupBridge.openFtps.Z211
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 211 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 211.
```

> [!knoten]- Was die Blöcke tun
> - **RemoteBackupBridge.configure**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `configure` in `RemoteBackupBridge.java`.
> - **RemoteBackupBridge.openFtps.Z211**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 211 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 211.

- Die Sicherung über das Netz öffnet hier einen Schritt. Eine Ebene tiefer steht er genauer.
- `openFtps` in `src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java`
