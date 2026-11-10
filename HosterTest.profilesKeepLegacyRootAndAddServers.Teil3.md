[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil1]] › [[HosterTest.profilesKeepLegacyRootAndAddServers]] › [[HosterTest.profilesKeepLegacyRootAndAddServers.Teil3]]

# HosterTest.profilesKeepLegacyRootAndAddServers.Teil3

```mermaid
flowchart TD
  n1["ServerProfile.directory"]:::internal-link
  n2["Profiles.focus"]:::internal-link
  n3["Profiles.portClash"]:::internal-link
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
  style n3 fill:#f88,stroke:#900
```

```knoten
ServerProfile.directory
  Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `directory` in `ServerProfile.java`.
Profiles.focus
  Würde den gemeinten Server aus den [[Glossar#Einstellungen|Einstellungen]] lesen. Der laufende Weg benutzt das nicht. Wird vom [[Glossar#Plugin|Plugin]]-Kern nicht für die laufende Auswahl benutzt. [[Glossar#Befund|Befund]]: angemeldet aber nicht umgesetzt, wahrscheinlich. ServerProfile.java:85, nur Tests rufen Profiles.focus
Profiles.portClash
  Würde merken, wenn zwei Server dieselbe Türnummer hätten. Der laufende Weg benutzt das nicht. Wird vom [[Glossar#Plugin|Plugin]]-Kern nicht ausgewertet. [[Glossar#Befund|Befund]]: angemeldet aber nicht umgesetzt, wahrscheinlich. ServerProfile.java:79, nur Tests rufen Profiles.portClash
```

> [!knoten]- Was die Blöcke tun
> - **ServerProfile.directory**: Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `directory` in `ServerProfile.java`.
> - **Profiles.focus**: Würde den gemeinten Server aus den [[Glossar#Einstellungen|Einstellungen]] lesen. Der laufende Weg benutzt das nicht. Wird vom [[Glossar#Plugin|Plugin]]-Kern nicht für die laufende Auswahl benutzt. [[Glossar#Befund|Befund]]: angemeldet aber nicht umgesetzt, wahrscheinlich. ServerProfile.java:85, nur Tests rufen Profiles.focus
> - **Profiles.portClash**: Würde merken, wenn zwei Server dieselbe Türnummer hätten. Der laufende Weg benutzt das nicht. Wird vom [[Glossar#Plugin|Plugin]]-Kern nicht ausgewertet. [[Glossar#Befund|Befund]]: angemeldet aber nicht umgesetzt, wahrscheinlich. ServerProfile.java:79, nur Tests rufen Profiles.portClash

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HosterTest.profilesKeepLegacyRootAndAddServers`.
