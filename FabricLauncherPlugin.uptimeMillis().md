[[00 Start]] › [[Plugin-Kern]] › [[Slot-Status]] › [[FabricLauncherPlugin.uptimeMillis()]]

# FabricLauncherPlugin.uptimeMillis()

`FabricLauncherPlugin.uptimeMillis()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:308–308](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L308-L308)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.focusSlot"]:::internal-link
  n2["ChildSlot.uptimeMillis"]:::internal-link
  n3["return Z.308 return focusSlot().uptimeMillis();"]
  n1 -->|"Z.308"| n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.focusSlot
  Liefert oder setzt den Fokus `focusSlot`. Ruft `slot`.
ChildSlot.uptimeMillis
  Liefert die Laufzeit `uptimeMillis`. Ruft `running`.
return Z.308 return focusSlot().uptimeMillis();
  Zeile 308: Rückgabe `return focusSlot().uptimeMillis();`.
```

- `uptimeMillis` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
- Befund: toter Code, sicher. src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:308–308 kein Aufruf, kein Treffer in plugin.yml/UI/Strings
