[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil4]] › [[HosterTest.crashIndexReadsAndRejectsEscape]] › [[HosterTest.crashIndexReadsAndRejectsEscape.Teil1]]

# HosterTest.crashIndexReadsAndRejectsEscape.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.485 Path root = Files.createDirectories(tmp.resolve('…"]
  n2["Schritt Z.486 Path crashes = Files.createDirectories(root.resol…"]
  n3["Schritt Z.487 Files.writeString(crashes.resolve('crash-2026-10-…"]
  n4["Schritt Z.488 Files.writeString(crashes.resolve('notes.md'), 'n…"]
  n5["Schritt Z.489 Path outside = Files.createDirectories(tmp.resolv…"]
  n6["Schritt Z.490 Files.writeString(outside.resolve('secret.txt'), …"]
  n7["HosterTest.tryCreateSymbolicLink"]:::internal-link
  n8["CrashIndex.list"]:::internal-link
  n9["CrashIndex.read"]:::internal-link
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

- Fortsetzung von `HosterTest.crashIndexReadsAndRejectsEscape`, Quellreihenfolge.
