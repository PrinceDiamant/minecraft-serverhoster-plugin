[[00 Start]] › [[Tests]] › [[RemoteBackupBridgeTest]] › [[RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload]]

# RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload

`RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload()` [src/test/java/de/aichele/childlauncher/RemoteBackupBridgeTest.java:30–70](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/test/java/de/aichele/childlauncher/RemoteBackupBridgeTest.java#L30-L70)

```mermaid
flowchart TD
  n1["Schritt Z.31 Files.createDirectories(work.resolve('world'));"]
  n2["Schritt Z.32 Files.writeString(work.resolve('world').resolve('…"]
  n3["Schritt Z.33 Files.writeString(work.resolve('world').resolve('…"]
  n4["RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload.Z37"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.31 Files.createDirectories(work.resolve('world'));
  Zeile 31: Dateioperation. `Files.createDirectories(work.resolve('world'));`
Schritt Z.32 Files.writeString(work.resolve('world').resolve('…
  Zeile 32: schreibt Text in eine Datei. `Files.writeString(work.resolve('world').resolve('…`
Schritt Z.33 Files.writeString(work.resolve('world').resolve('…
  Zeile 33: schreibt Text in eine Datei. `Files.writeString(work.resolve('world').resolve('…`
RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload.Z37
  Fortsetzung des Ablaufs ab Zeile 37.
```

- `autoModeStreamsFtpBackupAndFinalizesPartialUpload` in `src/test/java/de/aichele/childlauncher/RemoteBackupBridgeTest.java`
- Auslöser: Test
