[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil1]] › [[HttpsSupport.build]] › [[HttpsSupport.build.Z55.Teil2]]

# HttpsSupport.build.Z55.Teil2

```mermaid
flowchart TD
  n1["HttpsSupport.fromPem"]:::internal-link
  n2["HttpsSupport.resolve"]:::internal-link
  n3["HttpsSupport.resolve"]:::internal-link
  n4["HttpsSupport.password"]:::internal-link
  n1 -->|"Z.58"| n2
  n2 -->|"Z.58"| n3
  n3 -->|"Z.58"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HttpsSupport.fromPem
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `fromPem` in `HttpsSupport.java`. Ruft `loadKey`.
HttpsSupport.resolve
  Dieser Teil bestimmt das. Löst auf `resolve`.
HttpsSupport.password
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `password` in `HttpsSupport.java`. Ruft `readOrCreatePass`.
```

> [!knoten]- Was die Blöcke tun
> - **HttpsSupport.fromPem**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `fromPem` in `HttpsSupport.java`. Ruft `loadKey`.
> - **HttpsSupport.resolve**: Dieser Teil bestimmt das. Löst auf `resolve`.
> - **HttpsSupport.password**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `password` in `HttpsSupport.java`. Ruft `readOrCreatePass`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HttpsSupport.build.Z55`.
