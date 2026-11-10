[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil1]] › [[BackupBridge.restoreZip]] › [[BackupBridge.restoreZip.Z84]]

# BackupBridge.restoreZip.Z84

```mermaid
flowchart TD
  n1["try Z.84"]
  n2["if Z.85 (z.size() ) MAX_RESTORE_FILES)"]
  n3["throw Z.85 throw new IOException('zip too large');"]
  n4["BackupBridge.restoreZip.Z84.Z87"]:::internal-link
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.84
  Zeile 84: Versuch. Der Fehlerpfad geht in catch.
if Z.85 (z.size() ) MAX_RESTORE_FILES)
  Zeile 85: prüft `(z.size() ) MAX_RESTORE_FILES)`.
throw Z.85 throw new IOException('zip too large');
  Zeile 85: Abbruch `throw new IOException('zip too large');`.
BackupBridge.restoreZip.Z84.Z87
  Fortsetzung des Ablaufs ab Zeile 87.
```

- Fortsetzung von `BackupBridge.restoreZip`, Quellreihenfolge.
