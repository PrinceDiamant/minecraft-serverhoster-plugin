[[00 Start]] › [[Plugin-Kern]] › [[Properties]] › [[FabricLauncherPlugin.syncPropertiesEdit]] › [[FabricLauncherPlugin.syncPropertiesEdit.Teil2]]

# FabricLauncherPlugin.syncPropertiesEdit.Teil2

```mermaid
flowchart TD
  n1["if Z.354 (port != null && !port.trim().equals(String.value…"]
  n2["try Z.355"]
  n3["Schritt Z.355 getConfig().set(prefix + 'port', Integer.parseInt…"]
  n4["catch Z.355 (NumberFormatException ignore…"]
  n5["if Z.358 (ip != null && !ip.equals(childBindAddress(pr)))"]
  n6["FabricLauncherPlugin.childBindAddress"]:::internal-link
  n7["Schritt Z.359 getConfig().set(prefix + 'serverIp', ip);"]
  n2 --> n3
  n2 -->|"Fehler"| n4
  n1 -->|"ja"| n2
  n5 -->|"Z.358"| n6
  n6 -->|"ja"| n7
  n3 --> n5
  n4 --> n5
  n1 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.354 (port != null && !port.trim().equals(String.value…
  Zeile 354: prüft `(port != null && !port.trim().equals(String.value…`.
try Z.355
  Zeile 355: Versuch. Der Fehlerpfad geht in catch.
Schritt Z.355 getConfig().set(prefix + 'port', Integer.parseInt…
  Zeile 355: liest die Config. `getConfig().set(prefix + 'port', Integer.parseInt…`
catch Z.355 (NumberFormatException ignore…
  Zeile 355: fängt (NumberFormatException ignore….
if Z.358 (ip != null && !ip.equals(childBindAddress(pr)))
  Zeile 358: prüft `(ip != null && !ip.equals(childBindAddress(pr)))`.
FabricLauncherPlugin.childBindAddress
  Die Adresse, unter der der [[Glossar#Spielserver|Spielserver]] erreichbar sein soll. Betrifft den Child `childBindAddress`. Ruft `effectiveBindAddress`, `hostBindAddress`.
Schritt Z.359 getConfig().set(prefix + 'serverIp', ip);
  Zeile 359: liest die Config. `getConfig().set(prefix + 'serverIp', ip);`
```

> [!knoten]- Was die Blöcke tun
> - **if Z.354 (port != null && !port.trim().equals(String.value…**: Zeile 354: prüft `(port != null && !port.trim().equals(String.value…`.
> - **try Z.355**: Zeile 355: Versuch. Der Fehlerpfad geht in catch.
> - **Schritt Z.355 getConfig().set(prefix + 'port', Integer.parseInt…**: Zeile 355: liest die Config. `getConfig().set(prefix + 'port', Integer.parseInt…`
> - **catch Z.355 (NumberFormatException ignore…**: Zeile 355: fängt (NumberFormatException ignore….
> - **if Z.358 (ip != null && !ip.equals(childBindAddress(pr)))**: Zeile 358: prüft `(ip != null && !ip.equals(childBindAddress(pr)))`.
> - **FabricLauncherPlugin.childBindAddress**: Die Adresse, unter der der [[Glossar#Spielserver|Spielserver]] erreichbar sein soll. Betrifft den Child `childBindAddress`. Ruft `effectiveBindAddress`, `hostBindAddress`.
> - **Schritt Z.359 getConfig().set(prefix + 'serverIp', ip);**: Zeile 359: liest die Config. `getConfig().set(prefix + 'serverIp', ip);`

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.syncPropertiesEdit`.
