package com.juanmd.proyectofinal



class CompletarFrase(
    override var pregunta: String,
    val fraseIncompleta: String,
    val respuestaCorrecta: String
) : Ejercicio(pregunta) {

    override fun verificarRespuesta(respuesta: String): Boolean {
        return respuesta.equals(respuestaCorrecta, ignoreCase = true)
    }
}
