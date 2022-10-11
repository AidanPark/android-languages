package io.aidanpark.android.lang

/**
 * @description Representation of language.
 * @author AidanPark
 * @date 2022/05/26
 * @version 1.0
 */
enum class LanguageId {
    AFAR,
    AFRIKAANS,
    ALBANIAN,
    AMHARIC,
    ARABIC,
    ARAGONESE,
    ARMENIAN,
    ASSAMESE,
    ASTURIAN,
    AYMARA,
    AZERBAIJANI,

    //AZERI,
    BAMBARA,
    BASQUE,
    BELARUSIAN,
    BENGALI,//Bangla
    BERBER,
    BHOJPURI,
    BISLAMA,

    //BOHOLANO,
    BOSNIAN,
    BRETON,
    BULGARIAN,
    BURMESE,//Myanmar
    CANTONESE,
    CATALAN,
    CEBUANO,
    CHAMORRO,
    CHEROKEE,
    CHINESE_CLASSIC,
    CHINESE_SIMPLIFIED,
    CHINESE_TRADITIONAL,
    CORNISH,
    CORSICAN,
    CREE,
    CROATIAN,
    CZECH,
    DANISH,
    DHIVEHI,
    DOGRI,
    DUTCH,
    ENGLISH,
    ESPERANTO,
    ESTONIAN,
    EWE,
    FAROESE,
    FIJIAN,//Lauan
    FILIPINO,//Tagalog
    FINNISH,
    FRENCH,
    FRISIAN,
    FRISIAN_NORTHERN,
    FRISIAN_SATERLAND,
    FRISIAN_WESTERN,
    FULA,
    GALICIAN,
    GEORGIAN,
    GERMAN,
    GIKUYU,//Kikuyu
    GREEK,
    GUARANÍ,
    GUJARATI,

    //HAITIAN,
    HAITIAN_CREOLE,
    HAUSA,
    HAWAIIAN,
    HEBREW,
    HINDI,
    HIRI_MOTU,
    HMONG,
    HMONG_DAW,
    HUNGARIAN,
    ICELANDIC,
    IDO,
    IGBO,
    ILOCANO,
    INDONESIAN,
    INNU_AIMUN,//Montagnais
    INTERLINGUA,
    IRISH,
    ITALIAN,
    JAPANESE,
    JAVANESE,
    JUDEO_SPANISH,
    KABYLE,
    KANNADA,
    KAZAKH,
    KHASI,
    KHMER,
    KINYARWANDA,
    KIRUNDI,
    KLINGON,
    KLINGON_PLQAD,
    KONGO,
    KONKANI,
    KOREAN,
    KRIO,
    KURDISH,
    KYRGYZ,
    LAO,
    LATIN,
    LATVIAN,
    LAZ,

    //LEONESE,
    LEVANTINE_NORTHERN,
    LEVANTINE_SOUTHERN,
    LINGALA,
    LITHUANIAN,
    LUGANDA,
    LUXEMBOURGISH,
    MACEDONIAN,
    MAITHILI,
    MALAGASY,
    MALAY,
    MALAYALAM,
    MALTESE,
    MANIPURI,
    MANX,
    MAORI,
    MARATHI,
    MARSHALLESE,
    MIZO,
    MOLDOVAN,
    MONGOLIAN,
    MONTENEGRIN,
    NAHUATL,
    NAURUAN,

    //NAVAHO,
    NDEBELE_NORTHERN,
    NDEBELE_SOUTHERN,
    NEPALI,
    NORWEGIAN,
    NYANJA,//Chichewa
    OCCITAN,
    ODIA,
    OROMO,
    PALAUAN,
    PASHTO,
    PERSIAN,
    POLISH,
    PORTUGUESE,
    PUNJABI,
    QUECHUA,
    QUERETARO_OTOMI,
    ROHINGYA,
    ROMANIAN,
    ROMANSH,
    RUSSIAN,
    SAMOAN,
    SANSKRIT,
    SCOTS,
    SCOTS_GAELIC,
    SERBIAN,
    SERBIAN_CYRILLIC,
    SERBIAN_LATIN,
    SESOTHO,//Sotho southern
    SEYCHELLOIS_CREOLE,
    SHONA,
    SINDHI,
    SINHALA,
    SLOVAK,
    SLOVENIAN,
    SOMALI,
    SOTHO_NORTHERN,
    SPANISH,
    SUNDANESE,
    SWAHILI,
    SWATI,
    SWEDISH,
    TAHITIAN,
    TAJIK,
    TAMIL,
    TATAR,
    TELUGU,
    TETUM,
    THAI,
    TIGRINYA,
    TOK_PISIN,
    TONGAN,
    TSONGA,
    TSWANA,
    TUNISIAN_ARABIC,
    TURKISH,
    TURKMEN,
    TUROYO,
    TWI,
    UKRAINIAN,
    URDU,
    UYGHUR,
    UZBEK,
    VASTESE,
    VENDA,
    VIETNAMESE,
    VOLAPÜK,
    VÕRO,
    WALLOON,
    WELSH,
    WOLOF,
    XHOSA,
    YIDDISH,
    YORUBA,
    YUCATEC_MAYA,
    ZAZAKI,//Zaza
    ZULU,
    ;

    /**
     * Check if the language is a non-spacing language
     */
    fun isNonSpacing(): Boolean {
        return nonSpacingLanguageIds.contains(this)
    }

    /**
     * Check if the language support vertical writing
     */
    fun isVerticalSupport(): Boolean {
        return verticalSupportedLanguageIds.contains(this)
    }

    /**
     * Check if the language is a right-to-left language
     */
    fun isRTL(): Boolean {
        return rtlLanguageIds.contains(this)
    }

    companion object {

        /**
         * List of non-spacing languages
         */
        val nonSpacingLanguageIds: List<LanguageId> = listOf(
            BURMESE,
            CANTONESE,
            JAPANESE,
            LAO,
            THAI,
        )

        /**
         * List of vertical writing support languages
         */
        val verticalSupportedLanguageIds: List<LanguageId> = listOf(
            CHINESE_CLASSIC,
            CHINESE_SIMPLIFIED,
            CHINESE_TRADITIONAL,
            JAPANESE,
            KOREAN,
            VIETNAMESE,
        )

        /**
         * List of right-to-left writing languages
         */
        val rtlLanguageIds: List<LanguageId> = listOf(
            ARABIC,
            FULA,
            HEBREW,
            KURDISH,
            PERSIAN,
            ROHINGYA,
            URDU,
        )

        /**
         * Get LanguageId with given language code
         */
        fun of(code: String): LanguageId? {
            when (code) {
                "aa" -> return AFAR
                "aeb" -> return TUNISIAN_ARABIC
                "af" -> return AFRIKAANS
                "ajp" -> return LEVANTINE_SOUTHERN
                "ak", "tw" -> return TWI
                "am" -> return AMHARIC
                "an" -> return ARAGONESE
                "apc" -> return LEVANTINE_NORTHERN
                "ar" -> return ARABIC
                "as" -> return ASSAMESE
                "ast" -> return ASTURIAN
                "ay" -> return AYMARA
                "az" -> return AZERBAIJANI
                "bm" -> return BAMBARA
                "be" -> return BELARUSIAN
                "ber" -> return BERBER
                "bg" -> return BULGARIAN
                "bho" -> return BHOJPURI
                "bi" -> return BISLAMA
                "bn" -> return BENGALI
                "br" -> return BRETON
                "bs" -> return BOSNIAN
                "ca" -> return CATALAN
                "ceb" -> return CEBUANO
                "ch" -> return CHAMORRO
                "chr" -> return CHEROKEE
                "cnr" -> return MONTENEGRIN
                "co" -> return CORSICAN
                "cr" -> return CREE
                "crs" -> return SEYCHELLOIS_CREOLE
                "cs" -> return CZECH
                "cy" -> return WELSH
                "da" -> return DANISH
                "de" -> return GERMAN
                "doi" -> return DOGRI
                "dv" -> return DHIVEHI
                "ee" -> return EWE
                "el" -> return GREEK
                "en" -> return ENGLISH
                "eo" -> return ESPERANTO
                "es" -> return SPANISH
                "et" -> return ESTONIAN
                "eu" -> return BASQUE
                "fa" -> return PERSIAN
                "ff" -> return FULA
                "fi" -> return FINNISH
                "fj" -> return FIJIAN
                "fo" -> return FAROESE
                "fr" -> return FRENCH
                "frr" -> return FRISIAN_NORTHERN
                "fry" -> return FRISIAN_WESTERN
                "fy" -> return FRISIAN
                "ga" -> return IRISH
                "gd" -> return SCOTS_GAELIC
                "gl" -> return GALICIAN
                "gu" -> return GUJARATI
                "gn", "gug" -> return GUARANÍ
                "gv" -> return MANX
                "ha" -> return HAUSA
                "haw" -> return HAWAIIAN
                "hi" -> return HINDI
                "hmn" -> return HMONG
                "ho" -> return HIRI_MOTU
                "hr" -> return CROATIAN
                "ht" -> return HAITIAN_CREOLE
                "hu" -> return HUNGARIAN
                "hy" -> return ARMENIAN
                "id" -> return INDONESIAN
                "ig" -> return IGBO
                "ilo" -> return ILOCANO
                "ina" -> return INTERLINGUA
                "io" -> return IDO
                "is" -> return ICELANDIC
                "it" -> return ITALIAN
                "iw", "he" -> return HEBREW
                "ja" -> return JAPANESE
                "jw" -> return JAVANESE
                "ka" -> return GEORGIAN
                "kab" -> return KABYLE
                "kg" -> return KONGO
                "kha" -> return KHASI
                "ki" -> return GIKUYU
                "kk" -> return KAZAKH
                "km" -> return KHMER
                "kn" -> return KANNADA
                "ko" -> return KOREAN
                "kri" -> return KRIO
                "gom", "kok" -> return KONKANI
                "ckb", "ku" -> return KURDISH
                "kw" -> return CORNISH
                "ky" -> return KYRGYZ
                "la" -> return LATIN
                "lad" -> return JUDEO_SPANISH
                "lb" -> return LUXEMBOURGISH
                "lg" -> return LUGANDA
                "ln" -> return LINGALA
                "lo" -> return LAO
                "lt" -> return LITHUANIAN
                "lus" -> return MIZO
                "lv" -> return LATVIAN
                "lzz" -> return LAZ
                "mai" -> return MAITHILI
                "mg" -> return MALAGASY
                "mh" -> return MARSHALLESE
                "mi" -> return MAORI
                "mk" -> return MACEDONIAN
                "ml" -> return MALAYALAM
                "mn" -> return MONGOLIAN
                "mni-Mtei" -> return MANIPURI
                "mo" -> return MOLDOVAN
                "moe" -> return INNU_AIMUN
                "mr" -> return MARATHI
                "ms" -> return MALAY
                "mt" -> return MALTESE
                "mww" -> return HMONG_DAW
                "my" -> return BURMESE
                "na" -> return NAURUAN
                "nah" -> return NAHUATL
                "nap" -> return VASTESE
                "nde" -> return NDEBELE_NORTHERN
                "ne" -> return NEPALI
                "nl" -> return DUTCH
                "no" -> return NORWEGIAN
                "nr" -> return NDEBELE_SOUTHERN
                "nso" -> return SOTHO_NORTHERN
                "ny" -> return NYANJA
                "oc" -> return OCCITAN
                "om" -> return OROMO
                "or" -> return ODIA
                "otq" -> return QUERETARO_OTOMI
                "pa" -> return PUNJABI
                "pau" -> return PALAUAN
                "pl" -> return POLISH
                "ps" -> return PASHTO
                "pt" -> return PORTUGUESE
                "qu" -> return QUECHUA
                "rhg" -> return ROHINGYA
                "rm" -> return ROMANSH
                "rn" -> return KIRUNDI
                "ro" -> return ROMANIAN
                "ru" -> return RUSSIAN
                "rw" -> return KINYARWANDA
                "sa" -> return SANSKRIT
                "sco" -> return SCOTS
                "sd" -> return SINDHI
                "si" -> return SINHALA
                "sk" -> return SLOVAK
                "sl" -> return SLOVENIAN
                "sm" -> return SAMOAN
                "sn" -> return SHONA
                "so" -> return SOMALI
                "sq" -> return ALBANIAN
                "sr" -> return SERBIAN
                "sr-Cyrl" -> return SERBIAN_CYRILLIC
                "sr-Latn" -> return SERBIAN_LATIN
                "ss" -> return SWATI
                "st" -> return SESOTHO
                "stq" -> return FRISIAN_SATERLAND
                "su" -> return SUNDANESE
                "sv" -> return SWEDISH
                "sw" -> return SWAHILI
                "ta" -> return TAMIL
                "te" -> return TELUGU
                "tet" -> return TETUM
                "tg" -> return TAJIK
                "th" -> return THAI
                "ti" -> return TIGRINYA
                "tk" -> return TURKMEN
                "tl" -> return FILIPINO
                "tlh" -> return KLINGON
                "tlh-Qaak" -> return KLINGON_PLQAD
                "tn" -> return TSWANA
                "to" -> return TONGAN
                "tpi" -> return TOK_PISIN
                "tr" -> return TURKISH
                "tru" -> return TUROYO
                "ts" -> return TSONGA
                "tt" -> return TATAR
                "ty" -> return TAHITIAN
                "ug" -> return UYGHUR
                "uk" -> return UKRAINIAN
                "ur" -> return URDU
                "uz" -> return UZBEK
                "ve" -> return VENDA
                "vi" -> return VIETNAMESE
                "vo" -> return VOLAPÜK
                "vro" -> return VÕRO
                "wa" -> return WALLOON
                "wo" -> return WOLOF
                "xh" -> return XHOSA
                "yi" -> return YIDDISH
                "yo" -> return YORUBA
                "yua" -> return YUCATEC_MAYA
                "yue" -> return CANTONESE
                "zh-CN", "zh" -> return CHINESE_SIMPLIFIED
                "zh-TW" -> return CHINESE_TRADITIONAL
                "zu" -> return ZULU
                "zza" -> return ZAZAKI
                else -> return null
            }
        }

        /**
         * Get LanguageId with given localized name
         */
        fun byLocalizedName(localizedName: String): LanguageId? {
            when (localizedName) {
                "Afrikaans" -> return AFRIKAANS
                "Shqip" -> return ALBANIAN
                "العربية" -> return ARABIC
                "Հայերեն" -> return ARMENIAN
                "Azərbaycan" -> return AZERBAIJANI
                "Euskara" -> return BASQUE
                "Беларуская" -> return BELARUSIAN
                "বাংলা" -> return BENGALI
                "Босанци" -> return BOSNIAN
                "Български" -> return BULGARIAN
                "မြန်မာ(Unicode)" -> return BURMESE
                "粤语" -> return CANTONESE
                "Català" -> return CATALAN
                "中文（简体)" -> return CHINESE_SIMPLIFIED
                "中文（繁體)" -> return CHINESE_TRADITIONAL
                "Hrvatski" -> return CROATIAN
                "Čeština" -> return CZECH
                "Dansk" -> return DANISH
                "Nederlands" -> return DUTCH
                "English" -> return ENGLISH
                "Eesti" -> return ESTONIAN
                "Filipino" -> return FILIPINO
                "Suomi" -> return FINNISH
                "Français" -> return FRENCH
                "Galego" -> return GALICIAN
                "ქართული" -> return GEORGIAN
                "Deutsch" -> return GERMAN
                "GIKUYU" -> return GIKUYU
                "Ελληνικά" -> return GREEK
                "ગુજરાતી" -> return GUJARATI
                "עברית" -> return HEBREW
                "हिन्दी" -> return HINDI
                "Magyar" -> return HUNGARIAN
                "Íslenska" -> return ICELANDIC
                "Bahasa Indonesia" -> return INDONESIAN
                "Gaeilge" -> return IRISH
                "Italiano" -> return ITALIAN
                "日本語" -> return JAPANESE
                "ಕನ್ನಡ" -> return KANNADA
                "Қазақша" -> return KAZAKH
                "ខ្មែរយូនីកូដ" -> return KHMER
                "한국어" -> return KOREAN
                "ລາວ" -> return LAO
                "Latviešu" -> return LATVIAN
                "LAZ" -> return LAZ
                "Lietuvių" -> return LITHUANIAN
                "Македонски" -> return MACEDONIAN
                "Bahasa Melayu" -> return MALAY
                "മലയാളം" -> return MALAYALAM
                "मराठी" -> return MARATHI
                "Монгол" -> return MONGOLIAN
                "नेपाली" -> return NEPALI
                "Norsk" -> return NORWEGIAN
                "فارسی" -> return PERSIAN
                "Polski" -> return POLISH
                "Português" -> return PORTUGUESE
                "ਪੰਜਾਬੀ " -> return PUNJABI
                "Română" -> return ROMANIAN
                "Русский" -> return RUSSIAN
                "Srpski" -> return SERBIAN
                "සිංහල" -> return SINHALA
                "Slovenčina" -> return SLOVAK
                "Slovenščina" -> return SLOVENIAN
                "Español" -> return SPANISH
                "Svenska" -> return SWEDISH
                "Тоҷикӣ" -> return TAJIK
                "தமிழ்" -> return TAMIL
                "తెలుగు" -> return TELUGU
                "ไทย" -> return THAI
                "Türkçe" -> return TURKISH
                "Українська" -> return UKRAINIAN
                "اردو" -> return URDU
                "Oʻzbekcha" -> return UZBEK
                "Tiếng Việt" -> return VIETNAMESE
                else -> return null
            }
        }
    }
}



























