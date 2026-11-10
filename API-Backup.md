[[00 Start]] › [[Dashboard-HTTP]] › [[API-Backup]]

# API-Backup

```mermaid
flowchart TD
  n1["Dashboard.backupJson"]:::internal-link
  n2["Dashboard.backupDownload"]:::internal-link
  n3["Dashboard.backupMutate"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
```

```knoten
Dashboard.backupJson
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] sichert die Antwort.
Dashboard.backupDownload
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] sichert das Herunterladen. Auffällig: das kann sich anders verhalten, als man erwartet. Das nennt man [[Glossar#Unerwartetes Verhalten|Unerwartetes Verhalten]].
Dashboard.backupMutate
  Ändert eine vorhandene [[Glossar#Sicherungskopie|Sicherungskopie]], zum Beispiel löschen oder zurückholen.
```

> [!knoten] Was die Blöcke tun
> - **Dashboard.backupJson**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] sichert die Antwort.
> - **Dashboard.backupDownload**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] sichert das Herunterladen. Auffällig: das kann sich anders verhalten, als man erwartet. Das nennt man [[Glossar#Unerwartetes Verhalten|Unerwartetes Verhalten]].
> - **Dashboard.backupMutate**: Ändert eine vorhandene [[Glossar#Sicherungskopie|Sicherungskopie]], zum Beispiel löschen oder zurückholen.

- Startet eine [[Glossar#Sicherungskopie|Sicherungskopie]], lädt sie herunter, löscht sie oder prüft das Ziel.
