package com.juanmd.proyectofinal

object PreguntasModulo {

    // Mapa que asocia cada módulo con su lista de preguntas
    private val preguntasPorModulo = mapOf(
        "Environment and nature" to listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
            // Añade más preguntas para este módulo si lo deseas
        ),
        "Technology and society" to listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "you ___ a person", "are")
            // Añade más preguntas para este módulo
        ),
        "Greetings and introductions" to listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
            // Añade más preguntas para este módulo si lo deseas
        )
    )

    // Función para obtener preguntas según el nombre del módulo
    fun obtenerPreguntas(moduloNombre: String): List<Ejercicio> {
        return preguntasPorModulo[moduloNombre] ?: emptyList()
    }
}
