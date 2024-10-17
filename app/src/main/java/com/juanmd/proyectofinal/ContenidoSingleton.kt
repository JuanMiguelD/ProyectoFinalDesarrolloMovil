package com.juanmd.proyectofinal

object ContenidoSingleton {
    var niveles: List<Nivel> = crearNiveles()
    var nivelSeleccionado: Nivel? = null
    var moduloSeleccionado: Modulo? = null
    var temaSeleccionado: Tema? = null

    private fun crearNiveles(): List<Nivel> {
        val tema1 = Tema("Presentaciones", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val tema2 = Tema("Saludos", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val tema3 = Tema("Frases Comunes", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))

        val modulo1 = Modulo("Introducción al Inglés", listOf(tema1, tema2, tema3))
        val modulo2 = Modulo("Vocabulario Básico", listOf(tema1, tema2, tema3))
        val modulo3 = Modulo("Frases Comunes", listOf(tema1, tema2, tema3))
        val modulo4 = Modulo("Gramática Inicial", listOf(tema1, tema2, tema3))

        val nivelA1 = Nivel("A1", listOf(modulo1, modulo2, modulo3, modulo4))
        val nivelA2 = Nivel("A2", listOf(modulo1, modulo2, modulo3, modulo4))
        val nivelB1 = Nivel("B1", listOf(modulo1, modulo2, modulo3, modulo4))
        val nivelB2 = Nivel("B2", listOf(modulo1, modulo2, modulo3, modulo4))
        val nivelC1 = Nivel("C1", listOf(modulo1, modulo2, modulo3, modulo4))
        val nivelC2 = Nivel("C2", listOf(modulo1, modulo2, modulo3, modulo4))

        return listOf(nivelA1, nivelA2, nivelB1, nivelB2, nivelC1, nivelC2)
    }
}

