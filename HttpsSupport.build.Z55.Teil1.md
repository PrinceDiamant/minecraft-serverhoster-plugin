[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil1]] › [[HttpsSupport.build]] › [[HttpsSupport.build.Z55.Teil1]]

# HttpsSupport.build.Z55.Teil1

```mermaid
flowchart TD
  n1["HttpsSupport.fromKeystore"]:::internal-link
  n2["HttpsSupport.ensureSelfSigned"]:::internal-link
  n3["HttpsSupport.password"]:::internal-link
  n4["HttpsSupport.fromKeystore"]:::internal-link
  n5["HttpsSupport.resolve"]:::internal-link
  n6["HttpsSupport.password"]:::internal-link
  n1 -->|"Z.56"| n2
  n2 -->|"Z.56"| n3
  n4 -->|"Z.57"| n5
  n5 -->|"Z.57"| n6
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HttpsSupport.fromKeystore
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `fromKeystore` in `HttpsSupport.java`.
HttpsSupport.ensureSelfSigned
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Stellt sicher `ensureSelfSigned`. Ruft `resolve`, `password`, `normalizeSans`.
HttpsSupport.password
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `password` in `HttpsSupport.java`. Ruft `readOrCreatePass`.
HttpsSupport.resolve
  Dieser Teil bestimmt das. Löst auf `resolve`.
```

> [!knoten]- Was die Blöcke tun
> - **HttpsSupport.fromKeystore**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `fromKeystore` in `HttpsSupport.java`.
> - **HttpsSupport.ensureSelfSigned**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Stellt sicher `ensureSelfSigned`. Ruft `resolve`, `password`, `normalizeSans`.
> - **HttpsSupport.password**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `password` in `HttpsSupport.java`. Ruft `readOrCreatePass`.
> - **HttpsSupport.resolve**: Dieser Teil bestimmt das. Löst auf `resolve`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HttpsSupport.build.Z55`.
