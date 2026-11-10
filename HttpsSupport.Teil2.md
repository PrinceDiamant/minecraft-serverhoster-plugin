[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil2]]

# HttpsSupport.Teil2

```mermaid
flowchart TD
  n1["HttpsSupport.fromPem"]:::internal-link
  n2["HttpsSupport.loadKey"]:::internal-link
  n3["HttpsSupport.pemBlock"]:::internal-link
  n4["HttpsSupport.wrapPkcs1"]:::internal-link
  n5["HttpsSupport.derLen"]:::internal-link
  n6["HttpsSupport.concat"]:::internal-link
  n7["HttpsSupport.resolve"]:::internal-link
  n1 -->|"Z.145"| n2
  n2 -->|"Z.157"| n3
  n2 -->|"Z.161"| n4
  n4 -->|"Z.179"| n6
  n4 -->|"Z.179"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HttpsSupport.fromPem
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `fromPem` in `HttpsSupport.java`. Ruft `loadKey`.
HttpsSupport.loadKey
  Dieser Teil lädt hier einen Schritt. Eine Ebene tiefer steht er genauer. Lädt `loadKey`. Ruft `pemBlock`, `wrapPkcs1`.
HttpsSupport.pemBlock
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `pemBlock` in `HttpsSupport.java`.
HttpsSupport.wrapPkcs1
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Hüllt ein `wrapPkcs1`. Ruft `concat`, `derLen`.
HttpsSupport.derLen
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `derLen` in `HttpsSupport.java`.
HttpsSupport.concat
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `concat` in `HttpsSupport.java`.
HttpsSupport.resolve
  Dieser Teil bestimmt das. Löst auf `resolve`.
```

> [!knoten]- Was die Blöcke tun
> - **HttpsSupport.fromPem**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `fromPem` in `HttpsSupport.java`. Ruft `loadKey`.
> - **HttpsSupport.loadKey**: Dieser Teil lädt hier einen Schritt. Eine Ebene tiefer steht er genauer. Lädt `loadKey`. Ruft `pemBlock`, `wrapPkcs1`.
> - **HttpsSupport.pemBlock**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `pemBlock` in `HttpsSupport.java`.
> - **HttpsSupport.wrapPkcs1**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Hüllt ein `wrapPkcs1`. Ruft `concat`, `derLen`.
> - **HttpsSupport.derLen**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `derLen` in `HttpsSupport.java`.
> - **HttpsSupport.concat**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `concat` in `HttpsSupport.java`.
> - **HttpsSupport.resolve**: Dieser Teil bestimmt das. Löst auf `resolve`.

- Ein weiterer Abschnitt derselben Übersicht.
