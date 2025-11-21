package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro)

        val btnCancelar = findViewById<Button>(R.id.bCancelar)
        btnCancelar.setOnClickListener {
            Snackbar.make(it, "Voy al registro", Snackbar.LENGTH_SHORT).show()
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        val btnAceptar = findViewById<Button>(R.id.bRegistro)
        val textoNombre = findViewById<TextInputEditText>(R.id.tilNombre)
        val textoApellidos = findViewById<TextInputEditText>(R.id.tilApellidos)
        val textoGmail = findViewById<TextInputEditText>(R.id.tilGmail)
        val textoEdad = findViewById<TextInputEditText>(R.id.tilEdad)
        val textoContr = findViewById<TextInputEditText>(R.id.tilContr)
        btnAceptar.setOnClickListener {
            if (textoGmail.text?.toString() != "" && textoNombre.text?.toString() != "" && textoApellidos.text?.toString() != "" && textoEdad.text?.toString() != "" && textoContr.text?.toString() != "") {
                Snackbar.make(it, "Registro correcto", Snackbar.LENGTH_SHORT).show()

                val usuario1 = Usuario(
                    textoNombre.text.toString(),
                    textoApellidos.text.toString(),
                    textoGmail.text.toString(),
                    textoEdad.text.toString(),
                    textoContr.text.toString()
                )

                val i = Intent(this, MainActivity::class.java)
                i.putExtra("usuario", usuario1)
                startActivity(i)
            } else {
                Snackbar.make(it, "Los campos NO pueden estar vacíos", Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}