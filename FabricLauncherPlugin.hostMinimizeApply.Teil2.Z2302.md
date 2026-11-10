[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]] › [[FabricLauncherPlugin.hostMinimizeApply]] › [[FabricLauncherPlugin.hostMinimizeApply.Teil2.Z2302]]

# FabricLauncherPlugin.hostMinimizeApply.Teil2.Z2302

```mermaid
flowchart TD
  n1["try Z.2302"]
  n2["FabricLauncherPlugin.writeHostMinimizeState"]:::internal-link
  n3["FabricLauncherPlugin.heapPrevious"]:::internal-link
  n4["catch Z.2304 (IOException e)"]
  n5["try Z.2305"]
  n6["HostMinimize.restore"]:::internal-link
  n7["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n8["catch Z.2307 (IOException restoreError)"]
  n9["throw Z.2310 throw e;"]
  n2 -->|"Z.2303"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n6 -->|"Z.2306"| n7
  n5 --> n6
  n5 -->|"Fehler"| n8
  n7 --> n9
  n8 --> n9
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.2302
  Zeile 2302: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.writeHostMinimizeState
  Das [[Glossar#Plugin|Plugin]] schreibt den [[Glossar#Host|Host]] das Verkleinern den Zustand. Schreibt `writeHostMinimizeState`. Ruft `hostMinimizeStateFile`, `stateText`.
FabricLauncherPlugin.heapPrevious
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Betrifft den Heap `heapPrevious`.
catch Z.2304 (IOException e)
  Zeile 2304: fängt (IOException e).
try Z.2305
  Zeile 2305: Versuch. Der Fehlerpfad geht in catch.
HostMinimize.restore
  Das Verkleinern des [[Glossar#Host|Host]] stellt wieder her das. Stellt wieder her `restore`. Ruft `assertEditable`.
FabricLauncherPlugin.getWorldRoot
  Das [[Glossar#Plugin|Plugin]] liefert die [[Glossar#Spielwelt|Spielwelt]] den Anfang. Liefert `getWorldRoot`.
catch Z.2307 (IOException restoreError)
  Zeile 2307: fängt (IOException restoreError).
throw Z.2310 throw e;
  Zeile 2310: Abbruch `throw e;`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.2302**: Zeile 2302: Versuch. Der Fehlerpfad geht in catch.
> - **FabricLauncherPlugin.writeHostMinimizeState**: Das [[Glossar#Plugin|Plugin]] schreibt den [[Glossar#Host|Host]] das Verkleinern den Zustand. Schreibt `writeHostMinimizeState`. Ruft `hostMinimizeStateFile`, `stateText`.
> - **FabricLauncherPlugin.heapPrevious**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Betrifft den Heap `heapPrevious`.
> - **catch Z.2304 (IOException e)**: Zeile 2304: fängt (IOException e).
> - **try Z.2305**: Zeile 2305: Versuch. Der Fehlerpfad geht in catch.
> - **HostMinimize.restore**: Das Verkleinern des [[Glossar#Host|Host]] stellt wieder her das. Stellt wieder her `restore`. Ruft `assertEditable`.
> - **FabricLauncherPlugin.getWorldRoot**: Das [[Glossar#Plugin|Plugin]] liefert die [[Glossar#Spielwelt|Spielwelt]] den Anfang. Liefert `getWorldRoot`.
> - **catch Z.2307 (IOException restoreError)**: Zeile 2307: fängt (IOException restoreError).
> - **throw Z.2310 throw e;**: Zeile 2310: Abbruch `throw e;`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 2302 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.hostMinimizeApply.Teil2`.
