[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil2]] › [[CoreAdminTest.hostMemoryProbeSeparatesCgroupV1LimitHitsFromOomEvents]] › [[CoreAdminTest.hostMemoryProbeSeparatesCgroupV1LimitHitsFromOomEvents.Teil1]]

# CoreAdminTest.hostMemoryProbeSeparatesCgroupV1LimitHitsFromOomEvents.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.176 Path proc = Files.createDirectories(tmp.resolve('…"]
  n2["Schritt Z.177 Path memory = Files.createDirectories(tmp.resolve…"]
  n3["Schritt Z.178 Files.writeString(proc.resolve('cgroup'), '5:memo…"]
  n4["Schritt Z.179 Files.writeString(memory.resolve('memory.limit_in…"]
  n5["Schritt Z.180 Files.writeString(memory.resolve('memory.usage_in…"]
  n6["Schritt Z.181 Files.writeString(memory.resolve('memory.memsw.us…"]
  n7["Schritt Z.182 Files.writeString(memory.resolve('memory.failcnt'…"]
  n8["HostMemoryProbe.snapshot(Path,Path)"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.176 Path proc = Files.createDirectories(tmp.resolve('…
  Zeile 176: Dateioperation. `Path proc = Files.createDirectories(tmp.resolve('…`
Schritt Z.177 Path memory = Files.createDirectories(tmp.resolve…
  Zeile 177: Dateioperation. `Path memory = Files.createDirectories(tmp.resolve…`
Schritt Z.178 Files.writeString(proc.resolve('cgroup'), '5:memo…
  Zeile 178: schreibt Text in eine Datei. `Files.writeString(proc.resolve('cgroup'), '5:memo…`
Schritt Z.179 Files.writeString(memory.resolve('memory.limit_in…
  Zeile 179: schreibt Text in eine Datei. `Files.writeString(memory.resolve('memory.limit_in…`
Schritt Z.180 Files.writeString(memory.resolve('memory.usage_in…
  Zeile 180: schreibt Text in eine Datei. `Files.writeString(memory.resolve('memory.usage_in…`
Schritt Z.181 Files.writeString(memory.resolve('memory.memsw.us…
  Zeile 181: schreibt Text in eine Datei. `Files.writeString(memory.resolve('memory.memsw.us…`
Schritt Z.182 Files.writeString(memory.resolve('memory.failcnt'…
  Zeile 182: schreibt Text in eine Datei. `Files.writeString(memory.resolve('memory.failcnt'…`
HostMemoryProbe.snapshot(Path,Path)
  `snapshot` in `HostMemoryProbe.java`. Ruft `meminfo`, `cgroup`.
```

- Fortsetzung von `CoreAdminTest.hostMemoryProbeSeparatesCgroupV1LimitHitsFromOomEvents`, Quellreihenfolge.
