package com.jeromelens.alpha.core

/**
 * Central registry of all 40 JeromeLens Alpha capabilities.
 * Toggle flags as features move from PLANNED → PARTIAL → CORE.
 */
enum class Feature(
    val id: Int,
    val key: String,
    val title: String,
    val category: FeatureCategory,
    var status: FeatureStatus
) {
    // 1–8 Capture
    REGION_CAPTURE(1, "region_capture", "Region capture", FeatureCategory.CAPTURE, FeatureStatus.PLANNED),
    CONTINUOUS_CAPTURE(2, "continuous_capture", "Continuous capture", FeatureCategory.CAPTURE, FeatureStatus.PLANNED),
    CAMERA_OCR(3, "camera_ocr", "Live camera OCR", FeatureCategory.CAPTURE, FeatureStatus.PLANNED),
    MULTI_PAGE_DOC(4, "multi_page_doc", "Multi-page document", FeatureCategory.CAPTURE, FeatureStatus.PLANNED),
    IMAGE_IMPORT(5, "image_import", "Image / PDF import", FeatureCategory.CAPTURE, FeatureStatus.CORE),
    HANDWRITING_OCR(6, "handwriting_ocr", "Handwriting OCR", FeatureCategory.CAPTURE, FeatureStatus.PLANNED),
    TABLE_EXTRACTION(7, "table_extraction", "Table → CSV", FeatureCategory.CAPTURE, FeatureStatus.PLANNED),
    QR_BARCODE(8, "qr_barcode", "QR / Barcode", FeatureCategory.CAPTURE, FeatureStatus.PLANNED),

    // 9–16 Actions
    ADDRESS_TO_MAPS(9, "address_to_maps", "Address → Maps", FeatureCategory.ACTIONS, FeatureStatus.PARTIAL),
    CALENDAR_EVENT(10, "calendar_event", "Calendar event", FeatureCategory.ACTIONS, FeatureStatus.PLANNED),
    SHARE_AS_NOTE(11, "share_as_note", "Share as note", FeatureCategory.ACTIONS, FeatureStatus.CORE),
    TRANSLATE(12, "translate", "Translate", FeatureCategory.ACTIONS, FeatureStatus.PLANNED),
    SUMMARIZE(13, "summarize", "Summarise", FeatureCategory.ACTIONS, FeatureStatus.PLANNED),
    REWRITE(14, "rewrite", "Rewrite text", FeatureCategory.ACTIONS, FeatureStatus.PLANNED),
    EXTRACT_LINKS(15, "extract_links", "Extract links", FeatureCategory.ACTIONS, FeatureStatus.CORE),
    COPY_FORMATS(16, "copy_formats", "Copy formats", FeatureCategory.ACTIONS, FeatureStatus.PLANNED),

    // 17–24 Organise
    TAGS(17, "tags", "Tags", FeatureCategory.ORGANIZE, FeatureStatus.PLANNED),
    SMART_FOLDERS(18, "smart_folders", "Smart folders", FeatureCategory.ORGANIZE, FeatureStatus.PLANNED),
    SEARCH_FILTERS(19, "search_filters", "Search + filters", FeatureCategory.ORGANIZE, FeatureStatus.CORE),
    FAVORITES(20, "favorites", "Favorites / Pin", FeatureCategory.ORGANIZE, FeatureStatus.CORE),
    COLLECTIONS(21, "collections", "Collections", FeatureCategory.ORGANIZE, FeatureStatus.PLANNED),
    DEDUPE(22, "dedupe", "Duplicate detection", FeatureCategory.ORGANIZE, FeatureStatus.PLANNED),
    EXPORT(23, "export", "Export history", FeatureCategory.ORGANIZE, FeatureStatus.PLANNED),
    IMPORT(24, "import", "Import history", FeatureCategory.ORGANIZE, FeatureStatus.PLANNED),

    // 25–29 Privacy
    APP_LOCK(25, "app_lock", "App lock", FeatureCategory.PRIVACY, FeatureStatus.PLANNED),
    AUTO_DELETE(26, "auto_delete", "Auto-delete", FeatureCategory.PRIVACY, FeatureStatus.PLANNED),
    SENSITIVE_BLUR(27, "sensitive_blur", "Sensitive blur", FeatureCategory.PRIVACY, FeatureStatus.PLANNED),
    ENCRYPTED_DB(28, "encrypted_db", "Encrypted storage", FeatureCategory.PRIVACY, FeatureStatus.PLANNED),
    INCOGNITO(29, "incognito", "Incognito mode", FeatureCategory.PRIVACY, FeatureStatus.PLANNED),

    // 30–34 UX
    BUBBLE_MENU(30, "bubble_menu", "Bubble menu", FeatureCategory.UX, FeatureStatus.PARTIAL),
    QUICK_PASTE(31, "quick_paste", "Quick paste", FeatureCategory.UX, FeatureStatus.PLANNED),
    NOTIFICATION_ACTIONS(32, "notification_actions", "Notification actions", FeatureCategory.UX, FeatureStatus.PARTIAL),
    HOME_WIDGET(33, "home_widget", "Home widget", FeatureCategory.UX, FeatureStatus.PLANNED),
    DARK_MODE(34, "dark_mode", "Dark mode", FeatureCategory.UX, FeatureStatus.PLANNED),

    // 35–37 Share
    SHARE_CARD(35, "share_card", "Share card", FeatureCategory.SHARE, FeatureStatus.CORE),
    TEXT_QR(36, "text_qr", "Text as QR", FeatureCategory.SHARE, FeatureStatus.PLANNED),
    NEARBY_SHARE(37, "nearby_share", "Nearby Share", FeatureCategory.SHARE, FeatureStatus.PLANNED),

    // 38–40 Power
    CUSTOM_SCRIPTS(38, "custom_scripts", "Custom scripts", FeatureCategory.POWER, FeatureStatus.PLANNED),
    LANGUAGE_PACKS(39, "language_packs", "Language packs", FeatureCategory.POWER, FeatureStatus.PLANNED),
    TASKER_PLUGIN(40, "tasker_plugin", "Tasker plugin", FeatureCategory.POWER, FeatureStatus.PLANNED);

    val isEnabled: Boolean
        get() = status == FeatureStatus.CORE || status == FeatureStatus.PARTIAL || status == FeatureStatus.EXPERIMENTAL
}

enum class FeatureCategory {
    CAPTURE, ACTIONS, ORGANIZE, PRIVACY, UX, SHARE, POWER
}

enum class FeatureStatus {
    CORE, PARTIAL, PLANNED, EXPERIMENTAL
}

object FeatureRegistry {
    fun all(): List<Feature> = Feature.entries

    fun enabled(): List<Feature> = Feature.entries.filter { it.isEnabled }

    fun byCategory(category: FeatureCategory): List<Feature> =
        Feature.entries.filter { it.category == category }

    fun find(id: Int): Feature? = Feature.entries.find { it.id == id }

    fun find(key: String): Feature? = Feature.entries.find { it.key == key }
}
