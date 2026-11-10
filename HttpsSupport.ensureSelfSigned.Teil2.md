[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil1]] › [[HttpsSupport.ensureSelfSigned]] › [[HttpsSupport.ensureSelfSigned.Teil2]]

# HttpsSupport.ensureSelfSigned.Teil2

```mermaid
flowchart TD
  n1["HttpsSupport.normalizeSans"]:::internal-link
  n2["if Z.96 (!Files.isExecutable(keytool))"]
  n3["throw Z.96 throw new IOException('keytool missing: ' + keyto…"]
  n4["Schritt Z.103 Process p = new ProcessBuilder(cmd).redirectError…"]
  n5["if Z.105 (!p.waitFor(60, TimeUnit.SECONDS))"]
  n6["throw Z.105 throw new IOException('keytool timeout');"]
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  n5 -->|"ja"| n6
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HttpsSupport.normalizeSans
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Vereinheitlicht `normalizeSans`.
if Z.96 (!Files.isExecutable(keytool))
  Zeile 96: prüft `(!Files.isExecutable(keytool))`.
throw Z.96 throw new IOException('keytool missing: ' + keyto…
  Zeile 96: Abbruch `throw new IOException('keytool missing: ' + keyto…`.
Schritt Z.103 Process p = new ProcessBuilder(cmd).redirectError…
  Zeile 103: baut einen Prozess. `Process p = new ProcessBuilder(cmd).redirectError…`
if Z.105 (!p.waitFor(60, TimeUnit.SECONDS))
  Zeile 105: prüft `(!p.waitFor(60, TimeUnit.SECONDS))`.
throw Z.105 throw new IOException('keytool timeout');
  Zeile 105: Abbruch `throw new IOException('keytool timeout');`.
```

> [!knoten]- Was die Blöcke tun
> - **HttpsSupport.normalizeSans**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Vereinheitlicht `normalizeSans`.
> - **if Z.96 (!Files.isExecutable(keytool))**: Zeile 96: prüft `(!Files.isExecutable(keytool))`.
> - **throw Z.96 throw new IOException('keytool missing: ' + keyto…**: Zeile 96: Abbruch `throw new IOException('keytool missing: ' + keyto…`.
> - **Schritt Z.103 Process p = new ProcessBuilder(cmd).redirectError…**: Zeile 103: baut einen Prozess. `Process p = new ProcessBuilder(cmd).redirectError…`
> - **if Z.105 (!p.waitFor(60, TimeUnit.SECONDS))**: Zeile 105: prüft `(!p.waitFor(60, TimeUnit.SECONDS))`.
> - **throw Z.105 throw new IOException('keytool timeout');**: Zeile 105: Abbruch `throw new IOException('keytool timeout');`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HttpsSupport.ensureSelfSigned`.
