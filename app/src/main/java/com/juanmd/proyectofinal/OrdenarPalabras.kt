package com.juanmd.proyectofinal

class OrdenarPalabras(
    override var pregunta: String,
    val palabrasDesordenadas: List<String>,
    val respuestaCorrecta: String
) : Ejercicio(pregunta) {

    override fun verificarRespuesta(respuesta: String): Boolean {
        return respuesta.equals(respuestaCorrecta, ignoreCase = true)
    }
}
