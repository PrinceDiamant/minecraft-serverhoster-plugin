[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil1]] › [[CoreAdminTest.dashboardRoutesDoNotSwallowApiAssetsOrUnknownPaths]]

# CoreAdminTest.dashboardRoutesDoNotSwallowApiAssetsOrUnknownPaths

`CoreAdminTest.dashboardRoutesDoNotSwallowApiAssetsOrUnknownPaths()` [src/test/java/de/aichele/childlauncher/CoreAdminTest.java:30–38](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/test/java/de/aichele/childlauncher/CoreAdminTest.java#L30-L38)

```mermaid
flowchart TD
  n1["for Z.31 (String path : List.of('/', '/index.htm…"]
  n2["Dashboard.isDashboardPage"]:::internal-link
  n3["for Z.35 (String path : List.of('/api/status', '…"]
  n4["Dashboard.isDashboardPage"]:::internal-link
  n1 -->|"wiederholen"| n2
  n3 -->|"wiederholen"| n4
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.31 (String path : List.of('/', '/index.htm…
  Zeile 31: Schleife `(String path : List.of('/', '/index.htm…`.
Dashboard.isDashboardPage
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] prüft die [[Glossar#Bedienseite|Bedienseite]] die Seite. Prüft `isDashboardPage`.
for Z.35 (String path : List.of('/api/status', '…
  Zeile 35: Schleife `(String path : List.of('/api/status', '…`.
```

> [!knoten]- Was die Blöcke tun
> - **for Z.31 (String path : List.of('/', '/index.htm…**: Zeile 31: Schleife `(String path : List.of('/', '/index.htm…`.
> - **Dashboard.isDashboardPage**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] prüft die [[Glossar#Bedienseite|Bedienseite]] die Seite. Prüft `isDashboardPage`.
> - **for Z.35 (String path : List.of('/api/status', '…**: Zeile 35: Schleife `(String path : List.of('/api/status', '…`.

- Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
- `dashboardRoutesDoNotSwallowApiAssetsOrUnknownPaths` in `src/test/java/de/aichele/childlauncher/CoreAdminTest.java`
- Das ist ein Probelauf, kein Teil des laufenden Servers.
