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
  n5 -->|"Zeile 101"| n4
  n5 -->|"Zeile 102"| n3
  n5 -->|"Zeile 104"| n1
  n5 -->|"Zeile 113"| n10
  n5 -->|"Zeile 114"| n8
  n6 -->|"Zeile 118"| n5
  n7 -->|"Zeile 119"| n6
  n10 -->|"Zeile 162"| n9
  n10 -->|"Zeile 171"| n11
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.fmtUp
  Die ältere [[Glossar#Bedienseite|Bedienseite]] macht lesbar die Laufzeit.
index.fmtSize
  Die ältere [[Glossar#Bedienseite|Bedienseite]] macht lesbar die Größe.
index.lifecycleLabel
  Setzt die Beschriftung, die den Zustand in der älteren [[Glossar#Bedienseite|Bedienseite]] zeigt.
index.updateChildActions
  Die ältere [[Glossar#Bedienseite|Bedienseite]] ändert den [[Glossar#Spielserver|Spielserver]] die Tätigkeiten.
index.status
  Holt den Zustand und zeichnet ihn in die ältere [[Glossar#Bedienseite|Bedienseite]].
index.act
  Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] Start, [[Glossar#Stopp|Stopp]] oder [[Glossar#Neustart|Neustart]].
index.confirmStop
  Die ältere [[Glossar#Bedienseite|Bedienseite]] fragt nach den [[Glossar#Stopp|Stopp]].
index.spark
  Zeichnet in der älteren [[Glossar#Bedienseite|Bedienseite]] eine kleine Kurve der letzten Messwerte.
index.pushChartValue
  Die ältere [[Glossar#Bedienseite|Bedienseite]] zeichnet den Wert.
index.updateCharts
  Die ältere [[Glossar#Bedienseite|Bedienseite]] ändert die Kurven.
index.chartCard
  Baut in der älteren [[Glossar#Bedienseite|Bedienseite]] eine Karte mit einer Kurve.
```

> [!knoten] Was die Blöcke tun
> - **index.fmtUp**: Die ältere [[Glossar#Bedienseite|Bedienseite]] macht lesbar die Laufzeit.
> - **index.fmtSize**: Die ältere [[Glossar#Bedienseite|Bedienseite]] macht lesbar die Größe.
> - **index.lifecycleLabel**: Setzt die Beschriftung, die den Zustand in der älteren [[Glossar#Bedienseite|Bedienseite]] zeigt.
> - **index.updateChildActions**: Die ältere [[Glossar#Bedienseite|Bedienseite]] ändert den [[Glossar#Spielserver|Spielserver]] die Tätigkeiten.
> - **index.status**: Holt den Zustand und zeichnet ihn in die ältere [[Glossar#Bedienseite|Bedienseite]].
> - **index.act**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] Start, [[Glossar#Stopp|Stopp]] oder [[Glossar#Neustart|Neustart]].
> - **index.confirmStop**: Die ältere [[Glossar#Bedienseite|Bedienseite]] fragt nach den [[Glossar#Stopp|Stopp]].
> - **index.spark**: Zeichnet in der älteren [[Glossar#Bedienseite|Bedienseite]] eine kleine Kurve der letzten Messwerte.
> - **index.pushChartValue**: Die ältere [[Glossar#Bedienseite|Bedienseite]] zeichnet den Wert.
> - **index.updateCharts**: Die ältere [[Glossar#Bedienseite|Bedienseite]] ändert die Kurven.
> - **index.chartCard**: Baut in der älteren [[Glossar#Bedienseite|Bedienseite]] eine Karte mit einer Kurve.

- Die ältere [[Glossar#Bedienseite|Bedienseite]] fragt alle drei Sekunden nach, wie es dem [[Glossar#Spielserver|Spielserver]] geht.
