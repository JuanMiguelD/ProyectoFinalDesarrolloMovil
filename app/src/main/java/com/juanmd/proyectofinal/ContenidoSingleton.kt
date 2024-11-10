package com.juanmd.proyectofinal

object ContenidoSingleton {
    var niveles: List<Nivel> = crearNiveles()
    var nivelSeleccionado: Nivel? = null
    var moduloSeleccionado: Modulo? = null
    var temaSeleccionado: Tema? = null

    private fun crearNiveles(): List<Nivel> {

        val temaA1M1_1 = Tema("Formal and informal greetings", "https://www.youtube.com/watch?v=ti5pLWVwFBU", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence using a formal greeting.",
                "",
                listOf("to", "pleasure", "meet", "you", "It's"),
                "It's a pleasure to meet you"
            ),

            CompletarFrase(
                "Complete the sentence with an informal greeting.",
                "Hey! ____ up?",
                "What's"
            ),

            OpcionMultiple(
                "Select the correct greeting for a business meeting.",
                "Which is a formal greeting?",
                listOf("Hey, how's it going?", "Good morning, everyone.", "What's up?"),
                "Good morning, everyone."
            ),

            OpcionMultiple(
                "True or False",
                "\"Hi\" is a formal greeting.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "¿Cómo está usted?",
                "How are you?"
            ),

            OrdenarPalabras(
                "Arrange the words to form a sentence with an informal greeting.",
                "",
                listOf("What's", "everyone", "up,", "Hey"),
                "Hey, what's up, everyone"
            ),

            CompletarFrase(
                "Complete the formal greeting",
                "______ afternoon, Professor Williams.",
                "Good"
            ),

            OpcionMultiple(
                "Select the correct choice",
                "Which of these is an informal way to say hello?",
                listOf("Hello, sir.", "Hi there!", "Greetings."),
                "Hi there!"
            ),

            OrdenarPalabras(
                "Arrange the words to make an informal greeting.",
                "",
                listOf("up", "What's", "buddy", "?"),
                "What's up buddy?"
            ),

            CompletarFrase(
                "Translate:",
                "Es un placer conocerte",
                "It's a pleasure to meet you"
            )

        ))

        val temaA1M1_2 = Tema("Introducing oneself and others", "a1m1t2", listOf(

            OrdenarPalabras(
                "Arrange the words to make an introduction sentence.",
                "",
                listOf("am", "I", "a", "teacher"),
                "I am a teacher"
            ),

            CompletarFrase(
                "Complete the sentence introducing yourself.",
                "Hello, my name ____ John.",
                "is"
            ),

            OpcionMultiple(
                "Select the correct option for introducing someone else.",
                "Which sentence is appropriate?",
                listOf("This is my friend, Mike.", "I am Mike.", "Hello, I Mike."),
                "This is my friend, Mike."
            ),

            CompletarFrase(
                "Complete the business introduction",
                "It's a ______ to meet you, Mr. Anderson. I'm Sarah from the IT department.",
                "pleasure"
            ),

            OpcionMultiple(
                "Select the most appropriate way to introduce a colleague in a business meeting",
                "Choose the best option:",
                listOf(
                    "Hey, this is Bob",
                    "I'd like to introduce you to Mr. Roberts, our Marketing Director",
                    "This is my friend Roberts"
                ),
                "I'd like to introduce you to Mr. Roberts, our Marketing Director"
            ),

            OrdenarPalabras(
                "Arrange the words to introduce someone formally.",
                "",
                listOf("introduce", "let", "you", "me", "to", "Mrs. Brown"),
                "Let me introduce you to Mrs. Brown"
            ),

            CompletarFrase(
                "Complete the phrase for a casual introduction.",
                "Hi, ____ is my brother, Alex.",
                "this"
            ),

            OpcionMultiple(
                "Select the best introduction phrase for a formal event.",
                "Choose the correct option:",
                listOf("Hey, this is John.", "I’d like to introduce myself, I'm John.", "Yo, I'm John."),
                "I’d like to introduce myself, I'm John"
            ),

            OpcionMultiple(
                "True or False",
                "When introducing others, it is correct to say 'Please to meet you.'",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Fill the Blanks :",
                "I _____ like to introduce myself. I am Ana.",
                "would"
            )

        ))

        val temaA1M1_3 = Tema("Countries and nationalities", "a1m1t3", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about nationality.",
                "",
                listOf("I", "am", "Spanish"),
                "I am Spanish"
            ),

            CompletarFrase(
                "Complete the sentence with the correct nationality.",
                "He is from Italy. He is ____.",
                "Italian"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Maria is from France. She is ____.",
                listOf("French", "German", "Spanish"),
                "French"
            ),

            OpcionMultiple(
                "True or False",
                "A person from Brazil is called Brazilian.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Ella es de México.",
                "She is from Mexico."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about where someone is from.",
                "",
                listOf("from", "is", "He", "Canada"),
                "He is from Canada"
            ),

            CompletarFrase(
                "Complete the sentence",
                "We are ____; we come from the USA.",
                "American"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What is the nationality of someone from Japan?",
                listOf("Japanese", "Chinese", "Korean"),
                "Japanese"
            ),

            OpcionMultiple(
                "True or False",
                "People from Germany are called Germanians.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Soy de Australia.",
                "I am from Australia."
            )

        ))

        val temaA1M1_4 = Tema("Emotions", "https://www.youtube.com/watch?v=a1Uy7HP90NM", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence expressing emotion.",
                "",
                listOf("happy", "I", "am", "today"),
                "I am happy today"
            ),

            CompletarFrase(
                "Complete the sentence with the correct emotion.",
                "He lost his keys. He is ____.",
                "sad"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Sarah received a gift. She is ____.",
                listOf("angry", "tired", "excited"),
                "excited"
            ),

            OpcionMultiple(
                "True or False",
                "When someone feels tired, it means they have a lot of energy.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Estoy nervioso por el examen.",
                "I am nervous about the exam."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about how someone feels.",
                "",
                listOf("is", "She", "because", "happy", "it's", "her", "birthday"),
                "She is happy because it's her birthday"
            ),

            CompletarFrase(
                "Complete the sentence",
                "They are ____ because they won the game.",
                "happy"
            ),

            OpcionMultiple(
                "Select the correct option",
                "How do you feel when you are at a party with friends?",
                listOf("bored", "excited", "angry"),
                "excited"
            ),

            OpcionMultiple(
                "True or False",
                "Feeling angry means you are very sad.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Él está feliz con su nuevo trabajo.",
                "He is happy with his new job."
            )


        ))

        val temaA1M2_1 = Tema("Cardinal and ordinal numbers", "a1m2t1", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence with a cardinal number.",
                "",
                listOf("I", "have", "three", "cats"),
                "I have three cats"
            ),

            CompletarFrase(
                "Complete the sentence with the correct ordinal number.",
                "Today is my ____ day at school.",
                "first"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "What comes after 'second'?",
                listOf("third", "fourth", "first"),
                "third"
            ),

            OpcionMultiple(
                "True or False",
                "The number 'ten' is an ordinal number.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Él vive en el quinto piso.",
                "He lives on the fifth floor."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence using an ordinal number.",
                "",
                listOf("won", "She", "the", "second", "prize"),
                "She won the second prize"
            ),

            CompletarFrase(
                "Complete the sentence",
                "I am reading the ____ chapter of the book.",
                "third"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which number is a cardinal number?",
                listOf("first", "twelve", "second"),
                "twelve"
            ),

            OpcionMultiple(
                "True or False",
                "The word 'fourth' represents a position.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Tengo dos hermanos.",
                "I have two brothers."
            )


        ))

        val temaA1M2_2 = Tema("Months", "https://www.youtube.com/watch?v=8nQpS0HFsto", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about a month.",
                "",
                listOf("in", "My", "birthday", "is", "July"),
                "My birthday is in July"
            ),

            CompletarFrase(
                "Complete the sentence with the correct month.",
                "Christmas is in ____.",
                "December"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Which month comes after March?",
                listOf("April", "May", "February"),
                "April"
            ),

            OpcionMultiple(
                "True or False",
                "August is the first month of the year.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "El verano comienza en junio.",
                "Summer starts in June."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about a month.",
                "",
                listOf("is", "The", "holiday", "in", "November"),
                "The holiday is in November"
            ),

            CompletarFrase(
                "Complete the sentence",
                "The school ___ starts in September.",
                "year"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which month is the shortest?",
                listOf("February", "May", "April"),
                "February"
            ),

            OpcionMultiple(
                "True or False",
                "June, July, and August are winter months in the Northern Hemisphere.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Mi estación favorita es otoño, que comienza en septiembre.",
                "My favorite season is fall, which starts in September."
            )


        ))

        val temaA1M2_3 = Tema("Telling time", "a1m2t3", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about time.",
                "",
                listOf("o'clock", "It's", "three"),
                "It's three o'clock"
            ),


            OpcionMultiple(
                "Select the correct answer",
                "What time is it when the big hand is on 12 and the small hand is on 5?",
                listOf("5:00", "12:30", "3:00"),
                "5:00"
            ),

            OpcionMultiple(
                "True or False",
                "Half past seven means 7:30.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Es la una y cuarto.",
                "It is a quarter past one"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about telling time.",
                "",
                listOf("at", "bedtime", "My", "is", "eight", "o'clock"),
                "My bedtime is at eight o'clock"
            ),

            CompletarFrase(
                "Complete the sentence",
                "The meeting is ___ quarter past ten.",
                "at"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What does 'quarter to six' mean?",
                listOf("5:15", "5:45", "6:15"),
                "5:45"
            ),

            OpcionMultiple(
                "True or False",
                "10:15 can be said as 'a quarter past ten'.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Son las tres y cuarto",
                "It's quarter past three"
            ),

            OrdenarPalabras(
                "Arrange the words to tell the time.",
                "",
                listOf("is", "past", "It", "quarter", "eight", "a"),
                "It is a quarter past eight"
            )
        ))

        val temaA1M2_4 = Tema("Dates and years", "a1m2t4", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about a date.",
                "",
                listOf("in", "was", "born", "2005", "I"),
                "I was born in 2005"
            ),


            CompletarFrase(
                "answer",
                "What year comes after 2022?",
                "2023"
            ),

            OpcionMultiple(
                "True or False",
                "The phrase 'the 90s' refers to the 1990s.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "El evento es el 15 de agosto",
                "The event is on August 15th"
            ),

            OrdenarPalabras(
                "Arrange the words to form a sentence about a specific date.",
                "",
                listOf("wedding", "Their", "was", "in", "2020", "June"),
                "Their wedding was in June 2020"
            ),

            CompletarFrase(
                "Complete the sentence",
                "Christmas is on ____ 25th.",
                "December"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which is the correct way to say the date '03/14'?",
                listOf("March 14th", "April 3rd", "14th of March"),
                "March 14th"
            ),

            OpcionMultiple(
                "True or False",
                "July is the seventh month of the year.",
                listOf("True", "False"),
                "True"
            ),


            OrdenarPalabras(
                "Arrange the words to form a sentence about a historical year.",
                "",
                listOf("in", "The", "started", "war", "1939"),
                "The war started in 1939"
            ),

            CompletarFrase(
                "Complete the sentence",
                "New Year's Day is on ____ 1st.",
                "January"
            ),

            OpcionMultiple(
                "True or False",
                "October 31st is Halloween.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Mi cumpleaños es el 10 de noviembre.",
                "My birthday is on November 10th."
            )


        ))

        val temaA1M3_1 = Tema("Family members", "a1m3t1", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about a family member.",
                "",
                listOf("my", "mother", "is", "nice"),
                "My mother is nice"
            ),

            CompletarFrase(
                "Translate",
                "Él es mi papá",
                "He is my father"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Who is your sister's son?",
                listOf("Nephew", "Cousin", "Brother"),
                "Nephew"
            ),

            OpcionMultiple(
                "True or False",
                "Your father's daughter is your sister.",
                listOf("True", "False"),
                "True"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about family.",
                "",
                listOf("my", "is", "uncle", "he"),
                "He is my uncle"
            ),

            CompletarFrase(
                "Complete the sentence",
                "My mother's sister is my _____.",
                "aunt"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Who is the mother of your mother?",
                listOf("Grandmother", "Aunt", "Father"),
                "Grandmother"
            ),

            OpcionMultiple(
                "True or False",
                "A cousin is the child of your aunt or uncle.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Ellos son mis abuelos.",
                "They are my grandparents."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about a family member.",
                "",
                listOf("is", "son", "my", "he"),
                "He is my son"
            ),

            CompletarFrase(
                "Complete the sentence",
                "My father's son is my _____.",
                "brother"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Who is the father of your father?",
                listOf("Grandfather", "Uncle", "Brother"),
                "Grandfather"
            ),

            OpcionMultiple(
                "True or False",
                "Aunt is the sister of your father or mother.",
                listOf("True", "False"),
                "True"
            ),

        ))

        val temaA1M3_2 = Tema("Describing", "https://www.youtube.com/watch?v=tyQpVG2r07g", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence describing a person.",
                "",
                listOf("tall", "She", "is"),
                "She is tall"
            ),


            OpcionMultiple(
                "Select the correct answer",
                "How would you describe someone who is always happy?",
                listOf("Sad", "Funny", "Cheerful"),
                "Cheerful"
            ),

            OpcionMultiple(
                "True or False",
                "The word 'beautiful' is used to describe something that looks nice.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Él es un hombre muy inteligente",
                "He is a very smart man"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence describing an object.",
                "",
                listOf("This", "book", "interesting", "is"),
                "This book is interesting"
            ),


            OpcionMultiple(
                "Select the correct option",
                "How would you describe something very big?",
                listOf("Small", "Huge", "Tiny"),
                "Huge"
            ),

            OpcionMultiple(
                "True or False",
                "We use 'big' to describe something small.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Este coche es rápido",
                "This car is fast"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence describing a person’s hair.",
                "",
                listOf("hair", "long", "Her", "is"),
                "Her hair is long"
            ),

            CompletarFrase(
                "Complete the sentence",
                "The dress is _____ , I love it",
                "beautiful"
            ),

            OpcionMultiple(
                "Select the correct option",
                "How would you describe a person who is very tall?",
                listOf("Short", "Tiny", "Tall"),
                "Tall"
            ),

            CompletarFrase(
                "Translate:",
                "Mi hermano es muy simpático.",
                "My brother is very nice."
            )

        ))

        val temaA1M3_3 = Tema("Simple personality adjectives", "a1m3t3", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about a person's personality.",
                "",
                listOf("is", "She", "friendly"),
                "She is friendly"
            ),

            CompletarFrase(
                "Complete the sentence with the correct adjective.",
                "John is very _____. He always helps others.",
                "kind"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "How would you describe someone who is always smiling?",
                listOf("Sad", "Happy", "Boring"),
                "Happy"
            ),

            OpcionMultiple(
                "True or False",
                "A shy person is confident and speaks to everyone.",
                listOf("True", "False"),
                "False"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about a personality trait.",
                "",
                listOf("He", "is", "honest"),
                "He is honest"
            ),

            CompletarFrase(
                "Complete the sentence",
                "My friend is very _____. She loves to tell jokes.",
                "funny"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which word describes someone who doesn’t like to talk much?",
                listOf("Talkative", "Shy", "Funny"),
                "Shy"
            ),

            OpcionMultiple(
                "True or False",
                "A generous person likes to share with others.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Él es muy honesto",
                "He is very honest"
            ),

            CompletarFrase(
                "Complete the sentence",
                "My teacher is very _____",
                "smart"
            ),

            CompletarFrase(
                "Translate:",
                "Ella es muy perezosa.",
                "She is very lazy."
            )

        ))

        val temaA1M3_4 = Tema("Pets", "a1m3t4", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about pets.",
                "",
                listOf("a", "I", "have", "dog"),
                "I have a dog"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Which of these is a common pet?",
                listOf("Lion", "Cat", "Elephant"),
                "Cat"
            ),

            OpcionMultiple(
                "True or False",
                "A fish can be a pet.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Tengo un gato",
                "I have a cat"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about a pet.",
                "",
                listOf("is", "My", "cat", "lazy"),
                "My cat is lazy"
            ),

            OpcionMultiple(
                "True or False",
                "Cats like to bark.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Mi perro es muy amigable",
                "My dog is very friendly"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about a pet’s action.",
                "",
                listOf("likes", "My", "to", "sleep", "dog"),
                "My dog likes to sleep"
            ),

            CompletarFrase(
                "Complete the sentence",
                "I take my dog for a ____ every morning.",
                "walk"
            ),

            OpcionMultiple(
                "True or False",
                "Fish need a lot of water to live.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Mi conejo es muy pequeño.",
                "My rabbit is very small."
            )

        ))

        val temaA1M4_1 = Tema("Household items", "https://www.youtube.com/watch?v=L1iTdKz0GlE", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about a household item.",
                "",
                listOf("is", "on", "The", "table", "book"),
                "The book is on the table"
            ),

            CompletarFrase(
                "Complete the sentence with the correct item.",
                "I need a broom to clean the ____.",
                "floor"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Which of these is used to cook food?",
                listOf("Refrigerator", "Microwave", "Sofa"),
                "Microwave"
            ),

            OpcionMultiple(
                "True or False",
                "A lamp is used to clean the house.",
                listOf("True", "False"),
                "False"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about a household item.",
                "",
                listOf("bed", "The", "is", "comfortable"),
                "The bed is comfortable"
            ),

            CompletarFrase(
                "Complete the sentence",
                "I put my _____ in the wardrobe.",
                "clothes"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which of these do you use to wash dishes?",
                listOf("Fridge", "Dishwasher", "Oven"),
                "Dishwasher"
            ),


            CompletarFrase(
                "Translate:",
                "La lámpara está en la mesa.",
                "The lamp is on the table."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about a household object.",
                "",
                listOf("the", "is", "kitchen", "in", "fridge", "the"),
                "The fridge is in the kitchen"
            ),

            CompletarFrase(
                "Translate:",
                "put the food on the _____.",
                "table"
            )

        ))

        val temaA1M4_2 = Tema("Colors", "a1m4t2", listOf(

            OpcionMultiple(
                "Select the correct answer",
                "Which color is the sun?",
                listOf("Yellow", "Green", "Purple"),
                "Yellow"
            ),

            OpcionMultiple(
                "True or False",
                "Grass is usually blue.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Mi camisa es verde.",
                "My shirt is green."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about color.",
                "",
                listOf("yellow", "The", "ball", "is"),
                "The ball is yellow"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What color is the ocean?",
                listOf("Blue", "Orange", "Brown"),
                "Blue"
            ),

            OpcionMultiple(
                "True or False",
                "Oranges are usually red.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Tengo una bicicleta roja",
                "I have a red bicycle"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about colors.",
                "",
                listOf("is", "The", "green", "apple"),
                "The apple is green"
            ),

            CompletarFrase(
                "Complete the sentence",
                "The sky is _____.",
                "blue"
            ),


            OpcionMultiple(
                "True or False",
                "A banana is usually blue.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "The sun is _____.",
                "yellow"
            )

        ))

        val temaA1M4_3 = Tema("Basic clothing", "a1m4t3", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about clothing.",
                "",
                listOf("jacket", "The", "is", "blue"),
                "The jacket is blue"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Which of these is worn on your feet?",
                listOf("Shirt", "Shoes", "Hat"),
                "Shoes"
            ),

            OpcionMultiple(
                "True or False",
                "You wear a hat on your head.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Tengo una camiseta roja",
                "I have a red t-shirt"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about clothing.",
                "",
                listOf("pants", "My", "are", "black"),
                "My pants are black"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What do you wear to sleep?",
                listOf("Jacket", "Pajamas", "Shoes"),
                "Pajamas"
            ),

            OpcionMultiple(
                "True or False",
                "A scarf is worn around your neck.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Mis zapatos son blancos.",
                "My shoes are white."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about clothing.",
                "",
                listOf("red", "shirt", "My", "is"),
                "My shirt is red"
            ),

            CompletarFrase(
                "Complete the sentence",
                "I need a _____ to protect my eyes from the sun.",
                "sunglasses"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which item is worn on your hands?",
                listOf("Gloves", "Pants", "T-shirt"),
                "Gloves"
            ),

            CompletarFrase(
                "Translate:",
                "Ella tiene una chaqueta azul.",
                "She has a blue jacket."
            )

        ))

        val temaA1M4_4 = Tema("School supplies", "a1m4t4", listOf(

            OpcionMultiple(
                "Select the correct answer",
                "Which of these is used to write?",
                listOf("Eraser", "Pencil", "Ruler"),
                "Pencil"
            ),

            OpcionMultiple(
                "True or False",
                "A ruler is used to measure length.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Tengo una mochila roja.",
                "I have a red backpack."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about school supplies.",
                "",
                listOf("books", "are", "on", "the", "desk"),
                "The books are on the desk"
            ),

            CompletarFrase(
                "Complete the sentence",
                "I use the _____ to correct mistakes",
                "eraser"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which item is used to highlight text?",
                listOf("Pen", "Highlighter", "Eraser"),
                "Highlighter"
            ),

            OpcionMultiple(
                "True or False",
                "A notebook is used to write notes.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Mi cuaderno está en la mesa.",
                "My notebook is on the table."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about school supplies.",
                "",
                listOf("bag", "book", "in", "the", "My"),
                "My book is in the bag"
            ),

            CompletarFrase(
                "Complete the sentence",
                "I use ______ to cut paper",
                "scissors"
            )

        ))


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

