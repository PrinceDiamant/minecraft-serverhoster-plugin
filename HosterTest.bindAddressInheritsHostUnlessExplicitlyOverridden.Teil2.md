[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil1]] › [[HosterTest.bindAddressInheritsHostUnlessExplicitlyOverridden]] › [[HosterTest.bindAddressInheritsHostUnlessExplicitlyOverridden.Teil2]]

# HosterTest.bindAddressInheritsHostUnlessExplicitlyOverridden.Teil2

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.forcedProperties"]:::internal-link
  n2["Profiles.load"]:::internal-link
  n3["FabricLauncherPlugin.forcedProperties"]:::internal-link
  n4["FabricLauncherPlugin.forcedProperties"]:::internal-link
  n5["FabricLauncherPlugin.effectiveBindAddress"]:::internal-link
  n6["FabricLauncherPlugin.effectiveBindAddress"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
```

```knoten
FabricLauncherPlugin.forcedProperties
  Erzwingt `forcedProperties`. Ruft `effectiveBindAddress`.
Profiles.load
  Lädt `load`. Ruft `one`, `str`, `copyId`. Befund: angemeldet aber nicht umgesetzt (sicher).
FabricLauncherPlugin.effectiveBindAddress
  Liefert den wirksamen Wert `effectiveBindAddress`.
```

- Fortsetzung von `HosterTest.bindAddressInheritsHostUnlessExplicitlyOverridden`, Quellreihenfolge.
