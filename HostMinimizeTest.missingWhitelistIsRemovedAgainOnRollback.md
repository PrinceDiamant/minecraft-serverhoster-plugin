[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.missingWhitelistIsRemovedAgainOnRollback]]

# HostMinimizeTest.missingWhitelistIsRemovedAgainOnRollback

`HostMinimizeTest.missingWhitelistIsRemovedAgainOnRollback()` [src/test/java/de/aichele/childlauncher/HostMinimizeTest.java:88–98](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/test/java/de/aichele/childlauncher/HostMinimizeTest.java#L88-L98)

```mermaid
flowchart TD
  n1["Schritt Z.91 Files.createDirectories(data);"]
  n2["Schritt Z.92 Files.writeString(root.resolve('server.properties…"]
  n3["HostMinimize.apply"]:::internal-link
  n4["Schritt Z.95 assertEquals('()/n', Files.readString(root.resolv…"]
  n5["HostMinimize.restore"]:::internal-link
  n6["Schritt Z.97 assertFalse(Files.exists(root.resolve('whitelist.…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.91 Files.createDirectories(data);
  Zeile 91: Dateioperation. `Files.createDirectories(data);`
Schritt Z.92 Files.writeString(root.resolve('server.properties…
  Zeile 92: schreibt Text in eine Datei. `Files.writeString(root.resolve('server.properties…`
HostMinimize.apply
  Wendet an `apply`. Ruft `assertRoot`, `assertEditable`, `update`.
Schritt Z.95 assertEquals('()/n', Files.readString(root.resolv…
  Zeile 95: liest Text aus einer Datei. `assertEquals('()/n', Files.readString(root.resolv…`
HostMinimize.restore
  Stellt wieder her `restore`. Ruft `assertEditable`.
Schritt Z.97 assertFalse(Files.exists(root.resolve('whitelist.…
  Zeile 97: Dateioperation. `assertFalse(Files.exists(root.resolve('whitelist.…`
```

- `missingWhitelistIsRemovedAgainOnRollback` in `src/test/java/de/aichele/childlauncher/HostMinimizeTest.java`
- Auslöser: Test
