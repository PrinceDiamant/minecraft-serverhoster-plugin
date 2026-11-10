[[00 Start]] › [[Server-Anlage]] › [[Profile]] › [[Profiles]]

# Profiles

```mermaid
flowchart TD
  n1["Profiles.Profiles"]:::internal-link
  n2["Profiles.load"]:::internal-link
  n3["Profiles.portClash"]:::internal-link
  n4["Profiles.focus"]:::internal-link
  n5["Profiles.serverIds"]:::internal-link
  n6["Profiles.one"]:::internal-link
  n7["Profiles.copyId"]:::internal-link
  n8["Profiles.props"]:::internal-link
  n9["Profiles.str"]:::internal-link
  n10["Profiles.num"]:::internal-link
  n11["Profiles.bool"]:::internal-link
  n12["Profiles.list"]:::internal-link
  n2 -->|"Z.67"| n6
  n2 -->|"Z.68"| n9
  n2 -->|"Z.69"| n7
  n2 -->|"Z.72"| n5
  n4 -->|"Z.86"| n9
  n6 -->|"Z.103"| n9
  n6 -->|"Z.105"| n10
  n6 -->|"Z.113"| n12
  n6 -->|"Z.119"| n11
  n6 -->|"Z.121"| n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
  style n3 fill:#f88,stroke:#900
  style n4 fill:#f88,stroke:#900
  style n6 fill:#f88,stroke:#900
```

```knoten
Profiles.Profiles
  Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `Profiles`.
Profiles.load
  Die Serverbeschreibung lädt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `load`. Auffällig: es ist vorgesehen, der laufende Weg benutzt es aber nicht. Das nennt man [[Glossar#Nicht benutzt|Nicht benutzt]].
Profiles.portClash
  Würde merken, wenn zwei Server dieselbe Türnummer hätten. Der laufende Weg benutzt das nicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `portClash`. Auffällig: es ist vorgesehen, der laufende Weg benutzt es aber nicht. Das nennt man [[Glossar#Nicht benutzt|Nicht benutzt]].
Profiles.focus
  Würde den gemeinten Server aus den [[Glossar#Einstellungen|Einstellungen]] lesen. Der laufende Weg benutzt das nicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `focus`. Auffällig: es ist vorgesehen, der laufende Weg benutzt es aber nicht. Das nennt man [[Glossar#Nicht benutzt|Nicht benutzt]].
Profiles.serverIds
  Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `serverIds`.
Profiles.one
  Baut die Beschreibung eines Servers. Fehlt die Art, nimmt der [[Glossar#Quelltext|Quelltext]] fabric, die ausgelieferte [[Glossar#Einstellungsdatei|Einstellungsdatei]] sagt vanilla. Im Quelltext heißt das `one`. Auffällig: das kann sich anders verhalten, als man erwartet. Das nennt man [[Glossar#Unerwartetes Verhalten|Unerwartetes Verhalten]].
Profiles.copyId
  Die Serverbeschreibung kopiert die Kennung. Im [[Glossar#Quelltext|Quelltext]] heißt das `copyId`.
Profiles.props
  Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `props`.
Profiles.str
  Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `str`.
Profiles.num
  Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `num`.
Profiles.bool
  Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `bool`.
Profiles.list
  Die Serverbeschreibung zeigt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `list`.
```

> [!knoten]- Was die Blöcke tun
> - **Profiles.Profiles**: Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `Profiles`.
> - **Profiles.load**: Die Serverbeschreibung lädt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `load`. Auffällig: es ist vorgesehen, der laufende Weg benutzt es aber nicht. Das nennt man [[Glossar#Nicht benutzt|Nicht benutzt]].
> - **Profiles.portClash**: Würde merken, wenn zwei Server dieselbe Türnummer hätten. Der laufende Weg benutzt das nicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `portClash`. Auffällig: es ist vorgesehen, der laufende Weg benutzt es aber nicht. Das nennt man [[Glossar#Nicht benutzt|Nicht benutzt]].
> - **Profiles.focus**: Würde den gemeinten Server aus den [[Glossar#Einstellungen|Einstellungen]] lesen. Der laufende Weg benutzt das nicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `focus`. Auffällig: es ist vorgesehen, der laufende Weg benutzt es aber nicht. Das nennt man [[Glossar#Nicht benutzt|Nicht benutzt]].
> - **Profiles.serverIds**: Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `serverIds`.
> - **Profiles.one**: Baut die Beschreibung eines Servers. Fehlt die Art, nimmt der [[Glossar#Quelltext|Quelltext]] fabric, die ausgelieferte [[Glossar#Einstellungsdatei|Einstellungsdatei]] sagt vanilla. Im Quelltext heißt das `one`. Auffällig: das kann sich anders verhalten, als man erwartet. Das nennt man [[Glossar#Unerwartetes Verhalten|Unerwartetes Verhalten]].
> - **Profiles.copyId**: Die Serverbeschreibung kopiert die Kennung. Im [[Glossar#Quelltext|Quelltext]] heißt das `copyId`.
> - **Profiles.props**: Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `props`.
> - **Profiles.str**: Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `str`.
> - **Profiles.num**: Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `num`.
> - **Profiles.bool**: Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `bool`.
> - **Profiles.list**: Die Serverbeschreibung zeigt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `list`.

- Liest alle Server aus den [[Glossar#Einstellungen|Einstellungen]], inklusive [[Glossar#Fokus|Fokus]] und belegter Türnummern. Der laufende Weg behält davon nur den ersten.
