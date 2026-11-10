[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil4]] › [[HosterTest.crashIndexReadsAndRejectsEscape]] › [[HosterTest.crashIndexReadsAndRejectsEscape.Teil2]]

# HosterTest.crashIndexReadsAndRejectsEscape.Teil2

```mermaid
flowchart TD
  n1["CrashIndex.read"]:::internal-link
  n2["if Z.496 (linked)"]
  n3["CrashIndex.read"]:::internal-link
  n4["CrashIndex.read"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
CrashIndex.read
  Dieser Teil liest das. Liest `read`. Ruft `open`, `resolve`, `query`.
if Z.496 (linked)
  Zeile 496: prüft `(linked)`.
```

> [!knoten]- Was die Blöcke tun
> - **CrashIndex.read**: Dieser Teil liest das. Liest `read`. Ruft `open`, `resolve`, `query`.
> - **if Z.496 (linked)**: Zeile 496: prüft `(linked)`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HosterTest.crashIndexReadsAndRejectsEscape`.
