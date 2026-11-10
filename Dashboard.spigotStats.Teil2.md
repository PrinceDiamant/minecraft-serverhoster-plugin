[[00 Start]] › [[Dashboard-HTTP]] › [[API-Status]] › [[Dashboard.spigotStats]] › [[Dashboard.spigotStats.Teil2]]

# Dashboard.spigotStats.Teil2

```mermaid
flowchart TD
  n1["Dashboard.rssMb"]:::internal-link
  n2["Schritt Z.656 o.put('cores', Runtime.getRuntime().availableProc…"]
  n3["return Z.657 return o;"]
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.rssMb
  Liest, wie viel [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] der [[Glossar#Prozess|Prozess]] gerade belegt. `rssMb` in `Dashboard.java`.
Schritt Z.656 o.put('cores', Runtime.getRuntime().availableProc…
  Zeile 656: fragt die JVM-Laufzeit. `o.put('cores', Runtime.getRuntime().availableProc…`
return Z.657 return o;
  Zeile 657: Rückgabe `return o;`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.rssMb**: Liest, wie viel [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] der [[Glossar#Prozess|Prozess]] gerade belegt. `rssMb` in `Dashboard.java`.
> - **Schritt Z.656 o.put('cores', Runtime.getRuntime().availableProc…**: Zeile 656: fragt die JVM-Laufzeit. `o.put('cores', Runtime.getRuntime().availableProc…`
> - **return Z.657 return o;**: Zeile 657: Rückgabe `return o;`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `Dashboard.spigotStats`.
