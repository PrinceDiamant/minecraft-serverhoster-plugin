[[00 Start]] › [[Dashboard-HTTP]]

# Dashboard-HTTP

```mermaid
flowchart TD
  n1["HTTP-Start"]:::internal-link
  n2["HTTP-Routing"]:::internal-link
  n3["HTTP-Auth"]:::internal-link
  n4["API-Zeit"]:::internal-link
  n5["API-Status"]:::internal-link
  n6["API-Setup"]:::internal-link
  n7["API-Backup"]:::internal-link
  n8["API-Spieler"]:::internal-link
  n9["API-Dateien"]:::internal-link
  n10["API-Antworten"]:::internal-link
  n11["HTTP-Klassen"]:::internal-link
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
HTTP-Start
  Öffnet diese Tür: Türnummer, [[Glossar#Verschlüsselung|Verschlüsselung]] und ein eigener [[Glossar#Thread|Thread]] für die Anfragen.
HTTP-Routing
  Sieht nach, welche Adresse der Browser aufgerufen hat, und gibt den Auftrag an den passenden Teil weiter.
HTTP-Auth
  [[Glossar#Anmeldung|Anmeldung]] an der [[Glossar#Bedienseite|Bedienseite]]. Das Passwort wird geprüft, danach gilt die Anmeldung zwölf Stunden.
API-Zeit
  Liefert und ändert Zeitpläne und die ältere Aufgabenliste.
API-Status
  Liefert der [[Glossar#Bedienseite|Bedienseite]] den Zustand, die [[Glossar#Konsole|Konsole]] und die [[Glossar#Diagnose|Diagnose]].
API-Setup
  Die [[Glossar#Einrichtung|Einrichtung]] über die [[Glossar#Bedienseite|Bedienseite]], inklusive Übernehmen einer älteren Anlage.
API-Backup
  Startet eine [[Glossar#Sicherungskopie|Sicherungskopie]], lädt sie herunter, löscht sie oder prüft das Ziel.
API-Spieler
  Liefert die [[Glossar#Spieler|Spieler]] und schickt einen [[Glossar#Befehl|Befehl]] zu einem Spieler.
API-Dateien
  Ordner ansehen, Datei lesen, schreiben, umbenennen oder löschen.
API-Antworten
  Wie eine Antwort an den Browser aussieht: Text, Zahlen oder eine Fehlermeldung.
HTTP-Klassen
  Die Helfer daneben: Passwort, [[Glossar#Verschlüsselung|Verschlüsselung]], Protokoll und [[Glossar#Absturzbericht|Absturzberichte]].
```

> [!knoten] Was die Blöcke tun
> - **HTTP-Start**: Öffnet diese Tür: Türnummer, [[Glossar#Verschlüsselung|Verschlüsselung]] und ein eigener [[Glossar#Thread|Thread]] für die Anfragen.
> - **HTTP-Routing**: Sieht nach, welche Adresse der Browser aufgerufen hat, und gibt den Auftrag an den passenden Teil weiter.
> - **HTTP-Auth**: [[Glossar#Anmeldung|Anmeldung]] an der [[Glossar#Bedienseite|Bedienseite]]. Das Passwort wird geprüft, danach gilt die Anmeldung zwölf Stunden.
> - **API-Zeit**: Liefert und ändert Zeitpläne und die ältere Aufgabenliste.
> - **API-Status**: Liefert der [[Glossar#Bedienseite|Bedienseite]] den Zustand, die [[Glossar#Konsole|Konsole]] und die [[Glossar#Diagnose|Diagnose]].
> - **API-Setup**: Die [[Glossar#Einrichtung|Einrichtung]] über die [[Glossar#Bedienseite|Bedienseite]], inklusive Übernehmen einer älteren Anlage.
> - **API-Backup**: Startet eine [[Glossar#Sicherungskopie|Sicherungskopie]], lädt sie herunter, löscht sie oder prüft das Ziel.
> - **API-Spieler**: Liefert die [[Glossar#Spieler|Spieler]] und schickt einen [[Glossar#Befehl|Befehl]] zu einem Spieler.
> - **API-Dateien**: Ordner ansehen, Datei lesen, schreiben, umbenennen oder löschen.
> - **API-Antworten**: Wie eine Antwort an den Browser aussieht: Text, Zahlen oder eine Fehlermeldung.
> - **HTTP-Klassen**: Die Helfer daneben: Passwort, [[Glossar#Verschlüsselung|Verschlüsselung]], Protokoll und [[Glossar#Absturzbericht|Absturzberichte]].

- Die Tür, über die der Browser mit dem [[Glossar#Plugin|Plugin]] spricht. Sie liefert die [[Glossar#Bedienseite|Bedienseite]] aus und nimmt Aufträge an.
