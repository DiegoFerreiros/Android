package es.murallaromana.testcompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun MisTextFields(modifier: Modifier = Modifier) {
//    var texto = remember { mutableStateOf("Hola") }
    var nombre by rememberSaveable { mutableStateOf("Hola") }
    var apellidos by rememberSaveable { mutableStateOf("Hola") }

    Column(
        modifier = Modifier
            .padding(25.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        TextField(
            nombre,
            onValueChange = {
                nombre = it
            },
            label = { Text("Introduce tu nombre") },
        )

        Spacer(modifier = Modifier.height(10.dp).width(20.dp).background(Color.Red))

        OutlinedTextField(
            apellidos,
            onValueChange = {
                apellidos = it
            },
            label = { Text("Introduce tus apellidos") },
        )
    }
}