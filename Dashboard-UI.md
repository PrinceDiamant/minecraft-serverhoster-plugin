[[00 Start]] › [[Dashboard-UI]]

# Dashboard-UI

```mermaid
flowchart TD
  n1["UI-Start"]:::internal-link
  n2["UI-App"]:::internal-link
  n3["UI-Client"]:::internal-link
  n4["Legacy-Sitzung"]:::internal-link
  n5["Legacy-Status"]:::internal-link
  n6["Legacy-Konsole"]:::internal-link
  n7["Legacy-Altlast"]:::internal-link
  n8["Legacy-Dateien"]:::internal-link
  n9["Legacy-Logs"]:::internal-link
  n10["Legacy-Diag"]:::internal-link
  n11["UI-Workflows"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  n5 -->|"Kapitel im Text"| n6
  n6 -->|"Kapitel im Text"| n7
  n7 -->|"Kapitel im Text"| n8
  n8 -->|"Kapitel im Text"| n9
  n9 -->|"Kapitel im Text"| n10
  n10 -->|"Kapitel im Text"| n11
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
UI-Start
  Der Einstieg der neueren [[Glossar#Bedienseite|Bedienseite]]. Er hängt die Seite in den Browser ein. Eine eigene [[Glossar#Funktion|Funktion]] hat dieser Einstieg nicht.
UI-App
  Die neuere [[Glossar#Bedienseite|Bedienseite]]. Sie übernimmt die ältere Seite, schneidet alte Bereiche heraus und hängt die neuen Abläufe ein.
UI-Client
  Der Teil der [[Glossar#Bedienseite|Bedienseite]], der Aufträge an das [[Glossar#Plugin|Plugin]] schickt und Dateien bearbeitet.
Legacy-Sitzung
  [[Glossar#Anmeldung|Anmeldung]] und Abmeldung in der älteren [[Glossar#Bedienseite|Bedienseite]].
Legacy-Status
  Die ältere [[Glossar#Bedienseite|Bedienseite]] fragt alle drei Sekunden nach, wie es dem [[Glossar#Spielserver|Spielserver]] geht.
Legacy-Konsole
  [[Glossar#Konsole|Konsole]] und Befehlszeile in der älteren [[Glossar#Bedienseite|Bedienseite]].
Legacy-Altlast
  Bereiche der älteren [[Glossar#Bedienseite|Bedienseite]], die die neuere Seite aus dem laufenden Text herausschneidet. Sie bleiben in der Datei, laufen aber nicht mit.
Legacy-Dateien
  Der Datei-Browser in der älteren [[Glossar#Bedienseite|Bedienseite]].
Legacy-Logs
  Die Protokollansicht in der älteren [[Glossar#Bedienseite|Bedienseite]].
Legacy-Diag
  Die Diagnosekarten in der älteren [[Glossar#Bedienseite|Bedienseite]].
UI-Workflows
  Die einzelnen Abläufe der [[Glossar#Bedienseite|Bedienseite]]: [[Glossar#Spieler|Spieler]], [[Glossar#Sicherungskopie|Sicherungskopie]], [[Glossar#Aufgabe|Aufgaben]], [[Glossar#Einstellungen|Einstellungen]], [[Glossar#Version|Version]] und [[Glossar#Einrichtung|Einrichtung]].
```

> [!knoten] Was die Blöcke tun
> - **UI-Start**: Der Einstieg der neueren [[Glossar#Bedienseite|Bedienseite]]. Er hängt die Seite in den Browser ein. Eine eigene [[Glossar#Funktion|Funktion]] hat dieser Einstieg nicht.
> - **UI-App**: Die neuere [[Glossar#Bedienseite|Bedienseite]]. Sie übernimmt die ältere Seite, schneidet alte Bereiche heraus und hängt die neuen Abläufe ein.
> - **UI-Client**: Der Teil der [[Glossar#Bedienseite|Bedienseite]], der Aufträge an das [[Glossar#Plugin|Plugin]] schickt und Dateien bearbeitet.
> - **Legacy-Sitzung**: [[Glossar#Anmeldung|Anmeldung]] und Abmeldung in der älteren [[Glossar#Bedienseite|Bedienseite]].
> - **Legacy-Status**: Die ältere [[Glossar#Bedienseite|Bedienseite]] fragt alle drei Sekunden nach, wie es dem [[Glossar#Spielserver|Spielserver]] geht.
> - **Legacy-Konsole**: [[Glossar#Konsole|Konsole]] und Befehlszeile in der älteren [[Glossar#Bedienseite|Bedienseite]].
> - **Legacy-Altlast**: Bereiche der älteren [[Glossar#Bedienseite|Bedienseite]], die die neuere Seite aus dem laufenden Text herausschneidet. Sie bleiben in der Datei, laufen aber nicht mit.
> - **Legacy-Dateien**: Der Datei-Browser in der älteren [[Glossar#Bedienseite|Bedienseite]].
> - **Legacy-Logs**: Die Protokollansicht in der älteren [[Glossar#Bedienseite|Bedienseite]].
> - **Legacy-Diag**: Die Diagnosekarten in der älteren [[Glossar#Bedienseite|Bedienseite]].
> - **UI-Workflows**: Die einzelnen Abläufe der [[Glossar#Bedienseite|Bedienseite]]: [[Glossar#Spieler|Spieler]], [[Glossar#Sicherungskopie|Sicherungskopie]], [[Glossar#Aufgabe|Aufgaben]], [[Glossar#Einstellungen|Einstellungen]], [[Glossar#Version|Version]] und [[Glossar#Einrichtung|Einrichtung]].

- Die [[Glossar#Bedienseite|Bedienseite]], die man im Browser sieht. Dieselbe Seite ist zweimal gebaut, einmal älter und einmal neuer. Das nennt man [[Glossar#Doppelt gebaut|Doppelt gebaut]].
- Auffällig: derselbe Teil ist zweimal vorhanden. Das nennt man [[Glossar#Doppelt gebaut|Doppelt gebaut]].
