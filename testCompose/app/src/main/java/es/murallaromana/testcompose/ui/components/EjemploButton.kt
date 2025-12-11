package es.murallaromana.testcompose.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import es.murallaromana.testcompose.R

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MiBoton() {
    Button(
        onClick = {},
        modifier = Modifier
            .clip(RectangleShape)
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 32.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
//        shape = RectangleShape,
        shape = RoundedCornerShape(8.dp),
    ) {
        Text("Holaaa")
    }
}

@Preview(showSystemUi = true)
@Composable
fun MiFloatingActionButton() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomEnd
    ) {
        FloatingActionButton(
            onClick = {},
            modifier = Modifier.padding(16.dp),
            containerColor = Color.Gray,
            contentColor = Color.Green,
            shape = CircleShape
        ) {
            Icon(
                modifier = Modifier.size(40.dp),
                painter = painterResource(R.drawable.icon_add),
                contentDescription = "Add button"
            )
        }
    }
}