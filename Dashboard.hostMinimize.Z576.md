[[00 Start]] › [[Dashboard-HTTP]] › [[API-Setup]] › [[Dashboard.hostMinimize]] › [[Dashboard.hostMinimize.Z576]]

# Dashboard.hostMinimize.Z576

```mermaid
flowchart TD
  n1["return Z.576 return switch (action) ( case 'preview' -) pl.hos…"]
  n2["FabricLauncherPlugin.hostMinimizeView"]:::internal-link
  n3["FabricLauncherPlugin.hostMinimizeApply"]:::internal-link
  n4["FabricLauncherPlugin.hostMinimizeRollback"]:::internal-link
  n2 --> n3
  n3 --> n4
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
return Z.576 return switch (action) ( case 'preview' -) pl.hos…
  Zeile 576: Rückgabe `return switch (action) ( case 'preview' -) pl.hos…`.
FabricLauncherPlugin.hostMinimizeView
  Betrifft den Host `hostMinimizeView`. Ruft `readHostMinimizeState`, `configuredHostWorld`, `preview`.
FabricLauncherPlugin.hostMinimizeApply
  Betrifft den Host `hostMinimizeApply`. Ruft `focusSlot`, `running`, `stopBlocking`.
FabricLauncherPlugin.hostMinimizeRollback
  Betrifft den Host `hostMinimizeRollback`. Ruft `readHostMinimizeState`, `restore`, `getWorldRoot`.
```

- Fortsetzung von `Dashboard.hostMinimize`, Quellreihenfolge.
