(function () {
  const pageEl = document.getElementById("page");
  const tipEl = document.getElementById("tip");
  const nodeTips = new WeakMap();
  let current = null;
  let hideTimer = 0;
  let drawToken = 0;

  mermaid.initialize({
    startOnLoad: false,
    securityLevel: "loose",
    theme: "neutral",
    flowchart: { htmlLabels: true, useMaxWidth: true, wrappingWidth: 800 }
  });

  function norm(text) {
    return (text || "").replace(/[\u200b\u00a0]/g, " ").replace(/\s+/g, " ").trim();
  }

  function labelOf(node) {
    const label = node.querySelector(".nodeLabel");
    if (label) return norm(label.textContent);
    const text = node.querySelector("text, span");
    return norm(text ? text.textContent : "");
  }

  function bind(section) {
    const holder = section.querySelector(".tips");
    if (!holder) return;
    let tips = {};
    try { tips = JSON.parse(holder.textContent || "{}"); } catch (e) { return; }
    const byLabel = new Map();
    Object.keys(tips).forEach(function (key) { byLabel.set(norm(key), tips[key]); });
    section.querySelectorAll("svg g.node").forEach(function (node) {
      const text = labelOf(node);
      const tip = byLabel.get(text);
      if (!tip) return;
      node.setAttribute("data-label", text);
      nodeTips.set(node, tip);
      const title = document.createElementNS("http://www.w3.org/2000/svg", "title");
      title.textContent = norm(tip.replace(/<[^>]+>/g, " "));
      node.insertBefore(title, node.firstChild);
    });
  }

  function place(node) {
    const r = node.getBoundingClientRect();
    const w = tipEl.offsetWidth;
    const h = tipEl.offsetHeight;
    let x = r.right + 10;
    let y = r.top;
    if (x + w > window.innerWidth - 8) x = Math.max(8, r.left - w - 10);
    if (y + h > window.innerHeight - 8) y = Math.max(8, window.innerHeight - h - 8);
    tipEl.style.left = x + "px";
    tipEl.style.top = y + "px";
  }

  function show(node) {
    clearTimeout(hideTimer);
    const html = nodeTips.get(node);
    if (!html) return;
    if (current !== node) {
      tipEl.innerHTML = html;
      current = node;
    }
    tipEl.hidden = false;
    place(node);
  }

  function scheduleHide() {
    clearTimeout(hideTimer);
    hideTimer = setTimeout(function () {
      tipEl.hidden = true;
      current = null;
    }, 450);
  }

  document.addEventListener("mouseover", function (e) {
    if (tipEl.contains(e.target)) {
      clearTimeout(hideTimer);
      return;
    }
    const node = e.target.closest ? e.target.closest("svg g.node") : null;
    if (node && nodeTips.has(node)) {
      show(node);
      return;
    }
    if (current) scheduleHide();
  }, true);

  document.addEventListener("mouseout", function (e) {
    if (tipEl.contains(e.target)) return;
    const node = e.target.closest ? e.target.closest("svg g.node") : null;
    if (!node || !nodeTips.has(node)) return;
    const next = e.relatedTarget;
    if (next && (node.contains(next) || tipEl.contains(next))) return;
    scheduleHide();
  }, true);

  tipEl.addEventListener("mouseenter", function () { clearTimeout(hideTimer); });
  tipEl.addEventListener("mouseleave", scheduleHide);

  document.addEventListener("click", function (e) {
    if (e.target.closest && e.target.closest("#tip")) return;
    const node = e.target.closest ? e.target.closest("svg g.node") : null;
    if (!node) return;
    const text = node.getAttribute("data-label") || labelOf(node);
    if (!window.PAGES[text]) return;
    e.preventDefault();
    location.hash = "#/" + encodeURIComponent(text);
  }, true);

  async function draw(token) {
    const nodes = Array.from(pageEl.querySelectorAll("pre.mermaid"));
    for (const node of nodes) {
      if (token !== drawToken) return;
      try {
        await mermaid.run({ nodes: [node] });
      } catch (err) {
        const p = document.createElement("p");
        p.className = "err";
        p.textContent = "Diagramm konnte nicht gezeichnet werden: " + err;
        node.insertAdjacentElement("afterend", p);
      }
    }
    if (token !== drawToken) return;
    pageEl.querySelectorAll("section.diagram").forEach(bind);
  }

  function route() {
    const raw = decodeURIComponent((location.hash || "").replace(/^#\//, ""));
    let name = raw;
    let anchor = "";
    const cut = raw.indexOf("::");
    if (cut >= 0) {
      name = raw.slice(0, cut);
      anchor = raw.slice(cut + 2);
    }
    if (!window.PAGES[name]) name = "00 Start";
    const token = ++drawToken;
    tipEl.hidden = true;
    current = null;
    pageEl.innerHTML = window.PAGES[name].html;
    document.title = name + " · ServerHoster";
    draw(token).then(function () {
      if (token !== drawToken) return;
      if (anchor) {
        const el = document.getElementById(anchor);
        if (el) el.scrollIntoView({ block: "start" });
        return;
      }
      window.scrollTo(0, 0);
    });
  }

  window.addEventListener("hashchange", route);
  if (!location.hash || location.hash === "#") {
    location.hash = "#/" + encodeURIComponent("00 Start");
  } else {
    route();
  }
})();
