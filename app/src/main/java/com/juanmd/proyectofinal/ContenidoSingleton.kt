package com.juanmd.proyectofinal

object ContenidoSingleton {
    var niveles: List<Nivel> = crearNiveles()
    var nivelSeleccionado: Nivel? = null
    var moduloSeleccionado: Modulo? = null
    var temaSeleccionado: Tema? = null

    private fun crearNiveles(): List<Nivel> {

        val temaA1M1_1 = Tema("Formal and informal greetings", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaA1M1_2 = Tema("Introducing oneself and others", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaA1M1_3 = Tema("Countries and nationalities", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA1M1_4 = Tema("Alphabet and spelling", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))

        val temaA1M2_1 = Tema("Cardinal and ordinal numbers", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaA1M2_2 = Tema("Days of the week and months", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaA1M2_3 = Tema("Telling time", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA1M2_4 = Tema("Dates and years", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA1M3_1 = Tema("Family members", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaA1M3_2 = Tema("Describing people (basic appearance)", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaA1M3_3 = Tema("Simple personality adjectives", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA1M3_4 = Tema("Pets", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA1M4_1 = Tema("Household items", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaA1M4_2 = Tema("Colors", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaA1M4_3 = Tema("Basic clothing", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA1M4_4 = Tema("School supplies", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA1M5_1 = Tema("Common foods", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaA1M5_2 = Tema("Beverages", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaA1M5_3 = Tema("Expressing simple likes and preferences", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA1M5_4 = Tema("Ordering in a restaurant (basic phrases)", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))

        // temas A2
        val temaA2M1_1 = Tema("Everyday activities", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaA2M1_2 = Tema("Times of the day", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaA2M1_3 = Tema("Frequency", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA2M1_4 = Tema("Common action verbs", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))

        val temaA2M2_1 = Tema("Sports and recreational activities", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaA2M2_2 = Tema("Expressing likes and dislikes", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaA2M2_3 = Tema("Inviting and responding to invitations", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA2M2_4 = Tema("Weekend plans", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA2M3_1 = Tema("Means of transport", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaA2M3_2 = Tema("Giving and asking for simple directions", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaA2M3_3 = Tema("Places in the city", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA2M3_4 = Tema("Prepositions of place", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA2M4_1 = Tema("Types of shops", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaA2M4_2 = Tema("Clothing items and accessories", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaA2M4_3 = Tema("Prices and currencies", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA2M4_4 = Tema("Simple buying and selling dialogues", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA2M5_1 = Tema("Weather vocabulary", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaA2M5_2 = Tema("Seasons of the year", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaA2M5_3 = Tema("Seasonal activities", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaA2M5_4 = Tema("Clothing according to weather", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))

        //temas B1
        val temaB1M1_1 = Tema("Names of professions", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaB1M1_2 = Tema("Skills and qualifications", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaB1M1_3 = Tema("Work routines", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB1M1_4 = Tema("Job searching", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))

        val temaB1M2_1 = Tema("Types of accommodation", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaB1M2_2 = Tema("Booking flights and hotels", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaB1M2_3 = Tema("Tourist activities", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB1M2_4 = Tema("Travel experiences", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB1M3_1 = Tema("Parts of the body", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaB1M3_2 = Tema("Parts of the body", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaB1M3_3 = Tema("Medical appointments", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB1M3_4 = Tema("Healthy habits", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB1M4_1 = Tema("Electronic devices", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaB1M4_2 = Tema("Internet and social media", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaB1M4_3 = Tema("Technology-related verbs", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB1M4_4 = Tema("Simple technical problems", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB1M5_1 = Tema("Holidays and celebrations", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaB1M5_2 = Tema("Traditions from different countries", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaB1M5_3 = Tema("Comparing cultures", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB1M5_4 = Tema("Basic social etiquette", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))

        //temas B2
        val temaB2M1_1 = Tema("Environmental issues", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaB2M1_2 = Tema("Conservation and recycling", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaB2M1_3 = Tema("Animal and plant species", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB2M1_4 = Tema("Climate change", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))

        val temaB2M2_1 = Tema("Educational systems", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaB2M2_2 = Tema("Study methods", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaB2M2_3 = Tema("Online learning", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB2M2_4 = Tema("Exams and assessments", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB2M3_1 = Tema("Types of media (press, TV, radio, internet)", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaB2M3_2 = Tema("News and current affairs", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaB2M3_3 = Tema("Advertising", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB2M3_4 = Tema("Social media and its impact", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB2M4_1 = Tema("Music and film genres", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaB2M4_2 = Tema("Literature and theater", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaB2M4_3 = Tema("Museums and galleries", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB2M4_4 = Tema("Basic art criticism", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB2M5_1 = Tema("Inequality and discrimination", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaB2M5_2 = Tema("Volunteering and activism", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaB2M5_3 = Tema("Basic human rights", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaB2M5_4 = Tema("Immigration and cultural diversity", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))

        //temas C1
        val temaC1M1_1 = Tema("Political systems", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaC1M1_2 = Tema("Elections and parties", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaC1M1_3 = Tema("International politics", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC1M1_4 = Tema("Political debates", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))

        val temaC1M2_1 = Tema("Basic economic concepts", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaC1M2_2 = Tema("Labor market", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaC1M2_3 = Tema("Entrepreneurship", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC1M2_4 = Tema("Globalization", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC1M3_1 = Tema("Recent scientific advances", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaC1M3_2 = Tema("Ethics in science and technology", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaC1M3_3 = Tema("Artificial intelligence", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC1M3_4 = Tema("Space exploration", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC1M4_1 = Tema("Literary movements", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaC1M4_2 = Tema("Text analysis", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaC1M4_3 = Tema("Philosophical currents", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC1M4_4 = Tema("Critical thinking", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC1M5_1 = Tema("Structure of an argument", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaC1M5_2 = Tema("Logical fallacies", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaC1M5_3 = Tema("Persuasion techniques", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC1M5_4 = Tema("Current controversial topics", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))

        //temas C2
        val temaC2M1_1 = Tema("Academic texts", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaC2M1_2 = Tema("Specialized articles", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaC2M1_3 = Tema("Interpretation of data and statistics", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC2M1_4 = Tema("Speech analysis", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))

        val temaC2M2_1 = Tema("Research methodology", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaC2M2_2 = Tema("Writing theses and dissertations", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaC2M2_3 = Tema("Citations and references", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC2M2_4 = Tema("Presentation of results", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC2M3_1 = Tema("Idioms and fixed phrases", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaC2M3_2 = Tema("Slang and informal language", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaC2M3_3 = Tema("Humor and sarcasm", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC2M3_4 = Tema("Dialectal variations", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC2M4_1 = Tema("Narrative techniques", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaC2M4_2 = Tema("Poetry and rhetorical figures", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaC2M4_3 = Tema("Advertising writing", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC2M4_4 = Tema("Speeches and public speaking", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC2M5_1 = Tema("Legal language", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Hola' en inglés?", listOf("Hello", "Hi", "Hey", "Hola"), "Hello"),
            CompletarFrase("Completa la frase", "I ___ a teacher", "am")
        ))

        val temaC2M5_2 = Tema("Medical terminology", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Cómo se dice 'Adiós' en inglés?", listOf("Bye", "Goodbye", "Later", "Hasta luego"), "Goodbye"),
            OrdenarPalabras("Ordena las palabras para formar una frase", listOf("are", "How", "you?"), "How are you?")
        ))

        val temaC2M5_3 = Tema("Financial vocabulary", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))
        val temaC2M5_4 = Tema("Scientific and technical language", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("¿Qué significa 'How are you?'?", listOf("¿Cómo estás?", "¿Qué tal?", "¿De dónde eres?", "¿Cómo te llamas?"), "¿Cómo estás?")
        ))

        val modulo1A1 = Modulo("Greetings and introductions", listOf(temaA1M1_1, temaA1M1_2, temaA1M1_3, temaA1M1_4))
        val modulo2A1 = Modulo("Numbers and dates", listOf(temaA1M2_1, temaA1M2_2, temaA1M2_3,temaA1M2_4))
        val modulo3A1 = Modulo("Family and friends", listOf(temaA1M3_1, temaA1M3_2, temaA1M3_3,temaA1M3_4))
        val modulo4A1 = Modulo("Everyday objects", listOf(temaA1M4_1, temaA1M4_2, temaA1M4_3,temaA1M4_4))
        val modulo5A1 = Modulo("Food and drinks", listOf(temaA1M5_1, temaA1M5_2, temaA1M5_3,temaA1M5_4))

        val modulo1A2 = Modulo("Daily routines", listOf(temaA2M1_1, temaA2M1_2, temaA2M1_3, temaA2M1_4))
        val modulo2A2 = Modulo("Hobbies and free time", listOf(temaA2M2_1, temaA2M2_2, temaA2M2_3,temaA2M2_4))
        val modulo3A2 = Modulo("Directions and transportation", listOf(temaA2M3_1, temaA2M3_2, temaA2M3_3,temaA2M3_4))
        val modulo4A2 = Modulo("Basic shopping", listOf(temaA2M4_1, temaA2M4_2, temaA2M4_3,temaA2M4_4))
        val modulo5A2 = Modulo("Weather and seasons", listOf(temaA2M5_1, temaA2M5_2, temaA2M5_3,temaA2M5_4))

        val modulo1B1 = Modulo("Work and professions", listOf(temaB1M1_1, temaB1M1_2, temaB1M1_3, temaB1M1_4))
        val modulo2B1 = Modulo("Travel and holidays", listOf(temaB1M2_1, temaB1M2_2, temaB1M2_3,temaB1M2_4))
        val modulo3B1 = Modulo("Health and well-being", listOf(temaB1M3_1, temaB1M3_2, temaB1M3_3,temaB1M3_4))
        val modulo4B1 = Modulo("Basic technology", listOf(temaB1M4_1, temaB1M4_2, temaB1M4_3,temaB1M4_4))
        val modulo5B1 = Modulo("Culture and customs", listOf(temaB1M5_1, temaB1M5_2, temaB1M5_3,temaB1M5_4))

        val modulo1B2 = Modulo("Environment and nature", listOf(temaB2M1_1, temaB2M1_2, temaB2M1_3, temaB2M1_4))
        val modulo2B2 = Modulo("Education and learning", listOf(temaB2M2_1, temaB2M2_2, temaB2M2_3,temaB2M2_4))
        val modulo3B2 = Modulo("Media", listOf(temaB2M3_1, temaB2M3_2, temaB2M3_3,temaB2M3_4))
        val modulo4B2 = Modulo("Art and entertainment", listOf(temaB2M4_1, temaB2M4_2, temaB2M4_3,temaB2M4_4))
        val modulo5B2 = Modulo("Social issues", listOf(temaB2M5_1, temaB2M5_2, temaB2M5_3,temaB2M5_4))

        val modulo1C1 = Modulo("Work and professions", listOf(temaC1M1_1, temaC1M1_2, temaC1M1_3, temaC1M1_4))
        val modulo2C1 = Modulo("Travel and holidays", listOf(temaC1M2_1, temaC1M2_2, temaC1M2_3,temaC1M2_4))
        val modulo3C1 = Modulo("Health and well-being", listOf(temaC1M3_1, temaC1M3_2, temaC1M3_3,temaC1M3_4))
        val modulo4C1 = Modulo("Basic technology", listOf(temaC1M4_1, temaC1M4_2, temaC1M4_3,temaC1M4_4))
        val modulo5C1 = Modulo("Culture and customs", listOf(temaC1M5_1, temaC1M5_2, temaC1M5_3,temaC1M5_4))

        val modulo1C2 = Modulo("Environment and nature", listOf(temaC2M1_1, temaC2M1_2, temaC2M1_3, temaC2M1_4))
        val modulo2C2 = Modulo("Education and learning", listOf(temaC2M2_1, temaC2M2_2, temaC2M2_3,temaC2M2_4))
        val modulo3C2 = Modulo("Media", listOf(temaC2M3_1, temaC2M3_2, temaC2M3_3,temaC2M3_4))
        val modulo4C2 = Modulo("Art and entertainment", listOf(temaC2M4_1, temaC2M4_2, temaC2M4_3,temaC2M4_4))
        val modulo5C2 = Modulo("Social issues", listOf(temaC2M5_1, temaC2M5_2, temaC2M5_3,temaC2M5_4))


        val nivelA1 = Nivel("A1", listOf(modulo1A1, modulo2A1, modulo3A1, modulo4A1, modulo5A1))
        val nivelA2 = Nivel("A2", listOf(modulo1A2, modulo2A2, modulo3A2, modulo4A2, modulo5A2))
        val nivelB1 = Nivel("B1", listOf(modulo1B1, modulo2B1, modulo3B1, modulo4B1, modulo5B1))
        val nivelB2 = Nivel("B2", listOf(modulo1B2, modulo2B2, modulo3B2, modulo4B2, modulo5B2))
        val nivelC1 = Nivel("C1", listOf(modulo1C1, modulo2C1, modulo3C1, modulo4C1))
        val nivelC2 = Nivel("C2", listOf(modulo1C2, modulo2C2, modulo3C2, modulo4C2,modulo5C2))

        return listOf(nivelA1, nivelA2, nivelB1, nivelB2, nivelC1, nivelC2)
    }

}

