package com.juanmd.proyectofinal

class OpciónMultiple(
    override var pregunta: String,
    private val opciones: List<String>,
    private val respuestaCorrecta: String) : Ejercicio(pregunta) {

    override fun verificarRespuesta(respuesta: String): Boolean {
        return respuesta.equals(respuestaCorrecta, ignoreCase = true)
    }

}
