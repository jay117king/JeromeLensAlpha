# JeromeLens Alpha – Implementation Roadmap

Goal: unlock all 40 features in four waves without breaking the CORE base.

## Wave 1 – Foundation (now)
Already largely present from JeromeLens base:
- Image import (max 10)
- Extract links / smart entities
- Search + category filters
- Favorites
- Share
- Floating bubble + notifications

**Alpha deliverable:** FeatureRegistry + docs + package skeleton ✅

## Wave 2 – High value UX & privacy
1. Region capture (draw-to-OCR)
2. Tags
3. App lock (biometric/PIN)
4. Auto-delete retention
5. Copy as Markdown/plain
6. Address → Maps polish
7. Home screen widget
8. Dark mode

## Wave 3 – Intelligence
- Translate / Summarise / Rewrite (on-device hooks)
- Table extraction
- QR/barcode
- Smart folders
- Export / Import history

## Wave 4 – Advanced
- Continuous + camera OCR
- Multi-page docs
- Handwriting
- Calendar events
- Collections, dedupe
- Sensitive blur, encrypted DB, incognito
- Quick paste, text QR, Nearby Share
- Custom scripts, language packs, Tasker plugin

---

## How we ship

1. Keep JeromeLens (stable) and JeromeLensAlpha (experimental) separate.
2. Promote stable Alpha features back to JeromeLens when ready.
3. Every feature must respect FeatureRegistry flags.
4. Prefer on-device; network only with explicit user consent.
