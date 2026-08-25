# JeromeLens Alpha

**Privacy-first on-device OCR · Smart Actions · 40 Advanced Capabilities**

Experimental / alpha build of JeromeLens.  
Everything runs on-device by default. No cloud required.

**Repo:** https://github.com/jay117king/JeromeLensAlpha  
**Base:** Evolved from [JeromeLens](https://github.com/jay117king/JeromeLens)

---

## Vision

Turn any screenshot or image into actionable, organised text — with powerful automation, privacy controls, and smart tools — while keeping data on the user's device.

---

## All 40 Features (Alpha Roadmap)

### Core OCR & Capture
| # | Feature | Status | Notes |
|---|---------|--------|-------|
| 1 | Partial-screen / region capture | Planned | Draw rectangle → OCR region |
| 2 | Continuous capture mode | Planned | Auto-OCR new screenshots for N minutes |
| 3 | Live camera OCR | Planned | Point camera at text |
| 4 | Multi-page document mode | Planned | Stitch screenshots into one doc |
| 5 | PDF / image import | Core | Gallery + multi-image (max 10) |
| 6 | Handwriting recognition | Planned | Where ML Kit supports |
| 7 | Table detection → CSV | Planned | Structured extraction |
| 8 | QR / barcode in screenshots | Planned | Detect + act |

### Smart Actions & Automation
| # | Feature | Status | Notes |
|---|---------|--------|-------|
| 9 | Auto-detect addresses → Maps | Partial | Entity actions |
| 10 | Auto-create calendar events | Planned | From dates/times |
| 11 | Share as note (Keep/Notion/Obsidian) | Core | System share |
| 12 | Translate selected text | Planned | On-device preferred |
| 13 | Summarise long text | Planned | Tiny on-device model |
| 14 | Rewrite / formalise / shorten | Planned | Local LLM |
| 15 | Extract all links | Core | SmartEntityParser |
| 16 | Copy as Markdown / plain / rich | Planned | Format options |

### Organisation & History
| # | Feature | Status | Notes |
|---|---------|--------|-------|
| 17 | Tags (multi-tag) | Planned | Beyond categories |
| 18 | Smart folders (auto-file) | Planned | By content type |
| 19 | Full-text search + filters | Core | Search + category chips |
| 20 | Pinned / starred clips | Core | Favorites |
| 21 | Collections / albums | Planned | Trip, Project X… |
| 22 | Duplicate detection | Planned | Merge/ignore |
| 23 | Export history (JSON/CSV/MD) | Planned | Backup |
| 24 | Import history | Planned | Restore |

### Privacy & Security
| # | Feature | Status | Notes |
|---|---------|--------|-------|
| 25 | App lock (PIN / biometric) | Planned | Protect History |
| 26 | Auto-delete older than N days | Planned | Retention |
| 27 | Sensitive content blur | Planned | Optional |
| 28 | Encrypted local storage | Planned | DB encryption |
| 29 | Incognito mode | Planned | OCR without save |

### Floating Bubble & UX
| # | Feature | Status | Notes |
|---|---------|--------|-------|
| 30 | Expandable bubble menu | Partial | Bubble + actions |
| 31 | Quick-paste last OCR | Planned | Into any app |
| 32 | Notification actions | Partial | Foreground service |
| 33 | Home-screen widget | Planned | Last clip / Scan |
| 34 | Dark mode + Material You | Planned | Dynamic colour |

### Collaboration & Sharing
| # | Feature | Status | Notes |
|---|---------|--------|-------|
| 35 | Share clip as card | Core | Share intent |
| 36 | QR of selected text | Planned | Cross-device |
| 37 | Nearby Share / Bluetooth | Planned | Quick send |

### Power-user & Developer
| # | Feature | Status | Notes |
|---|---------|--------|-------|
| 38 | Custom action scripts | Planned | Entity rules |
| 39 | OCR language packs | Planned | On-demand ML Kit |
| 40 | Tasker / automation plugin | Planned | External triggers |

---

## Alpha Architecture

```
app/
├── core/           # OCR, entities, database
├── capture/        # Screenshot, region, camera, continuous
├── actions/        # Smart actions, share, translate, LLM hooks
├── organize/       # Categories, tags, collections, search
├── privacy/        # Lock, encryption, incognito, retention
├── bubble/         # Floating bubble + menu
├── widget/         # Home screen widget
├── automation/     # Tasker, custom scripts
└── ui/             # Screens
```

Feature flags live in `FeatureRegistry` so capabilities can be toggled while we implement them.

---

## Current working base

- Screenshot detection (Accessibility + MediaStore)
- On-device ML Kit OCR
- Interactive text overlay
- Smart entity actions (URL, email, phone, code)
- Categories + History filters
- Upload up to 10 images (batch OCR)
- Floating bubble
- Soft modern UI

---

## Build

Clone, open in Android Studio, or use GitHub Actions once the workflow is added.  
`minSdk 26` · Kotlin · Hilt · Room · ML Kit

---

**JeromeLens Alpha** – your screenshots, your device, your rules.
