package com.juanmd.proyectofinal



class CompletarFrase(
    override var enunciado: String,
    override var pregunta: String,
    override var respuesta : String
) : Ejercicio(enunciado, pregunta, respuesta) {

    override fun verificarRespuesta(respuesta: String): Boolean {
        return this.respuesta.equals(respuesta, ignoreCase = true)
    }
}
