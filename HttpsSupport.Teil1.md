[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil1]]

# HttpsSupport.Teil1

```mermaid
flowchart TD
  n1["HttpsSupport.HttpsSupport"]:::internal-link
  n2["HttpsSupport.configure"]:::internal-link
  n3["HttpsSupport.build"]:::internal-link
  n4["HttpsSupport.password"]:::internal-link
  n5["HttpsSupport.readOrCreatePass"]:::internal-link
  n6["HttpsSupport.ensureSelfSigned"]:::internal-link
  n7["HttpsSupport.normalizeSans"]:::internal-link
  n8["HttpsSupport.fromKeystore"]:::internal-link
  n3 -->|"Z.56"| n8
  n3 -->|"Z.56"| n6
  n3 -->|"Z.56"| n4
  n4 -->|"Z.66"| n5
  n6 -->|"Z.90"| n4
  n6 -->|"Z.94"| n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HttpsSupport.HttpsSupport
  Dieser Teil kümmert sich um die Hilfe. `HttpsSupport` in `HttpsSupport.java`.
HttpsSupport.configure
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `configure` in `HttpsSupport.java`. Ruft `configure`.
HttpsSupport.build
  Dieser Teil baut das. Baut `build`. Ruft `fromKeystore`, `ensureSelfSigned`, `password`.
HttpsSupport.password
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `password` in `HttpsSupport.java`. Ruft `readOrCreatePass`.
HttpsSupport.readOrCreatePass
  Dieser Teil liest oder den Ersatz. Liest `readOrCreatePass`.
HttpsSupport.ensureSelfSigned
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Stellt sicher `ensureSelfSigned`. Ruft `resolve`, `password`, `normalizeSans`.
HttpsSupport.normalizeSans
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Vereinheitlicht `normalizeSans`.
HttpsSupport.fromKeystore
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `fromKeystore` in `HttpsSupport.java`.
```

> [!knoten]- Was die Blöcke tun
> - **HttpsSupport.HttpsSupport**: Dieser Teil kümmert sich um die Hilfe. `HttpsSupport` in `HttpsSupport.java`.
> - **HttpsSupport.configure**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `configure` in `HttpsSupport.java`. Ruft `configure`.
> - **HttpsSupport.build**: Dieser Teil baut das. Baut `build`. Ruft `fromKeystore`, `ensureSelfSigned`, `password`.
> - **HttpsSupport.password**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `password` in `HttpsSupport.java`. Ruft `readOrCreatePass`.
> - **HttpsSupport.readOrCreatePass**: Dieser Teil liest oder den Ersatz. Liest `readOrCreatePass`.
> - **HttpsSupport.ensureSelfSigned**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Stellt sicher `ensureSelfSigned`. Ruft `resolve`, `password`, `normalizeSans`.
> - **HttpsSupport.normalizeSans**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Vereinheitlicht `normalizeSans`.
> - **HttpsSupport.fromKeystore**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `fromKeystore` in `HttpsSupport.java`.

- Ein weiterer Abschnitt derselben Übersicht.
