[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil2]] › [[HostFirstSetup.worldDirectories]] › [[HostFirstSetup.worldDirectories.Z214]]

# HostFirstSetup.worldDirectories.Z214

```mermaid
flowchart TD
  n1["try Z.214"]
  n2["for Z.215 (Path entry : entries.toList())"]
  n3["if Z.216 (!Files.isDirectory(entry, LinkOption.NOFOLLOW_LI…"]
  n4["if Z.218 (Files.isRegularFile(level, LinkOption.NOFOLLOW_L…"]
  n3 --> n4
  n3 --> n4
  n2 -->|"wiederholen"| n3
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.214
  Zeile 214: Versuch. Der Fehlerpfad geht in catch.
for Z.215 (Path entry : entries.toList())
  Zeile 215: Schleife `(Path entry : entries.toList())`.
if Z.216 (!Files.isDirectory(entry, LinkOption.NOFOLLOW_LI…
  Zeile 216: prüft `(!Files.isDirectory(entry, LinkOption.NOFOLLOW_LI…`.
if Z.218 (Files.isRegularFile(level, LinkOption.NOFOLLOW_L…
  Zeile 218: prüft `(Files.isRegularFile(level, LinkOption.NOFOLLOW_L…`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.214**: Zeile 214: Versuch. Der Fehlerpfad geht in catch.
> - **for Z.215 (Path entry : entries.toList())**: Zeile 215: Schleife `(Path entry : entries.toList())`.
> - **if Z.216 (!Files.isDirectory(entry, LinkOption.NOFOLLOW_LI…**: Zeile 216: prüft `(!Files.isDirectory(entry, LinkOption.NOFOLLOW_LI…`.
> - **if Z.218 (Files.isRegularFile(level, LinkOption.NOFOLLOW_L…**: Zeile 218: prüft `(Files.isRegularFile(level, LinkOption.NOFOLLOW_L…`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 214 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `HostFirstSetup.worldDirectories`.
