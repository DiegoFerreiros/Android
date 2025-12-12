package es.murallaromana.testcompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import es.murallaromana.testcompose.R

@Preview(showSystemUi = true)
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    var Correo by rememberSaveable { mutableStateOf("") }
    var Pass by rememberSaveable { mutableStateOf("") }
    val verdePersonalizado = Color(0xFF25D366)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(120.dp))

        Icon(
            modifier = Modifier.size(125.dp),
            painter = painterResource(R.drawable.round_account_circle_24),
            contentDescription = ""
        )

        Text(
            "Bienvenido",
            fontSize = 30.sp)

        Text(
            "Inicia sesión para continuar",
            fontSize = 15.sp)

        Text(
            "Correo electrónico",
            fontSize = 15.sp,
            textAlign = TextAlign.Left)

        OutlinedTextField(
            Correo,
            onValueChange = {
                Correo = it
            },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("ejemplo@correo.com") },
            leadingIcon = {
                Icon(
                    modifier = Modifier.size(25.dp),
                    painter = painterResource(R.drawable.baseline_email_24),
                    contentDescription = ""
                )
            },
        )

        Text("Contraseña", fontSize = 15.sp)

        OutlinedTextField(
            Pass,
            onValueChange = {
                Pass = it
            },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("*******") },
            leadingIcon = {
                Icon(
                    modifier = Modifier.size(25.dp),
                    painter = painterResource(R.drawable.outline_password_24),
                    contentDescription = ""
                )
            },
            trailingIcon = {
                Button(
                    onClick = {}
                ) {
                    Icon(
                        modifier = Modifier.size(25.dp),
                        painter = painterResource(R.drawable.outline_visibility_24),
                        contentDescription = ""
                    )
                }
            },
        )

        Button(
            onClick = {},
            colors = ButtonDefaults
                .buttonColors(containerColor = Color.Transparent, contentColor = verdePersonalizado)
        ) {
            Text("¿Olvidaste la contraseña?")
        }

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults
                .buttonColors(containerColor = verdePersonalizado, contentColor = Color.White)
        ) {
            Text("Iniciar sesión")
        }


    }
}