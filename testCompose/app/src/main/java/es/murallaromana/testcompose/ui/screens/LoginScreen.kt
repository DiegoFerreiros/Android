package es.murallaromana.testcompose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import es.murallaromana.testcompose.R

@Preview(showSystemUi = true)
@Composable
fun loginScreen(modifier: Modifier = Modifier) {
    var Correo by rememberSaveable { mutableStateOf("") }
    var Pass by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(90.dp))

        Icon(
            modifier = Modifier
                .size(115.dp)
                .background(Color(0xFF00C24D), shape = CircleShape)
                .padding(20.dp),
            tint = Color.White,
            painter = painterResource(R.drawable.baseline_lock_24),
            contentDescription = ""
        )

        Spacer(
            modifier = Modifier.height(5.dp)
        )

        Text(
            "Bienvenido",
            fontSize = 30.sp
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Text(
            "Inicia sesión para continuar",
            fontSize = 15.sp,
            color = Color.Gray
        )

        Spacer(
            modifier = Modifier.height(40.dp)
        )

        Text(
            "Correo electrónico",
            fontSize = 15.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            Correo,
            onValueChange = {
                Correo = it
            },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("ejemplo@correo.com", color = Color.Gray) },
            leadingIcon = {
                Icon(
                    modifier = Modifier.size(25.dp),
                    painter = painterResource(R.drawable.baseline_email_24),
                    tint = Color.Gray,
                    contentDescription = ""
                )
            },
        )

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Text(
            "Contraseña",
            fontSize = 15.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            Pass,
            onValueChange = {
                Pass = it
            },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("*******", color = Color.Gray) },
            leadingIcon = {
                Icon(
                    modifier = Modifier.size(25.dp),
                    painter = painterResource(R.drawable.baseline_lock_24),
                    tint = Color.Gray,
                    contentDescription = ""
                )
            },
            trailingIcon = {
                Icon(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(R.drawable.outline_visibility_24),
                    tint = Color.Gray,
                    contentDescription = ""
                )
            },
        )

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Text(
            "¿Olvidaste la contraseña?",
            color = Color(0xFF00C24D),
            textAlign = TextAlign.End,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults
                .buttonColors(containerColor = Color(0xFF00C24D), contentColor = Color.White)
        ) {
            Text(
                "INICIAR SESIÓN",
                fontSize = 18.sp,
            )
        }

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Divider(
                modifier = Modifier
                    .weight(0.4F),
            )
            Text(
                "O",
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(horizontal = 8.dp),
                color = Color.Gray
            )
            Divider(
                modifier = Modifier.weight(0.4F)
            )
        }


        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                "¿No tienes cuenta? ",
                fontSize = 15.sp
            )

            Text(
                "Regístrate",
                color = Color(0xFF00C24D)
            )

        }


    }
}