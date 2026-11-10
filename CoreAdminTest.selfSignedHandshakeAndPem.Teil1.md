[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil3]] › [[CoreAdminTest.selfSignedHandshakeAndPem]] › [[CoreAdminTest.selfSignedHandshakeAndPem.Teil1]]

# CoreAdminTest.selfSignedHandshakeAndPem.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.279 Path dir = Files.createDirectories(tmp.resolve('t…"]
  n2["HttpsSupport.build"]:::internal-link
  n3["Schritt Z.282 assertTrue(Files.isRegularFile(dir.resolve('dashb…"]
  n4["HttpsSupport.configure"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.279 Path dir = Files.createDirectories(tmp.resolve('t…
  Zeile 279: Dateioperation. `Path dir = Files.createDirectories(tmp.resolve('t…`
HttpsSupport.build
  Baut `build`. Ruft `fromKeystore`, `ensureSelfSigned`, `password`.
Schritt Z.282 assertTrue(Files.isRegularFile(dir.resolve('dashb…
  Zeile 282: Dateioperation. `assertTrue(Files.isRegularFile(dir.resolve('dashb…`
HttpsSupport.configure
  `configure` in `HttpsSupport.java`. Ruft `configure`.
```

- Fortsetzung von `CoreAdminTest.selfSignedHandshakeAndPem`, Quellreihenfolge.
