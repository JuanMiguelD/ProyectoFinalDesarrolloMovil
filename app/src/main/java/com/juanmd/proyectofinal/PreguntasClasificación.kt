package com.juanmd.proyectofinal

object PreguntasClasificación {


    // Mapa que asocia cada nivel  con su lista de preguntas
    private val preguntasPorNivel = mapOf(
        "A1" to listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            OpcionMultiple("Select the correct choice","Which word means \"big\"?", listOf("small", "tiny", "large", "short"), "large"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"),"the apple is red"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("Select the correct choice"," \"Cat\" is a plural noun.", listOf("True", "False"), "False"),
            CompletarFrase("Translate:","Hola, ¿cómo estás?", "Hello, how are you?"),
            CompletarFrase("Complete the Sentence", "My name ______ Sara.", "is")

            ),
        "A2" to listOf(
            OpcionMultiple("Choose the correct verb form:","She ______ to the park every Sunday.", listOf("go", "goes", "going", "gone"), "goes"),
            OpcionMultiple("Select the correct choice","Which word means \"happy\"?", listOf("sad", "angry", "joyful", "tired"), "joyful"),
            OpcionMultiple("True or False"," Past simple and past continuous are the same tense.", listOf("True", "False"), "False"),
            OrdenarPalabras("Create a correct sentence:","",listOf("play", "I", "football", "every","Sunday"),"I play football every Sunday"),
            CompletarFrase("Fill in the Blank", "Yesterday, I ______ (watch) a movie.", "watched"),
            OpcionMultiple("True or False","I have been living here for two years\" is in the present perfect continuous tense.", listOf("True", "False"), "True"),
            CompletarFrase("Translate:","Me gusta estudiar inglés", "I like studying English"),
            CompletarFrase("Complete the Sentence", "If it ______ (rain), I will stay home.", "rains")

        ),
        "B1" to listOf(
            OpcionMultiple("Select the correct choice","Which sentence is in the second conditional?", listOf(" If I have time, I go shopping", "If I am rich, I buy a car", "If it rains, I will stay home", "If I had more money, I would travel more"), "If I had more money, I would travel more"),
            OpcionMultiple("True or False","Modal verbs can only be used in present tense.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","What does \"get on\" mean?", listOf("To become angry", "To board", "To stop", "To fall down"), "To board"),
            OrdenarPalabras("Create a sentence with a relative clause:","",listOf("girl", "The", "whose", "car","is","red"),"The girl whose car is red"),
            CompletarFrase("Change to passive:", "\"They clean the house every week.\"", "The house is cleaned every week"),
            OpcionMultiple("True Or False","All adverbs end in \"-ly\".", listOf("True", "False"), "False"),
            CompletarFrase("Translate:","Ojalá pudiera hablar inglés perfectamente", "I wish I could speak English perfectly"),
            CompletarFrase("Complete the Sentence", "We arrived ______ the station at 5 PM", "at")

        ),
        "B2" to listOf(

            OpcionMultiple("True Or False","Passive voice always requires the verb \"to be\".", listOf("True", "False"), "True"),
            CompletarFrase("Complete the Sentence", "Despite ______ (Study) hard, he didn't pass the exam.", "studying"),
            CompletarFrase("Change to reported speech:", " \"I love learning languages,\" She said.", "that she loved learning languages"),
            OpcionMultiple("True Or False","All compound adjectives are hyphenated.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","What does the phrasal verb \"give up\" mean?", listOf("To provide", "To surrender", "To hand over", "To distribute"), "To surrender"),
            OpcionMultiple("Select the correct choice","Which word means \"ambiguous\"?", listOf("Clear", "Precise", "Vague", "Definite"), "Vague"),
            CompletarFrase("Translate:","A pesar de las dificultades, logramos completar el proyecto", "Despite the difficulties, we managed to complete the project"),
            CompletarFrase("Combine sentences using a relative clause:", "This is the book. I found it yesterday.", "This is the book that I found yesterday.")

        ),
        "C1" to listOf(
            OpcionMultiple("Select the correct choice","Which word means \"to make something seem less important\"?", listOf("Exaggerate", "Minimize", "Emphasize", "Magnify"), "Minimize"),
            OpcionMultiple("True or False","Reported speech always changes the verb tense.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","What does \"ostensibly\" mean?", listOf("Obviously", "Secretly", "Apparently", "Definitely"), "Apparently"),
            OpcionMultiple("True or False","All abstract nouns are uncountable.", listOf("True", "False"), "False"),
            OrdenarPalabras("Create a sentence:","",listOf("I","had","would", "have", "if", "studied","passed","more", "I"),"I would have passed if I had studied more"),
            OrdenarPalabras("Create a sentence:","",listOf("system","is","healthcare", "country's", "relatively", "the","efficient"),"The country's healthcare system is relatively efficient"),
            CompletarFrase("Translate:","Sería aconsejable reconsiderar la propuesta", "It would be advisable to reconsider the proposal"),
            CompletarFrase("Complete the Sentence", "He is known ____ his generosity", "for")

        ),
        "C2" to listOf(
            OpcionMultiple("Identify the literary device in:","\"Her eyes were diamonds sparkling in the moonlight\"", listOf("Simile", "Metaphor", "Personification", "Hyperbole"), "Metaphor"),
            OpcionMultiple("Select the correct choice","What does \"equivocal\" mean?", listOf("Clear", "Ambiguous", "Definite", "Precise"), "Ambiguous"),
            OpcionMultiple("Select the correct choice","The book provides insight ____ complex social issues.", listOf("Of", "For", "With", "Into"), "Into"),
            OpcionMultiple("True or False","All infinitive phrases can function as nouns.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("perspective", "should", "objective", "maintained", "be", "An"),"An objective perspective should be maintained"),
            CompletarFrase("Complete the Sentence", "___ to popular belief, this approach is not necessarily effective.", "Contrary"),
            OpcionMultiple("True or False","Semantic nuances are always translatable between languages", listOf("True", "False"), "False"),
            CompletarFrase("Translate:","Las implicaciones matizadas de su discurso eran profundas", "The nuanced implications of his discourse were profound"),

        )
    )

    // Función para obtener preguntas según el nombre del nivel
    fun obtenerPreguntas(nivelNombre: String): List<Ejercicio> {
        return preguntasPorNivel[nivelNombre] ?: emptyList()
    }
}