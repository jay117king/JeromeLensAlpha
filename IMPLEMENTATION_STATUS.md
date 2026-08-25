# Implementation Status – JeromeLens Alpha

**Honest status as of Alpha bootstrap**

Implementing all 40 features to production quality in a single session is not possible. This document tracks what exists.

## Strategy

1. **JeromeLens** (stable) remains the production app: OCR, overlay, history, categories, batch upload, bubble, smart entities.
2. **JeromeLensAlpha** is the experimental lab: FeatureRegistry + modular packages + progressive unlock of the 40.
3. Features move: PLANNED → stub → PARTIAL → CORE, then can be backported to JeromeLens.

## What is done in Alpha repo today

| Area | Done |
|------|------|
| FeatureRegistry (all 40 typed) | Yes |
| FEATURES / ARCHITECTURE / ROADMAP docs | Yes |
| Package skeleton (capture, actions, organize, privacy, bubble, widget, automation) | Yes |
| Runnable full APK with all 40 complete | No – use JeromeLens for daily driver |

## Recommended path to "all 40"

### Phase A – Make Alpha runnable (1–2 sessions)
- Copy full JeromeLens Android project into this repo under `app/`
- Rename package to `com.jeromelens.alpha`
- Wire FeatureRegistry into Main / Settings
- Features list screen showing all 40 with status badges

### Phase B – Wave 2 real implementations
- Region capture UI
- Tags on ClipEntity + UI
- Biometric app lock
- Auto-delete worker
- Dark theme
- Home widget
- Export JSON/CSV

### Phase C – Wave 3 intelligence
- Translate / summarize hooks (MediaPipe or optional API)
- Table + QR detection
- Smart folders heuristics

### Phase D – Wave 4 advanced
- Camera OCR, continuous mode, multi-page
- Encryption, incognito, Tasker, custom scripts

---

**Bottom line:** Asking for "all 40 now" as finished product code would produce mostly empty stubs. Alpha is correctly set up as the **architecture and registry** for those 40. Next concrete step: **port JeromeLens → Alpha so the app builds**, then implement Wave 2 features one by one.

Say **"Port JeromeLens into Alpha"** to start Phase A, or pick specific feature numbers to implement next.
