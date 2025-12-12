package es.murallaromana.testcompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun EjemploWeights(modifier: Modifier = Modifier) {
    Column {
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .weight(1F))
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
            .weight(5F))
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green)
            .weight(1F))
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .weight(1F))
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
            .weight(1F))
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Magenta)
            .weight(1F))
    }
}

@Preview(showSystemUi = true)
@Composable
fun DistribucionFilas(modifier: Modifier = Modifier) {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .size(100.dp)
                .background(Color.Red)
                .weight(0.5F)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .size(100.dp)
                .background(Color.Green)
                .weight(0.5F)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(200.dp)
                    .background(Color.Blue)
            )

            Column {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .background(Color.Red)
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .background(Color.Yellow)
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2F)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color.Red)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2F)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.2f)
                    .background(Color.Blue)
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color.Green)
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.2f)
                    .background(Color.Blue)
            )

        }
    }



    Row(
        modifier = Modifier
            .padding(top = 20.dp, start = 20.dp, end = 20.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceAround,
//        horizontalArrangement = Arrangement.Absolute.SpaceBetween
    ) {
//        Text("Uno")
//        Text("Dos")
//        Text("Tres")
//        Text("Cuatro")
//        Text("Cinco")

        Icon(imageVector = Icons.Default.Person, contentDescription = "IconoUser")
        Spacer(modifier.width(20.dp))
        Text(text = "User", fontSize = 24.sp, fontWeight = FontWeight.Bold)
    }
}
