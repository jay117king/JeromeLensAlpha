# JeromeLens Alpha – Feature Registry (40)

All capabilities are declared here and in code via `FeatureRegistry`.

Status key:
- `CORE` – implemented in base
- `PARTIAL` – basic version exists
- `PLANNED` – stubbed / architecture ready
- `EXPERIMENTAL` – behind flag, unstable

---

## 1–8 Core OCR & Capture

1. **REGION_CAPTURE** – PLANNED – Draw rectangle, OCR only that area  
2. **CONTINUOUS_CAPTURE** – PLANNED – Auto-OCR screenshots for a timed session  
3. **CAMERA_OCR** – PLANNED – Live camera text recognition  
4. **MULTI_PAGE_DOC** – PLANNED – Stitch multiple captures into one document  
5. **IMAGE_IMPORT** – CORE – Gallery / multi-image upload (max 10)  
6. **HANDWRITING_OCR** – PLANNED – Handwriting where supported by ML Kit  
7. **TABLE_EXTRACTION** – PLANNED – Detect tables → CSV / structured text  
8. **QR_BARCODE** – PLANNED – Detect QR/barcodes in screenshots and act

## 9–16 Smart Actions & Automation

9. **ADDRESS_TO_MAPS** – PARTIAL – Entity detection + maps intent  
10. **CALENDAR_EVENT** – PLANNED – Parse dates/times → calendar insert  
11. **SHARE_AS_NOTE** – CORE – System share sheet  
12. **TRANSLATE** – PLANNED – On-device or optional network translate  
13. **SUMMARIZE** – PLANNED – On-device summarisation  
14. **REWRITE** – PLANNED – Formalise / shorten / rewrite (local LLM)  
15. **EXTRACT_LINKS** – CORE – SmartEntityParser URLs  
16. **COPY_FORMATS** – PLANNED – Plain / Markdown / rich text copy

## 17–24 Organisation & History

17. **TAGS** – PLANNED – Multi-tag per clip  
18. **SMART_FOLDERS** – PLANNED – Auto-categorise by content  
19. **SEARCH_FILTERS** – CORE – Full-text + category chips  
20. **FAVORITES** – CORE – Star / pin clips  
21. **COLLECTIONS** – PLANNED – User albums (Trip, Project…)  
22. **DEDUPE** – PLANNED – Detect similar clips  
23. **EXPORT** – PLANNED – JSON / CSV / Markdown export  
24. **IMPORT** – PLANNED – Restore from backup

## 25–29 Privacy & Security

25. **APP_LOCK** – PLANNED – PIN / biometric lock  
26. **AUTO_DELETE** – PLANNED – Retention policy (N days)  
27. **SENSITIVE_BLUR** – PLANNED – Blur before save (optional)  
28. **ENCRYPTED_DB** – PLANNED – SQLCipher / encrypted Room  
29. **INCOGNITO** – PLANNED – OCR without writing to history

## 30–34 Floating Bubble & UX

30. **BUBBLE_MENU** – PARTIAL – Floating bubble + expand actions  
31. **QUICK_PASTE** – PLANNED – Paste last OCR into focused app  
32. **NOTIFICATION_ACTIONS** – PARTIAL – Service notification actions  
33. **HOME_WIDGET** – PLANNED – Widget: last clip / scan  
34. **DARK_MODE** – PLANNED – Material You + dark theme

## 35–37 Collaboration

35. **SHARE_CARD** – CORE – Share clip content  
36. **TEXT_QR** – PLANNED – Generate QR from selection  
37. **NEARBY_SHARE** – PLANNED – System nearby / Bluetooth share

## 38–40 Power-user

38. **CUSTOM_SCRIPTS** – PLANNED – User rules on entities  
39. **LANGUAGE_PACKS** – PLANNED – Download extra OCR languages  
40. **TASKER_PLUGIN** – PLANNED – Tasker / automation bridge

---

Implementation order recommendation for Alpha:

**Wave 1 (foundation):** 5, 15, 19, 20, 11, 35, 30, 32  
**Wave 2 (high value):** 1, 17, 25, 26, 16, 9, 33, 34  
**Wave 3 (intelligence):** 12, 13, 14, 7, 8, 18, 23, 24  
**Wave 4 (advanced):** 2, 3, 4, 6, 10, 21, 22, 27–29, 31, 36–40
