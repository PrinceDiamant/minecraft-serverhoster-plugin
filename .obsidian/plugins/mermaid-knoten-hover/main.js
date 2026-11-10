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
  for (const raw of String(source || "").split(/\r?\n/)) {
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

function renderTip(text) {
  const frag = document.createDocumentFragment();
  const re = /\[\[([^\]|#]+)(?:#([^\]|]+))?\|([^\]]+)\]\]|`([^`]+)`/g;
  let last = 0;
  let match;
  while ((match = re.exec(text))) {
    if (match.index > last) frag.append(text.slice(last, match.index));
    if (match[4]) {
      const code = document.createElement("code");
      code.textContent = match[4];
      frag.append(code);
    } else {
      const link = document.createElement("a");
      link.className = "internal-link";
      link.dataset.href = match[2] ? `${match[1]}#${match[2]}` : match[1];
      link.textContent = match[3];
      frag.append(link);
    }
    last = match.index + match[0].length;
  }
  if (last < text.length) frag.append(text.slice(last));
  return frag;
}

function plainTip(text) {
  return text
    .replace(/\[\[([^\]|#]+)(?:#[^\]|]+)?\|([^\]]+)\]\]/g, "$2")
    .replace(/`([^`]+)`/g, "$1");
}

class KnotenChild extends MarkdownRenderChild {
  constructor(el, tips, plugin) {
    super(el);
    this.tips = tips;
    this.plugin = plugin;
  }

  onload() {
    this.containerEl.dataset.knotenAnchor = "1";
    this.containerEl.style.display = "none";
    this.plugin.anchors.set(this.containerEl, this.tips);
    this.plugin.scheduleScan();
  }

  onunload() {
    this.plugin.anchors.delete(this.containerEl);
  }
}

module.exports = class MermaidKnotenHover extends Plugin {
  onload() {
    this.anchors = new Map();
    this.nodeTips = new WeakMap();
    this.current = null;
    this.hideTimer = null;
    this.scanFrame = 0;

    this.tipEl = document.createElement("div");
    this.tipEl.className = "knoten-hover";
    this.tipEl.style.display = "none";
    this.tipEl.addEventListener("mouseenter", () => this.cancelHide());
    this.tipEl.addEventListener("mouseleave", () => this.scheduleHide());
    this.tipEl.addEventListener("click", (event) => {
      const link = event.target.closest("a");
      if (!link) return;
      event.preventDefault();
      this.app.workspace.openLinkText(link.dataset.href || "", "", "tab");
    });
    document.body.appendChild(this.tipEl);
    this.register(() => this.tipEl.remove());

    const onOver = (event) => this.onOver(event);
    document.addEventListener("mouseover", onOver, true);
    this.register(() => document.removeEventListener("mouseover", onOver, true));

    this.observer = new MutationObserver(() => this.scheduleScan());
    this.observer.observe(document.body, { childList: true, subtree: true });
    this.register(() => this.observer.disconnect());

    this.registerEvent(this.app.workspace.on("layout-change", () => this.scheduleScan()));
    this.registerEvent(this.app.workspace.on("active-leaf-change", () => this.scheduleScan()));

    this.registerMarkdownCodeBlockProcessor("knoten", (source, el, ctx) => {
      ctx.addChild(new KnotenChild(el, parseTips(source), this));
    });
  }

  scheduleScan() {
    if (this.scanFrame) return;
    this.scanFrame = window.requestAnimationFrame(() => {
      this.scanFrame = 0;
      this.scan();
    });
  }

  scan() {
    const svgs = [...document.querySelectorAll("svg")].filter((svg) => svg.querySelector("g.node, .nodeLabel"));
    const anchors = [...this.anchors.keys()].filter((anchor) => anchor.isConnected);
    anchors.sort((a, b) => (a.compareDocumentPosition(b) & Node.DOCUMENT_POSITION_FOLLOWING ? -1 : 1));
    const used = new Set();
    for (const anchor of anchors) {
      let chosen = null;
      for (const svg of svgs) {
        if (used.has(svg) || svg.dataset.knotenReady === "1") continue;
        if (svg.compareDocumentPosition(anchor) & Node.DOCUMENT_POSITION_FOLLOWING) chosen = svg;
      }
      if (!chosen) continue;
      if (this.bind(chosen, this.anchors.get(anchor))) {
        chosen.dataset.knotenReady = "1";
        used.add(chosen);
      }
    }
  }

  bind(svg, tips) {
    const nodes = [...svg.querySelectorAll("g.node")];
    if (!nodes.length) return false;
    let matched = 0;
    let labeled = 0;
    for (const node of nodes) {
      const text = nodeText(node);
      if (text) labeled += 1;
      const tip = lookup(tips, text);
      if (!tip) continue;
      matched += 1;
      this.nodeTips.set(node, tip);
      node.dataset.knotenNode = "1";
      const label = node.querySelector(".nodeLabel");
      if (label) label.setAttribute("title", plainTip(tip));
      node.setAttribute("title", plainTip(tip));
    }
    return matched > 0 || (labeled > 0 && labeled === nodes.length);
  }

  onOver(event) {
    const target = event.target;
    if (!target || !target.closest) return;
    if (this.tipEl.contains(target)) {
      this.cancelHide();
      return;
    }
    const node = target.closest("g.node");
    if (node && this.nodeTips.has(node)) {
      if (this.current === node) return;
      this.current = node;
      this.show(this.nodeTips.get(node), event);
      return;
    }
    if (this.current) {
      this.current = null;
      this.scheduleHide();
    }
  }

  show(text, event) {
    this.cancelHide();
    this.tipEl.replaceChildren(renderTip(text));
    this.tipEl.style.display = "block";
    this.move(event);
  }

  move(event) {
    if (this.tipEl.style.display === "none") return;
    const pad = 12;
    const rect = this.tipEl.getBoundingClientRect();
    let x = event.clientX + 16;
    let y = event.clientY + 22;
    if (x + rect.width > window.innerWidth - pad) x = Math.max(pad, event.clientX - rect.width - 16);
    if (y + rect.height > window.innerHeight - pad) y = Math.max(pad, event.clientY - rect.height - 14);
    this.tipEl.style.left = x + "px";
    this.tipEl.style.top = y + "px";
  }

  scheduleHide() {
    this.cancelHide();
    this.hideTimer = window.setTimeout(() => this.hide(), 280);
  }

  cancelHide() {
    if (this.hideTimer) {
      window.clearTimeout(this.hideTimer);
      this.hideTimer = null;
    }
  }

  hide() {
    this.cancelHide();
    this.current = null;
    if (this.tipEl) this.tipEl.style.display = "none";
  }
};
