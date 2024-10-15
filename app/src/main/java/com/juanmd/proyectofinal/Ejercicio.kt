package com.juanmd.proyectofinal

abstract class Ejercicio(
    open val pregunta: String
) {
    abstract fun verificarRespuesta(respuesta: String): Boolean
}

