package com.juanmd.proyectofinal

object PreguntasNivel {


    // Mapa que asocia cada nivel  con su lista de preguntas
    private val preguntasPorNivel = mapOf(
        "A1" to listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            OpcionMultiple("Select the correct choice","Which word means \"big\"?", listOf("small", "tiny", "large", "short"), "large"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"),"the apple is red")
            // Añade más preguntas para este módulo si lo deseas
        ),
        "A2" to listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            OpcionMultiple("Select the correct choice","Which word means \"big\"?", listOf("small", "tiny", "large", "short"), "large"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"),"the apple is red")
            // Añade más preguntas para este módulo
        ),
        "B1" to listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            OpcionMultiple("Select the correct choice","Which word means \"big\"?", listOf("small", "tiny", "large", "short"), "large"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"),"the apple is red")
            // Añade más preguntas para este módulo si lo deseas
        )
    )

    // Función para obtener preguntas según el nombre del nivel
    fun obtenerPreguntas(nivelNombre: String): List<Ejercicio> {
        return preguntasPorNivel[nivelNombre] ?: emptyList()
    }
}