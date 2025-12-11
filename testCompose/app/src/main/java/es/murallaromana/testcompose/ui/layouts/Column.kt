package es.murallaromana.testcompose.ui.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MiColumna(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text("Hola mundo!!",
            modifier = Modifier.background(Color.Red)
        )
        Text("Hola mundo!!")
        Text("Hola mundo!!")
        Text("Hola mundo!!")
        Button(onClick = {}) {
            Text("Hola mundo!")
        }
    }
}