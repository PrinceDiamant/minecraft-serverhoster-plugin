[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]]

# Setup-Suche

```mermaid
flowchart TD
  n1["SetupRecovery"]:::internal-link
  n2["SetupDiscovery"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SetupRecovery
  Macht aus so einem Treffer wieder eine Anlage, die das [[Glossar#Plugin|Plugin]] benutzen kann.
SetupDiscovery
  Sucht Ordner, die schon wie ein Server aussehen.
```

> [!knoten] Was die Blöcke tun
> - **SetupRecovery**: Macht aus so einem Treffer wieder eine Anlage, die das [[Glossar#Plugin|Plugin]] benutzen kann.
> - **SetupDiscovery**: Sucht Ordner, die schon wie ein Server aussehen.

- Sucht auf der Festplatte nach einer schon vorhandenen Anlage und kann sie wieder benutzbar machen.
