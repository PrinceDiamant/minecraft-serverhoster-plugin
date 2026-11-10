[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.apply]] › [[HostMinimize.apply.Teil3]]

# HostMinimize.apply.Teil3

```mermaid
flowchart TD
  n1["HostMinimize.assertEditable"]:::internal-link
  n2["if Z.168 (!backupDirectory.toAbsolutePath().normalize().st…"]
  n3["throw Z.169 throw new SecurityException('host minimization ba…"]
  n4["Schritt Z.170 Files.createDirectories(backupDirectory);"]
  n5["if Z.171 (!whitelistExisted)"]
  n6["Schritt Z.171 Files.writeString(backupDirectory.resolve(WHITELI…"]
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
HostMinimize.assertEditable
  Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Prüft `assertEditable`.
if Z.168 (!backupDirectory.toAbsolutePath().normalize().st…
  Zeile 168: prüft `(!backupDirectory.toAbsolutePath().normalize().st…`.
throw Z.169 throw new SecurityException('host minimization ba…
  Zeile 169: Abbruch `throw new SecurityException('host minimization ba…`.
Schritt Z.170 Files.createDirectories(backupDirectory);
  Zeile 170: Dateioperation. `Files.createDirectories(backupDirectory);`
if Z.171 (!whitelistExisted)
  Zeile 171: prüft `(!whitelistExisted)`.
Schritt Z.171 Files.writeString(backupDirectory.resolve(WHITELI…
  Zeile 171: schreibt Text in eine Datei. `Files.writeString(backupDirectory.resolve(WHITELI…`
```

> [!knoten]- Was die Blöcke tun
> - **HostMinimize.assertEditable**: Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Prüft `assertEditable`.
> - **if Z.168 (!backupDirectory.toAbsolutePath().normalize().st…**: Zeile 168: prüft `(!backupDirectory.toAbsolutePath().normalize().st…`.
> - **throw Z.169 throw new SecurityException('host minimization ba…**: Zeile 169: Abbruch `throw new SecurityException('host minimization ba…`.
> - **Schritt Z.170 Files.createDirectories(backupDirectory);**: Zeile 170: Dateioperation. `Files.createDirectories(backupDirectory);`
> - **if Z.171 (!whitelistExisted)**: Zeile 171: prüft `(!whitelistExisted)`.
> - **Schritt Z.171 Files.writeString(backupDirectory.resolve(WHITELI…**: Zeile 171: schreibt Text in eine Datei. `Files.writeString(backupDirectory.resolve(WHITELI…`

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HostMinimize.apply`.
