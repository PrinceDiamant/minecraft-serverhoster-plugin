[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]]

# HTTP-Klassen

```mermaid
flowchart TD
  n1["CrashIndex"]:::internal-link
  n2["LogQuery"]:::internal-link
  n3["DashboardPassword"]:::internal-link
  n4["HttpsSupport"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
CrashIndex
  Sucht [[Glossar#Absturzbericht|Absturzberichte]] und liefert ihren Text.
LogQuery
  Sucht [[Glossar#Zeile|Zeilen]] im Protokoll, die zu einer Frage passen.
DashboardPassword
  Prüft das Passwort der [[Glossar#Bedienseite|Bedienseite]] und merkt sich die [[Glossar#Anmeldung|Anmeldung]].
HttpsSupport
  Baut die [[Glossar#Verschlüsselung|Verschlüsselung]] für die Verbindung zur [[Glossar#Bedienseite|Bedienseite]], wenn sie eingeschaltet ist.
```

> [!knoten] Was die Blöcke tun
> - **CrashIndex**: Sucht [[Glossar#Absturzbericht|Absturzberichte]] und liefert ihren Text.
> - **LogQuery**: Sucht [[Glossar#Zeile|Zeilen]] im Protokoll, die zu einer Frage passen.
> - **DashboardPassword**: Prüft das Passwort der [[Glossar#Bedienseite|Bedienseite]] und merkt sich die [[Glossar#Anmeldung|Anmeldung]].
> - **HttpsSupport**: Baut die [[Glossar#Verschlüsselung|Verschlüsselung]] für die Verbindung zur [[Glossar#Bedienseite|Bedienseite]], wenn sie eingeschaltet ist.

- Die Helfer daneben: Passwort, [[Glossar#Verschlüsselung|Verschlüsselung]], Protokoll und [[Glossar#Absturzbericht|Absturzberichte]].
