[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil3]] › [[CoreAdminTest.derValue]] › [[CoreAdminTest.derValue.Z337]]

# CoreAdminTest.derValue.Z337

```mermaid
flowchart TD
  n1["if Z.337 (firstLength ( 0x80)"]
  n2["if Z.341 (count == 0 // count ) 4 // content + count ) der…"]
  n3["throw Z.342 throw new IllegalArgumentException('Invalid DER l…"]
  n4["for Z.344 (int i = 0; i ( count; i++)"]
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 -->|"nein"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.337 (firstLength ( 0x80)
  Zeile 337: prüft `(firstLength ( 0x80)`.
if Z.341 (count == 0 // count ) 4 // content + count ) der…
  Zeile 341: prüft `(count == 0 // count ) 4 // content + count ) der…`.
throw Z.342 throw new IllegalArgumentException('Invalid DER l…
  Zeile 342: Abbruch `throw new IllegalArgumentException('Invalid DER l…`.
for Z.344 (int i = 0; i ( count; i++)
  Zeile 344: Schleife `(int i = 0; i ( count; i++)`.
```

- Fortsetzung von `CoreAdminTest.derValue`, Quellreihenfolge.
