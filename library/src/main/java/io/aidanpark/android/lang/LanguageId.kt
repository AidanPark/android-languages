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
    BASQUE,
    BELARUSIAN,
    BENGALI,//Bangla
    BERBER,
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
    DUTCH,
    ENGLISH,
    ESPERANTO,
    ESTONIAN,
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
    MALAGASY,
    MALAY,
    MALAYALAM,
    MALTESE,
    MANX,
    MAORI,
    MARATHI,
    MARSHALLESE,
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
    TOK_PISIN,
    TONGAN,
    TSONGA,
    TSWANA,
    TUNISIAN_ARABIC,
    TURKISH,
    TURKMEN,
    TUROYO,
    UKRAINIAN,
    URDU,
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
                "af" -> return AFRIKAANS
                "sq" -> return ALBANIAN
                "am" -> return AMHARIC
                "ar" -> return ARABIC
                "an" -> return ARAGONESE
                "hy" -> return ARMENIAN
                "as" -> return ASSAMESE
                "ast" -> return ASTURIAN
                "ay" -> return AYMARA
                "az" -> return AZERBAIJANI
                "eu" -> return BASQUE
                "be" -> return BELARUSIAN
                "bn" -> return BENGALI
                "ber" -> return BERBER
                "bi" -> return BISLAMA
                "bs" -> return BOSNIAN
                "br" -> return BRETON
                "bg" -> return BULGARIAN
                "my" -> return BURMESE
                "yue" -> return CANTONESE
                "ca" -> return CATALAN
                "ceb" -> return CEBUANO
                "ch" -> return CHAMORRO
                "chr" -> return CHEROKEE
                "zh-CN", "zh" -> return CHINESE_SIMPLIFIED
                "zh-TW" -> return CHINESE_TRADITIONAL
                "kw" -> return CORNISH
                "co" -> return CORSICAN
                "cr" -> return CREE
                "hr" -> return CROATIAN
                "cs" -> return CZECH
                "da" -> return DANISH
                "nl" -> return DUTCH
                "en" -> return ENGLISH
                "eo" -> return ESPERANTO
                "et" -> return ESTONIAN
                "fo" -> return FAROESE
                "fj" -> return FIJIAN
                "tl" -> return FILIPINO
                "fi" -> return FINNISH
                "fr" -> return FRENCH
                "fy" -> return FRISIAN
                "stq" -> return FRISIAN_SATERLAND
                "frr" -> return FRISIAN_NORTHERN
                "fry" -> return FRISIAN_WESTERN
                "ff" -> return FULA
                "gl" -> return GALICIAN
                "ka" -> return GEORGIAN
                "de" -> return GERMAN
                "ki" -> return GIKUYU
                "el" -> return GREEK
                "gug" -> return GUARANÍ
                "gu" -> return GUJARATI
                "ht" -> return HAITIAN_CREOLE
                "ha" -> return HAUSA
                "haw" -> return HAWAIIAN
                "iw", "he" -> return HEBREW
                "hi" -> return HINDI
                "ho" -> return HIRI_MOTU
                "hmn" -> return HMONG
                "mww" -> return HMONG_DAW
                "hu" -> return HUNGARIAN
                "is" -> return ICELANDIC
                "io" -> return IDO
                "ig" -> return IGBO
                "ilo" -> return ILOCANO
                "id" -> return INDONESIAN
                "moe" -> return INNU_AIMUN
                "ina" -> return INTERLINGUA
                "ga" -> return IRISH
                "it" -> return ITALIAN
                "ja" -> return JAPANESE
                "jw" -> return JAVANESE
                "lad" -> return JUDEO_SPANISH
                "kab" -> return KABYLE
                "kn" -> return KANNADA
                "kk" -> return KAZAKH
                "kha" -> return KHASI
                "km" -> return KHMER
                "rw" -> return KINYARWANDA
                "rn" -> return KIRUNDI
                "tlh" -> return KLINGON
                "tlh-Qaak" -> return KLINGON_PLQAD
                "kg" -> return KONGO
                "kok" -> return KONKANI
                "ko" -> return KOREAN
                "ku" -> return KURDISH
                "ky" -> return KYRGYZ
                "lo" -> return LAO
                "la" -> return LATIN
                "lv" -> return LATVIAN
                "lzz" -> return LAZ
                "apc" -> return LEVANTINE_NORTHERN
                "ajp" -> return LEVANTINE_SOUTHERN
                "ln" -> return LINGALA
                "lt" -> return LITHUANIAN
                "lg" -> return LUGANDA
                "lb" -> return LUXEMBOURGISH
                "mk" -> return MACEDONIAN
                "mg" -> return MALAGASY
                "ms" -> return MALAY
                "ml" -> return MALAYALAM
                "mt" -> return MALTESE
                "gv" -> return MANX
                "mi" -> return MAORI
                "mr" -> return MARATHI
                "mh" -> return MARSHALLESE
                "mo" -> return MOLDOVAN
                "mn" -> return MONGOLIAN
                "cnr" -> return MONTENEGRIN
                "nah" -> return NAHUATL
                "na" -> return NAURUAN
                "nde" -> return NDEBELE_NORTHERN
                "nr" -> return NDEBELE_SOUTHERN
                "ne" -> return NEPALI
                "no" -> return NORWEGIAN
                "ny" -> return NYANJA
                "oc" -> return OCCITAN
                "om" -> return OROMO
                "pau" -> return PALAUAN
                "ps" -> return PASHTO
                "fa" -> return PERSIAN
                "pl" -> return POLISH
                "pt" -> return PORTUGUESE
                "pa" -> return PUNJABI
                "qu" -> return QUECHUA
                "otq" -> return QUERETARO_OTOMI
                "rhg" -> return ROHINGYA
                "ro" -> return ROMANIAN
                "rm" -> return ROMANSH
                "ru" -> return RUSSIAN
                "sm" -> return SAMOAN
                "sa" -> return SANSKRIT
                "sco" -> return SCOTS
                "gd" -> return SCOTS_GAELIC
                "sr" -> return SERBIAN
                "sr-Cyrl" -> return SERBIAN_CYRILLIC
                "sr-Latn" -> return SERBIAN_LATIN
                "st" -> return SESOTHO
                "crs" -> return SEYCHELLOIS_CREOLE
                "sn" -> return SHONA
                "sd" -> return SINDHI
                "si" -> return SINHALA
                "sk" -> return SLOVAK
                "sl" -> return SLOVENIAN
                "so" -> return SOMALI
                "nso" -> return SOTHO_NORTHERN
                "es" -> return SPANISH
                "su" -> return SUNDANESE
                "sw" -> return SWAHILI
                "ss" -> return SWATI
                "sv" -> return SWEDISH
                "ty" -> return TAHITIAN
                "tg" -> return TAJIK
                "ta" -> return TAMIL
                "tt" -> return TATAR
                "te" -> return TELUGU
                "tet" -> return TETUM
                "th" -> return THAI
                "tpi" -> return TOK_PISIN
                "to" -> return TONGAN
                "ts" -> return TSONGA
                "tn" -> return TSWANA
                "aeb" -> return TUNISIAN_ARABIC
                "tr" -> return TURKISH
                "tk" -> return TURKMEN
                "tru" -> return TUROYO
                "uk" -> return UKRAINIAN
                "ur" -> return URDU
                "uz" -> return UZBEK
                "nap" -> return VASTESE
                "ve" -> return VENDA
                "vi" -> return VIETNAMESE
                "vo" -> return VOLAPÜK
                "vro" -> return VÕRO
                "wa" -> return WALLOON
                "cy" -> return WELSH
                "wo" -> return WOLOF
                "xh" -> return XHOSA
                "yi" -> return YIDDISH
                "yo" -> return YORUBA
                "yua" -> return YUCATEC_MAYA
                "zza" -> return ZAZAKI
                "zu" -> return ZULU
                else -> return null
            }
        }
    }
}



























