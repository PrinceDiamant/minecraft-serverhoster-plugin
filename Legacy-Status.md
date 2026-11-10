[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Status]]

# Legacy-Status

```mermaid
flowchart TD
  n1["index.fmtUp"]:::internal-link
  n2["index.fmtSize"]:::internal-link
  n3["index.lifecycleLabel"]:::internal-link
  n4["index.updateChildActions"]:::internal-link
  n5["index.status"]:::internal-link
  n6["index.act"]:::internal-link
  n7["index.confirmStop"]:::internal-link
  n8["index.spark"]:::internal-link
  n9["index.pushChartValue"]:::internal-link
  n10["index.updateCharts"]:::internal-link
  n11["index.chartCard"]:::internal-link
  n5 -->|"Z.101"| n4
  n5 -->|"Z.102"| n3
  n5 -->|"Z.104"| n1
  n5 -->|"Z.113"| n10
  n5 -->|"Z.114"| n8
  n6 -->|"Z.118"| n5
  n7 -->|"Z.119"| n6
  n10 -->|"Z.162"| n9
  n10 -->|"Z.171"| n11
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.fmtUp
  Formatiert `fmtUp`.
index.fmtSize
  Formatiert `fmtSize`.
index.lifecycleLabel
  `lifecycleLabel` in `index.html`.
index.updateChildActions
  Aktualisiert `updateChildActions`. Ruft `$`.
index.status
  Liefert den Status `status`. Ruft `api`, `updateChildActions`, `$`.
index.act
  Sendet start, stop oder restart `act`. Ruft `$`, `post`, `toast`.
index.confirmStop
  Fragt nach `confirmStop`. Ruft `act`.
index.spark
  Zeichnet eine Sparkline `spark`.
index.pushChartValue
  Schiebt einen Wert in `pushChartValue`.
index.updateCharts
  Aktualisiert `updateCharts`. Ruft `pushChartValue`, `$`, `chartCard`.
index.chartCard
  Zeichnet das Diagramm `chartCard`. Ruft `x`, `y`.
```


