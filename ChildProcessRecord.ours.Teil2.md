[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.ours]] › [[ChildProcessRecord.ours.Teil2]]

# ChildProcessRecord.ours.Teil2

```mermaid
flowchart TD
  n1["ChildProcessRecord.samePath"]:::internal-link
  n2["ChildProcessRecord.looksLikeJava"]:::internal-link
  n3["ChildProcessRecord.fileName"]:::internal-link
  n4["ChildProcessRecord.fileName"]:::internal-link
  n5["return Z.84 return samePath(live.cwd(), recorded.wo…"]
  n1 -->|"Z.85"| n2
  n2 -->|"Z.87"| n3
  n3 -->|"Z.87"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ChildProcessRecord.samePath
  Dieser Teil kümmert sich um den Pfad. Vergleicht `samePath`.
ChildProcessRecord.looksLikeJava
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `looksLikeJava` in `ChildProcessRecord.java`. Ruft `fileName`.
ChildProcessRecord.fileName
  Dieser Teil kümmert sich um den Namen. Liefert die Datei `fileName`.
return Z.84 return samePath(live.cwd(), recorded.wo…
  Zeile 84: Rückgabe `return samePath(live.cwd(), recorded.wo…`.
```

> [!knoten]- Was die Blöcke tun
> - **ChildProcessRecord.samePath**: Dieser Teil kümmert sich um den Pfad. Vergleicht `samePath`.
> - **ChildProcessRecord.looksLikeJava**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `looksLikeJava` in `ChildProcessRecord.java`. Ruft `fileName`.
> - **ChildProcessRecord.fileName**: Dieser Teil kümmert sich um den Namen. Liefert die Datei `fileName`.
> - **return Z.84 return samePath(live.cwd(), recorded.wo…**: Zeile 84: Rückgabe `return samePath(live.cwd(), recorded.wo…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `ChildProcessRecord.ours`.
