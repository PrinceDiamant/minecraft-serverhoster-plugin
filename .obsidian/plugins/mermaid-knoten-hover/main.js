const { Plugin, MarkdownRenderChild } = require("obsidian");

function norm(value) {
  return (value || "").replace(/\s+/g, " ").trim();
}

function parseTips(source) {
  const map = new Map();
  let label = null;
  let parts = [];
  const flush = () => {
    if (!label) return;
    const tip = parts.join(" ").trim();
    if (tip) map.set(norm(label), tip);
    label = null;
    parts = [];
  };
  for (const raw of source.split(/\r?\n/)) {
    if (raw.startsWith("  ") || raw.startsWith("\t")) {
      if (label) parts.push(raw.trim());
      continue;
    }
    if (raw.trim()) {
      flush();
      label = raw.trim();
      continue;
    }
    flush();
  }
  flush();
  return map;
}

function nodeText(node) {
  const label = node.querySelector(".nodeLabel") || node.querySelector("foreignObject") || node;
  return norm(label.textContent);
}

function lookup(tips, text) {
  const key = norm(text);
  if (tips.has(key)) return tips.get(key);
  const dotted = key.replace(/…/g, "...");
  if (tips.has(dotted)) return tips.get(dotted);
  const ellipsis = key.replace(/\.\.\./g, "…");
  if (tips.has(ellipsis)) return tips.get(ellipsis);
  return null;
}

function findMermaid(start) {
  let node = start;
  for (let depth = 0; depth < 8 && node; depth++) {
    let prev = node.previousElementSibling;
    while (prev) {
      if (prev.querySelector && prev.querySelector("g.node")) return prev;
      prev = prev.previousElementSibling;
    }
    node = node.parentElement;
  }
  return null;
}

class KnotenChild extends MarkdownRenderChild {
  constructor(el, tips, plugin) {
    super(el);
    this.tips = tips;
    this.plugin = plugin;
    this.observer = null;
  }

  onload() {
    this.containerEl.style.display = "none";
    this.tryBind();
    const watch = this.containerEl.closest(".markdown-preview-section")
      || this.containerEl.closest(".markdown-rendered")
      || this.containerEl.parentElement;
    if (!watch) return;
    this.observer = new MutationObserver(() => this.tryBind());
    this.observer.observe(watch, { childList: true, subtree: true });
  }

  onunload() {
    if (this.observer) this.observer.disconnect();
    this.plugin.hide();
  }

  tryBind() {
    const host = findMermaid(this.containerEl);
    if (!host) return;
    const svg = host.querySelector("svg");
    if (!svg || svg.dataset.knotenBound === "1") return;
    const nodes = svg.querySelectorAll("g.node");
    if (!nodes.length) return;
    svg.dataset.knotenBound = "1";
    nodes.forEach((node) => {
      const tip = lookup(this.tips, nodeText(node));
      if (!tip) return;
      node.addEventListener("mouseenter", (event) => this.plugin.show(tip, event));
      node.addEventListener("mousemove", (event) => this.plugin.move(event));
      node.addEventListener("mouseleave", () => this.plugin.hide());
    });
  }
}

module.exports = class MermaidKnotenHover extends Plugin {
  onload() {
    this.tipEl = document.createElement("div");
    this.tipEl.className = "knoten-hover";
    this.tipEl.style.display = "none";
    document.body.appendChild(this.tipEl);
    this.register(() => this.tipEl.remove());

    this.registerMarkdownCodeBlockProcessor("knoten", (source, el, ctx) => {
      const tips = parseTips(source);
      ctx.addChild(new KnotenChild(el, tips, this));
    });
  }

  show(text, event) {
    this.tipEl.textContent = text;
    this.tipEl.style.display = "block";
    this.move(event);
  }

  move(event) {
    if (this.tipEl.style.display === "none") return;
    const pad = 12;
    const rect = this.tipEl.getBoundingClientRect();
    let x = event.clientX + 14;
    let y = event.clientY + 18;
    if (x + rect.width > window.innerWidth - pad) x = Math.max(pad, event.clientX - rect.width - 14);
    if (y + rect.height > window.innerHeight - pad) y = Math.max(pad, event.clientY - rect.height - 12);
    this.tipEl.style.left = x + "px";
    this.tipEl.style.top = y + "px";
  }

  hide() {
    if (this.tipEl) this.tipEl.style.display = "none";
  }
};
