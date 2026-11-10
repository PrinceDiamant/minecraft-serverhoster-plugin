[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[VersionCatalog]] › [[VersionCatalog.fetch]] › [[VersionCatalog.fetch.Z68.Teil1]]

# VersionCatalog.fetch.Z68.Teil1

```mermaid
flowchart TD
  n1["VersionCatalog.vanilla"]:::internal-link
  n2["Upstream.getJson"]:::internal-link
  n3["VersionCatalog.fabric"]:::internal-link
  n4["Upstream.getJson"]:::internal-link
  n5["VersionCatalog.paper"]:::internal-link
  n6["Upstream.getJson"]:::internal-link
  n7["VersionCatalog.spigot"]:::internal-link
  n8["Upstream.getText"]:::internal-link
  n1 -->|"Z.69"| n2
  n3 -->|"Z.70"| n4
  n2 --> n3
  n5 -->|"Z.71"| n6
  n4 --> n5
  n7 -->|"Z.72"| n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
VersionCatalog.vanilla
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `vanilla` in `VersionCatalog.java`. Ruft `str`.
Upstream.getJson
  Dieser Teil liefert die Antwort. Liefert `getJson`.
VersionCatalog.fabric
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `fabric` in `VersionCatalog.java`. Ruft `str`.
VersionCatalog.paper
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `paper` in `VersionCatalog.java`.
VersionCatalog.spigot
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `spigot` in `VersionCatalog.java`. Ruft `compare`.
Upstream.getText
  Dieser Teil liefert den Text. Liefert `getText`.
```

> [!knoten]- Was die Blöcke tun
> - **VersionCatalog.vanilla**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `vanilla` in `VersionCatalog.java`. Ruft `str`.
> - **Upstream.getJson**: Dieser Teil liefert die Antwort. Liefert `getJson`.
> - **VersionCatalog.fabric**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `fabric` in `VersionCatalog.java`. Ruft `str`.
> - **VersionCatalog.paper**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `paper` in `VersionCatalog.java`.
> - **VersionCatalog.spigot**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `spigot` in `VersionCatalog.java`. Ruft `compare`.
> - **Upstream.getText**: Dieser Teil liefert den Text. Liefert `getText`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `VersionCatalog.fetch.Z68`.
