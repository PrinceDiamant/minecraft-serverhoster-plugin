[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil3]] › [[CoreAdminTest.rsaPkcs1]] › [[CoreAdminTest.rsaPkcs1.Teil1]]

# CoreAdminTest.rsaPkcs1.Teil1

```mermaid
flowchart TD
  n1["CoreAdminTest.derValue"]:::internal-link
  n2["if Z.323 (sequence.tag != 0x30 // sequence.end != pkcs8.le…"]
  n3["throw Z.323 throw new IllegalArgumentException('Invalid PKCS8…"]
  n4["CoreAdminTest.derValue"]:::internal-link
  n5["CoreAdminTest.derValue"]:::internal-link
  n6["CoreAdminTest.derValue"]:::internal-link
  n7["if Z.327 (algorithm.tag != 0x30 // key.tag != 0x04 // key.…"]
  n8["throw Z.328 throw new IllegalArgumentException('Invalid RSA P…"]
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  n4 --> n5
  n5 --> n6
  n7 -->|"ja"| n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
CoreAdminTest.derValue
  `derValue` in `CoreAdminTest.java`. Nur Test.
if Z.323 (sequence.tag != 0x30 // sequence.end != pkcs8.le…
  Zeile 323: prüft `(sequence.tag != 0x30 // sequence.end != pkcs8.le…`.
throw Z.323 throw new IllegalArgumentException('Invalid PKCS8…
  Zeile 323: Abbruch `throw new IllegalArgumentException('Invalid PKCS8…`.
if Z.327 (algorithm.tag != 0x30 // key.tag != 0x04 // key.…
  Zeile 327: prüft `(algorithm.tag != 0x30 // key.tag != 0x04 // key.…`.
throw Z.328 throw new IllegalArgumentException('Invalid RSA P…
  Zeile 328: Abbruch `throw new IllegalArgumentException('Invalid RSA P…`.
```

- Fortsetzung von `CoreAdminTest.rsaPkcs1`, Quellreihenfolge.
