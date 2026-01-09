package es.murallaromana.testcompose.ui.components

import android.icu.text.CaseMap
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import es.murallaromana.testcompose.R

@Preview(showSystemUi = true)
@Composable
fun MiTopBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {Text("Título")},
    ) //Titulo e icono
}