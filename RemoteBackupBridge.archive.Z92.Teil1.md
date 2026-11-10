[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil1]] › [[RemoteBackupBridge.archive]] › [[RemoteBackupBridge.archive.Z92.Teil1]]

# RemoteBackupBridge.archive.Z92.Teil1

```mermaid
flowchart TD
  n1["RemoteBackupBridge.enterDirectory"]:::internal-link
  n2["RemoteBackupBridge.archive.Z92.Teil1.Z99"]:::internal-link
  n3["RemoteBackupBridge.CountingOutputStream.count"]:::internal-link
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridge.enterDirectory
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Wechselt hinein `enterDirectory`. Ruft `enterBaseDirectory`, `replyError`.
RemoteBackupBridge.archive.Z92.Teil1.Z99
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 99 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 99.
RemoteBackupBridge.CountingOutputStream.count
  Die Sicherung über das Netz zählt das. Zählt `count`.
```

> [!knoten]- Was die Blöcke tun
> - **RemoteBackupBridge.enterDirectory**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Wechselt hinein `enterDirectory`. Ruft `enterBaseDirectory`, `replyError`.
> - **RemoteBackupBridge.archive.Z92.Teil1.Z99**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 99 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 99.
> - **RemoteBackupBridge.CountingOutputStream.count**: Die Sicherung über das Netz zählt das. Zählt `count`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `RemoteBackupBridge.archive.Z92`.
