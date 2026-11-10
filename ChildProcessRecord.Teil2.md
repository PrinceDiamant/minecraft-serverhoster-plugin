[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil2]]

# ChildProcessRecord.Teil2

```mermaid
flowchart TD
  n1["ChildProcessRecord.waitUntilDead"]:::internal-link
  n2["ChildProcessRecord.looksLikeJava"]:::internal-link
  n3["ChildProcessRecord.samePath"]:::internal-link
  n4["ChildProcessRecord.fileName"]:::internal-link
  n5["ChildProcessRecord.required"]:::internal-link
  n6["ChildProcessRecord.safe"]:::internal-link
  n2 -->|"Z.198"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ChildProcessRecord.waitUntilDead
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Wartet `waitUntilDead`.
ChildProcessRecord.looksLikeJava
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `looksLikeJava` in `ChildProcessRecord.java`. Ruft `fileName`.
ChildProcessRecord.samePath
  Dieser Teil kümmert sich um den Pfad. Vergleicht `samePath`.
ChildProcessRecord.fileName
  Dieser Teil kümmert sich um den Namen. Liefert die Datei `fileName`.
ChildProcessRecord.required
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liest verpflichtend `required`.
ChildProcessRecord.safe
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Prüft die Pfadgrenze `safe`.
```

> [!knoten]- Was die Blöcke tun
> - **ChildProcessRecord.waitUntilDead**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Wartet `waitUntilDead`.
> - **ChildProcessRecord.looksLikeJava**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `looksLikeJava` in `ChildProcessRecord.java`. Ruft `fileName`.
> - **ChildProcessRecord.samePath**: Dieser Teil kümmert sich um den Pfad. Vergleicht `samePath`.
> - **ChildProcessRecord.fileName**: Dieser Teil kümmert sich um den Namen. Liefert die Datei `fileName`.
> - **ChildProcessRecord.required**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liest verpflichtend `required`.
> - **ChildProcessRecord.safe**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Prüft die Pfadgrenze `safe`.

- Ein weiterer Abschnitt derselben Übersicht.
