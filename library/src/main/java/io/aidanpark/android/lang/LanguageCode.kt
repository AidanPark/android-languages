package io.aidanpark.android.lang

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


/**
 * @description Code for the representation of name of language.
 * @author AidanPark
 * @date 2022/05/26
 * @version 1.0
 *
 * @property value String value of language code
 * @property standard [LanguageStandard]
 */
@Parcelize
data class LanguageCode(val value: String, val standard: LanguageStandard? = null) : Parcelable {

    override fun equals(other: Any?): Boolean {
        if (other is LanguageCode) {
            return this.value == other.value
        }
        return false
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }

    override fun toString(): String {
        return "{\n" +
                "\t\tcode: '$value', \n" +
                "\t\tstandard: '$standard'\n" +
                "\t}"
    }

    companion object {

        /**
         * Get LanguageCode with given language code
         */
        fun of(code: String): LanguageCode? {
            when (code) {
                "aa" -> return LanguageCode("aa", LanguageStandard.ISO_639_1)
                "af" -> return LanguageCode("af", LanguageStandard.ISO_639_1)
                "sq" -> return LanguageCode("sq", LanguageStandard.ISO_639_1)
                "am" -> return LanguageCode("am", LanguageStandard.ISO_639_1)
                "ar" -> return LanguageCode("ar", LanguageStandard.ISO_639_1)
                "an" -> return LanguageCode("an", LanguageStandard.ISO_639_1)
                "hy" -> return LanguageCode("hy", LanguageStandard.ISO_639_1)
                "as" -> return LanguageCode("as", LanguageStandard.ISO_639_1)
                "ast" -> return LanguageCode("ast", LanguageStandard.ISO_639_1)
                "ay" -> return LanguageCode("ay", LanguageStandard.ISO_639_1)
                "az" -> return LanguageCode("az", LanguageStandard.ISO_639_1)
                "eu" -> return LanguageCode("eu", LanguageStandard.ISO_639_1)
                "be" -> return LanguageCode("be", LanguageStandard.ISO_639_1)
                "bn" -> return LanguageCode("bn", LanguageStandard.ISO_639_1) // Bangla
                "ber" -> return LanguageCode("ber", LanguageStandard.ISO_639_1)
                "bi" -> return LanguageCode("bi", LanguageStandard.ISO_639_1)
                "bs" -> return LanguageCode("bs", LanguageStandard.ISO_639_1)
                "br" -> return LanguageCode("br", LanguageStandard.ISO_639_1)
                "bg" -> return LanguageCode("bg", LanguageStandard.ISO_639_1)
                "my" -> return LanguageCode("my", LanguageStandard.ISO_639_1) // Myanmar
                "yue" -> return LanguageCode("yue", LanguageStandard.ISO_639_1)
                "ca" -> return LanguageCode("ca", LanguageStandard.ISO_639_1)
                "ceb" -> return LanguageCode("ceb", LanguageStandard.ISO_639_1)
                "ch" -> return LanguageCode("ch", LanguageStandard.ISO_639_1)
                "chr" -> return LanguageCode("chr", LanguageStandard.ISO_639_1)
                "zh-CN" -> return LanguageCode("zh-CN", LanguageStandard.ISO_639_1)
                "zh-TW" -> return LanguageCode("zh-TW", LanguageStandard.ISO_639_1)
                "kw" -> return LanguageCode("kw", LanguageStandard.ISO_639_1)
                "co" -> return LanguageCode("co", LanguageStandard.ISO_639_1)
                "cr" -> return LanguageCode("cr", LanguageStandard.ISO_639_1)
                "hr" -> return LanguageCode("hr", LanguageStandard.ISO_639_1)
                "cs" -> return LanguageCode("cs", LanguageStandard.ISO_639_1)
                "da" -> return LanguageCode("da", LanguageStandard.ISO_639_1)
                "nl" -> return LanguageCode("nl", LanguageStandard.ISO_639_1)
                "en" -> return LanguageCode("en", LanguageStandard.ISO_639_1)
                "eo" -> return LanguageCode("eo", LanguageStandard.ISO_639_1)
                "et" -> return LanguageCode("et", LanguageStandard.ISO_639_1)
                "fo" -> return LanguageCode("fo", LanguageStandard.ISO_639_1)
                "fj" -> return LanguageCode("fj", LanguageStandard.ISO_639_1) // Lauan
                "tl" -> return LanguageCode("tl", LanguageStandard.ISO_639_1) // Tagalog
                "fi" -> return LanguageCode("fi", LanguageStandard.ISO_639_1)
                "fr" -> return LanguageCode("fr", LanguageStandard.ISO_639_1)
                "fy" -> return LanguageCode("fy", LanguageStandard.ISO_639_1)
                "stq" -> return LanguageCode("stq", LanguageStandard.ISO_639_1)
                "frr" -> return LanguageCode("frr", LanguageStandard.ISO_639_1)
                "fry" -> return LanguageCode("fry", LanguageStandard.ISO_639_1)
                "ff" -> return LanguageCode("ff", LanguageStandard.ISO_639_1)
                "gl" -> return LanguageCode("gl", LanguageStandard.ISO_639_1)
                "ka" -> return LanguageCode("ka", LanguageStandard.ISO_639_1)
                "de" -> return LanguageCode("de", LanguageStandard.ISO_639_1)
                "ki" -> return LanguageCode("ki", LanguageStandard.ISO_639_1)
                "el" -> return LanguageCode("el", LanguageStandard.ISO_639_1)
                "gug" -> return LanguageCode("gug", LanguageStandard.ISO_639_1)
                "gu" -> return LanguageCode("gu", LanguageStandard.ISO_639_1)
                "ht" -> return LanguageCode("ht", LanguageStandard.ISO_639_1)
                "ha" -> return LanguageCode("ha", LanguageStandard.ISO_639_1)
                "haw" -> return LanguageCode("haw", LanguageStandard.ISO_639_1)
                "iw" -> return LanguageCode("iw", LanguageStandard.ISO_639_1)
                "hi" -> return LanguageCode("hi", LanguageStandard.ISO_639_1)
                "ho" -> return LanguageCode("ho", LanguageStandard.ISO_639_1)
                "hmn" -> return LanguageCode("hmn", LanguageStandard.ISO_639_1)
                "mww" -> return LanguageCode("mww", LanguageStandard.ISO_639_1)
                "hu" -> return LanguageCode("hu", LanguageStandard.ISO_639_1)
                "is" -> return LanguageCode("is", LanguageStandard.ISO_639_1)
                "io" -> return LanguageCode("io", LanguageStandard.ISO_639_1)
                "ig" -> return LanguageCode("ig", LanguageStandard.ISO_639_1)
                "ilo" -> return LanguageCode("ilo", LanguageStandard.ISO_639_1)
                "id" -> return LanguageCode("id", LanguageStandard.ISO_639_1)
                "moe" -> return LanguageCode("moe", LanguageStandard.ISO_639_1)
                "ina" -> return LanguageCode("ina", LanguageStandard.ISO_639_1)
                "ga" -> return LanguageCode("ga", LanguageStandard.ISO_639_1)
                "it" -> return LanguageCode("it", LanguageStandard.ISO_639_1)
                "ja" -> return LanguageCode("ja", LanguageStandard.ISO_639_1)
                "jw" -> return LanguageCode("jw", LanguageStandard.ISO_639_1)
                "lad" -> return LanguageCode("lad", LanguageStandard.ISO_639_1)
                "kab" -> return LanguageCode("kab", LanguageStandard.ISO_639_1)
                "kn" -> return LanguageCode("kn", LanguageStandard.ISO_639_1)
                "kk" -> return LanguageCode("kk", LanguageStandard.ISO_639_1)
                "kha" -> return LanguageCode("kha", LanguageStandard.ISO_639_1)
                "km" -> return LanguageCode("km", LanguageStandard.ISO_639_1)
                "rw" -> return LanguageCode("rw", LanguageStandard.ISO_639_1)
                "rn" -> return LanguageCode("rn", LanguageStandard.ISO_639_1)
                "tlh" -> return LanguageCode("tlh", LanguageStandard.ISO_639_1)
                "tlh-Qaak" -> return LanguageCode(      "tlh-Qaak", LanguageStandard.ISO_639_1)
                "kg" -> return LanguageCode("kg", LanguageStandard.ISO_639_1)
                "kok" -> return LanguageCode("kok", LanguageStandard.ISO_639_1)
                "ko" -> return LanguageCode("ko", LanguageStandard.ISO_639_1)
                "ku" -> return LanguageCode("ku", LanguageStandard.ISO_639_1)
                "ky" -> return LanguageCode("ky", LanguageStandard.ISO_639_1)
                "lo" -> return LanguageCode("lo", LanguageStandard.ISO_639_1)
                "la" -> return LanguageCode("la", LanguageStandard.ISO_639_1)
                "lv" -> return LanguageCode("lv", LanguageStandard.ISO_639_1)
                "lzz" -> return LanguageCode("lzz", LanguageStandard.ISO_639_1)
                "apc" -> return LanguageCode("apc", LanguageStandard.ISO_639_1)
                "ajp" -> return LanguageCode("ajp", LanguageStandard.ISO_639_1)
                "ln" -> return LanguageCode("ln", LanguageStandard.ISO_639_1)
                "lt" -> return LanguageCode("lt", LanguageStandard.ISO_639_1)
                "lg" -> return LanguageCode("lg", LanguageStandard.ISO_639_1)
                "lb" -> return LanguageCode("lb", LanguageStandard.ISO_639_1)
                "mk" -> return LanguageCode("mk", LanguageStandard.ISO_639_1)
                "mg" -> return LanguageCode("mg", LanguageStandard.ISO_639_1)
                "ms" -> return LanguageCode("ms", LanguageStandard.ISO_639_1)
                "ml" -> return LanguageCode("ml", LanguageStandard.ISO_639_1)
                "mt" -> return LanguageCode("mt", LanguageStandard.ISO_639_1)
                "gv" -> return LanguageCode("gv", LanguageStandard.ISO_639_1)
                "mi" -> return LanguageCode("mi", LanguageStandard.ISO_639_1)
                "mr" -> return LanguageCode("mr", LanguageStandard.ISO_639_1)
                "mh" -> return LanguageCode("mh", LanguageStandard.ISO_639_1)
                "mo" -> return LanguageCode("mo", LanguageStandard.ISO_639_1)
                "mn" -> return LanguageCode("mn", LanguageStandard.ISO_639_1)
                "cnr" -> return LanguageCode("cnr", LanguageStandard.ISO_639_1)
                "nah" -> return LanguageCode("nah", LanguageStandard.ISO_639_1)
                "na" -> return LanguageCode("na", LanguageStandard.ISO_639_1)
                "nde" -> return LanguageCode("nde", LanguageStandard.ISO_639_1)
                "nr" -> return LanguageCode("nr", LanguageStandard.ISO_639_1)
                "ne" -> return LanguageCode("ne", LanguageStandard.ISO_639_1)
                "no" -> return LanguageCode("no", LanguageStandard.ISO_639_1)
                "ny" -> return LanguageCode("ny", LanguageStandard.ISO_639_1) // Chichewa
                "oc" -> return LanguageCode("oc", LanguageStandard.ISO_639_1)
                "om" -> return LanguageCode("om", LanguageStandard.ISO_639_1)
                "pau" -> return LanguageCode("pau", LanguageStandard.ISO_639_1)
                "ps" -> return LanguageCode("ps", LanguageStandard.ISO_639_1)
                "fa" -> return LanguageCode("fa", LanguageStandard.ISO_639_1)
                "pl" -> return LanguageCode("pl", LanguageStandard.ISO_639_1)
                "pt" -> return LanguageCode("pt", LanguageStandard.ISO_639_1)
                "pa" -> return LanguageCode("pa", LanguageStandard.ISO_639_1)
                "qu" -> return LanguageCode("qu", LanguageStandard.ISO_639_1)
                "otq" -> return LanguageCode("otq", LanguageStandard.ISO_639_1)
                "rhg" -> return LanguageCode("rhg", LanguageStandard.ISO_639_1)
                "ro" -> return LanguageCode("ro", LanguageStandard.ISO_639_1)
                "rm" -> return LanguageCode("rm", LanguageStandard.ISO_639_1)
                "ru" -> return LanguageCode("ru", LanguageStandard.ISO_639_1)
                "sm" -> return LanguageCode("sm", LanguageStandard.ISO_639_1)
                "sa" -> return LanguageCode("sa", LanguageStandard.ISO_639_1)
                "sco" -> return LanguageCode("sco", LanguageStandard.ISO_639_1)
                "gd" -> return LanguageCode("gd", LanguageStandard.ISO_639_1)
                "sr" -> return LanguageCode("sr", LanguageStandard.ISO_639_1)
                "sr-Cyrl" -> return LanguageCode("sr-Cyrl", LanguageStandard.ISO_639_1)
                "sr-Latn" -> return LanguageCode("sr-Latn", LanguageStandard.ISO_639_1)
                "st" -> return LanguageCode("st", LanguageStandard.ISO_639_1)
                "crs" -> return LanguageCode("crs", LanguageStandard.ISO_639_1)
                "sn" -> return LanguageCode("sn", LanguageStandard.ISO_639_1)
                "sd" -> return LanguageCode("sd", LanguageStandard.ISO_639_1)
                "si" -> return LanguageCode("si", LanguageStandard.ISO_639_1)
                "sk" -> return LanguageCode("sk", LanguageStandard.ISO_639_1)
                "sl" -> return LanguageCode("sl", LanguageStandard.ISO_639_1)
                "so" -> return LanguageCode("so", LanguageStandard.ISO_639_1)
                "nso" -> return LanguageCode("nso", LanguageStandard.ISO_639_1)
                "es" -> return LanguageCode("es", LanguageStandard.ISO_639_1)
                "su" -> return LanguageCode("su", LanguageStandard.ISO_639_1)
                "sw" -> return LanguageCode("sw", LanguageStandard.ISO_639_1)
                "ss" -> return LanguageCode("ss", LanguageStandard.ISO_639_1)
                "sv" -> return LanguageCode("sv", LanguageStandard.ISO_639_1)
                "ty" -> return LanguageCode("ty", LanguageStandard.ISO_639_1)
                "tg" -> return LanguageCode("tg", LanguageStandard.ISO_639_1)
                "ta" -> return LanguageCode("ta", LanguageStandard.ISO_639_1)
                "tt" -> return LanguageCode("tt", LanguageStandard.ISO_639_1)
                "te" -> return LanguageCode("te", LanguageStandard.ISO_639_1)
                "tet" -> return LanguageCode("tet", LanguageStandard.ISO_639_1)
                "th" -> return LanguageCode("th", LanguageStandard.ISO_639_1)
                "tpi" -> return LanguageCode("tpi", LanguageStandard.ISO_639_1)
                "to" -> return LanguageCode("to", LanguageStandard.ISO_639_1)
                "ts" -> return LanguageCode("ts", LanguageStandard.ISO_639_1)
                "tn" -> return LanguageCode("tn", LanguageStandard.ISO_639_1)
                "aeb" -> return LanguageCode("aeb", LanguageStandard.ISO_639_1)
                "tr" -> return LanguageCode("tr", LanguageStandard.ISO_639_1)
                "tk" -> return LanguageCode("tk", LanguageStandard.ISO_639_1)
                "tru" -> return LanguageCode("tru", LanguageStandard.ISO_639_1)
                "uk" -> return LanguageCode("uk", LanguageStandard.ISO_639_1)
                "ur" -> return LanguageCode("ur", LanguageStandard.ISO_639_1)
                "uz" -> return LanguageCode("uz", LanguageStandard.ISO_639_1)
                "nap" -> return LanguageCode("nap", LanguageStandard.ISO_639_1)
                "ve" -> return LanguageCode("ve", LanguageStandard.ISO_639_1)
                "vi" -> return LanguageCode("vi", LanguageStandard.ISO_639_1)
                "vo" -> return LanguageCode("vo", LanguageStandard.ISO_639_1)
                "vro" -> return LanguageCode("vro", LanguageStandard.ISO_639_1)
                "wa" -> return LanguageCode("wa", LanguageStandard.ISO_639_1)
                "cy" -> return LanguageCode("cy", LanguageStandard.ISO_639_1)
                "wo" -> return LanguageCode("wo", LanguageStandard.ISO_639_1)
                "xh" -> return LanguageCode("xh", LanguageStandard.ISO_639_1)
                "yi" -> return LanguageCode("yi", LanguageStandard.ISO_639_1)
                "yo" -> return LanguageCode("yo", LanguageStandard.ISO_639_1)
                "yua" -> return LanguageCode("yua", LanguageStandard.ISO_639_1)
                "zza" -> return LanguageCode("zza", LanguageStandard.ISO_639_1)
                "zu" -> return LanguageCode("zu", LanguageStandard.ISO_639_1)
                else -> return null
            }
        }

        /**
         * Get LanguageCode with given LanguageId
         */
        fun of(id: LanguageId): LanguageCode? {
            when (id) {
                LanguageId.AFAR -> return LanguageCode("aa", LanguageStandard.ISO_639_1)
                LanguageId.AFRIKAANS -> return LanguageCode("af", LanguageStandard.ISO_639_1)
                LanguageId.ALBANIAN -> return LanguageCode("sq", LanguageStandard.ISO_639_1)
                LanguageId.AMHARIC -> return LanguageCode("am", LanguageStandard.ISO_639_1)
                LanguageId.ARABIC -> return LanguageCode("ar", LanguageStandard.ISO_639_1)
                LanguageId.ARAGONESE -> return LanguageCode("an", LanguageStandard.ISO_639_1)
                LanguageId.ARMENIAN -> return LanguageCode("hy", LanguageStandard.ISO_639_1)
                LanguageId.ASSAMESE -> return LanguageCode("as", LanguageStandard.ISO_639_1)
                LanguageId.ASTURIAN -> return LanguageCode("ast", LanguageStandard.ISO_639_2)
                LanguageId.AYMARA -> return LanguageCode("ay", LanguageStandard.ISO_639_1)
                LanguageId.AZERBAIJANI -> return LanguageCode("az", LanguageStandard.ISO_639_1)
                LanguageId.BASQUE -> return LanguageCode("eu", LanguageStandard.ISO_639_1)
                LanguageId.BELARUSIAN -> return LanguageCode("be", LanguageStandard.ISO_639_1)
                LanguageId.BENGALI -> return LanguageCode("bn", LanguageStandard.ISO_639_1) // Bangla
                LanguageId.BERBER -> return LanguageCode("ber", LanguageStandard.ISO_639_3)
                LanguageId.BISLAMA -> return LanguageCode("bi", LanguageStandard.ISO_639_1)
                LanguageId.BOSNIAN -> return LanguageCode("bs", LanguageStandard.ISO_639_1)
                LanguageId.BRETON -> return LanguageCode("br", LanguageStandard.ISO_639_1)
                LanguageId.BULGARIAN -> return LanguageCode("bg", LanguageStandard.ISO_639_1)
                LanguageId.BURMESE -> return LanguageCode("my", LanguageStandard.ISO_639_1) // Myanmar
                LanguageId.CANTONESE -> return LanguageCode("yue", LanguageStandard.ISO_639_3)
                LanguageId.CATALAN -> return LanguageCode("ca", LanguageStandard.ISO_639_1)
                LanguageId.CEBUANO -> return LanguageCode("ceb", LanguageStandard.ISO_639_2)
                LanguageId.CHAMORRO -> return LanguageCode("ch", LanguageStandard.ISO_639_1)
                LanguageId.CHEROKEE -> return LanguageCode("chr", LanguageStandard.ISO_639_2)
                LanguageId.CHINESE_SIMPLIFIED -> return LanguageCode("zh-CN", LanguageStandard.BCP_47)
                LanguageId.CHINESE_TRADITIONAL -> return LanguageCode("zh-TW", LanguageStandard.BCP_47)
                LanguageId.CORNISH -> return LanguageCode("kw", LanguageStandard.ISO_639_1)
                LanguageId.CORSICAN -> return LanguageCode("co", LanguageStandard.ISO_639_1)
                LanguageId.CREE -> return LanguageCode("cr", LanguageStandard.ISO_639_1)
                LanguageId.CROATIAN -> return LanguageCode("hr", LanguageStandard.ISO_639_1)
                LanguageId.CZECH -> return LanguageCode("cs", LanguageStandard.ISO_639_1)
                LanguageId.DANISH -> return LanguageCode("da", LanguageStandard.ISO_639_1)
                LanguageId.DUTCH -> return LanguageCode("nl", LanguageStandard.ISO_639_1)
                LanguageId.ENGLISH -> return LanguageCode("en", LanguageStandard.ISO_639_1)
                LanguageId.ESPERANTO -> return LanguageCode("eo", LanguageStandard.ISO_639_1)
                LanguageId.ESTONIAN -> return LanguageCode("et", LanguageStandard.ISO_639_1)
                LanguageId.FAROESE -> return LanguageCode("fo", LanguageStandard.ISO_639_1)
                LanguageId.FIJIAN -> return LanguageCode("fj", LanguageStandard.ISO_639_3) // Lauan // llx
                LanguageId.FILIPINO -> return LanguageCode("tl", LanguageStandard.ISO_639_1) // Tagalog
                LanguageId.FINNISH -> return LanguageCode("fi", LanguageStandard.ISO_639_1)
                LanguageId.FRENCH -> return LanguageCode("fr", LanguageStandard.ISO_639_1)
                LanguageId.FRISIAN -> return LanguageCode("fy", LanguageStandard.ISO_639_1)
                LanguageId.FRISIAN_SATERLAND -> return LanguageCode("stq", LanguageStandard.ISO_639_3)
                LanguageId.FRISIAN_NORTHERN -> return LanguageCode("frr", LanguageStandard.ISO_639_3)
                LanguageId.FRISIAN_WESTERN -> return LanguageCode("fry", LanguageStandard.ISO_639_3)
                LanguageId.FULA -> return LanguageCode("ff", LanguageStandard.ISO_639_1)
                LanguageId.GALICIAN -> return LanguageCode("gl", LanguageStandard.ISO_639_1)
                LanguageId.GEORGIAN -> return LanguageCode("ka", LanguageStandard.ISO_639_1)
                LanguageId.GERMAN -> return LanguageCode("de", LanguageStandard.ISO_639_1)
                LanguageId.GIKUYU -> return LanguageCode("ki", LanguageStandard.ISO_639_1)
                LanguageId.GREEK -> return LanguageCode("el", LanguageStandard.ISO_639_1)
                LanguageId.GUARANÍ -> return LanguageCode("gug", LanguageStandard.ISO_639_3)
                LanguageId.GUJARATI -> return LanguageCode("gu", LanguageStandard.ISO_639_1)
                LanguageId.HAITIAN_CREOLE -> return LanguageCode("ht", LanguageStandard.ISO_639_1)
                LanguageId.HAUSA -> return LanguageCode("ha", LanguageStandard.ISO_639_1)
                LanguageId.HAWAIIAN -> return LanguageCode("haw", LanguageStandard.ISO_639_2)
                LanguageId.HEBREW -> return LanguageCode("iw", LanguageStandard.ISO_639_1)
                LanguageId.HINDI -> return LanguageCode("hi", LanguageStandard.ISO_639_1)
                LanguageId.HIRI_MOTU -> return LanguageCode("ho")
                LanguageId.HMONG -> return LanguageCode("hmn", LanguageStandard.ISO_639_2)
                LanguageId.HMONG_DAW -> return LanguageCode("mww", LanguageStandard.ISO_639_3)
                LanguageId.HUNGARIAN -> return LanguageCode("hu", LanguageStandard.ISO_639_1)
                LanguageId.ICELANDIC -> return LanguageCode("is", LanguageStandard.ISO_639_1)
                LanguageId.IDO -> return LanguageCode("io", LanguageStandard.ISO_639_1)
                LanguageId.IGBO -> return LanguageCode("ig", LanguageStandard.ISO_639_1)
                LanguageId.ILOCANO -> return LanguageCode("ilo", LanguageStandard.ISO_639_2)
                LanguageId.INDONESIAN -> return LanguageCode("id", LanguageStandard.ISO_639_1)
                LanguageId.INNU_AIMUN -> return LanguageCode("moe", LanguageStandard.ISO_639_3)
                LanguageId.INTERLINGUA -> return LanguageCode("ina", LanguageStandard.ISO_639_2)
                LanguageId.IRISH -> return LanguageCode("ga", LanguageStandard.ISO_639_1)
                LanguageId.ITALIAN -> return LanguageCode("it", LanguageStandard.ISO_639_1)
                LanguageId.JAPANESE -> return LanguageCode("ja", LanguageStandard.ISO_639_1)
                LanguageId.JAVANESE -> return LanguageCode("jw", LanguageStandard.ISO_639_1)
                LanguageId.JUDEO_SPANISH -> return LanguageCode("lad", LanguageStandard.ISO_639_2)
                LanguageId.KABYLE -> return LanguageCode("kab", LanguageStandard.ISO_639_2)
                LanguageId.KANNADA -> return LanguageCode("kn", LanguageStandard.ISO_639_1)
                LanguageId.KAZAKH -> return LanguageCode("kk", LanguageStandard.ISO_639_1)
                LanguageId.KHASI -> return LanguageCode("kha", LanguageStandard.ISO_639_2)
                LanguageId.KHMER -> return LanguageCode("km", LanguageStandard.ISO_639_1)
                LanguageId.KINYARWANDA -> return LanguageCode("rw", LanguageStandard.ISO_639_1)
                LanguageId.KIRUNDI -> return LanguageCode("rn", LanguageStandard.ISO_639_1)
                LanguageId.KLINGON -> return LanguageCode("tlh", LanguageStandard.ISO_639_2)
                LanguageId.KLINGON_PLQAD -> return LanguageCode("tlh-Qaak")
                LanguageId.KONGO -> return LanguageCode("kg", LanguageStandard.ISO_639_1)
                LanguageId.KONKANI -> return LanguageCode("kok", LanguageStandard.ISO_639_1)
                LanguageId.KOREAN -> return LanguageCode("ko", LanguageStandard.ISO_639_1)
                LanguageId.KURDISH -> return LanguageCode("ku", LanguageStandard.ISO_639_1)
                LanguageId.KYRGYZ -> return LanguageCode("ky", LanguageStandard.ISO_639_1)
                LanguageId.LAO -> return LanguageCode("lo", LanguageStandard.ISO_639_1)
                LanguageId.LATIN -> return LanguageCode("la", LanguageStandard.ISO_639_1)
                LanguageId.LATVIAN -> return LanguageCode("lv", LanguageStandard.ISO_639_1)
                LanguageId.LAZ -> return LanguageCode("lzz", LanguageStandard.ISO_639_3)
                LanguageId.LEVANTINE_NORTHERN -> return LanguageCode("apc", LanguageStandard.ISO_639_3)
                LanguageId.LEVANTINE_SOUTHERN -> return LanguageCode("ajp", LanguageStandard.ISO_639_3)
                LanguageId.LINGALA -> return LanguageCode("ln", LanguageStandard.ISO_639_1)
                LanguageId.LITHUANIAN -> return LanguageCode("lt", LanguageStandard.ISO_639_1)
                LanguageId.LUGANDA -> return LanguageCode("lg", LanguageStandard.ISO_639_1)
                LanguageId.LUXEMBOURGISH -> return LanguageCode("lb", LanguageStandard.ISO_639_1)
                LanguageId.MACEDONIAN -> return LanguageCode("mk", LanguageStandard.ISO_639_1)
                LanguageId.MALAGASY -> return LanguageCode("mg", LanguageStandard.ISO_639_1)
                LanguageId.MALAY -> return LanguageCode("ms", LanguageStandard.ISO_639_1)
                LanguageId.MALAYALAM -> return LanguageCode("ml", LanguageStandard.ISO_639_1)
                LanguageId.MALTESE -> return LanguageCode("mt", LanguageStandard.ISO_639_1)
                LanguageId.MANX -> return LanguageCode("gv", LanguageStandard.ISO_639_1)
                LanguageId.MAORI -> return LanguageCode("mi", LanguageStandard.ISO_639_1)
                LanguageId.MARATHI -> return LanguageCode("mr", LanguageStandard.ISO_639_1)
                LanguageId.MARSHALLESE -> return LanguageCode("mh", LanguageStandard.ISO_639_1)
                LanguageId.MOLDOVAN -> return LanguageCode("mo", LanguageStandard.ISO_639_1)
                LanguageId.MONGOLIAN -> return LanguageCode("mn", LanguageStandard.ISO_639_1)
                LanguageId.MONTENEGRIN -> return LanguageCode("cnr", LanguageStandard.ISO_639_2)
                LanguageId.NAHUATL -> return LanguageCode("nah", LanguageStandard.ISO_639_2)
                LanguageId.NAURUAN -> return LanguageCode("na", LanguageStandard.ISO_639_1)
                LanguageId.NDEBELE_NORTHERN -> return LanguageCode("nde", LanguageStandard.ISO_639_2)
                LanguageId.NDEBELE_SOUTHERN -> return LanguageCode("nr", LanguageStandard.ISO_639_1)
                LanguageId.NEPALI -> return LanguageCode("ne", LanguageStandard.ISO_639_1)
                LanguageId.NORWEGIAN -> return LanguageCode("no", LanguageStandard.ISO_639_1)
                LanguageId.NYANJA -> return LanguageCode("ny", LanguageStandard.ISO_639_1) // Chichewa
                LanguageId.OCCITAN -> return LanguageCode("oc", LanguageStandard.ISO_639_1)
                LanguageId.OROMO -> return LanguageCode("om", LanguageStandard.ISO_639_1)
                LanguageId.PALAUAN -> return LanguageCode("pau", LanguageStandard.ISO_639_2)
                LanguageId.PASHTO -> return LanguageCode("ps", LanguageStandard.ISO_639_1)
                LanguageId.PERSIAN -> return LanguageCode("fa", LanguageStandard.ISO_639_1)
                LanguageId.POLISH -> return LanguageCode("pl", LanguageStandard.ISO_639_1)
                LanguageId.PORTUGUESE -> return LanguageCode("pt", LanguageStandard.ISO_639_1)
                LanguageId.PUNJABI -> return LanguageCode("pa", LanguageStandard.ISO_639_1)
                LanguageId.QUECHUA -> return LanguageCode("qu", LanguageStandard.ISO_639_1)
                LanguageId.QUERETARO_OTOMI -> return LanguageCode("otq", LanguageStandard.ISO_639_3)
                LanguageId.ROHINGYA -> return LanguageCode("rhg", LanguageStandard.ISO_639_3)
                LanguageId.ROMANIAN -> return LanguageCode("ro", LanguageStandard.ISO_639_1)
                LanguageId.ROMANSH -> return LanguageCode("rm", LanguageStandard.ISO_639_1)
                LanguageId.RUSSIAN -> return LanguageCode("ru", LanguageStandard.ISO_639_1)
                LanguageId.SAMOAN -> return LanguageCode("sm", LanguageStandard.ISO_639_1)
                LanguageId.SANSKRIT -> return LanguageCode("sa", LanguageStandard.ISO_639_1)
                LanguageId.SCOTS -> return LanguageCode("sco", LanguageStandard.ISO_639_2)
                LanguageId.SCOTS_GAELIC -> return LanguageCode("gd", LanguageStandard.ISO_639_1)
                LanguageId.SERBIAN -> return LanguageCode("sr", LanguageStandard.ISO_639_1)
                LanguageId.SERBIAN_CYRILLIC -> return LanguageCode("sr-Cyrl")
                LanguageId.SERBIAN_LATIN -> return LanguageCode("sr-Latn")
                LanguageId.SESOTHO -> return LanguageCode("st", LanguageStandard.ISO_639_1)
                LanguageId.SEYCHELLOIS_CREOLE -> return LanguageCode("crs", LanguageStandard.ISO_639_3)
                LanguageId.SHONA -> return LanguageCode("sn", LanguageStandard.ISO_639_1)
                LanguageId.SINDHI -> return LanguageCode("sd", LanguageStandard.ISO_639_1)
                LanguageId.SINHALA -> return LanguageCode("si", LanguageStandard.ISO_639_1)
                LanguageId.SLOVAK -> return LanguageCode("sk", LanguageStandard.ISO_639_1)
                LanguageId.SLOVENIAN -> return LanguageCode("sl", LanguageStandard.ISO_639_1)
                LanguageId.SOMALI -> return LanguageCode("so", LanguageStandard.ISO_639_1)
                LanguageId.SOTHO_NORTHERN -> return LanguageCode("nso", LanguageStandard.ISO_639_2)
                LanguageId.SPANISH -> return LanguageCode("es", LanguageStandard.ISO_639_1)
                LanguageId.SUNDANESE -> return LanguageCode("su", LanguageStandard.ISO_639_1)
                LanguageId.SWAHILI -> return LanguageCode("sw", LanguageStandard.ISO_639_1)
                LanguageId.SWATI -> return LanguageCode("ss", LanguageStandard.ISO_639_1)
                LanguageId.SWEDISH -> return LanguageCode("sv", LanguageStandard.ISO_639_1)
                LanguageId.TAHITIAN -> return LanguageCode("ty", LanguageStandard.ISO_639_1)
                LanguageId.TAJIK -> return LanguageCode("tg", LanguageStandard.ISO_639_1)
                LanguageId.TAMIL -> return LanguageCode("ta", LanguageStandard.ISO_639_1)
                LanguageId.TATAR -> return LanguageCode("tt", LanguageStandard.ISO_639_1)
                LanguageId.TELUGU -> return LanguageCode("te", LanguageStandard.ISO_639_1)
                LanguageId.TETUM -> return LanguageCode("tet", LanguageStandard.ISO_639_2)
                LanguageId.THAI -> return LanguageCode("th", LanguageStandard.ISO_639_1)
                LanguageId.TOK_PISIN -> return LanguageCode("tpi", LanguageStandard.ISO_639_2)
                LanguageId.TONGAN -> return LanguageCode("to", LanguageStandard.ISO_639_1)
                LanguageId.TSONGA -> return LanguageCode("ts", LanguageStandard.ISO_639_1)
                LanguageId.TSWANA -> return LanguageCode("tn", LanguageStandard.ISO_639_1)
                LanguageId.TUNISIAN_ARABIC -> return LanguageCode("aeb", LanguageStandard.ISO_639_3)
                LanguageId.TURKISH -> return LanguageCode("tr", LanguageStandard.ISO_639_1)
                LanguageId.TURKMEN -> return LanguageCode("tk", LanguageStandard.ISO_639_1)
                LanguageId.TUROYO -> return LanguageCode("tru", LanguageStandard.ISO_639_3)
                LanguageId.UKRAINIAN -> return LanguageCode("uk", LanguageStandard.ISO_639_1)
                LanguageId.URDU -> return LanguageCode("ur", LanguageStandard.ISO_639_1)
                LanguageId.UZBEK -> return LanguageCode("uz", LanguageStandard.ISO_639_1)
                LanguageId.VASTESE -> return LanguageCode("nap", LanguageStandard.ISO_639_3)
                LanguageId.VENDA -> return LanguageCode("ve", LanguageStandard.ISO_639_1)
                LanguageId.VIETNAMESE -> return LanguageCode("vi", LanguageStandard.ISO_639_1)
                LanguageId.VOLAPÜK -> return LanguageCode("vo", LanguageStandard.ISO_639_1)
                LanguageId.VÕRO -> return LanguageCode("vro", LanguageStandard.ISO_639_3)
                LanguageId.WALLOON -> return LanguageCode("wa", LanguageStandard.ISO_639_1)
                LanguageId.WELSH -> return LanguageCode("cy", LanguageStandard.ISO_639_1)
                LanguageId.WOLOF -> return LanguageCode("wo", LanguageStandard.ISO_639_1)
                LanguageId.XHOSA -> return LanguageCode("xh", LanguageStandard.ISO_639_1)
                LanguageId.YIDDISH -> return LanguageCode("yi", LanguageStandard.ISO_639_1)
                LanguageId.YORUBA -> return LanguageCode("yo", LanguageStandard.ISO_639_1)
                LanguageId.YUCATEC_MAYA -> return LanguageCode("yua", LanguageStandard.ISO_639_3)
                LanguageId.ZAZAKI -> return LanguageCode("zza", LanguageStandard.ISO_639_2)
                LanguageId.ZULU -> return LanguageCode("zu", LanguageStandard.ISO_639_1)
                else -> return null
            }
        }
    }


}