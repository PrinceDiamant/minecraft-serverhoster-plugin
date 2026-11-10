[[00 Start]] › [[Server-Anlage]] › [[Profile]]

# Profile

```mermaid
flowchart TD
  n1["ServerProfile"]:::internal-link
  n2["Profiles"]:::internal-link
  n3["ProfileMerge"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ServerProfile
  Baut diese Beschreibung aus den [[Glossar#Einstellungen|Einstellungen]]. Fehlt die Art des Servers, nimmt der [[Glossar#Quelltext|Quelltext]] fabric an, die ausgelieferte Datei sagt vanilla.
Profiles
  Liest alle Server aus den [[Glossar#Einstellungen|Einstellungen]], inklusive [[Glossar#Fokus|Fokus]] und belegter Türnummern. Der laufende Weg behält davon nur den ersten.
ProfileMerge
  Mischt Werte aus den [[Glossar#Einstellungen|Einstellungen]] und aus einer Datei zu einer Beschreibung zusammen.
```

> [!knoten] Was die Blöcke tun
> - **ServerProfile**: Baut diese Beschreibung aus den [[Glossar#Einstellungen|Einstellungen]]. Fehlt die Art des Servers, nimmt der [[Glossar#Quelltext|Quelltext]] fabric an, die ausgelieferte Datei sagt vanilla.
> - **Profiles**: Liest alle Server aus den [[Glossar#Einstellungen|Einstellungen]], inklusive [[Glossar#Fokus|Fokus]] und belegter Türnummern. Der laufende Weg behält davon nur den ersten.
> - **ProfileMerge**: Mischt Werte aus den [[Glossar#Einstellungen|Einstellungen]] und aus einer Datei zu einer Beschreibung zusammen.

- Die Beschreibung eines Servers: Name, [[Glossar#Version|Version]], Ordner, Speicher.
