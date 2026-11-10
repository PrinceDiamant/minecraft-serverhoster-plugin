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

```knoten
CoreAdminTest.rsaPkcs1
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. `rsaPkcs1` in `CoreAdminTest.java`. Ruft `derValue`. Nur Test.
CoreAdminTest.pem
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. `pem` in `CoreAdminTest.java`. Nur Test.
HttpsSupport.loadKey
  Dieser Teil lädt hier einen Schritt. Eine Ebene tiefer steht er genauer. Lädt `loadKey`. Ruft `pemBlock`, `wrapPkcs1`.
HttpsSupport.normalizeSans
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Vereinheitlicht `normalizeSans`.
```

> [!knoten]- Was die Blöcke tun
> - **CoreAdminTest.rsaPkcs1**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. `rsaPkcs1` in `CoreAdminTest.java`. Ruft `derValue`. Nur Test.
> - **CoreAdminTest.pem**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. `pem` in `CoreAdminTest.java`. Nur Test.
> - **HttpsSupport.loadKey**: Dieser Teil lädt hier einen Schritt. Eine Ebene tiefer steht er genauer. Lädt `loadKey`. Ruft `pemBlock`, `wrapPkcs1`.
> - **HttpsSupport.normalizeSans**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Vereinheitlicht `normalizeSans`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `CoreAdminTest.selfSignedHandshakeAndPem`.
