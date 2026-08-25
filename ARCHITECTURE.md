# JeromeLens Alpha – Architecture

## Package layout

```
com.jeromelens.alpha
├── core/                 # FeatureRegistry, OCR, entities, DB
│   ├── FeatureRegistry.kt
│   ├── ocr/
│   ├── entity/
│   └── data/
├── capture/              # #1–8
│   ├── ScreenshotDetector
│   ├── RegionCapture
│   ├── ContinuousCapture
│   ├── CameraOcr
│   └── MultiPageDoc
├── actions/              # #9–16
│   ├── SmartActions
│   ├── Translate
│   ├── Summarize
│   └── Rewrite
├── organize/             # #17–24
│   ├── Categories
│   ├── Tags
│   ├── Collections
│   └── ExportImport
├── privacy/              # #25–29
│   ├── AppLock
│   ├── Retention
│   └── Incognito
├── bubble/               # #30–32
├── widget/               # #33
├── automation/           # #38–40
└── ui/
    ├── main/
    ├── overlay/
    ├── history/
    ├── batch/
    └── settings/         # Feature toggles UI
```

## Principles

1. **On-device first** – network only when user explicitly opts in.
2. **Feature flags** – every capability is in `FeatureRegistry`.
3. **Modular** – each feature group is a package.
4. **Privacy by default** – history, lock, retention, encryption are first-class.
5. **Alpha stability** – CORE features must not regress; PLANNED can be incomplete.

## Data model (alpha)

- `ClipEntity` – text, path, timestamp, category, tags, favorite, collectionId, source
- `CollectionEntity` – user albums
- `Settings` – retention days, lock enabled, incognito default, enabled features

## Implementation waves

See FEATURES.md (Wave 1 → 4).
