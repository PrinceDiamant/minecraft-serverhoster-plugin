[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil3]] › [[HostMinimize.assertEditable]] › [[HostMinimize.assertEditable.Teil1]]

# HostMinimize.assertEditable.Teil1

```mermaid
flowchart TD
  n1["if Z.231 (fileNormal.getParent() == null // !fileNormal.ge…"]
  n2["throw Z.232 throw new SecurityException('only a file directly…"]
  n3["if Z.233 (!EDITABLE.contains(fileNormal.getFileName().toSt…"]
  n4["throw Z.234 throw new SecurityException('file is not part of …"]
  n5["if Z.235 (Files.isSymbolicLink(fileNormal))"]
  n6["throw Z.235 throw new SecurityException('refusing symbolic li…"]
  n7["if Z.236 (Files.exists(fileNormal, LinkOption.NOFOLLOW_LIN…"]
  n8["throw Z.237 throw new SecurityException('refusing non-regular…"]
  n9["Schritt Z.238 Path real = Files.exists(fileNormal, LinkOption.N…"]
  n10["Schritt Z.239 Path realRoot = Files.isDirectory(rootNormal) ? r…"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n7 -->|"ja"| n8
  n6 --> n7
  n5 --> n7
  n8 --> n9
  n7 --> n9
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.231 (fileNormal.getParent() == null // !fileNormal.ge…
  Zeile 231: prüft `(fileNormal.getParent() == null // !fileNormal.ge…`.
throw Z.232 throw new SecurityException('only a file directly…
  Zeile 232: Abbruch `throw new SecurityException('only a file directly…`.
if Z.233 (!EDITABLE.contains(fileNormal.getFileName().toSt…
  Zeile 233: prüft `(!EDITABLE.contains(fileNormal.getFileName().toSt…`.
throw Z.234 throw new SecurityException('file is not part of …
  Zeile 234: Abbruch `throw new SecurityException('file is not part of …`.
if Z.235 (Files.isSymbolicLink(fileNormal))
  Zeile 235: prüft `(Files.isSymbolicLink(fileNormal))`.
throw Z.235 throw new SecurityException('refusing symbolic li…
  Zeile 235: Abbruch `throw new SecurityException('refusing symbolic li…`.
if Z.236 (Files.exists(fileNormal, LinkOption.NOFOLLOW_LIN…
  Zeile 236: prüft `(Files.exists(fileNormal, LinkOption.NOFOLLOW_LIN…`.
throw Z.237 throw new SecurityException('refusing non-regular…
  Zeile 237: Abbruch `throw new SecurityException('refusing non-regular…`.
Schritt Z.238 Path real = Files.exists(fileNormal, LinkOption.N…
  Zeile 238: Dateioperation. `Path real = Files.exists(fileNormal, LinkOption.N…`
Schritt Z.239 Path realRoot = Files.isDirectory(rootNormal) ? r…
  Zeile 239: Dateioperation. `Path realRoot = Files.isDirectory(rootNormal) ? r…`
```

- Fortsetzung von `HostMinimize.assertEditable`, Quellreihenfolge.
