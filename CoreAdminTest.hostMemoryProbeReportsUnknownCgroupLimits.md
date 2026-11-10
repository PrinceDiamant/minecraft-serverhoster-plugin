[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil2]] › [[CoreAdminTest.hostMemoryProbeReportsUnknownCgroupLimits]]

# CoreAdminTest.hostMemoryProbeReportsUnknownCgroupLimits

`CoreAdminTest.hostMemoryProbeReportsUnknownCgroupLimits()` [src/test/java/de/aichele/childlauncher/CoreAdminTest.java:211–224](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/test/java/de/aichele/childlauncher/CoreAdminTest.java#L211-L224)

```mermaid
flowchart TD
  n1["Schritt Z.212 Path proc = Files.createDirectories(tmp.resolve('…"]
  n2["Schritt Z.213 Files.createDirectories(tmp.resolve('cgroup'));"]
  n3["Schritt Z.214 Files.writeString(tmp.resolve('proc/meminfo'), 'M…"]
  n4["Schritt Z.215 Files.writeString(proc.resolve('cgroup'), '0:://n…"]
  n5["Schritt Z.216 Files.writeString(tmp.resolve('cgroup/memory.max'…"]
  n6["Schritt Z.217 Files.writeString(tmp.resolve('cgroup/memory.curr…"]
  n7["HostMemoryProbe.snapshot(Path,Path)"]:::internal-link
  n8["HostMemoryProbe.Snapshot.cgroupUsePercent"]:::internal-link
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

- `hostMemoryProbeReportsUnknownCgroupLimits` in `src/test/java/de/aichele/childlauncher/CoreAdminTest.java`
- Auslöser: Test
