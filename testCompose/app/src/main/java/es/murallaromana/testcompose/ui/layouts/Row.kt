package es.murallaromana.testcompose.ui.layouts

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MiFila(modifier: Modifier = Modifier){
    Row (modifier = modifier) {
        Text("Hola mundo!")
        Text("Hola mundo!")
        Text("Hola mundo!")
        Text("Hola mundo!")
        Text("Hola mundo!")
    }
}