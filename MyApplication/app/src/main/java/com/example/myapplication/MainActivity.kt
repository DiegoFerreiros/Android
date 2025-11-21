package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    // Bindear los findByView automaticamente haciendo binding.nombreTexto
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "Estoy en el onCreate")

        // necesario para el binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val email = binding.eitCorreo
        val btnLogin = binding.bLogIN
        val contr = binding.eitPass


//        if (android.os.Build.VERSION.SDK_INT > 33) {
//            val usuario = intent.getSerializableExtra("usuario", Usuario::class.java)
//        }

        var usuario: Usuario?
        usuario = intent.getSerializableExtra("usuario") as Usuario?

        val textoCorreo = usuario?.correo
        if (textoCorreo != null) {
            email.setText(textoCorreo)
        }

        btnLogin.setOnClickListener {
            if (email.text.toString() != "" && contr.text.toString() != "") {
                if (contr.text.toString() == usuario?.contr) {
                    val i = Intent(this, DatosUsuario::class.java)
                    i.putExtra("usuario", usuario)
                    startActivity(i)
                }
                val mensaje2 =
                    Toast.makeText(this, "Contraseña y correo NO COINCIDEN", Toast.LENGTH_SHORT)
                mensaje2.show()
            }
            val mensaje1 = Toast.makeText(this, "Rellena los datos para acceder", Toast.LENGTH_SHORT)
            mensaje1.show()
        }

        val btnRegistro = findViewById<Button>(R.id.bCrearCuenta)
        btnRegistro.setOnClickListener {
            Snackbar.make(it, "Voy al registro", Snackbar.LENGTH_SHORT).show()
            val i = Intent(this, RegistroActivity::class.java)
            startActivity(i)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "Estoy en el onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "Estoy en el onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "Estoy en el onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "Estoy en el onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "Estoy en el onDestroy")
    }
}