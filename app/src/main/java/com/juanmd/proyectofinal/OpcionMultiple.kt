package com.juanmd.proyectofinal

class OpcionMultiple(
    override var enunciado: String,
    override var pregunta: String,
    val opciones: List<String>,
    override val respuesta: String
) : Ejercicio(enunciado, pregunta, respuesta) {

    override fun verificarRespuesta(respuesta: String): Boolean {
        return this.respuesta.equals(respuesta, ignoreCase = true)
    }
}
