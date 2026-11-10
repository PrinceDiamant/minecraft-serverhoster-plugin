[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil2]] › [[CoreAdminTest.hostMemoryProbeReadsCgroupV2AndHostSwapWithoutCommands]] › [[CoreAdminTest.hostMemoryProbeReadsCgroupV2AndHostSwapWithoutCommands.Teil1]]

# CoreAdminTest.hostMemoryProbeReadsCgroupV2AndHostSwapWithoutCommands.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.151 Path proc = Files.createDirectories(tmp.resolve('…"]
  n2["Schritt Z.152 Path cgroups = Files.createDirectories(tmp.resolv…"]
  n3["Schritt Z.153 Files.writeString(tmp.resolve('proc/meminfo'), 'M…"]
  n4["Schritt Z.154 Files.writeString(proc.resolve('cgroup'), '0::/te…"]
  n5["Schritt Z.155 Files.writeString(cgroups.resolve('memory.current…"]
  n6["Schritt Z.156 Files.writeString(cgroups.resolve('memory.max'), …"]
  n7["Schritt Z.157 Files.writeString(cgroups.resolve('memory.swap.cu…"]
  n8["Schritt Z.158 Files.writeString(cgroups.resolve('memory.events'…"]
  n9["HostMemoryProbe.snapshot(Path,Path)"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  n7 --> n8
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `CoreAdminTest.hostMemoryProbeReadsCgroupV2AndHostSwapWithoutCommands`, Quellreihenfolge.
