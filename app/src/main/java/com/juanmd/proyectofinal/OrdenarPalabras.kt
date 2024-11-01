package com.juanmd.proyectofinal

class OrdenarPalabras(
    override var enunciado: String,
    override var pregunta: String,
    val palabrasDesordenadas: List<String>,
    override val respuesta: String
) : Ejercicio(enunciado,pregunta,respuesta) {

    override fun verificarRespuesta(respuesta: String): Boolean {
        return this.respuesta.equals(respuesta, ignoreCase = true)
    }
}
