[[00 Start]] › [[Dashboard-HTTP]] › [[API-Setup]] › [[Dashboard.saveSettings]] › [[Dashboard.saveSettings.Teil1]]

# Dashboard.saveSettings.Teil1

```mermaid
flowchart TD
  n1["Dashboard.parseJsonObject"]:::internal-link
  n2["Dashboard.readBodyText"]:::internal-link
  n3["if Z.778 (!request.has('autoRestartEnabled') // !request.g…"]
  n4["throw Z.780 throw new IllegalArgumentException('autoRestartEn…"]
  n5["Dashboard.saveSettings.Teil1.Calls42317"]:::internal-link
  n6["Dashboard.saveSettings.Teil1.Calls42744"]:::internal-link
  n7["FabricLauncherPlugin.saveSettings"]:::internal-link
  n1 -->|"Z.777"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n5 -->|"weiter"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.parseJsonObject
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest die Antwort den Inhalt. Wertet aus `parseJsonObject`.
Dashboard.readBodyText
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den Text den Text. Liest `readBodyText`.
if Z.778 (!request.has('autoRestartEnabled') // !request.g…
  Zeile 778: prüft `(!request.has('autoRestartEnabled') // !request.g…`.
throw Z.780 throw new IllegalArgumentException('autoRestartEn…
  Zeile 780: Abbruch `throw new IllegalArgumentException('autoRestartEn…`.
Dashboard.saveSettings.Teil1.Calls42317
  Weitere [[Glossar#Funktion|Funktionen]], die ab [[Glossar#Zeile|Zeile]] 42317 aufgerufen werden. Weitere eigene Aufrufe ab Zeile 42317.
Dashboard.saveSettings.Teil1.Calls42744
  Weitere [[Glossar#Funktion|Funktionen]], die ab [[Glossar#Zeile|Zeile]] 42744 aufgerufen werden. Weitere eigene Aufrufe ab Zeile 42744.
FabricLauncherPlugin.saveSettings
  Das [[Glossar#Plugin|Plugin]] speichert die [[Glossar#Einstellungen|Einstellungen]]. Speichert `saveSettings`. Ruft `apply`, `saveConfigWritable`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.parseJsonObject**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest die Antwort den Inhalt. Wertet aus `parseJsonObject`.
> - **Dashboard.readBodyText**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den Text den Text. Liest `readBodyText`.
> - **if Z.778 (!request.has('autoRestartEnabled') // !request.g…**: Zeile 778: prüft `(!request.has('autoRestartEnabled') // !request.g…`.
> - **throw Z.780 throw new IllegalArgumentException('autoRestartEn…**: Zeile 780: Abbruch `throw new IllegalArgumentException('autoRestartEn…`.
> - **Dashboard.saveSettings.Teil1.Calls42317**: Weitere [[Glossar#Funktion|Funktionen]], die ab [[Glossar#Zeile|Zeile]] 42317 aufgerufen werden. Weitere eigene Aufrufe ab Zeile 42317.
> - **Dashboard.saveSettings.Teil1.Calls42744**: Weitere [[Glossar#Funktion|Funktionen]], die ab [[Glossar#Zeile|Zeile]] 42744 aufgerufen werden. Weitere eigene Aufrufe ab Zeile 42744.
> - **FabricLauncherPlugin.saveSettings**: Das [[Glossar#Plugin|Plugin]] speichert die [[Glossar#Einstellungen|Einstellungen]]. Speichert `saveSettings`. Ruft `apply`, `saveConfigWritable`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `Dashboard.saveSettings`.
