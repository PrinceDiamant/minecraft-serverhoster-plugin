[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil5]] › [[HosterTest.legacyCleanupRetainsBackupsAndMemoryReports]] › [[HosterTest.legacyCleanupRetainsBackupsAndMemoryReports.Teil2]]

# HosterTest.legacyCleanupRetainsBackupsAndMemoryReports.Teil2

```mermaid
flowchart TD
  n1["Schritt Z.672 assertEquals('report', Files.readString(reports.r…"]
  n2["Schritt Z.673 assertTrue(Files.isDirectory(oldData));"]
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.672 assertEquals('report', Files.readString(reports.r…
  Zeile 672: liest Text aus einer Datei. `assertEquals('report', Files.readString(reports.r…`
Schritt Z.673 assertTrue(Files.isDirectory(oldData));
  Zeile 673: Dateioperation. `assertTrue(Files.isDirectory(oldData));`
```

> [!knoten]- Was die Blöcke tun
> - **Schritt Z.672 assertEquals('report', Files.readString(reports.r…**: Zeile 672: liest Text aus einer Datei. `assertEquals('report', Files.readString(reports.r…`
> - **Schritt Z.673 assertTrue(Files.isDirectory(oldData));**: Zeile 673: Dateioperation. `assertTrue(Files.isDirectory(oldData));`

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HosterTest.legacyCleanupRetainsBackupsAndMemoryReports`.
