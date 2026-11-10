[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.versionCatalogCanIncludeMoreThanFortyReleases]]

# HosterTest.versionCatalogCanIncludeMoreThanFortyReleases

`HosterTest.versionCatalogCanIncludeMoreThanFortyReleases()` [src/test/java/de/aichele/childlauncher/HosterTest.java:365–377](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/test/java/de/aichele/childlauncher/HosterTest.java#L365-L377)

```mermaid
flowchart TD
  n1["for Z.367 (int i = 0; i ( 50; i++)"]
  n2["VersionCatalog.vanilla"]:::internal-link
  n3["VersionCatalog.vanilla"]:::internal-link
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.367 (int i = 0; i ( 50; i++)
  Zeile 367: Schleife `(int i = 0; i ( 50; i++)`.
VersionCatalog.vanilla
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `vanilla` in `VersionCatalog.java`. Ruft `str`.
```

> [!knoten]- Was die Blöcke tun
> - **for Z.367 (int i = 0; i ( 50; i++)**: Zeile 367: Schleife `(int i = 0; i ( 50; i++)`.
> - **VersionCatalog.vanilla**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `vanilla` in `VersionCatalog.java`. Ruft `str`.

- Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
- `versionCatalogCanIncludeMoreThanFortyReleases` in `src/test/java/de/aichele/childlauncher/HosterTest.java`
- Das ist ein Probelauf, kein Teil des laufenden Servers.
