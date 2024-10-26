package com.juanmd.proyectofinal

object PreguntasNivel {


    // Mapa que asocia cada nivel  con su lista de preguntas
    private val preguntasPorNivel = mapOf(
        "A1" to listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
            // Añade más preguntas para este módulo si lo deseas
        ),
        "A2" to listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "you ___ a person", "are")
            // Añade más preguntas para este módulo
        ),
        "B1" to listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
            // Añade más preguntas para este módulo si lo deseas
        )
    )

    // Función para obtener preguntas según el nombre del nivel
    fun obtenerPreguntas(nivelNombre: String): List<Ejercicio> {
        return preguntasPorNivel[nivelNombre] ?: emptyList()
    }
}