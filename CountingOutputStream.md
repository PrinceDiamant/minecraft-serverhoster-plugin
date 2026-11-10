[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[CountingOutputStream]]

# CountingOutputStream

```mermaid
flowchart TD
  n1["RemoteBackupBridge.CountingOutputStream.CountingOutputStream"]:::internal-link
  n2["RemoteBackupBridge.CountingOutputStream.write(int)"]:::internal-link
  n3["RemoteBackupBridge.CountingOutputStream.write(byteArray,int,int)"]:::internal-link
  n4["RemoteBackupBridge.CountingOutputStream.count"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridge.CountingOutputStream.CountingOutputStream
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `CountingOutputStream` in `RemoteBackupBridge.java`.
RemoteBackupBridge.CountingOutputStream.write(int)
  Die Sicherung über das Netz schreibt das. Schreibt `write`.
RemoteBackupBridge.CountingOutputStream.write(byteArray,int,int)
  Die Sicherung über das Netz schreibt das. Schreibt `write`.
RemoteBackupBridge.CountingOutputStream.count
  Die Sicherung über das Netz zählt das. Zählt `count`.
```

> [!knoten]- Was die Blöcke tun
> - **RemoteBackupBridge.CountingOutputStream.CountingOutputStream**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `CountingOutputStream` in `RemoteBackupBridge.java`.
> - **RemoteBackupBridge.CountingOutputStream.write(int)**: Die Sicherung über das Netz schreibt das. Schreibt `write`.
> - **RemoteBackupBridge.CountingOutputStream.write(byteArray,int,int)**: Die Sicherung über das Netz schreibt das. Schreibt `write`.
> - **RemoteBackupBridge.CountingOutputStream.count**: Die Sicherung über das Netz zählt das. Zählt `count`.

- Zählt mit, wie viel gerade in die [[Glossar#Sicherungskopie|Sicherungskopie]] geschrieben wurde.
