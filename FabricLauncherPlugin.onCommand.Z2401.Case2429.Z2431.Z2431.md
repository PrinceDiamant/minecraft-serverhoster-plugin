[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2429.Z2431.Z2431]]

# FabricLauncherPlugin.onCommand.Z2401.Case2429.Z2431.Z2431

```mermaid
flowchart TD
  n1["try Z.2431"]
  n2["for Z.2431 (String v : versions(a(1)).stream().lim…"]
  n3["FabricLauncherPlugin.versions"]:::internal-link
  n4["FabricLauncherPlugin.msg"]:::internal-link
  n5["catch Z.2431 (Exception e)"]
  n6["FabricLauncherPlugin.msg"]:::internal-link
  n2 -->|"Z.2431"| n3
  n3 -->|"wiederholen"| n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.2431
  Zeile 2431: Versuch. Der Fehlerpfad geht in catch.
for Z.2431 (String v : versions(a(1)).stream().lim…
  Zeile 2431: Schleife `(String v : versions(a(1)).stream().lim…`.
FabricLauncherPlugin.versions
  Liefert die bekannten [[Glossar#Version|Versionen]]. `versions` in `FabricLauncherPlugin.java`. Ruft `fetch`.
FabricLauncherPlugin.msg
  Schickt eine [[Glossar#Zeile|Zeile]] an den Menschen, der einen [[Glossar#Befehl|Befehl]] getippt hat. Sendet eine Chat-Zeile `msg`.
catch Z.2431 (Exception e)
  Zeile 2431: fängt (Exception e).
```

> [!knoten]- Was die Blöcke tun
> - **try Z.2431**: Zeile 2431: Versuch. Der Fehlerpfad geht in catch.
> - **for Z.2431 (String v : versions(a(1)).stream().lim…**: Zeile 2431: Schleife `(String v : versions(a(1)).stream().lim…`.
> - **FabricLauncherPlugin.versions**: Liefert die bekannten [[Glossar#Version|Versionen]]. `versions` in `FabricLauncherPlugin.java`. Ruft `fetch`.
> - **FabricLauncherPlugin.msg**: Schickt eine [[Glossar#Zeile|Zeile]] an den Menschen, der einen [[Glossar#Befehl|Befehl]] getippt hat. Sendet eine Chat-Zeile `msg`.
> - **catch Z.2431 (Exception e)**: Zeile 2431: fängt (Exception e).

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 2431 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401.Case2429.Z2431`.
