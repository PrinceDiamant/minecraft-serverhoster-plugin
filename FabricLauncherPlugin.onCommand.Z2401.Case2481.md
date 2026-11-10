[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2481]]

# FabricLauncherPlugin.onCommand.Z2401.Case2481

```mermaid
flowchart TD
  n1["if Z.2482 (a.length ( 3 // !a(1).equalsIgnoreCase('set'))"]
  n2["return Z.2482 return true;"]
  n3["try Z.2484"]
  n4["FabricLauncherPlugin.setChildProperty(String,String)"]:::internal-link
  n5["catch Z.2487 (IOException e)"]
  n1 -->|"ja"| n2
  n3 --> n4
  n3 -->|"Fehler"| n5
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.2482 (a.length ( 3 // !a(1).equalsIgnoreCase('set'))
  Zeile 2482: prüft `(a.length ( 3 // !a(1).equalsIgnoreCase('set'))`.
return Z.2482 return true;
  Zeile 2482: Rückgabe `return true;`.
try Z.2484
  Zeile 2484: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.setChildProperty(String,String)
  Das [[Glossar#Plugin|Plugin]] setzt den [[Glossar#Spielserver|Spielserver]] eine Eigenschaft. Setzt `setChildProperty`. Ruft `setChildProperty`.
catch Z.2487 (IOException e)
  Zeile 2487: fängt (IOException e).
```

> [!knoten]- Was die Blöcke tun
> - **if Z.2482 (a.length ( 3 // !a(1).equalsIgnoreCase('set'))**: Zeile 2482: prüft `(a.length ( 3 // !a(1).equalsIgnoreCase('set'))`.
> - **return Z.2482 return true;**: Zeile 2482: Rückgabe `return true;`.
> - **try Z.2484**: Zeile 2484: Versuch. Der Fehlerpfad geht in catch.
> - **FabricLauncherPlugin.setChildProperty(String,String)**: Das [[Glossar#Plugin|Plugin]] setzt den [[Glossar#Spielserver|Spielserver]] eine Eigenschaft. Setzt `setChildProperty`. Ruft `setChildProperty`.
> - **catch Z.2487 (IOException e)**: Zeile 2487: fängt (IOException e).

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 2481.
- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401`.
