[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil3]] › [[CoreAdminTest.selfSignedHandshakeAndPem]] › [[CoreAdminTest.selfSignedHandshakeAndPem.Teil2]]

# CoreAdminTest.selfSignedHandshakeAndPem.Teil2

```mermaid
flowchart TD
  n1["try Z.292"]
  n2["CoreAdminTest.client"]:::internal-link
  n3["finally Z.292"]
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.292
  Zeile 292: Versuch. Der Fehlerpfad geht in catch.
CoreAdminTest.client
  `client` in `CoreAdminTest.java`. Nur Test.
finally Z.292
  Läuft danach immer, auch nach einem Fehler.
```

- Fortsetzung von `CoreAdminTest.selfSignedHandshakeAndPem`, Quellreihenfolge.
