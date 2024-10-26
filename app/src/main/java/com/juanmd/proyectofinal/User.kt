package com.juanmd.proyectofinal

data class User(
    var name: String,
    var email: String,
    var uid: String,
    var nivelActual: String = "A1", // Valor por defecto
    var moduloActual: Int = 1,      // Valor por defecto
    var temaActual: Int = 1         // Valor por defecto
) {
    // Constructor vacío necesario para Firebase
    constructor() : this("", "", "", "A1", 1, 1)
}

