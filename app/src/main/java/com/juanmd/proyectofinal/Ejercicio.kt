package com.juanmd.proyectofinal

abstract class Ejercicio {

    abstract var pregunta: String

    constructor(pregunta: String) {
        this.pregunta = pregunta
    }

    abstract fun verificarRespuesta(respuesta: String): Boolean
}