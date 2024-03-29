package io.aidanpark.android.lang.test

import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.aidanpark.android.lang.Language

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("io.aidanpark.android.lang.test", appContext.packageName)

        Language.getAllLanguages(appContext)
            .sorted()
            .map {
//                Log.d("", StringBuilder().append("\n<tr>")
//                    .append("<td>").append(it.name).append("</td>")
////                    .append("<td>").append(it.code?.value ?: "").append("</td>")
////                    .append("<td>").append(it.code?.standard ?: "").append("</td>")
//                    .append("<td>").append(it.code.value).append("</td>")
//                    .append("<td>").append(it.code.standard).append("</td>")
//                    .append("<td>").append(it.localizedName).append("</td>")
//                    .append("<td>").append(it.isNonSpacing).append("</td>")
//                    .append("<td>").append(it.isVerticalSupport).append("</td>")
//                    .append("<td>").append(it.isRTL).append("</td>")
//                    .append("</tr>").toString()
//                )

                if(it.localizedName.isNotEmpty()) {
                    Log.d("", "\"${it.localizedName}\" -> return LanguageId.${it.id}")
                }


                //Log.d("", it.toString())
            }
    }
}

































