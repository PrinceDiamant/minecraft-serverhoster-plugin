[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[Session]] › [[RemoteBackupBridge.Session.close]] › [[RemoteBackupBridge.Session.close.Teil2]]

# RemoteBackupBridge.Session.close.Teil2

```mermaid
flowchart TD
  n1["try Z.43"]
  n2["catch Z.44 (IOException e)"]
  n3["if Z.45 (failure == null)"]
  n4["if Z.48 (failure != null)"]
  n5["throw Z.48 throw failure;"]
  n1 -->|"Fehler"| n2
  n2 --> n3
  n4 -->|"ja"| n5
  n1 --> n4
  n3 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.43
  Zeile 43: Versuch. Der Fehlerpfad geht in catch.
catch Z.44 (IOException e)
  Zeile 44: fängt (IOException e).
if Z.45 (failure == null)
  Zeile 45: prüft `(failure == null)`.
if Z.48 (failure != null)
  Zeile 48: prüft `(failure != null)`.
throw Z.48 throw failure;
  Zeile 48: Abbruch `throw failure;`.
```

- Fortsetzung von `RemoteBackupBridge.Session.close`, Quellreihenfolge.
