[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil1]] › [[HttpsSupport.ensureSelfSigned]] › [[HttpsSupport.ensureSelfSigned.Teil1]]

# HttpsSupport.ensureSelfSigned.Teil1

```mermaid
flowchart TD
  n1["HttpsSupport.resolve"]:::internal-link
  n2["if Z.88 (Files.exists(ks))"]
  n3["return Z.88 return ks;"]
  n4["Schritt Z.89 Files.createDirectories(ks.getParent() == null ? …"]
  n5["HttpsSupport.password"]:::internal-link
  n6["if Z.92 (dn.indexOf('/n') )= 0 // dn.indexOf('/r') )= 0 /…"]
  n7["throw Z.92 throw new IllegalArgumentException('dashboard.htt…"]
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  n4 --> n5
  n6 -->|"ja"| n7
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HttpsSupport.resolve
  Dieser Teil bestimmt das. Löst auf `resolve`.
if Z.88 (Files.exists(ks))
  Zeile 88: prüft `(Files.exists(ks))`.
return Z.88 return ks;
  Zeile 88: Rückgabe `return ks;`.
Schritt Z.89 Files.createDirectories(ks.getParent() == null ? …
  Zeile 89: Dateioperation. `Files.createDirectories(ks.getParent() == null ? …`
HttpsSupport.password
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `password` in `HttpsSupport.java`. Ruft `readOrCreatePass`.
if Z.92 (dn.indexOf('/n') )= 0 // dn.indexOf('/r') )= 0 /…
  Zeile 92: prüft `(dn.indexOf('/n') )= 0 // dn.indexOf('/r') )= 0 /…`.
throw Z.92 throw new IllegalArgumentException('dashboard.htt…
  Zeile 92: Abbruch `throw new IllegalArgumentException('dashboard.htt…`.
```

> [!knoten]- Was die Blöcke tun
> - **HttpsSupport.resolve**: Dieser Teil bestimmt das. Löst auf `resolve`.
> - **if Z.88 (Files.exists(ks))**: Zeile 88: prüft `(Files.exists(ks))`.
> - **return Z.88 return ks;**: Zeile 88: Rückgabe `return ks;`.
> - **Schritt Z.89 Files.createDirectories(ks.getParent() == null ? …**: Zeile 89: Dateioperation. `Files.createDirectories(ks.getParent() == null ? …`
> - **HttpsSupport.password**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `password` in `HttpsSupport.java`. Ruft `readOrCreatePass`.
> - **if Z.92 (dn.indexOf('/n') )= 0 // dn.indexOf('/r') )= 0 /…**: Zeile 92: prüft `(dn.indexOf('/n') )= 0 // dn.indexOf('/r') )= 0 /…`.
> - **throw Z.92 throw new IllegalArgumentException('dashboard.htt…**: Zeile 92: Abbruch `throw new IllegalArgumentException('dashboard.htt…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HttpsSupport.ensureSelfSigned`.
