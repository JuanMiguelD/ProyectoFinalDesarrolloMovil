package com.juanmd.proyectofinal

object PreguntasNivel {


    // Mapa que asocia cada nivel  con su lista de preguntas
    private val preguntasPorNivel = mapOf(
        "A1" to listOf(
            OrdenarPalabras("Arrange the words to make a sentence in negative or affirmative form using verb to be.","",listOf("girl", "a", "good", "is", "She"),"She is a good girl"),
            OrdenarPalabras("Arrange the words to make a sentence in negative or affirmative form using verb to be","",listOf("good", "not", "friends", "They", "are"),"They are not good friends"),
            CompletarFrase("Complete the sentence using the verb to be", "I ______ a good student.", "am"),
            OrdenarPalabras("Arrange the words to make a sentence in negative or affirmative form using verb to be","",listOf("American", "friends", "and", "are", "My",  "not", "I"),"My friends and I Are not American"),
            CompletarFrase("Complete the sentence using the verb to be", "My father ____ a policeman.", "is"),
            CompletarFrase("Complete the sentence using the verb to be", "Her friends ____ hungry.", "are"),
            CompletarFrase("Complete the sentence using the verb to be", "He ____ not Mexican.", "is"),
            OpcionMultiple("Select the correct choice","It ____ not my dog", listOf("are", "am", "is"), "is"),
            OrdenarPalabras("Arrange the words to make a sentence in negative or affirmative form using verb to be","",listOf("a", "sister", "dentist", "My", "is"),"My sister is a dentist"),
            OpcionMultiple("the following sentence is correct.","we are friends", listOf("True", "False"), "True"),
            OpcionMultiple("the following sentence is correct.","They are doctors", listOf("True", "False"), "True"),
            CompletarFrase("Complete the sentence with a or an", "this is ____ apple", "an"),
            CompletarFrase("Complete the sentence with have, remember to conjugate ", "Peter and Carlos ____ a good idea.", "have"),
            OpcionMultiple("Complete the sentence with have, remember to conjugate ","My mother ____ a big bag.", listOf("have", "don't have", "has"), "has"),
            CompletarFrase("Complete the sentence with have, remember to conjugate ", "My sister doesn't have a skirt. She ____ pants.", "has"),
            ),
        "A2" to listOf(
            OpcionMultiple("choose the correct answer to each sentence.","We are to Young to get married so we have decided _____", listOf("waiting", "to wait", "wait"), "to wait"),
            OpcionMultiple("choose the correct answer to each sentence.","Stop ____ this terrible noise at once!", listOf("making", "make", "to make"), "making"),
            OpcionMultiple("choose the correct answer to each sentence.","I wanted ____ some presents. but we didn't have enough time", listOf("buy", "buying", "to buy"), "to buy"),
            CompletarFrase("Complete the sentence by using the base form, gerund, or infinitive of the verb in parentheses", "We decided _______ (run)   across the park.", "to run"),
            CompletarFrase("Complete the sentence by using the base form, gerund, or infinitive of the verb in parentheses", "Many people avoid ______ (eat) junk food because it can affect their health.", "eating"),
            OrdenarPalabras("Arrange the words to make a sentence in negative or affirmative form.","",listOf("him", "yet", "I", "have", "not", "singing","heard"),"I have not heard him singing yet"),
            OpcionMultiple("choose the correct answer to each sentence.","Albert ______ this happy since he met his girlfriend.", listOf("wasn't been", "hasn't been", "was not"), "hasn't been"),
            CompletarFrase("Complete the sentence using the verb in parentheses", "What is she doing? She ____  _____ (talk).", "is talking"),
            OpcionMultiple("choose the correct answer to each sentence.","I am busy right now. Let's ______ tomorrow.", listOf("will talk", "be talking", "talk"), "talk"),
            OrdenarPalabras("Arrange the words to make a sentence in interrogative form.","",listOf("laugh", "joke", "Did", "at", "?", "you","this"),"Did you laugh at this joke ?"),
            OrdenarPalabras("Arrange the words to make a sentence.","",listOf("has", "My", "Japan ", "traveled", "to", "brother","three", "times"),"My brother has traveled to Japan three times"),
            OrdenarPalabras("Arrange the words to make a sentence.","",listOf("party", "having", "Saturday", "are", "a", "my", "Next", "friends"),"Next Saturday my friends are having a party"),
            CompletarFrase("Complete the sentence using the verb in parentheses", "The telephone is ringing, I am ______ (go) to answer it.", "going"),
            CompletarFrase("Complete the sentence with by, at or for", "I have been waiting ______ three hours!", "for"),
            CompletarFrase("Complete the sentence with by, at or for", "I have to be home ______ 8:00 o´clock", "at"),
            ),
        "B1" to listOf(
            CompletarFrase("Write the superlative for this adjective", "Safe", "the safest"),
            CompletarFrase("Write the superlative for this adjective", "Fat", "fattest"),
            OpcionMultiple("choose the superlative for this adjective","Easy", listOf("The Easier", "Easier", "The easiest", "The best"), "The easiest"),
            CompletarFrase("Write the superlative for this adjective", "Beautiful", "the most beautiful"),
            OrdenarPalabras("Arrange the words to make a sentence.","",listOf("If", "have", "should", "dentist", "you", "toothache", "the", "see","you"),"If you have toothache you should see the dentist"),
            OrdenarPalabras("Arrange the words to make a sentence.","",listOf("her", "bought", "in", "flat", "She", "2016"),"She bought her flat in 2016"),
            CompletarFrase("Write the sentence using the correct tense", "I _____ (meet) him last Monday", "met"),
            OpcionMultiple("choose the best answer to complete the sentence.","The cat _____ the canary.", listOf("eat", "ate", "eating", "eaten"), "ate"),
            OpcionMultiple("choose the best answer to complete the sentence.","Marcos slept while I _________", listOf("are working", "worked", "was working", "work"), "was working"),
            OpcionMultiple("choose the best answer to complete the sentence.","I ______ the room. That's why my clothes are full of paint", listOf("painted", "have been painting", "am going to paint", "will paint"), "have been painting"),
            OpcionMultiple("choose the best answer to complete the sentence.","if he had ______ everything he would have _____ ill", listOf("eaten/been", "ate/been", "eat/be", "eat/been"), "have been painting"),
            OrdenarPalabras("Arrange the words to make a sentence.","",listOf("Did", "?", "teacher","to", "find", "you", "previous","out","what","the","happened"),"Did you find out what happened to the previous teacher ?"),
            OrdenarPalabras("Arrange the words to make a sentence.","",listOf("I", "dress", "if", "you","were","that", "wouldn't", "buy", "I"),"I wouldn't buy that dress if I were you"),
            OpcionMultiple("choose the best answer to complete the sentence.","I really like Harry because he´s very ______. He never lies.", listOf("lazy", "honest", "mean"), "honest"),
            OpcionMultiple("choose the best answer to complete the sentence.","I have a lot of _____ to finish tomorrow", listOf("project", "task", "work"), "have been painting"),
            )
    )

    // Función para obtener preguntas según el nombre del nivel
    fun obtenerPreguntas(nivelNombre: String): List<Ejercicio> {
        return preguntasPorNivel[nivelNombre] ?: emptyList()
    }
}