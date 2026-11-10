[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Status]] › [[index.status]] › [[index.status.Z101.Teil5]]

# index.status.Z101.Teil5

```mermaid
flowchart TD
  n1["index.$"]:::internal-link
  n2["index.esc"]:::internal-link
  n3["index.updateCharts"]:::internal-link
  n4["index.$"]:::internal-link
  n5["index.spark"]:::internal-link
  n6["index.$"]:::internal-link
  n7["index.esc"]:::internal-link
  n1 -->|"Z.112"| n2
  n2 --> n3
  n4 -->|"Z.114"| n5
  n3 --> n4
  n6 -->|"Z.115"| n7
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.$
  Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
index.esc
  Macht einen Text so ungefährlich, dass die Seite ihn anzeigen kann. Maskiert HTML `esc`.
index.updateCharts
  Die ältere [[Glossar#Bedienseite|Bedienseite]] ändert die Kurven. Aktualisiert `updateCharts`. Ruft `pushChartValue`, `$`, `chartCard`.
index.spark
  Zeichnet in der älteren [[Glossar#Bedienseite|Bedienseite]] eine kleine Kurve der letzten Messwerte. Zeichnet eine Sparkline `spark`.
```

> [!knoten]- Was die Blöcke tun
> - **index.$**: Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
> - **index.esc**: Macht einen Text so ungefährlich, dass die Seite ihn anzeigen kann. Maskiert HTML `esc`.
> - **index.updateCharts**: Die ältere [[Glossar#Bedienseite|Bedienseite]] ändert die Kurven. Aktualisiert `updateCharts`. Ruft `pushChartValue`, `$`, `chartCard`.
> - **index.spark**: Zeichnet in der älteren [[Glossar#Bedienseite|Bedienseite]] eine kleine Kurve der letzten Messwerte. Zeichnet eine Sparkline `spark`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `index.status.Z101`.
