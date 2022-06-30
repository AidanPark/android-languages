package io.aidanpark.android.lang.test

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.aidanpark.android.lang.Language
import java.util.*

@Composable
fun LocalesScreen(
    modifier: Modifier = Modifier
) {
    val languages: List<Language> = Language.getAllLanguages(LocalContext.current)
        //.sorted()

    /*
        LazyColumn and LazyRow are equivalent to RecyclerView in Android Views.
        LazyColumn doesn't recycle its children like RecyclerView.
        It emits new Composables as you scroll through it and is still performant, as emitting Composables is relatively cheap compared to instantiating Android Views.
     */
    LazyColumn(
        modifier = modifier
    ) {
        items(
            items = languages
        ) { language ->
            Card(
                backgroundColor = MaterialTheme.colors.primary,
                modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
            ) {
                LanguageContent(language)
            }
        }
    }
}

@Composable
private fun LanguageContent(language: Language) {
    /*
        remember is used to guard against recomposition, so the state is not reset.
        Note that if you call the same composable from different parts of the screen you will create different UI elements, each with its own version of the state.
        You can think of internal state as a private variable in a class.
        The composable function will automatically be "subscribed" to the state.
        If the state changes, composables that read these fields will be recomposed to display the updates.
        The remember function works only as long as the composable is kept in the Composition.
        When you rotate, the whole activity is restarted so all state is lost. This also happens with any configuration change and on process death.
     */
    //var expanded by remember { mutableStateOf(false) }

    /*
        If you expand item number 1, you scroll away to number 20 and come back to 1, you'll notice that 1 is back to the original size.
        You could save this data with rememberSaveable
     */
    var expanded by rememberSaveable { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .padding(12.dp)
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(12.dp)
        ) {
            Text(
                text = language.name,
                style = MaterialTheme.typography.h4.copy(
                    fontWeight = FontWeight.ExtraBold
                )
            )

//            Text(text = language.englishName)
//            Text(text = language.localizedName)
            Text(text = Language.localedName(LocalContext.current, language.id, Locale.KOREA))

            if (expanded) {
                Text(
                    text = language.toString(),
                )
            }
        }
        IconButton(onClick = { expanded = !expanded }) {
            Icon(
                imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                contentDescription = if (expanded) {
                    stringResource(R.string.show_less)
                } else {
                    stringResource(R.string.show_more)
                }
            )
        }
    }
}



