[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]]

# RemoteBackupBridge

```mermaid
flowchart TD
  n1["Session"]:::internal-link
  n2["CountingOutputStream"]:::internal-link
  n3["RemoteBackupBridge.Teil1"]:::internal-link
  n4["RemoteBackupBridge.Teil2"]:::internal-link
  n5["RemoteBackupBridge.Teil3"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Session
  Die Verbindung zu dem anderen Rechner, solange eine [[Glossar#Sicherungskopie|Sicherungskopie]] übertragen wird. Am Ende wird sie geschlossen.
CountingOutputStream
  Zählt mit, wie viel gerade in die [[Glossar#Sicherungskopie|Sicherungskopie]] geschrieben wurde.
RemoteBackupBridge.Teil1
  Ein weiterer Abschnitt derselben Übersicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `Teil1`.
RemoteBackupBridge.Teil2
  Ein weiterer Abschnitt derselben Übersicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `Teil2`.
RemoteBackupBridge.Teil3
  Ein weiterer Abschnitt derselben Übersicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `Teil3`.
```

> [!knoten]- Was die Blöcke tun
> - **Session**: Die Verbindung zu dem anderen Rechner, solange eine [[Glossar#Sicherungskopie|Sicherungskopie]] übertragen wird. Am Ende wird sie geschlossen.
> - **CountingOutputStream**: Zählt mit, wie viel gerade in die [[Glossar#Sicherungskopie|Sicherungskopie]] geschrieben wurde.
> - **RemoteBackupBridge.Teil1**: Ein weiterer Abschnitt derselben Übersicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `Teil1`.
> - **RemoteBackupBridge.Teil2**: Ein weiterer Abschnitt derselben Übersicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `Teil2`.
> - **RemoteBackupBridge.Teil3**: Ein weiterer Abschnitt derselben Übersicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `Teil3`.

- Schickt die [[Glossar#Sicherungskopie|Sicherungskopie]] über das Netz auf einen anderen Rechner und holt sie von dort zurück.
