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

- Fortsetzung von `CoreAdminTest.hostMemoryProbeSeparatesCgroupV1LimitHitsFromOomEvents`, Quellreihenfolge.
