[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil3]] › [[CoreAdminTest.selfSignedHandshakeAndPem]] › [[CoreAdminTest.selfSignedHandshakeAndPem.Teil4]]

# CoreAdminTest.selfSignedHandshakeAndPem.Teil4

```mermaid
flowchart TD
  n1["CoreAdminTest.rsaPkcs1"]:::internal-link
  n2["CoreAdminTest.pem"]:::internal-link
  n3["HttpsSupport.loadKey"]:::internal-link
  n4["HttpsSupport.normalizeSans"]:::internal-link
  n5["HttpsSupport.normalizeSans"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `CoreAdminTest.selfSignedHandshakeAndPem`, Quellreihenfolge.
