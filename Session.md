[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[Session]]

# Session

```mermaid
flowchart TD
  n1["RemoteBackupBridge.Session.close"]:::internal-link
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridge.Session.close
  Die Sicherung über das Netz schließt das. Schließt `close`. Ruft `replyError`.
```

> [!knoten]- Was die Blöcke tun
> - **RemoteBackupBridge.Session.close**: Die Sicherung über das Netz schließt das. Schließt `close`. Ruft `replyError`.

- Die Verbindung zu dem anderen Rechner, solange eine [[Glossar#Sicherungskopie|Sicherungskopie]] übertragen wird. Am Ende wird sie geschlossen.
