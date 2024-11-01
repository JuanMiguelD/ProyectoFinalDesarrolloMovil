package com.juanmd.proyectofinal

abstract class Ejercicio(
    open val enunciado: String,
    open val pregunta: String,
    open val respuesta: String
) {
    abstract fun verificarRespuesta(respuesta: String): Boolean
}

