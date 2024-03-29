package io.aidanpark.android.lang

import android.content.Context
import android.content.res.Configuration
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.*


/**
 * @description
 * @author AidanPark
 * @date 2022/05/26
 * @version 1.1
 */
@Parcelize
class Language(
    val id: LanguageId,
    val code: LanguageCode,
    val name: String,
    val localizedName: String,
    val englishName: String,
    val isNonSpacing: Boolean,
    val isVerticalSupport: Boolean,
    val isRTL: Boolean
) : Comparable<Language>, Parcelable {

    companion object {

        /**
         * Import all supported languages from this library
         */
        fun getAllLanguages(context: Context): List<Language> {
            return enumValues<LanguageId>().mapNotNull { of(context, it) }
        }

        /**
         * Create Language by LanguageId
         */
        fun of(context: Context, id: LanguageId): Language? {
            LanguageCode.of(id)?.let { code ->
                return Language(
                    id = id,
                    code = code,
                    name = name(context, id),
                    localizedName = localizedName(id),
                    englishName = englishName(id),
                    isNonSpacing = id.isNonSpacing(),
                    isVerticalSupport = id.isVerticalSupport(),
                    isRTL = id.isRTL()
                )
            }
            return null
        }

        /**
         * Create Language by LanguageCode
         */
        fun of(context: Context, code: LanguageCode): Language? {
            LanguageId.of(code.value)?.let { id ->
                return Language(
                    id = id,
                    code = code,
                    name = name(context, id),
                    localizedName = localizedName(id),
                    englishName = englishName(id),
                    isNonSpacing = id.isNonSpacing(),
                    isVerticalSupport = id.isVerticalSupport(),
                    isRTL = id.isRTL()
                )
            }
            return null
        }

        /**
         * Create Language by String code
         */
        fun of(context: Context, stringCode: String): Language? {
            LanguageId.of(stringCode)?.let { id ->
                LanguageCode.of(stringCode)?.let { code ->
                    return Language(
                        id = id,
                        code = code,
                        name = name(context, id),
                        localizedName = localizedName(id),
                        englishName = englishName(id),
                        isNonSpacing = id.isNonSpacing(),
                        isVerticalSupport = id.isVerticalSupport(),
                        isRTL = id.isRTL()
                    )
                }
            }
            return null
        }

        /**
         * A language name from a resource
         */
        val name = fun(context: Context, id: LanguageId): String {
            nameResourceId(id)?.let {
                return context.getString(it)
            }
            return englishName(id)
        }

        /**
         * A Localized name with given LanguageId
         */
        val localizedName = fun(id: LanguageId): String {
            when (id) {
                LanguageId.AFAR -> return ""
                LanguageId.AFRIKAANS -> return "Afrikaans"
                LanguageId.ALBANIAN -> return "Shqip"
                LanguageId.AMHARIC -> return ""
                LanguageId.ARABIC -> return "العربية"
                LanguageId.ARAGONESE -> return ""
                LanguageId.ARMENIAN -> return "Հայերեն"
                LanguageId.ASSAMESE -> return ""
                LanguageId.ASTURIAN -> return ""
                LanguageId.AYMARA -> return ""
                LanguageId.AZERBAIJANI -> return "Azərbaycan"
                LanguageId.BASQUE -> return "Euskara"
                LanguageId.BELARUSIAN -> return "Беларуская"
                LanguageId.BENGALI -> return "বাংলা"
                LanguageId.BERBER -> return ""
                LanguageId.BISLAMA -> return ""
                LanguageId.BOSNIAN -> return "Босанци"
                LanguageId.BRETON -> return ""
                LanguageId.BULGARIAN -> return "Български"
                LanguageId.BURMESE -> return "မြန်မာ(Unicode)"
                LanguageId.CANTONESE -> return "粤语"
                LanguageId.CATALAN -> return "Català"
                LanguageId.CEBUANO -> return ""
                LanguageId.CHAMORRO -> return ""
                LanguageId.CHEROKEE -> return ""
                LanguageId.CHINESE_CLASSIC -> return "文言文"
                LanguageId.CHINESE_SIMPLIFIED -> return "中文（简体)"
                LanguageId.CHINESE_TRADITIONAL -> return "中文（繁體)"
                LanguageId.CORNISH -> return ""
                LanguageId.CORSICAN -> return ""
                LanguageId.CREE -> return ""
                LanguageId.CROATIAN -> return "Hrvatski"
                LanguageId.CZECH -> return "Čeština"
                LanguageId.DANISH -> return "Dansk"
                LanguageId.DUTCH -> return "Nederlands"
                LanguageId.ENGLISH -> return "English"
                LanguageId.ESPERANTO -> return ""
                LanguageId.ESTONIAN -> return "Eesti"
                LanguageId.FAROESE -> return ""
                LanguageId.FIJIAN -> return ""
                LanguageId.FILIPINO -> return "Filipino"
                LanguageId.FINNISH -> return "Suomi"
                LanguageId.FRENCH -> return "Français"
                LanguageId.FRISIAN -> return ""
                LanguageId.FRISIAN_NORTHERN -> return ""
                LanguageId.FRISIAN_SATERLAND -> return ""
                LanguageId.FRISIAN_WESTERN -> return ""
                LanguageId.FULA -> return ""
                LanguageId.GALICIAN -> return "Galego"
                LanguageId.GEORGIAN -> return "ქართული"
                LanguageId.GERMAN -> return "Deutsch"
                LanguageId.GIKUYU -> return "GIKUYU"
                LanguageId.GREEK -> return "Ελληνικά"
                LanguageId.GUARANÍ -> return ""
                LanguageId.GUJARATI -> return "ગુજરાતી"
                LanguageId.HAITIAN_CREOLE -> return ""
                LanguageId.HAUSA -> return ""
                LanguageId.HAWAIIAN -> return ""
                LanguageId.HEBREW -> return "עברית"
                LanguageId.HINDI -> return "हिन्दी"
                LanguageId.HIRI_MOTU -> return ""
                LanguageId.HMONG -> return ""
                LanguageId.HMONG_DAW -> return ""
                LanguageId.HUNGARIAN -> return "Magyar"
                LanguageId.ICELANDIC -> return "Íslenska"
                LanguageId.IDO -> return ""
                LanguageId.IGBO -> return ""
                LanguageId.ILOCANO -> return ""
                LanguageId.INDONESIAN -> return "Bahasa Indonesia"
                LanguageId.INNU_AIMUN -> return ""
                LanguageId.INTERLINGUA -> return ""
                LanguageId.IRISH -> return "Gaeilge"
                LanguageId.ITALIAN -> return "Italiano"
                LanguageId.JAPANESE -> return "日本語"
                LanguageId.JAVANESE -> return ""
                LanguageId.JUDEO_SPANISH -> return ""
                LanguageId.KABYLE -> return ""
                LanguageId.KANNADA -> return "ಕನ್ನಡ"
                LanguageId.KAZAKH -> return "Қазақша"
                LanguageId.KHASI -> return ""
                LanguageId.KHMER -> return "ខ្មែរយូនីកូដ"
                LanguageId.KINYARWANDA -> return ""
                LanguageId.KIRUNDI -> return ""
                LanguageId.KLINGON -> return ""
                LanguageId.KLINGON_PLQAD -> return ""
                LanguageId.KONGO -> return ""
                LanguageId.KONKANI -> return ""
                LanguageId.KOREAN -> return "한국어"
                LanguageId.KURDISH -> return ""
                LanguageId.KYRGYZ -> return ""
                LanguageId.LAO -> return "ລາວ"
                LanguageId.LATIN -> return ""
                LanguageId.LATVIAN -> return "Latviešu"
                LanguageId.LAZ -> return "LAZ"
                LanguageId.LEVANTINE_NORTHERN -> return ""
                LanguageId.LEVANTINE_SOUTHERN -> return ""
                LanguageId.LINGALA -> return ""
                LanguageId.LITHUANIAN -> return "Lietuvių"
                LanguageId.LUGANDA -> return ""
                LanguageId.LUXEMBOURGISH -> return ""
                LanguageId.MACEDONIAN -> return "Македонски"
                LanguageId.MALAGASY -> return ""
                LanguageId.MALAY -> return "Bahasa Melayu"
                LanguageId.MALAYALAM -> return "മലയാളം"
                LanguageId.MALTESE -> return ""
                LanguageId.MANX -> return ""
                LanguageId.MAORI -> return ""
                LanguageId.MARATHI -> return "मराठी"
                LanguageId.MARSHALLESE -> return ""
                LanguageId.MOLDOVAN -> return ""
                LanguageId.MONGOLIAN -> return "Монгол"
                LanguageId.MONTENEGRIN -> return ""
                LanguageId.NAHUATL -> return ""
                LanguageId.NAURUAN -> return ""
                LanguageId.NDEBELE_NORTHERN -> return ""
                LanguageId.NDEBELE_SOUTHERN -> return ""
                LanguageId.NEPALI -> return "नेपाली"
                LanguageId.NORWEGIAN -> return "Norsk"
                LanguageId.NYANJA -> return ""
                LanguageId.OCCITAN -> return ""
                LanguageId.OROMO -> return ""
                LanguageId.PALAUAN -> return ""
                LanguageId.PASHTO -> return ""
                LanguageId.PERSIAN -> return "فارسی"
                LanguageId.POLISH -> return "Polski"
                LanguageId.PORTUGUESE -> return "Português"
                LanguageId.PUNJABI -> return "ਪੰਜਾਬੀ "
                LanguageId.QUECHUA -> return ""
                LanguageId.QUERETARO_OTOMI -> return ""
                LanguageId.ROHINGYA -> return ""
                LanguageId.ROMANIAN -> return "Română"
                LanguageId.ROMANSH -> return ""
                LanguageId.RUSSIAN -> return "Русский"
                LanguageId.SAMOAN -> return ""
                LanguageId.SANSKRIT -> return ""
                LanguageId.SCOTS -> return ""
                LanguageId.SCOTS_GAELIC -> return ""
                LanguageId.SERBIAN -> return "Srpski"
                LanguageId.SERBIAN_CYRILLIC -> return ""
                LanguageId.SERBIAN_LATIN -> return ""
                LanguageId.SESOTHO -> return ""
                LanguageId.SEYCHELLOIS_CREOLE -> return ""
                LanguageId.SHONA -> return ""
                LanguageId.SINDHI -> return ""
                LanguageId.SINHALA -> return "සිංහල"
                LanguageId.SLOVAK -> return "Slovenčina"
                LanguageId.SLOVENIAN -> return "Slovenščina"
                LanguageId.SOMALI -> return ""
                LanguageId.SOTHO_NORTHERN -> return ""
                LanguageId.SPANISH -> return "Español"
                LanguageId.SUNDANESE -> return ""
                LanguageId.SWAHILI -> return ""
                LanguageId.SWATI -> return ""
                LanguageId.SWEDISH -> return "Svenska"
                LanguageId.TAHITIAN -> return ""
                LanguageId.TAJIK -> return "Тоҷикӣ"
                LanguageId.TAMIL -> return "தமிழ்"
                LanguageId.TATAR -> return ""
                LanguageId.TELUGU -> return "తెలుగు"
                LanguageId.TETUM -> return ""
                LanguageId.THAI -> return "ไทย"
                LanguageId.TOK_PISIN -> return ""
                LanguageId.TONGAN -> return ""
                LanguageId.TSONGA -> return ""
                LanguageId.TSWANA -> return ""
                LanguageId.TUNISIAN_ARABIC -> return ""
                LanguageId.TURKISH -> return "Türkçe"
                LanguageId.TURKMEN -> return ""
                LanguageId.TUROYO -> return ""
                LanguageId.UKRAINIAN -> return "Українська"
                LanguageId.URDU -> return "اردو"
                LanguageId.UZBEK -> return "Oʻzbekcha"
                LanguageId.VASTESE -> return ""
                LanguageId.VENDA -> return ""
                LanguageId.VIETNAMESE -> return "Tiếng Việt"
                LanguageId.VOLAPÜK -> return ""
                LanguageId.VÕRO -> return ""
                LanguageId.WALLOON -> return ""
                LanguageId.WELSH -> return ""
                LanguageId.WOLOF -> return ""
                LanguageId.XHOSA -> return ""
                LanguageId.YIDDISH -> return ""
                LanguageId.YORUBA -> return ""
                LanguageId.YUCATEC_MAYA -> return ""
                LanguageId.ZAZAKI -> return ""
                LanguageId.ZULU -> return ""
                else -> return ""
            }
        }

        /**
         * A english name with given LanguageId
         */
        val englishName = fun(id: LanguageId): String {
            return id.toString()
                .split("_")
                .map {
                    it.lowercase()
                        .replaceFirstChar { firstChar ->
                            firstChar.uppercase()
                        }
                }
                .reduce { englishName, s ->
                    "$englishName $s"
                }
        }

        /**
         * A language name with the specified locale applied on the resource
         */
        val localedName = fun(context: Context, id: LanguageId, locale: Locale): String {
            nameResourceId(id)?.let {
                return context.createConfigurationContext(
                    Configuration(context.resources.configuration)
                        .apply {
                            setLocale(locale)
                        }
                ).getString(it)
            }
            return englishName(id)
        }

        /**
         * A language name String resource id with given LanguageId
         */
        private val nameResourceId = fun(id: LanguageId): Int? {
            when (id) {
                LanguageId.AFAR -> return R.string.language_name_afar
                LanguageId.AFRIKAANS -> return R.string.language_name_afrikaans
                LanguageId.ALBANIAN -> return R.string.language_name_albanian
                LanguageId.AMHARIC -> return R.string.language_name_amharic
                LanguageId.ARABIC -> return R.string.language_name_arabic
                LanguageId.ARAGONESE -> return R.string.language_name_aragonese
                LanguageId.ARMENIAN -> return R.string.language_name_armenian
                LanguageId.ASSAMESE -> return R.string.language_name_assamese
                LanguageId.ASTURIAN -> return R.string.language_name_asturian
                LanguageId.AYMARA -> return R.string.language_name_aymara
                LanguageId.AZERBAIJANI -> return R.string.language_name_azerbaijani
                LanguageId.BASQUE -> return R.string.language_name_basque
                LanguageId.BELARUSIAN -> return R.string.language_name_belarusian
                LanguageId.BENGALI -> return R.string.language_name_bengali
                LanguageId.BERBER -> return R.string.language_name_berber
                LanguageId.BISLAMA -> return R.string.language_name_bislama
                LanguageId.BOSNIAN -> return R.string.language_name_bosnian
                LanguageId.BRETON -> return R.string.language_name_breton
                LanguageId.BULGARIAN -> return R.string.language_name_bulgarian
                LanguageId.BURMESE -> return R.string.language_name_burmese
                LanguageId.CANTONESE -> return R.string.language_name_cantonese
                LanguageId.CATALAN -> return R.string.language_name_catalan
                LanguageId.CEBUANO -> return R.string.language_name_cebuano
                LanguageId.CHAMORRO -> return R.string.language_name_chamorro
                LanguageId.CHEROKEE -> return R.string.language_name_cherokee
                LanguageId.CHINESE_CLASSIC -> return R.string.language_name_chinese_classical
                LanguageId.CHINESE_SIMPLIFIED -> return R.string.language_name_chinese_simplified
                LanguageId.CHINESE_TRADITIONAL -> return R.string.language_name_chinese_traditional
                LanguageId.CORNISH -> return R.string.language_name_cornish
                LanguageId.CORSICAN -> return R.string.language_name_corsican
                LanguageId.CREE -> return R.string.language_name_cree
                LanguageId.CROATIAN -> return R.string.language_name_croatian
                LanguageId.CZECH -> return R.string.language_name_czech
                LanguageId.DANISH -> return R.string.language_name_danish
                LanguageId.DUTCH -> return R.string.language_name_dutch
                LanguageId.ENGLISH -> return R.string.language_name_english
                LanguageId.ESPERANTO -> return R.string.language_name_esperanto
                LanguageId.ESTONIAN -> return R.string.language_name_estonian
                LanguageId.FAROESE -> return R.string.language_name_faroese
                LanguageId.FIJIAN -> return R.string.language_name_fijian
                LanguageId.FILIPINO -> return R.string.language_name_filipino
                LanguageId.FINNISH -> return R.string.language_name_finnish
                LanguageId.FRENCH -> return R.string.language_name_french
                LanguageId.FRISIAN -> return R.string.language_name_frisian
                LanguageId.FRISIAN_NORTHERN -> return R.string.language_name_frisian_saterland
                LanguageId.FRISIAN_SATERLAND -> return R.string.language_name_frisian_northern
                LanguageId.FRISIAN_WESTERN -> return R.string.language_name_frisian_western
                LanguageId.FULA -> return R.string.language_name_fula
                LanguageId.GALICIAN -> return R.string.language_name_galician
                LanguageId.GEORGIAN -> return R.string.language_name_georgian
                LanguageId.GERMAN -> return R.string.language_name_german
                LanguageId.GIKUYU -> return R.string.language_name_gikuyu
                LanguageId.GREEK -> return R.string.language_name_greek
                LanguageId.GUARANÍ -> return R.string.language_name_guarani
                LanguageId.GUJARATI -> return R.string.language_name_gujarati
                LanguageId.HAITIAN_CREOLE -> return R.string.language_name_haitian_creole
                LanguageId.HAUSA -> return R.string.language_name_hausa
                LanguageId.HAWAIIAN -> return R.string.language_name_hawaiian
                LanguageId.HEBREW -> return R.string.language_name_hebrew
                LanguageId.HINDI -> return R.string.language_name_hindi
                LanguageId.HIRI_MOTU -> return R.string.language_name_hiri
                LanguageId.HMONG -> return R.string.language_name_hmong
                LanguageId.HMONG_DAW -> return R.string.language_name_hmong_daw
                LanguageId.HUNGARIAN -> return R.string.language_name_hungarian
                LanguageId.ICELANDIC -> return R.string.language_name_icelandic
                LanguageId.IDO -> return R.string.language_name_ido
                LanguageId.IGBO -> return R.string.language_name_igbo
                LanguageId.ILOCANO -> return R.string.language_name_ilocano
                LanguageId.INDONESIAN -> return R.string.language_name_indonesian
                LanguageId.INNU_AIMUN -> return R.string.language_name_innu
                LanguageId.INTERLINGUA -> return R.string.language_name_interlingua
                LanguageId.IRISH -> return R.string.language_name_irish
                LanguageId.ITALIAN -> return R.string.language_name_italian
                LanguageId.JAPANESE -> return R.string.language_name_japanese
                LanguageId.JAVANESE -> return R.string.language_name_javanese
                LanguageId.JUDEO_SPANISH -> return R.string.language_name_judeo
                LanguageId.KABYLE -> return R.string.language_name_kabyle
                LanguageId.KANNADA -> return R.string.language_name_kannada
                LanguageId.KAZAKH -> return R.string.language_name_kazakh
                LanguageId.KHASI -> return R.string.language_name_khasi
                LanguageId.KHMER -> return R.string.language_name_khmer
                LanguageId.KINYARWANDA -> return R.string.language_name_kinyarwanda
                LanguageId.KIRUNDI -> return R.string.language_name_kirundi
                LanguageId.KLINGON -> return R.string.language_name_klingon
                LanguageId.KLINGON_PLQAD -> return R.string.language_name_klingon_plqad
                LanguageId.KONGO -> return R.string.language_name_kongo
                LanguageId.KONKANI -> return R.string.language_name_konkani
                LanguageId.KOREAN -> return R.string.language_name_korean
                LanguageId.KURDISH -> return R.string.language_name_kurdish
                LanguageId.KYRGYZ -> return R.string.language_name_kyrgyz
                LanguageId.LAO -> return R.string.language_name_lao
                LanguageId.LATIN -> return R.string.language_name_latin
                LanguageId.LATVIAN -> return R.string.language_name_latvian
                LanguageId.LAZ -> return R.string.language_name_laz
                LanguageId.LEVANTINE_NORTHERN -> return R.string.language_name_levantine_northern
                LanguageId.LEVANTINE_SOUTHERN -> return R.string.language_name_levantine_southern
                LanguageId.LINGALA -> return R.string.language_name_lingala
                LanguageId.LITHUANIAN -> return R.string.language_name_lithuanian
                LanguageId.LUGANDA -> return R.string.language_name_luganda
                LanguageId.LUXEMBOURGISH -> return R.string.language_name_luxembourgish
                LanguageId.MACEDONIAN -> return R.string.language_name_macedonian
                LanguageId.MALAGASY -> return R.string.language_name_malagasy
                LanguageId.MALAY -> return R.string.language_name_malay
                LanguageId.MALAYALAM -> return R.string.language_name_malayalam
                LanguageId.MALTESE -> return R.string.language_name_maltese
                LanguageId.MANX -> return R.string.language_name_manx
                LanguageId.MAORI -> return R.string.language_name_maori
                LanguageId.MARATHI -> return R.string.language_name_marathi
                LanguageId.MARSHALLESE -> return R.string.language_name_marshallese
                LanguageId.MOLDOVAN -> return R.string.language_name_moldovan
                LanguageId.MONGOLIAN -> return R.string.language_name_mongolian
                LanguageId.MONTENEGRIN -> return R.string.language_name_montenegrin
                LanguageId.NAHUATL -> return R.string.language_name_nahuatl
                LanguageId.NAURUAN -> return R.string.language_name_nauruan
                LanguageId.NDEBELE_NORTHERN -> return R.string.language_name_ndebele_northern
                LanguageId.NDEBELE_SOUTHERN -> return R.string.language_name_ndebele_southern
                LanguageId.NEPALI -> return R.string.language_name_nepali
                LanguageId.NORWEGIAN -> return R.string.language_name_norwegian
                LanguageId.NYANJA -> return R.string.language_name_nyanja
                LanguageId.OCCITAN -> return R.string.language_name_occitan
                LanguageId.OROMO -> return R.string.language_name_oromo
                LanguageId.PALAUAN -> return R.string.language_name_palauan
                LanguageId.PASHTO -> return R.string.language_name_pashto
                LanguageId.PERSIAN -> return R.string.language_name_persian
                LanguageId.POLISH -> return R.string.language_name_polish
                LanguageId.PORTUGUESE -> return R.string.language_name_portuguese
                LanguageId.PUNJABI -> return R.string.language_name_punjabi
                LanguageId.QUECHUA -> return R.string.language_name_quechua
                LanguageId.QUERETARO_OTOMI -> return R.string.language_name_queretaro_otomi
                LanguageId.ROHINGYA -> return R.string.language_name_rohingya
                LanguageId.ROMANIAN -> return R.string.language_name_romanian
                LanguageId.ROMANSH -> return R.string.language_name_romansh
                LanguageId.RUSSIAN -> return R.string.language_name_russian
                LanguageId.SAMOAN -> return R.string.language_name_samoan
                LanguageId.SANSKRIT -> return R.string.language_name_sanskrit
                LanguageId.SCOTS -> return R.string.language_name_scots
                LanguageId.SCOTS_GAELIC -> return R.string.language_name_scots_gaelic
                LanguageId.SERBIAN -> return R.string.language_name_serbian
                LanguageId.SERBIAN_CYRILLIC -> return R.string.language_name_serbian_cyrillic
                LanguageId.SERBIAN_LATIN -> return R.string.language_name_serbian_latin
                LanguageId.SESOTHO -> return R.string.language_name_sesotho
                LanguageId.SEYCHELLOIS_CREOLE -> return R.string.language_name_seychellois
                LanguageId.SHONA -> return R.string.language_name_shona
                LanguageId.SINDHI -> return R.string.language_name_sindhi
                LanguageId.SINHALA -> return R.string.language_name_sinhala
                LanguageId.SLOVAK -> return R.string.language_name_slovak
                LanguageId.SLOVENIAN -> return R.string.language_name_slovenian
                LanguageId.SOMALI -> return R.string.language_name_somali
                LanguageId.SOTHO_NORTHERN -> return R.string.language_name_sotho
                LanguageId.SPANISH -> return R.string.language_name_spanish
                LanguageId.SUNDANESE -> return R.string.language_name_sundanese
                LanguageId.SWAHILI -> return R.string.language_name_swahili
                LanguageId.SWATI -> return R.string.language_name_swati
                LanguageId.SWEDISH -> return R.string.language_name_swedish
                LanguageId.TAHITIAN -> return R.string.language_name_tahitian
                LanguageId.TAJIK -> return R.string.language_name_tajik
                LanguageId.TAMIL -> return R.string.language_name_tamil
                LanguageId.TATAR -> return R.string.language_name_tatar
                LanguageId.TELUGU -> return R.string.language_name_telugu
                LanguageId.TETUM -> return R.string.language_name_tetum
                LanguageId.THAI -> return R.string.language_name_thai
                LanguageId.TOK_PISIN -> return R.string.language_name_tok
                LanguageId.TONGAN -> return R.string.language_name_tongan
                LanguageId.TSONGA -> return R.string.language_name_tsonga
                LanguageId.TSWANA -> return R.string.language_name_tswana
                LanguageId.TUNISIAN_ARABIC -> return R.string.language_name_tunisian
                LanguageId.TURKISH -> return R.string.language_name_turkish
                LanguageId.TURKMEN -> return R.string.language_name_turkmen
                LanguageId.TUROYO -> return R.string.language_name_turoyo
                LanguageId.UKRAINIAN -> return R.string.language_name_ukrainian
                LanguageId.URDU -> return R.string.language_name_urdu
                LanguageId.UZBEK -> return R.string.language_name_uzbek
                LanguageId.VASTESE -> return R.string.language_name_vastese
                LanguageId.VENDA -> return R.string.language_name_venda
                LanguageId.VIETNAMESE -> return R.string.language_name_vietnamese
                LanguageId.VOLAPÜK -> return R.string.language_name_volapuk
                LanguageId.VÕRO -> return R.string.language_name_voro
                LanguageId.WALLOON -> return R.string.language_name_walloon
                LanguageId.WELSH -> return R.string.language_name_welsh
                LanguageId.WOLOF -> return R.string.language_name_wolof
                LanguageId.XHOSA -> return R.string.language_name_xhosa
                LanguageId.YIDDISH -> return R.string.language_name_yiddish
                LanguageId.YORUBA -> return R.string.language_name_yoruba
                LanguageId.YUCATEC_MAYA -> return R.string.language_name_yucatec_maya
                LanguageId.ZAZAKI -> return R.string.language_name_zazaki
                LanguageId.ZULU -> return R.string.language_name_zulu
                else -> return null
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other is Language) {
            return id == other.id
        }
        return false
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

    override fun compareTo(other: Language): Int {
        return name.compareTo(other.name)
    }

    override fun toString(): String {
        return "{\n" +
                "\tid: $id, \n" +
                "\tcode: $code, \n" +
                "\tname: '$name', \n" +
                "\tlocalizedName: '$localizedName', \n" +
                "\tenglishName: '$englishName', \n" +
                "\tisNonSpacing: $isNonSpacing, \n" +
                "\tisVerticalSupport: $isVerticalSupport, \n" +
                "\tisRTL: $isRTL\n" +
                "}"
    }
}

















