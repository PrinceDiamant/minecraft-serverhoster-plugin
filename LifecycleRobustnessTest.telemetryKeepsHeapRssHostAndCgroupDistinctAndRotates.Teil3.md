[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil2]] › [[LifecycleRobustnessTest.telemetryKeepsHeapRssHostAndCgroupDistinctAndRotates]] › [[LifecycleRobustnessTest.telemetryKeepsHeapRssHostAndCgroupDistinctAndRotates.Teil3]]

# LifecycleRobustnessTest.telemetryKeepsHeapRssHostAndCgroupDistinctAndRotates.Teil3

```mermaid
flowchart TD
  n1["MemoryTelemetry.appendRotated"]:::internal-link
  n2["MemoryTelemetry.appendRotated"]:::internal-link
  n3["Schritt Z.273 assertEquals('two/n', Files.readString(log));"]
  n4["Schritt Z.274 assertEquals('one/n', Files.readString(tmp.resolv…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
MemoryTelemetry.appendRotated
  Hängt an `appendRotated`.
Schritt Z.273 assertEquals('two/n', Files.readString(log));
  Zeile 273: liest Text aus einer Datei. `assertEquals('two/n', Files.readString(log));`
Schritt Z.274 assertEquals('one/n', Files.readString(tmp.resolv…
  Zeile 274: liest Text aus einer Datei. `assertEquals('one/n', Files.readString(tmp.resolv…`
```

- Fortsetzung von `LifecycleRobustnessTest.telemetryKeepsHeapRssHostAndCgroupDistinctAndRotates`, Quellreihenfolge.
