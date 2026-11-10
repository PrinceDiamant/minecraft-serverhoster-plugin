[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Dateien]] › [[index.upload]] › [[index.upload.Z148]]

# index.upload.Z148

```mermaid
flowchart TD
  n1["for Z.148 files"]
  n2["try Z.148"]
  n3["index.api"]:::internal-link
  n4["catch Z.149 e"]
  n5["if Z.149 String(e.message).includes('existiert')&&await wi…"]
  n6["index.api"]:::internal-link
  n7["index.toast"]:::internal-link
  n2 --> n3
  n2 -->|"Fehler"| n4
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n7
  n6 --> n7
  n5 --> n7
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.148 files
  Zeile 148: Schleife `files`.
try Z.148
  Zeile 148: Versuch. Der Fehlerpfad geht in catch.
index.api
  Sendet einen Dashboard-Request `api`. Ruft `scoped`, `showLogin`, `toast`.
catch Z.149 e
  Zeile 149: fängt e.
if Z.149 String(e.message).includes('existiert')&&await wi…
  Zeile 149: prüft `String(e.message).includes('existiert')&&await wi…`.
index.toast
  Zeigt eine Meldung `toast`. Ruft `$`.
```

- Fortsetzung von `index.upload`, Quellreihenfolge.
