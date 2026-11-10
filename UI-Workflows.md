[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]]

# UI-Workflows

```mermaid
flowchart TD
  n1["BackupSettings"]:::internal-link
  n2["BackupWorkflow"]:::internal-link
  n3["PlayerWorkflow"]:::internal-link
  n4["SettingsWorkflow"]:::internal-link
  n5["SetupWizard"]:::internal-link
  n6["SetupWorkflow"]:::internal-link
  n7["TaskWorkflow"]:::internal-link
  n8["VersionSelect"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  n5 -->|"Kapitel im Text"| n6
  n6 -->|"Kapitel im Text"| n7
  n7 -->|"Kapitel im Text"| n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupSettings
  Die [[Glossar#Einstellungen|Einstellungen]], die für jede [[Glossar#Sicherungskopie|Sicherungskopie]] gelten.
BackupWorkflow
  Der Ablauf in der [[Glossar#Bedienseite|Bedienseite]] für eine [[Glossar#Sicherungskopie|Sicherungskopie]]: anstoßen, Ziel prüfen, herunterladen.
PlayerWorkflow
  Der Ablauf in der [[Glossar#Bedienseite|Bedienseite]], mit dem man etwas für einen [[Glossar#Spieler|Spieler]] tut.
SettingsWorkflow
  Der Ablauf in der [[Glossar#Bedienseite|Bedienseite]], in dem man [[Glossar#Einstellungen|Einstellungen]] ändert.
SetupWizard
  Der [[Glossar#Assistent|Assistent]] in der [[Glossar#Bedienseite|Bedienseite]], der durch die [[Glossar#Einrichtung|Einrichtung]] führt.
SetupWorkflow
  Die Einrichtungsseite in der [[Glossar#Bedienseite|Bedienseite]].
TaskWorkflow
  Der Ablauf in der [[Glossar#Bedienseite|Bedienseite]] für Zeitpläne und die ältere Aufgabenliste.
VersionSelect
  Die Auswahl der [[Glossar#Version|Version]] in der [[Glossar#Bedienseite|Bedienseite]].
```

> [!knoten] Was die Blöcke tun
> - **BackupSettings**: Die [[Glossar#Einstellungen|Einstellungen]], die für jede [[Glossar#Sicherungskopie|Sicherungskopie]] gelten.
> - **BackupWorkflow**: Der Ablauf in der [[Glossar#Bedienseite|Bedienseite]] für eine [[Glossar#Sicherungskopie|Sicherungskopie]]: anstoßen, Ziel prüfen, herunterladen.
> - **PlayerWorkflow**: Der Ablauf in der [[Glossar#Bedienseite|Bedienseite]], mit dem man etwas für einen [[Glossar#Spieler|Spieler]] tut.
> - **SettingsWorkflow**: Der Ablauf in der [[Glossar#Bedienseite|Bedienseite]], in dem man [[Glossar#Einstellungen|Einstellungen]] ändert.
> - **SetupWizard**: Der [[Glossar#Assistent|Assistent]] in der [[Glossar#Bedienseite|Bedienseite]], der durch die [[Glossar#Einrichtung|Einrichtung]] führt.
> - **SetupWorkflow**: Die Einrichtungsseite in der [[Glossar#Bedienseite|Bedienseite]].
> - **TaskWorkflow**: Der Ablauf in der [[Glossar#Bedienseite|Bedienseite]] für Zeitpläne und die ältere Aufgabenliste.
> - **VersionSelect**: Die Auswahl der [[Glossar#Version|Version]] in der [[Glossar#Bedienseite|Bedienseite]].

- Die einzelnen Abläufe der [[Glossar#Bedienseite|Bedienseite]]: [[Glossar#Spieler|Spieler]], [[Glossar#Sicherungskopie|Sicherungskopie]], [[Glossar#Aufgabe|Aufgaben]], [[Glossar#Einstellungen|Einstellungen]], [[Glossar#Version|Version]] und [[Glossar#Einrichtung|Einrichtung]].
