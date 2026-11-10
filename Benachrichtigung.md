[[00 Start]] › [[Plugin-Kern]] › [[Benachrichtigung]]

# Benachrichtigung

```mermaid
flowchart TD
  n1["NtfyNotifier"]:::internal-link
  n2["FabricLauncherPlugin.ntfySettings"]:::internal-link
  n3["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n3 -->|"Zeile 210"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
NtfyNotifier
  Schickt die Nachricht an den Mitteilungsdienst.
FabricLauncherPlugin.ntfySettings
  Liest die [[Glossar#Einstellungen|Einstellungen]] für den Mitteilungsdienst.
FabricLauncherPlugin.notifyNtfy
  Das [[Glossar#Plugin|Plugin]] meldet den Mitteilungsdienst.
```

> [!knoten] Was die Blöcke tun
> - **NtfyNotifier**: Schickt die Nachricht an den Mitteilungsdienst.
> - **FabricLauncherPlugin.ntfySettings**: Liest die [[Glossar#Einstellungen|Einstellungen]] für den Mitteilungsdienst.
> - **FabricLauncherPlugin.notifyNtfy**: Das [[Glossar#Plugin|Plugin]] meldet den Mitteilungsdienst.

- Schickt eine kurze Nachricht an einen externen Mitteilungsdienst, wenn etwas passiert.
