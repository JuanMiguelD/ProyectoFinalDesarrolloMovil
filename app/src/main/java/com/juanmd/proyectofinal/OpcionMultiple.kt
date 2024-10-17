package com.juanmd.proyectofinal

class OpcionMultiple(
    override var pregunta: String,
    val opciones: List<String>,
    val respuestaCorrecta: String
) : Ejercicio(pregunta) {

    override fun verificarRespuesta(respuesta: String): Boolean {
        return respuesta.equals(respuestaCorrecta, ignoreCase = true)
    }
}
