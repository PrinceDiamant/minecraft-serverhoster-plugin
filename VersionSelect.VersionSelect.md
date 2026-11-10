[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[VersionSelect]] › [[VersionSelect.VersionSelect]]

# VersionSelect.VersionSelect

`VersionSelect.VersionSelect({ type, value, onChange, preserve, catalog }: {
  type: string;
  value: string;
  onChange: (value: string) => void;
  preserve: boolean;
  catalog: ReturnType<typeof useVersionCatalog>;
})` [ui/src/components/VersionSelect.tsx:45–76](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/VersionSelect.tsx#L45-L76)

```mermaid
flowchart TD
  n1["if Z.59 type === 'custom'"]
  n2["return Z.60 return (label)Minecraft-Version(input value=(valu…"]
  n3["return Z.65 return (div) (label)Minecraft-Version (select val…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.59 type === 'custom'
  Zeile 59: prüft `type === 'custom'`.
return Z.60 return (label)Minecraft-Version(input value=(valu…
  Zeile 60: Rückgabe `return (label)Minecraft-Version(input value=(valu…`.
return Z.65 return (div) (label)Minecraft-Version (select val…
  Zeile 65: Rückgabe `return (div) (label)Minecraft-Version (select val…`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.59 type === 'custom'**: Zeile 59: prüft `type === 'custom'`.
> - **return Z.60 return (label)Minecraft-Version(input value=(valu…**: Zeile 60: Rückgabe `return (label)Minecraft-Version(input value=(valu…`.
> - **return Z.65 return (div) (label)Minecraft-Version (select val…**: Zeile 65: Rückgabe `return (div) (label)Minecraft-Version (select val…`.

- Die [[Glossar#Bedienseite|Bedienseite]] wählt das.
- `VersionSelect` in `ui/src/components/VersionSelect.tsx`
