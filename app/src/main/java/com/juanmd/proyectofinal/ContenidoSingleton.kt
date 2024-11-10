package com.juanmd.proyectofinal

object ContenidoSingleton {
    var niveles: List<Nivel> = crearNiveles()
    var nivelSeleccionado: Nivel? = null
    var moduloSeleccionado: Modulo? = null
    var temaSeleccionado: Tema? = null

    private fun crearNiveles(): List<Nivel> {

        val temaA1M1_1 = Tema("Formal and informal greetings", "https://www.youtube.com/watch?v=ti5pLWVwFBU", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA1M1_2 = Tema("Introducing oneself and others", "a1m1t2", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA1M1_3 = Tema("Countries and nationalities", "a1m1t3", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))
        val temaA1M1_4 = Tema("Emotions", "https://www.youtube.com/watch?v=a1Uy7HP90NM", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA1M2_1 = Tema("Cardinal and ordinal numbers", "a1m2t1", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA1M2_2 = Tema("Months", "https://www.youtube.com/watch?v=8nQpS0HFsto", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA1M2_3 = Tema("Telling time", "a1m2t3", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA1M2_4 = Tema("Dates and years", "a1m2t4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))
        val temaA1M3_1 = Tema("Family members", "a1m3t1", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA1M3_2 = Tema("Describing", "https://www.youtube.com/watch?v=tyQpVG2r07g", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))

        val temaA1M3_3 = Tema("Simple personality adjectives", "a1m3t3", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))

        val temaA1M3_4 = Tema("Pets", "a1m3t4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaA1M4_1 = Tema("Household items", "https://www.youtube.com/watch?v=L1iTdKz0GlE", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))

        val temaA1M4_2 = Tema("Colors", "a1m4t2", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))

        val temaA1M4_3 = Tema("Basic clothing", "a1m4t3", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))

        val temaA1M4_4 = Tema("School supplies", "a1m4t4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))



        // temas A2
        val temaA2M1_1 = Tema("Everyday activities", "https://www.youtube.com/watch?v=9wCqcdTwcco", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA2M1_2 = Tema("Times of the day", "a2m1t2", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA2M1_3 = Tema("Frequency", "a2m1t3", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))

        val temaA2M1_4 = Tema("Common action verbs", "a2m1t4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))

        val temaA2M2_1 = Tema("Sports and recreational activities", "a2m2t1", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))

        val temaA2M2_2 = Tema("Expressing likes and dislikes", "a2m2t2", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA2M2_3 = Tema("Inviting and responding to invitations", "a2m2t3", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))
        val temaA2M2_4 = Tema("Weekend plans", "a2m2t4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
            ))

        val temaA2M3_1 = Tema("Types of shops", "a2m3t1", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA2M3_2 = Tema("Clothing items and accessories", "a2m3t2", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA2M3_3 = Tema("Prices and currencies", "a2m3t3", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA2M3_4 = Tema("Simple buying and selling dialogues", "a2m3t4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))
        val temaA2M4_1 = Tema("Weather vocabulary", "", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA2M4_2 = Tema("Seasons of the year", "", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA2M4_3 = Tema("Seasonal activities", "", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaA2M4_4 = Tema("Clothing according to weather", "", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        //temas B1
        val temaB1M1_1 = Tema("Names of professions", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB1M1_2 = Tema("Skills and qualifications", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB1M1_3 = Tema("Work routines", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))
        val temaB1M1_4 = Tema("Job searching", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))


        val temaB1M3_1 = Tema("Parts of the body", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB1M3_2 = Tema("Parts of the body", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB1M3_3 = Tema("Medical appointments", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))
        val temaB1M3_4 = Tema("Healthy habits", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))
        val temaB1M4_1 = Tema("Electronic devices", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB1M4_2 = Tema("Internet and social media", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB1M4_3 = Tema("Technology-related verbs", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))
        val temaB1M4_4 = Tema("Simple technical problems", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))
        val temaB1M5_1 = Tema("Holidays and celebrations", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")

        ))

        val temaB1M5_2 = Tema("Traditions from different countries", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB1M5_3 = Tema("Comparing cultures", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))
        val temaB1M5_4 = Tema("Basic social etiquette", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        //temas B2
        val temaB2M1_1 = Tema("Environmental issues", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB2M1_2 = Tema("Conservation and recycling", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB2M1_3 = Tema("Animal and plant species", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))
        val temaB2M1_4 = Tema("Climate change", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB2M2_1 = Tema("Educational systems", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB2M2_2 = Tema("Study methods", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB2M2_3 = Tema("Online learning", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaB2M2_4 = Tema("Exams and assessments", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaB2M3_1 = Tema("Types of media (press, TV, radio, internet)", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB2M3_2 = Tema("News and current affairs", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB2M3_3 = Tema("Advertising", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaB2M3_4 = Tema("Social media and its impact", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaB2M4_1 = Tema("Music and film genres", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB2M4_2 = Tema("Literature and theater", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB2M4_3 = Tema("Museums and galleries", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaB2M4_4 = Tema("Basic art criticism", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaB2M5_1 = Tema("Inequality and discrimination", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB2M5_2 = Tema("Volunteering and activism", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaB2M5_3 = Tema("Basic human rights", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaB2M5_4 = Tema("Immigration and cultural diversity", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))

        //temas C1
        val temaC1M1_1 = Tema("Political systems", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC1M1_2 = Tema("Elections and parties", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC1M1_3 = Tema("International politics", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC1M1_4 = Tema("Political debates", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))

        val temaC1M2_1 = Tema("Basic economic concepts", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC1M2_2 = Tema("Labor market", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC1M2_3 = Tema("Entrepreneurship", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC1M2_4 = Tema("Globalization", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC1M3_1 = Tema("Recent scientific advances", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC1M3_2 = Tema("Ethics in science and technology", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC1M3_3 = Tema("Artificial intelligence", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC1M3_4 = Tema("Space exploration", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC1M4_1 = Tema("Literary movements", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC1M4_2 = Tema("Text analysis", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC1M4_3 = Tema("Philosophical currents", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC1M4_4 = Tema("Critical thinking", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC1M5_1 = Tema("Structure of an argument", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC1M5_2 = Tema("Logical fallacies", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC1M5_3 = Tema("Persuasion techniques", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC1M5_4 = Tema("Current controversial topics", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))

        //temas C2
        val temaC2M1_1 = Tema("Academic texts", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC2M1_2 = Tema("Specialized articles", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC2M1_3 = Tema("Interpretation of data and statistics", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC2M1_4 = Tema("Speech analysis", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))

        val temaC2M2_1 = Tema("Research methodology", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC2M2_2 = Tema("Writing theses and dissertations", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC2M2_3 = Tema("Citations and references", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC2M2_4 = Tema("Presentation of results", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC2M3_1 = Tema("Idioms and fixed phrases", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC2M3_2 = Tema("Slang and informal language", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC2M3_3 = Tema("Humor and sarcasm", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC2M3_4 = Tema("Dialectal variations", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC2M4_1 = Tema("Narrative techniques", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC2M4_2 = Tema("Poetry and rhetorical figures", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC2M4_3 = Tema("Advertising writing", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC2M4_4 = Tema("Speeches and public speaking", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC2M5_1 = Tema("Legal language", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC2M5_2 = Tema("Medical terminology", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))

        val temaC2M5_3 = Tema("Financial vocabulary", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))
        val temaC2M5_4 = Tema("Scientific and technical language", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")        ))

        val modulo1A1 = Modulo("Greetings and introductions", listOf(temaA1M1_1, temaA1M1_2, temaA1M1_3, temaA1M1_4))
        val modulo2A1 = Modulo("Numbers and dates", listOf(temaA1M2_1, temaA1M2_2, temaA1M2_3,temaA1M2_4))
        val modulo3A1 = Modulo("Family and friends", listOf(temaA1M3_1, temaA1M3_2, temaA1M3_3,temaA1M3_4))
        val modulo4A1 = Modulo("Everyday objects", listOf(temaA1M4_1, temaA1M4_2, temaA1M4_3,temaA1M4_4))

        val modulo1A2 = Modulo("Daily routines", listOf(temaA2M1_1, temaA2M1_2, temaA2M1_3, temaA2M1_4))
        val modulo2A2 = Modulo("Hobbies and free time", listOf(temaA2M2_1, temaA2M2_2, temaA2M2_3,temaA2M2_4))
        val modulo4A2 = Modulo("Basic shopping", listOf(temaA2M3_1, temaA2M3_2, temaA2M3_3,temaA2M3_4))
        val modulo5A2 = Modulo("Weather and seasons", listOf(temaA2M4_1, temaA2M4_2, temaA2M4_3,temaA2M4_4))

        val modulo1B1 = Modulo("Work and professions", listOf(temaB1M1_1, temaB1M1_2, temaB1M1_3, temaB1M1_4))
        val modulo3B1 = Modulo("Health and well-being", listOf(temaB1M3_1, temaB1M3_2, temaB1M3_3,temaB1M3_4))
        val modulo4B1 = Modulo("Basic technology", listOf(temaB1M4_1, temaB1M4_2, temaB1M4_3,temaB1M4_4))
        val modulo5B1 = Modulo("Culture and customs", listOf(temaB1M5_1, temaB1M5_2, temaB1M5_3,temaB1M5_4))

        val modulo1B2 = Modulo("Environment and nature", listOf(temaB2M1_1, temaB2M1_2, temaB2M1_3, temaB2M1_4))
        val modulo2B2 = Modulo("Education and learning", listOf(temaB2M2_1, temaB2M2_2, temaB2M2_3,temaB2M2_4))
        val modulo3B2 = Modulo("Media", listOf(temaB2M3_1, temaB2M3_2, temaB2M3_3,temaB2M3_4))
        val modulo4B2 = Modulo("Art and entertainment", listOf(temaB2M4_1, temaB2M4_2, temaB2M4_3,temaB2M4_4))
        val modulo5B2 = Modulo("Social issues", listOf(temaB2M5_1, temaB2M5_2, temaB2M5_3,temaB2M5_4))

        val modulo1C1 = Modulo("Politics and government", listOf(temaC1M1_1, temaC1M1_2, temaC1M1_3, temaC1M1_4))
        val modulo2C1 = Modulo("Economy and business", listOf(temaC1M2_1, temaC1M2_2, temaC1M2_3,temaC1M2_4))
        val modulo3C1 = Modulo("Advanced science and technology", listOf(temaC1M3_1, temaC1M3_2, temaC1M3_3,temaC1M3_4))
        val modulo4C1 = Modulo("Literature and philosophy", listOf(temaC1M4_1, temaC1M4_2, temaC1M4_3,temaC1M4_4))
        val modulo5C1 = Modulo("Debates and argumentation", listOf(temaC1M5_1, temaC1M5_2, temaC1M5_3,temaC1M5_4))

        val modulo1C2 = Modulo("Critical analysis of complex texts", listOf(temaC2M1_1, temaC2M1_2, temaC2M1_3, temaC2M1_4))
        val modulo2C2 = Modulo("Academic research", listOf(temaC2M2_1, temaC2M2_2, temaC2M2_3,temaC2M2_4))
        val modulo3C2 = Modulo("Idiomatic and colloquial expression", listOf(temaC2M3_1, temaC2M3_2, temaC2M3_3,temaC2M3_4))
        val modulo4C2 = Modulo("Creative and persuasive writing", listOf(temaC2M4_1, temaC2M4_2, temaC2M4_3,temaC2M4_4))
        val modulo5C2 = Modulo("Specialized and technical topics", listOf(temaC2M5_1, temaC2M5_2, temaC2M5_3,temaC2M5_4))


        val nivelA1 = Nivel("A1", listOf(modulo1A1, modulo2A1, modulo3A1, modulo4A1))
        val nivelA2 = Nivel("A2", listOf(modulo1A2, modulo2A2,  modulo4A2, modulo5A2))
        val nivelB1 = Nivel("B1", listOf(modulo1B1, modulo3B1, modulo4B1, modulo5B1))
        val nivelB2 = Nivel("B2", listOf(modulo1B2, modulo2B2, modulo3B2, modulo4B2, modulo5B2))
        val nivelC1 = Nivel("C1", listOf(modulo1C1, modulo2C1, modulo3C1, modulo4C1, modulo5C1))
        val nivelC2 = Nivel("C2", listOf(modulo1C2, modulo2C2, modulo3C2, modulo4C2,modulo5C2))

        return listOf(nivelA1, nivelA2, nivelB1, nivelB2, nivelC1, nivelC2)
    }

}

