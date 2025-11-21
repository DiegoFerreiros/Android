package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DatosUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_datos_usuario)

        val nombre = findViewById<EditText>(R.id.eitDatoNombre)
        val apellidos = findViewById<EditText>(R.id.eitDatoApellidos)
        val email = findViewById<EditText>(R.id.eitDatoCorreo)
        val edad = findViewById<EditText>(R.id.eitDatoEdad)
        val contr = findViewById<EditText>(R.id.eitDatoContr)


        val usuario = intent.getSerializableExtra("usuario") as Usuario

        val textoCorreo = usuario.correo
        val textoNombre = usuario.nombre
        val textoApellidos = usuario.apellidos
        val textoEdad = usuario.edad
        val textoContr = usuario.contr

        if (textoCorreo != "" && textoNombre != "" && textoApellidos != ""
            && textoEdad != "" && textoContr != "") {
            email.setText(textoCorreo)
            nombre.setText(textoNombre)
            apellidos.setText(textoApellidos)
            edad.setText(textoEdad)
            contr.setText(textoContr)
        }


        val btnEditar = findViewById<Button>(R.id.bEditar)
        btnEditar.setOnClickListener {
            if (!email.isEnabled && !nombre.isEnabled && !apellidos.isEnabled
                && !edad.isEnabled && !contr.isEnabled
            ) {
                email.setEnabled(true)
                nombre.setEnabled(true)
                apellidos.setEnabled(true)
                edad.setEnabled(true)
                contr.setEnabled(true)

                btnEditar.text = "Guardar"
            } else {
                email.setEnabled(false)
                nombre.setEnabled(false)
                apellidos.setEnabled(false)
                edad.setEnabled(false)
                contr.setEnabled(false)

                btnEditar.text = "Editar los datos"
            }
        }

    }
}