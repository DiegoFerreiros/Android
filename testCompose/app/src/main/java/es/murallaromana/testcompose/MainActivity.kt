package es.murallaromana.testcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Composer
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import es.murallaromana.testcompose.ui.components.MisTextFields
import es.murallaromana.testcompose.ui.layouts.MiColumna
import es.murallaromana.testcompose.ui.layouts.MiFila
import es.murallaromana.testcompose.ui.theme.TestComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestComposeTheme {
//                MiColumna(Modifier.padding(vertical = 40.dp))
//                MiFila(Modifier.padding(vertical = 200.dp))
                MisTextFields()
            }
        }
    }


    @Preview(showSystemUi = true, showBackground = true)
    @Composable
    fun MostrarTexto() {
        Text(
            "Hola mundo",
            modifier = Modifier
                .padding(36.dp)
                .fillMaxWidth()
                .height(88.dp)
                .clip(CircleShape)
                .background(Color.Red),
            textAlign = TextAlign.Center
        )
    }
}