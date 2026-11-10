[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil3]] › [[CoreAdminTest.selfSignedHandshakeAndPem]] › [[CoreAdminTest.selfSignedHandshakeAndPem.Teil3]]

# CoreAdminTest.selfSignedHandshakeAndPem.Teil3

```mermaid
flowchart TD
  n1["try Z.300"]
  n2["CoreAdminTest.pem"]:::internal-link
  n3["CoreAdminTest.pem"]:::internal-link
  n4["HttpsSupport.fromPem"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.300
  Zeile 300: Versuch. Der Fehlerpfad geht in catch.
CoreAdminTest.pem
  `pem` in `CoreAdminTest.java`. Nur Test.
HttpsSupport.fromPem
  `fromPem` in `HttpsSupport.java`. Ruft `loadKey`.
```

- Fortsetzung von `CoreAdminTest.selfSignedHandshakeAndPem`, Quellreihenfolge.
