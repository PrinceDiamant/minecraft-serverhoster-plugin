[[00 Start]] › [[Server-Anlage]]

# Server-Anlage

```mermaid
flowchart TD
  n1["Versionen"]:::internal-link
  n2["Profile"]:::internal-link
  n3["Startplan"]:::internal-link
  n4["Setup-Suche"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Versionen
  Welche [[Glossar#Version|Versionen]] es gibt und welche das [[Glossar#Plugin|Plugin]] als stabil nimmt.
Profile
  Die Beschreibung eines Servers: Name, [[Glossar#Version|Version]], Ordner, Speicher.
Startplan
  Was zum Starten gebraucht wird: Eigenschaften, ein geprüfter Ordner, die Argumente, die [[Glossar#Programmdatei|Programmdatei]].
Setup-Suche
  Sucht auf der Festplatte nach einer schon vorhandenen Anlage und kann sie wieder benutzbar machen.
```

> [!knoten] Was die Blöcke tun
> - **Versionen**: Welche [[Glossar#Version|Versionen]] es gibt und welche das [[Glossar#Plugin|Plugin]] als stabil nimmt.
> - **Profile**: Die Beschreibung eines Servers: Name, [[Glossar#Version|Version]], Ordner, Speicher.
> - **Startplan**: Was zum Starten gebraucht wird: Eigenschaften, ein geprüfter Ordner, die Argumente, die [[Glossar#Programmdatei|Programmdatei]].
> - **Setup-Suche**: Sucht auf der Festplatte nach einer schon vorhandenen Anlage und kann sie wieder benutzbar machen.

- Alles vor dem ersten Start: [[Glossar#Version|Version]], die Beschreibung des Servers und der [[Glossar#Startplan|Startplan]]. Die [[Glossar#Einstellungsdatei|Einstellungsdatei]] kann mehrere Server nennen, benutzt wird der erste.
