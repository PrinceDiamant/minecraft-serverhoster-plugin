[[00 Start]] › [[Plugin-Kern]] › [[Fokus]]

# Fokus

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.focusId"]:::internal-link
  n2["FabricLauncherPlugin.profiles"]:::internal-link
  n3["FabricLauncherPlugin.profile"]:::internal-link
  n4["FabricLauncherPlugin.slot"]:::internal-link
  n5["FabricLauncherPlugin.focusSlot"]:::internal-link
  n6["FabricLauncherPlugin.focus"]:::internal-link
  n7["FabricLauncherPlugin.workDir()"]:::internal-link
  n8["FabricLauncherPlugin.workDir(String)"]:::internal-link
  n9["FabricLauncherPlugin.workDirs"]:::internal-link
  n4 -->|"Zeile 299"| n3
  n5 -->|"Zeile 303"| n4
  n7 -->|"Zeile 859"| n3
  n8 -->|"Zeile 860"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
  style n6 fill:#f88,stroke:#900
  style n7 fill:#f88,stroke:#900
  style n9 fill:#f88,stroke:#900
```

```knoten
FabricLauncherPlugin.focusId
  Das [[Glossar#Plugin|Plugin]] liefert die Kennung.
FabricLauncherPlugin.profiles
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.profile
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
FabricLauncherPlugin.slot
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
FabricLauncherPlugin.focusSlot
  Das [[Glossar#Plugin|Plugin]] liefert den [[Glossar#Platz|Platz]].
FabricLauncherPlugin.focus
  Liefert den Server, der gerade gemeint ist. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.workDir()
  Liefert den Ordner, in dem der [[Glossar#Spielserver|Spielserver]] arbeitet. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.workDir(String)
  Liefert den Ordner, in dem der [[Glossar#Spielserver|Spielserver]] arbeitet.
FabricLauncherPlugin.workDirs
  Die Ordner, in denen die Server arbeiten. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
```

> [!knoten] Was die Blöcke tun
> - **FabricLauncherPlugin.focusId**: Das [[Glossar#Plugin|Plugin]] liefert die Kennung.
> - **FabricLauncherPlugin.profiles**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.profile**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
> - **FabricLauncherPlugin.slot**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
> - **FabricLauncherPlugin.focusSlot**: Das [[Glossar#Plugin|Plugin]] liefert den [[Glossar#Platz|Platz]].
> - **FabricLauncherPlugin.focus**: Liefert den Server, der gerade gemeint ist. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.workDir()**: Liefert den Ordner, in dem der [[Glossar#Spielserver|Spielserver]] arbeitet. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.workDir(String)**: Liefert den Ordner, in dem der [[Glossar#Spielserver|Spielserver]] arbeitet.
> - **FabricLauncherPlugin.workDirs**: Die Ordner, in denen die Server arbeiten. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].

- Welcher Server gerade gemeint ist. Praktisch ist es immer derselbe eine.
