package com.example.myapplication

import java.io.Serializable

class Usuario(
    var nombre: String,
    var apellidos: String,
    var correo: String,
    var edad: String,
    var contr: String
): Serializable {
}