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
                listOf("to", "pleasure", "a", "meet", "you", "It's"),
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
                listOf("What's", "everyone", "up", "Hey"),
                "Hey what's up everyone"
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
                "What's up buddy ?"
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
                "He"
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

            CompletarFrase(
                "Complete the sentence with the correct verb.",
                "Every day, I _____ to school by bus.",
                "go"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about an everyday activity.",
                "",
                listOf("morning", "in", "I", "run", "the"),
                "I run in the morning"
            ),

            OpcionMultiple(
                "True or False",
                "We usually eat dinner in the morning.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Voy al trabajo en coche.",
                "I go to work by car."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about an everyday activity.",
                "",
                listOf("cook", "I", "dinner", "every", "night"),
                "I cook dinner every night"
            ),

            CompletarFrase(
                "Complete the sentence",
                "I usually _____ a shower in the morning.",
                "take"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which activity do you do before going to bed?",
                listOf("Brush your teeth", "Eat lunch", "Go to work"),
                "Brush your teeth"
            ),

            OpcionMultiple(
                "True or False",
                "People usually wake up at night.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Complete the sentence",
                "She _____ to music every afternoon.",
                "listens"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which of these activities do you do at night?",
                listOf("Eat breakfast", "Go to sleep", "Go to work"),
                "Go to sleep"
            ),

            OpcionMultiple(
                "True or False",
                "We usually eat breakfast in the evening.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Me levanto temprano todos los días.",
                "I wake up early every day."
            )

        ))

        val temaA2M1_2 = Tema("Times of the day", "a2m1t2", listOf(

            CompletarFrase(
                "Complete the sentence",
                "We usually go to bed at _____.",
                "night"
            ),

            CompletarFrase(
                "Complete the sentence with the correct time of day.",
                "I always have breakfast in the _____.",
                "morning"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "What do you usually do in the evening?",
                listOf("Sleep", "Work", "Wake up"),
                "Work"
            ),


            OrdenarPalabras(
                "Arrange the words to make a sentence about times of the day.",
                "",
                listOf("afternoon", "I", "study", "in", "the"),
                "I study in the afternoon"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which time of day is it when you wake up?",
                listOf("Morning", "Night", "Evening"),
                "Morning"
            ),

            OpcionMultiple(
                "True or False",
                "We sleep in the morning.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Ella trabaja por la tarde.",
                "She works in the afternoon."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about times of the day.",
                "",
                listOf("in", "I", "study", "the", "afternoon"),
                "I study in the afternoon"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What do you usually do at night?",
                listOf("Eat breakfast", "Go to sleep", "Go to work"),
                "Go to sleep"
            ),

            CompletarFrase(
                "Translate:",
                "Me gusta tomar café por la mañana.",
                "I like to drink coffee in the morning."
            ),

            OpcionMultiple(
                "True or False",
                "You wake up in the evening.",
                listOf("True", "False"),
                "False"
            )

        ))

        val temaA2M1_3 = Tema("Frequency", "a2m1t3", listOf(

            OpcionMultiple(
                "Select the correct answer",
                "How often do you go to the gym?",
                listOf("At night", "In the morning", "Every day"),
                "Every day"
            ),

            CompletarFrase(
                "Complete the sentence with the correct frequency word.",
                "I _____ eat pizza. Maybe once a month.",
                "rarely"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about frequency.",
                "",
                listOf("I", "once", "week", "go", "a"),
                "I go once a week"
            ),

            OpcionMultiple(
                "True or False",
                "You can say 'I go never to the park' in English.",
                listOf("True", "False"),
                "False"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about frequency.",
                "",
                listOf("often", "I", "go", "to", "the", "movies"),
                "I often go to the movies"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which word means 'not often'?",
                listOf("Sometimes", "Always", "Never"),
                "Never"
            ),

            OpcionMultiple(
                "True or False",
                "We use 'never' to talk about things we do sometimes.",
                listOf("True", "False"),
                "False"
            ),


            OrdenarPalabras(
                "Arrange the words to make a sentence about frequency.",
                "",
                listOf("wake", "never", "early", "I", "up"),
                "I never wake up early"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "How often do you watch TV?",
                listOf("Never", "On Sunday", "At night"),
                "Never"
            ),

            OpcionMultiple(
                "True or False",
                "We say 'always' when something happens rarely.",
                listOf("True", "False"),
                "False"
            ),


        ))

        val temaA2M1_4 = Tema("Common action verbs", "a2m1t4", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about an action.",
                "",
                listOf("eat", "I", "apple", "an"),
                "I eat an apple"
            ),

            CompletarFrase(
                "Complete the sentence with the correct verb.",
                "I _____ my homework in the evening.",
                "do"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Which of these is something you do with a book?",
                listOf("Read", "run", "Sing"),
                "Read"
            ),

            OpcionMultiple(
                "True or False",
                "We use the verb 'watch' to talk about looking at something carefully.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Él corre en el parque todos los días.",
                "He runs in the park every day."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about an action.",
                "",
                listOf("I", "eat", "breakfast", "every", "morning"),
                "I eat breakfast every morning"
            ),

            CompletarFrase(
                "Complete the sentence with the correct verb.",
                "She _____ to music in the evening.",
                "listens"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which verb do you use when you want to make a phone call?",
                listOf("Talk", "Call", "Write"),
                "Call"
            ),

            OpcionMultiple(
                "True or False",
                "We use the verb 'cook' to make food.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Nosotros jugamos fútbol los fines de semana.",
                "We play football on weekends."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about an action.",
                "",
                listOf("he", "wakes", "up", "early"),
                "He wakes up early"
            ),

            CompletarFrase(
                "Complete the sentence with the correct verb.",
                "They _____ to school by bus every day.",
                "go"
            ),

            OpcionMultiple(
                "True or False",
                "We use the verb 'swim' when we are flying.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Yo estudio inglés todos los días.",
                "I study English every day."
            )

        ))

        val temaA2M2_1 = Tema("Sports and recreational activities", "a2m2t1", listOf(

            CompletarFrase(
                "Complete the sentence with the correct sport.",
                "He likes to _____ in the lake.",
                "swim"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about sports.",
                "",
                listOf("on", "Sundays", "play", "I", "football"),
                "I play football on Sundays"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Which sport do you play with a ball and a racket?",
                listOf("Football", "Tennis", "Swimming"),
                "Tennis"
            ),


            OrdenarPalabras(
                "Arrange the words to make a sentence about an activity.",
                "",
                listOf("ride", "bike", "I", "park", "in", "the","my"),
                "I ride my bike in the park"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which activity involves running and jumping?",
                listOf("Cycling", "Athletics", "Swimming"),
                "Athletics"
            ),

            OpcionMultiple(
                "True or False",
                "You need a racket to play football.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "A mí me gusta bailar salsa.",
                "I like to dance salsa."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about an activity.",
                "",
                listOf("play", "I", "football", "often"),
                "I often play football"
            ),

            CompletarFrase(
                "Complete the sentence with the correct verb.",
                "They _____ in the pool every Saturday.",
                "swim"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which of these activities does not use a ball?",
                listOf("Football", "Swimming", "Basketball"),
                "Swimming"
            ),

            OpcionMultiple(
                "True or False",
                "You can play tennis on a water surface.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Ella juega al tenis con sus amigos.",
                "She plays tennis with her friends."
            )
        ))

        val temaA2M2_2 = Tema("Expressing likes and dislikes", "a2m2t2", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about likes.",
                "",
                listOf("I", "chocolate", "like"),
                "I like chocolate"
            ),

            OpcionMultiple(
                "True or False",
                "'I enjoy' means the same as 'I dislike'.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Me gusta bailar.",
                "I like to dance."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about dislikes.",
                "",
                listOf("don’t", "fish", "I", "like"),
                "I don’t like fish"
            ),

            OpcionMultiple(
                "Complete the sentence with the correct expression.",
                "She _____ eating vegetables.",
                listOf("dislikes", "don't like"),
                "dislikes"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which of these means 'I enjoy'?",
                listOf("I don’t like", "I like", "I dislike"),
                "I like"
            ),

            OpcionMultiple(
                "True or False",
                "The phrase 'I dislike' means the same as 'I don’t like'.",
                listOf("True", "False"),
                "True"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about likes.",
                "",
                listOf("love", "playing", "I", "chess"),
                "I love playing chess"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which of these expresses a dislike?",
                listOf("I enjoy", "I like", "I hate"),
                "I hate"
            ),

            OpcionMultiple(
                "True or False",
                "You can say 'I love' when you like something very much.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "A ella le gusta leer libros.",
                "She likes to read books."
            )

        ))

        val temaA2M2_3 = Tema("Inviting and responding to invitations", "a2m2t3", listOf(

            CompletarFrase(
                "Complete the informal invitation",
                "Do you ______ to grab a coffee later?",
                "want"
            ),

            OpcionMultiple(
                "True or False",
                "It's acceptable to not give a reason when declining an invitation.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Complete the sentence with the correct response.",
                "I can’t come to your party because I _____ work.",
                "have to"
            ),

            OrdenarPalabras(
                "Arrange the words to make a formal invitation.",
                "",
                listOf("like", "would", "dinner", "to", "you", "I", "invite", "to"),
                "I would like to invite you to dinner"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence inviting someone.",
                "",
                listOf("you", "to", "coffee", "have", "want", "would", "some"),
                "Would you like to have some coffee?"
            ),

            CompletarFrase(
                "Complete the sentence with the correct response.",
                "That sounds great! I _____ love to go.",
                "would"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What would you say to invite someone to dinner?",
                listOf("Come to my house.", "Would you like to join me for dinner?", "I don’t want to eat."),
                "Would you like to join me for dinner?"
            ),

            OrdenarPalabras(
                "Arrange the words to make a response to an invitation.",
                "",
                listOf("to","I'd","come","love"),
                "I'd love to come"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Which of these is a way to invite someone?",
                listOf("I like", "Would you like", "I don’t care"),
                "Would you like"
            ),

            CompletarFrase(
                "Complete the sentence with the correct phrase.",
                "___ ____ _____ to my party this Saturday?",
                "Do you want to come"
            ),

        ))

        val temaA2M2_4 = Tema("Weekend plans", "a2m2t4", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about weekend plans.",
                "",
                listOf("going", "I", "am", "park", "the", "to"),
                "I am going to the park"
            ),

            CompletarFrase(
                "Complete the sentence with the correct activity.",
                "On Saturday, we _____ to the beach.",
                "are going"
            ),

            CompletarFrase(
                "Translate:",
                "Voy a ver una película el domingo.",
                "I am going to watch a movie on Sunday."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about weekend plans.",
                "",
                listOf("a", "going", "they", "are", "to", "concert"),
                "They are going to a concert"
            ),

            OpcionMultiple(
                "Complete the sentence with the correct plan.",
                "She _____ with her friends this weekend.",
                listOf("go", "is hanging out", "leave"),
                "is hanging out"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which of these is a weekend activity?",
                listOf("Attend meetings", "Go hiking", "Write reports"),
                "Go hiking"
            ),

            OpcionMultiple(
                "True or False",
                "You can use 'I am sleeping all weekend' to talk about weekend plans.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Nosotros vamos a hacer una barbacoa el sábado.",
                "We are going to have a barbecue on Saturday."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about weekend activities.",
                "",
                listOf("playing", "am", "I", "games", "video"),
                "I am playing video games"
            ),


            OpcionMultiple(
                "Select the correct option",
                "Which of these sentences is about making plans?",
                listOf("I am going to the store", "I am reading now", "I am tired"),
                "I am going to the store"
            ),

            OpcionMultiple(
                "True or False",
                "The phrase 'I am going to visit my family' is used to talk about past plans.",
                listOf("True", "False"),
                "False"
            ),

        ))

        val temaA2M3_1 = Tema("Types of shops", "a2m3t1", listOf(

            CompletarFrase(
                "Complete the sentence with the type of shop.",
                "You go to a ______ to buy bread and pastries.",
                "bakery"
            ),

            OpcionMultiple(
                "Choose the type of shop where you buy books.",
                "Where would you go to buy novels and magazines?",
                listOf("bookstore", "butcher's", "pharmacy"),
                "bookstore"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence.",
                "Arrange the words to name a shop.",
                listOf("florist's", "the", "at", "flowers", "buy", "can", "You"),
                "You can buy flowers at the florist's"
            ),

            CompletarFrase(
                "Translate the shop name.",
                "Zapatería",
                "shoe store"
            ),


            CompletarFrase(
                "Complete the sentence with the type of shop.",
                "You go to a ____  ____ to buy toys.",
                "toy store"
            ),

            OpcionMultiple(
                "Select the correct shop for electronics.",
                "Where can you buy a new phone or laptop?",
                listOf("electronics store", "bakery", "florist's"),
                "electronics store"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence.",
                "Arrange the words to name a shop.",
                listOf("the", "furniture", "at", "furniture", "store", "buy", "You"),
                "You buy furniture at the furniture store"
            ),

            CompletarFrase(
                "Translate the shop name.",
                "Joyería",
                "jewelry store"
            ),

            OpcionMultiple(
                "Choose the correct type of shop.",
                "Where would you go to buy a birthday card?",
                listOf("stationery store", "butcher's", "electronics store"),
                "stationery store"
            ),

            OpcionMultiple(
                "Choose the correct shop for buying sports equipment.",
                "Where would you buy a basketball or running shoes?",
                listOf("sports store", "pharmacy", "bakery"),
                "sports store"
            )

        ))


        val temaA2M3_2 = Tema("Clothing items and accessories", "a2m3t2", listOf(

            CompletarFrase(
                "Complete the sentence with a clothing item.",
                "A ______ is a type of jacket worn in cold weather.",
                "coat"
            ),

            OpcionMultiple(
                "Choose the accessory.",
                "What do you use to carry your belongings?",
                listOf("backpack", "sweater", "glasses"),
                "backpack"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence.",
                "Arrange the words to name an accessory.",
                listOf("ring", "on", "a", "finger", "wear", "You", "your"),
                "You wear a ring on your finger"
            ),

            CompletarFrase(
                "Translate the clothing item.",
                "Camisa",
                "shirt"
            ),

            OpcionMultiple(
                "Choose the clothing item.",
                "What do you wear on your hands in winter to keep warm?",
                listOf("gloves", "scarf", "belt"),
                "gloves"
            ),

            CompletarFrase(
                "Complete the sentence with a clothing item.",
                "A ______ is a piece of clothing that covers your legs.",
                "pants"
            ),

            OpcionMultiple(
                "Choose the accessory.",
                "What do you wear around your neck for warmth?",
                listOf("scarf", "belt", "gloves"),
                "scarf"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence.",
                "Arrange the words to name an accessory.",
                listOf("watch", "wear", "time", "wrist", "your", "check", "You", "to", "on"),
                "You wear a watch on your wrist to check time"
            ),

            CompletarFrase(
                "Translate the accessory.",
                "Corbata",
                "tie"
            ),

            OpcionMultiple(
                "Choose the clothing item.",
                "What do you wear to go swimming?",
                listOf("swimsuit", "jacket", "boots"),
                "swimsuit"
            )
        ))

        val temaA2M3_3 = Tema("Prices and currencies", "a2m3t3", listOf(

            OpcionMultiple(
                "Choose the currency.",
                "Which currency is used in the United Kingdom?",
                listOf("pound", "dollar", "euro"),
                "pound"
            ),

            CompletarFrase(
                "Complete the sentence with the currency symbol.",
                "The symbol for the US dollar is ______.",
                "$"
            ),

            OpcionMultiple(
                "Select the correct price.",
                "If an item costs $20 and you buy two, how much will it cost?",
                listOf("$40", "$20", "$10"),
                "$40"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence.",
                "Arrange the words to form a question about price.",
                listOf("cost", "does", "this", "How", "?"),
                "How much does this cost?"
            ),

            CompletarFrase(
                "Translate the currency.",
                "Euro",
                "euro"
            ),

            OpcionMultiple(
                "Choose the correct currency.",
                "What currency is used in China?",
                listOf("yuan", "peso", "pound"),
                "yuan"
            ),

            CompletarFrase(
                "Complete the sentence with the currency name.",
                "The currency used in Mexico is the ______.",
                "peso"
            ),

            OpcionMultiple(
                "Choose the correct currency.",
                "Which currency symbol is used in European Union countries?",
                listOf("€", "$", "£"),
                "€"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence.",
                "Arrange the words to form a sentence about price.",
                listOf("The", "item", "$50", "costs"),
                "The item costs $50"
            ),

            CompletarFrase(
                "Translate the sentence about price.",
                "El precio es de 30 euros.",
                "The price is 30 euros."
            )

        ))

        val temaA2M3_4 = Tema("Simple buying and selling dialogues", "a2m3t4", listOf(

            CompletarFrase(
                "Translate the dialogue.",
                "Cliente: ¿Cuánto cuesta este libro?\nVendedor: Cuesta 15 euros.",
                "Customer: How much does this book cost?\nSeller: It costs 15 euros."
            ),

            OpcionMultiple(
                "Choose the best response for a customer.",
                "Seller: Can I help you?\nCustomer:",
                listOf("Yes, I’m looking for a gift.", "Maybe, thank you.", "I don't know."),
                "Yes, I’m looking for a gift."
            ),

            CompletarFrase(
                "Complete the question for the seller.",
                "Customer: ______ you have this item in a larger size?",
                "Do"
            ),

            OpcionMultiple(
                "Choose the appropriate dialogue ending.",
                "Customer: I’ll take two, please.\nSeller:",
                listOf("Thank you! That will be $10.", "You are welcome.", "What color?"),
                "Thank you! That will be $10."
            ),

            OrdenarPalabras(
                "Arrange the words to make a customer question.",
                "Arrange the words for asking about available colors.",
                listOf("Do", "this", "in", "have", "you", "color?", "another"),
                "Do you have this in another color?"
            ),

            CompletarFrase(
                "Complete the polite request.",
                "Customer: Can you ______ me find a shirt?",
                "help"
            ),

            OpcionMultiple(
                "Choose the seller's response.",
                "Customer: Is there a discount on this item?\nSeller:",
                listOf("Yes, it’s 20% off.", "No, it’s sold out.", "It’s not here."),
                "Yes, it’s 20% off."
            ),

            CompletarFrase(
                "Translate the sentence.",
                "Me gustaría comprar esta camisa.",
                "I would like to buy this shirt."
            ),

            OpcionMultiple(
                "Choose the best closing line for a seller.",
                "Customer: Thank you!\nSeller:",
                listOf("Have a great day!", "No, thanks.", "It’s okay."),
                "Have a great day!"
            ),

            OrdenarPalabras(
                "Arrange the words to make a customer sentence.",
                "Arrange the words to form a polite buying request.",
                listOf("buy", "this", "I'd", "to", "like"),
                "I'd like to buy this"
            )

        ))


        val temaA2M4_1 = Tema("Weather vocabulary", "a2m4t1", listOf(

            CompletarFrase(
                "Complete the sentence with the correct weather word.",
                "It’s _____ outside, so take your umbrella.",
                "raining"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "What is the weather like when there are no clouds?",
                listOf("Cloudy", "Sunny", "Rainy"),
                "Sunny"
            ),


            OrdenarPalabras(
                "Arrange the words to describe a type of weather.",
                "",
                listOf("cold", "is", "very", "it"),
                "It is very cold"
            ),

            CompletarFrase(
                "Complete the sentence with the correct word.",
                "Tomorrow will be _____, so wear a warm coat.",
                "cold"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which of these words describes weather with falling snow?",
                listOf("Rainy", "Sunny", "Snowy"),
                "Snowy"
            ),


            CompletarFrase(
                "Translate:",
                "Está nublado y parece que va a llover",
                "It is cloudy and it looks like it is going to rain"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about the weather.",
                "",
                listOf("is", "stormy", "it", "today"),
                "It is stormy today"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What does 'chilly' mean?",
                listOf("Very hot", "A little cold", "Very windy"),
                "A little cold"
            ),

            OpcionMultiple(
                "True or False",
                "When it’s 'rainy', the sky is usually clear.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Mañana estará soleado y caluroso",
                "Tomorrow it will be sunny and hot"
            )

        ))

        val temaA2M4_2 = Tema("Seasons of the year", "a2m4t2", listOf(

            OpcionMultiple(
                "True or False",
                "Winter is the season when it is usually cold.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "La primavera es mi estación favorita.",
                "Spring is my favorite season."
            ),

            CompletarFrase(
                "Complete the sentence with the correct season.",
                "People often go to the beach during _____.",
                "summer"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which season is associated with snow?",
                listOf("Spring", "Summer", "Winter"),
                "Winter"
            ),


            CompletarFrase(
                "Translate:",
                "El invierno es frío y oscuro.",
                "Winter is cold and dark."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about summer.",
                "",
                listOf("enjoy", "people", "summer", "in", "outdoors", "the"),
                "People enjoy the outdoors in summer"
            ),

            CompletarFrase(
                "Complete the sentence with the correct season.",
                "_____ is when the leaves change color and fall.",
                "Autumn"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which of these describes autumn?",
                listOf("Hot and sunny", "Cold and snowy", "Cool with falling leaves"),
                "Cool with falling leaves"
            ),

            OpcionMultiple(
                "True or False",
                "Spring is the season that comes before winter.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "El verano es caluroso y soleado",
                "Summer is hot and sunny"
            )

        ))

        val temaA2M4_3 = Tema("Seasonal activities", "a2m4t3", listOf(

            CompletarFrase(
                "Complete the sentence with the correct activity.",
                "In summer, many people _____ to the beach.",
                "go"
            ),

            OpcionMultiple(
                "True or False",
                "Planting flowers is an activity often done in spring.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "En otoño, la gente recoge hojas.",
                "In autumn, people rake leaves."
            ),

            OrdenarPalabras(
                "Arrange the words to describe a spring activity.",
                "",
                listOf("plant", "flowers", "in", "spring", "we"),
                "We plant flowers in spring"
            ),

            CompletarFrase(
                "Complete the sentence with the correct seasonal activity.",
                "Many families _____ barbecues in summer.",
                "have"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which of these activities is common in winter?",
                listOf("Hiking", "Ice skating", "Surfing"),
                "Ice skating"
            ),

            OpcionMultiple(
                "True or False",
                "Picnics are popular activities in winter.",
                listOf("True", "False"),
                "False"
            ),


            OrdenarPalabras(
                "Arrange the words to make a sentence about a summer activity.",
                "",
                listOf("enjoy", "many", "swimming", "people", "summer", "in"),
                "Many people enjoy swimming in summer"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What do people often do in the winter holidays?",
                listOf("Sunbathe", "Ski", "Garden"),
                "Ski"
            ),

            OpcionMultiple(
                "True or False",
                "Going to the beach is a common winter activity.",
                listOf("True", "False"),
                "False"
            ),


        ))

        val temaA2M4_4 = Tema("Clothing according to weather", "a2m4t4", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about clothing for winter.",
                "",
                listOf("scarves","wear","in", "we", "coats", "and",  "winter"),
                "We wear coats and scarves in winter"
            ),

            CompletarFrase(
                "Complete the sentence with the correct clothing item.",
                "When it’s raining, I wear my _____.",
                "raincoat"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "What do you wear when it’s sunny and hot?",
                listOf("A coat", "A swimsuit", "A sweater"),
                "A swimsuit"
            ),

            OpcionMultiple(
                "True or False",
                "We wear boots and a hat when it’s very hot outside.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "En verano, uso pantalones cortos y camisetas",
                "In summer, I wear shorts and t-shirts"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which item of clothing is best for cold weather?",
                listOf("Sandals", "Jacket", "Shorts"),
                "Jacket"
            ),


            CompletarFrase(
                "Translate:",
                "Uso botas cuando está nevando.",
                "I wear boots when it’s snowing."
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about clothing for summer.",
                "",
                listOf("a", "wear", "we", "hat", "sunny", "on", "days"),
                "We wear a hat on sunny days"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What do you wear when it’s raining?",
                listOf("A scarf", "A raincoat", "Sandals"),
                "A raincoat"
            ),

            OpcionMultiple(
                "True or False",
                "We wear sunglasses when it’s cloudy.",
                listOf("True", "False"),
                "False"
            ),


        ))

        //temas B1
        val temaB1M1_1 = Tema("Names of professions", "b1m1t1", listOf(
            OrdenarPalabras(
                "Arrange the words to make a sentence about a profession.",
                "",
                listOf("a", "doctor", "is", "She"),
                "She is a doctor"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Who teaches students in a school?",
                listOf("Engineer", "Teacher", "Chef"),
                "Teacher"
            ),


            CompletarFrase(
                "Translate:",
                "Mi padre es un abogado.",
                "My father is a lawyer."
            ),

            OrdenarPalabras(
                "Arrange the words to describe a profession.",
                "",
                listOf("an", "engineer", "is", "He"),
                "He is an engineer"
            ),

            CompletarFrase(
                "Complete the sentence with the correct word.",
                "A person who takes care of sick animals is a _____.",
                "veterinarian"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which of these professions works with computers?",
                listOf("Artist", "Chef", "Programmer"),
                "Programmer"
            ),

            OpcionMultiple(
                "True or False",
                "A pilot flies airplanes.",
                listOf("True", "False"),
                "True"
            ),


            CompletarFrase(
                "Complete the sentence with the correct job title.",
                "The person who serves food at a restaurant is a _____.",
                "waiter"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which job involves designing buildings?",
                listOf("Architect", "Doctor", "Lawyer"),
                "Architect"
            ),


            CompletarFrase(
                "Translate:",
                "Mi hermana es una dentista.",
                "My sister is a dentist."
            )



        ))

        val temaB1M1_2 = Tema("Skills and qualifications", "b1m1t2", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about a skill.",
                "",
                listOf("She", "speak", "three", "languages", "can"),
                "She can speak three languages"
            ),

            CompletarFrase(
                "Complete the sentence with the correct skill.",
                "To be a good chef, you need to know how to _____.",
                "cook"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "What skill is important for a writer?",
                listOf("Driving", "Writing", "Singing"),
                "Writing"
            ),

            OpcionMultiple(
                "True or False",
                "A qualification is a certificate or degree someone has earned.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Ella tiene un título en ingeniería",
                "She has a degree in engineering"
            ),

            OrdenarPalabras(
                "Arrange the words to describe a qualification.",
                "",
                listOf("He", "certificate", "received", "a", "training"),
                "He received a training certificate"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which of these is a qualification?",
                listOf("A bicycle", "A diploma", "A phone"),
                "A diploma"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about skills.",
                "",
                listOf("important", "is", "teamwork", "for", "projects"),
                "Teamwork is important for projects"
            ),

            CompletarFrase(
                "Complete the sentence with the appropriate qualification.",
                "She earned a _____ in business management.",
                "degree"
            ),

            CompletarFrase(
                "Translate:",
                "Él tiene experiencia en ventas y marketing.",
                "He has experience in sales and marketing."
            )

        ))

        val temaB1M1_3 = Tema("Work routines", "b1m1t3", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about a daily work routine.",
                "",
                listOf("starts", "at", "She", "8", "work", "am"),
                "She starts work at 8 am"
            ),

            CompletarFrase(
                "Complete the sentence with the correct activity.",
                "Every day, I _____ emails in the morning.",
                "check"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "What do most people do at the beginning of the workday?",
                listOf("Go to bed", "Start their tasks", "Have dinner"),
                "Start their tasks"
            ),

            CompletarFrase(
                "Translate:",
                "Él toma un descanso a las 10 de la mañana.",
                "He takes a break at 10 in the morning."
            ),

            CompletarFrase(
                "Complete the sentence with the correct action.",
                "In the afternoon, she usually _____ reports.",
                "writes"
            ),

            OpcionMultiple(
                "True or False",
                "Workers often take a break in the middle of their workday.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Después de trabajar, él se relaja en casa",
                "After work, he relaxes at home"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about an afternoon routine.",
                "",
                listOf("She", "at", "calls", "clients", "2", "pm"),
                "She calls clients at 2 pm"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What do employees do during a break?",
                listOf("Write reports", "Rest or have a snack", "Start work"),
                "Rest or have a snack"
            ),

            CompletarFrase(
                "Translate:",
                "Ella revisa sus correos electrónicos todas las mañanas.",
                "She checks her emails every morning."
            )

        ))

        val temaB1M1_4 = Tema("Job searching", "b1m1t4", listOf(
            OrdenarPalabras(
                "Arrange the words to make a sentence related to job searching.",
                "",
                listOf("looking", "She", "for", "a", "is", "job"),
                "She is looking for a job"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "What do people often read when searching for a job?",
                listOf("Magazines", "Job postings", "Novels"),
                "Job postings"
            ),

            OpcionMultiple(
                "True or False",
                "An interview is the first step in searching for a job.",
                listOf("True", "False"),
                "False"
            ),

            OrdenarPalabras(
                "Arrange the words to describe a job search activity.",
                "",
                listOf("job", "online", "for", "searching", "is", "a", "common"),
                "Searching for a job online is common"
            ),

            CompletarFrase(
                "Complete the sentence with the correct word.",
                "During an interview, it’s important to make a good _____.",
                "impression"
            ),

            OpcionMultiple(
                "True or False",
                "Job seekers should tailor their resumes for each job.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Él está buscando un trabajo",
                "He is looking for a job"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about job application.",
                "",
                listOf("apply", "I", "to", "want", "for", "this", "job"),
                "I want to apply for this job"
            ),

            CompletarFrase(
                "Complete the sentence with the correct action.",
                "She _____ job interviews every week.",
                "attends"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What should you prepare before an interview?",
                listOf("A gift", "Questions and answers", "A vacation plan"),
                "Questions and answers"
            ),


        ))

        val temaB1M2_1 = Tema("Parts of the body", "b1m2t1", listOf(

            CompletarFrase(
                "Complete the sentence with the correct body part.",
                "You use your _____ to hear sounds.",
                "ears"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Which part of the body connects your head to your shoulders?",
                listOf("Knee", "Neck", "Elbow"),
                "Neck"
            ),

            OpcionMultiple(
                "True or False",
                "The ankle is part of the arm.",
                listOf("True", "False"),
                "False"
            ),

            OrdenarPalabras(
                "Arrange the words to form a sentence about the body.",
                "",
                listOf("eyes", "two", "has", "everyone"),
                "Everyone has two eyes"
            ),

            CompletarFrase(
                "Complete the sentence with the appropriate body part.",
                "I use my _____ to run every morning.",
                "legs"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What part of the body do you use to write?",
                listOf("Hand", "Foot", "Back"),
                "Hand"
            ),


            CompletarFrase(
                "Complete the sentence with the correct word.",
                "When I smile, you can see my _____.",
                "teeth"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which body part is responsible for pumping blood?",
                listOf("Heart", "Stomach", "Liver"),
                "Heart"
            ),

            OpcionMultiple(
                "True or False",
                "Your elbow is part of your leg.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Mi hermana tiene los ojos verdes",
                "My sister has green eyes"
            )

        ))

        val temaB1M2_2 = Tema("Common illnesses and symptoms", "b1m2t2", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about a common illness.",
                "",
                listOf("flu", "has", "She", "the", "week", "this"),
                "She has the flu this week"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "What symptom do you usually have with a fever?",
                listOf("Cough", "High temperature", "Runny nose"),
                "High temperature"
            ),

            OpcionMultiple(
                "True or False",
                "A headache is pain in your stomach.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Complete the sentence with the correct illness.",
                "He has a high temperature and feels weak; he might have _____.",
                "fever"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What should you do if you have a persistent cough?",
                listOf("Ignore it", "See a doctor", "Eat more sweets"),
                "See a doctor"
            ),

            CompletarFrase(
                "Translate:",
                "Ella tiene un resfriado y está tosiendo mucho.",
                "She has a cold and is coughing a lot."
            ),

            OrdenarPalabras(
                "Arrange the words to form a sentence about an illness.",
                "",
                listOf("feels", "He", "tired", "very", "lately"),
                "He feels very tired lately"
            ),

            CompletarFrase(
                "Complete the sentence with the correct symptom.",
                "If you have a runny nose, you might also _____.",
                "sneeze"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What symptom is associated with a stomachache?",
                listOf("Ear pain", "Abdominal pain", "Back pain"),
                "Abdominal pain"
            ),
        ))

        val temaB1M2_3 = Tema("Medical appointments", "b1m2t3", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about a medical appointment.",
                "",
                listOf("doctor", "an", "appointment", "with", "I", "made"),
                "I made an appointment with the doctor"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "What should you do if you need to see a specialist?",
                listOf("Make an appointment", "Wait at home", "Ignore it"),
                "Make an appointment"
            ),

            OpcionMultiple(
                "True or False",
                "You need an appointment to visit the emergency room.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Tengo una cita médica mañana a las 10 de la mañana",
                "I have a medical appointment tomorrow at 10 am"
            ),

            OrdenarPalabras(
                "Arrange the words to form a sentence related to medical visits.",
                "",
                listOf("at", "arrived", "clinic", "the", "She", "early"),
                "She arrived at the clinic early"
            ),

            CompletarFrase(
                "Complete the sentence with the appropriate term.",
                "During your appointment, the doctor will ask about your medical _____.",
                "history"
            ),

            CompletarFrase(
                "Complete the sentence with the correct action.",
                "Before going to the appointment, remember to ____ the necessary documents.",
                "bring"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What should you do if you can't attend your scheduled appointment?",
                listOf("Ignore it", "Cancel or reschedule it", "Arrive late"),
                "Cancel or reschedule it"
            ),

            OpcionMultiple(
                "True or False",
                "Doctors never ask about previous illnesses during an appointment.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "¿Podría programar una cita para el próximo lunes, por favor?",
                "Could I schedule an appointment for next Monday, please?"
            )



        ))

        val temaB1M2_4 = Tema("Healthy habits", "b1m2t4", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about a healthy habit.",
                "",
                listOf("drink", "eight", "day", "glasses", "water", "a", "of"),
                "Drink eight glasses of water a day"
            ),

            OpcionMultiple(
                "Complete the sentence with the correct habit.",
                "It is important to _____ regularly to stay healthy.",
                listOf("drink coffee", "exercise", "watch TV"),
                "exercise"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Which of the following is a healthy habit?",
                listOf("Eating fast food every day", "Sleeping 7-8 hours per night", "Skipping meals"),
                "Sleeping 7-8 hours per night"
            ),

            OpcionMultiple(
                "True or False",
                "Drinking plenty of water helps maintain good health.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Hacer ejercicio todos los días es bueno para la salud.",
                "Exercising every day is good for your health."
            ),

            OrdenarPalabras(
                "Arrange the words to form a sentence about healthy eating.",
                "",
                listOf("fruits", "vegetables", "eat", "and", "regularly"),
                "Eat fruits and vegetables regularly"
            ),


            OpcionMultiple(
                "Select the correct option",
                "Which of these habits can improve your mental health?",
                listOf("Watching TV all night", "Going for a walk", "Eating sweets"),
                "Going for a walk"
            ),


            OrdenarPalabras(
                "Arrange the words to create a sentence about sleep.",
                "",
                listOf("hours", "night", "sleep", "eight", "at", "least", "a"),
                "Sleep at least eight hours a night"
            ),


            OpcionMultiple(
                "True or False",
                "Physical activity can help improve your mood.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Tomar descansos regulares durante el trabajo es beneficioso.",
                "Taking regular breaks during work is beneficial."
            )

        ))

        val temaB1M3_1 = Tema("Electronic devices", "b1m3t1", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about an electronic device.",
                "",
                listOf("use", "I", "to", "computer", "my", "work", "on"),
                "I use my computer to work on"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Which device is commonly used for making video calls?",
                listOf("Refrigerator", "Laptop", "Microwave"),
                "Laptop"
            ),

            OpcionMultiple(
                "True or False",
                "A tablet is smaller than a smartphone.",
                listOf("True", "False"),
                "False"
            ),


            OrdenarPalabras(
                "Arrange the words to form a sentence about charging devices.",
                "",
                listOf("needs", "phone", "Your", "charging"),
                "Your phone needs charging"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which of these is used to read e-books?",
                listOf("Washing machine", "E-reader", "Toaster"),
                "E-reader"
            ),


            CompletarFrase(
                "Translate:",
                "Voy a cargar mi portátil antes de la reunión.",
                "I am going to charge my laptop before the meeting."
            ),

            OrdenarPalabras(
                "Arrange the words to create a sentence about using electronic devices.",
                "",
                listOf("the", "turned", "He", "radio", "on"),
                "He turned on the radio"
            ),

            CompletarFrase(
                "Complete the sentence with the correct device.",
                "I use my _____ to take high-quality photos.",
                "camera"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What device is used to print documents?",
                listOf("Printer", "Blender", "Tablet"),
                "Printer"
            ),

            OpcionMultiple(
                "True or False",
                "Headphones are used to play music aloud in a room.",
                listOf("True", "False"),
                "False"
            ),


        ))

        val temaB1M3_2 = Tema("Internet and social media", "b1m3t2", listOf(

            OpcionMultiple(
                "Select the correct answer",
                "What do people usually post on Instagram?",
                listOf("Photos", "Recipes", "Books"),
                "Photos"
            ),

            CompletarFrase(
                "Translate:",
                "¿Puedes enviar el enlace de la página web?",
                "Can you send the link to the website?"
            ),

            OrdenarPalabras(
                "Arrange the words to form a sentence about social media.",
                "",
                listOf("to", "like", "You", "posts", "can", "Facebook"),
                "You can like posts on Facebook"
            ),


            OpcionMultiple(
                "Select the correct option",
                "Which of these platforms is used for professional networking?",
                listOf("Twitter", "LinkedIn", "Snapchat"),
                "LinkedIn"
            ),

            OpcionMultiple(
                "True or False",
                "Instagram is mostly used for short messages and news updates.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Ella siempre revisa las redes sociales por la mañana.",
                "She always checks social media in the morning."
            ),

            OrdenarPalabras(
                "Arrange the words to form a sentence about internet use.",
                "",
                listOf("searching", "I", "the", "internet", "for", "information", "am"),
                "I am searching the internet for information"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What is a common use of Twitter?",
                listOf("Sharing photos", "Sending messages", "Posting short updates"),
                "Posting short updates"
            ),

            OpcionMultiple(
                "True or False",
                "People use social media to stay connected with friends and share personal updates.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "¿Puedo encontrar este producto en línea?",
                "Can I find this product online?"
            )


        ))

        val temaB1M3_3 = Tema("Technology-related verbs", "b1m3t3", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence using a technology-related verb.",
                "",
                listOf("download", "I", "apps", "my", "on", "phone"),
                "I download apps on my phone"
            ),

            CompletarFrase(
                "Complete the sentence with the correct verb.",
                "You need to _____ your computer to install the updates.",
                "restart"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Which verb describes saving a copy of an email on your computer?",
                listOf("Forward", "Download", "Delete"),
                "Download"
            ),

            OpcionMultiple(
                "True or False",
                "To 'stream' means to watch or listen to content directly from the internet.",
                listOf("True", "False"),
                "True"
            ),


            OrdenarPalabras(
                "Arrange the words to form a sentence using a common technology verb.",
                "",
                listOf("software", "update", "must",  "the", "You", "regularly"),
                "You must update the software regularly"
            ),

            CompletarFrase(
                "Complete the sentence with the appropriate verb.",
                "To protect your data, always _____ your files.",
                "backup"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What does 'browse' mean?",
                listOf("To delete files", "To search the internet", "To turn off the computer"),
                "To search the internet"
            ),

            CompletarFrase(
                "Translate:",
                "Necesito escanear este documento y enviarlo por correo electrónico.",
                "I need to scan this document and send it by email."
            ),

            CompletarFrase(
                "Complete the sentence with the correct verb.",
                "If you want to watch this video offline, you should _____ it first.",
                "download"
            ),

            OpcionMultiple(
                "True or False",
                "The verb 'mute' refers to lowering the volume completely.",
                listOf("True", "False"),
                "True"
            ),


        ))

        val temaB1M3_4 = Tema("Simple technical problems", "b1m3t4", listOf(
            OrdenarPalabras(
                "Arrange the words to make a sentence about a common technical issue.",
                "",
                listOf("internet", "The", "working", "not", "is"),
                "The internet is not working"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "What should you do if your computer freezes?",
                listOf("Restart it", "Turn off the lights", "Ignore it"),
                "Restart it"
            ),

            OpcionMultiple(
                "True or False",
                "A slow computer could be a result of too many open programs.",
                listOf("True", "False"),
                "True"
            ),

            OrdenarPalabras(
                "Arrange the words to form a sentence about troubleshooting.",
                "",
                listOf("router", "restart", "the", "Try"),
                "Try restarting the router"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What does it mean if your device 'overheats'?",
                listOf("It runs out of battery", "It becomes too hot", "It turns off automatically"),
                "It becomes too hot"
            ),

            OpcionMultiple(
                "True or False",
                "If a website doesn't load, refreshing the page might solve the problem.",
                listOf("True", "False"),
                "True"
            ),


            CompletarFrase(
                "Complete the sentence with the appropriate word.",
                "If the battery is low, you need to _____ your phone.",
                "charge"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What could you do if your software is not up to date?",
                listOf("Ignore it", "Update it", "Delete it"),
                "Update it"
            ),

            OpcionMultiple(
                "True or False",
                "Restarting a device is often a good first step to fix technical issues.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "El sistema operativo necesita ser actualizado.",
                "The operating system needs to be updated."
            )

        ))

        val temaB1M4_1 = Tema("Holidays and celebrations", "b1m4t1", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about a holiday celebration.",
                "",
                listOf("celebrate", "We", "Christmas", "family", "with", "our"),
                "We celebrate Christmas with our family"
            ),

            CompletarFrase(
                "Complete the sentence with the correct holiday.",
                "Many people give and receive chocolates on _____.",
                "Valentine's Day"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "What holiday is known for costumes and trick-or-treating?",
                listOf("Thanksgiving", "Easter", "Halloween"),
                "Halloween"
            ),

            OpcionMultiple(
                "True or False",
                "Independence Day is often celebrated with fireworks and parades.",
                listOf("True", "False"),
                "True"
            ),


            OrdenarPalabras(
                "Arrange the words to form a sentence about holiday traditions.",
                "",
                listOf("decorations", "put", "People", "up", "during", "festive", "holidays"),
                "People put up festive decorations during holidays"
            ),


            OpcionMultiple(
                "Select the correct option",
                "What holiday is celebrated with egg hunts and special church services?",
                listOf("Easter", "Halloween", "New Year's Eve"),
                "Easter"
            ),

            OpcionMultiple(
                "True or False",
                "Valentine's Day is a holiday that celebrates friendship and love.",
                listOf("True", "False"),
                "True"
            ),


            OrdenarPalabras(
                "Arrange the words to create a sentence about holiday meals.",
                "",
                listOf("turkey", "We", "eat", "Thanksgiving", "on"),
                "We eat turkey on Thanksgiving"
            ),


            OpcionMultiple(
                "Select the correct option",
                "Which holiday involves lighting candles on a menorah?",
                listOf("Christmas", "Hanukkah", "Easter"),
                "Hanukkah"
            ),

            OpcionMultiple(
                "True or False",
                "In many countries, Mother's Day is celebrated by giving gifts to mothers.",
                listOf("True", "False"),
                "True"
            ),

        ))

        val temaB1M4_2 = Tema("Traditions from different countries", "b1m4t2", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about a tradition.",
                "",
                listOf("celebrate", "Japan", "cherry", "the", "blossom", "in", "They"),
                "They celebrate the cherry blossom in Japan"
            ),

            CompletarFrase(
                "Complete the sentence with the correct country.",
                "In _____, people celebrate the Day of the Dead with altars and offerings.",
                "Mexico"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Which country is known for celebrating Diwali, the festival of lights?",
                listOf("India", "Spain", "Brazil"),
                "India"
            ),

            OpcionMultiple(
                "True or False",
                "Oktoberfest is a traditional beer festival celebrated in Germany.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "El festival de las linternas en Tailandia es muy famoso.",
                "The lantern festival in Thailand is very famous."
            ),

            OrdenarPalabras(
                "Arrange the words to form a sentence about a tradition.",
                "",
                listOf("New", "celebrate", "They", "Chinese", "Year"),
                "They celebrate Chinese New Year"
            ),


            OpcionMultiple(
                "True or False",
                "In Brazil, Carnival is celebrated with parades, music, and dancing.",
                listOf("True", "False"),
                "True"
            ),


            CompletarFrase(
                "Complete the sentence with the correct festival.",
                "The Running of the Bulls is a tradition that takes place in _____.",
                "Spain"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which tradition involves people setting off fireworks during a major holiday?",
                listOf("Oktoberfest", "Chinese New Year", "La Tomatina"),
                "Chinese New Year"
            ),

            CompletarFrase(
                "Translate:",
                "El Año Nuevo Lunar es celebrado por muchas culturas asiáticas",
                "The Lunar New Year is celebrated by many Asian cultures"
            )

        ))

        val temaB1M4_3 = Tema("Comparing cultures", "b1m4t3", listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence comparing cultures.",
                "",
                listOf("food", "Italian", "Mexican", "different", "is", "from"),
                "Italian food is different from Mexican food"
            ),

            CompletarFrase(
                "Complete the sentence with the correct comparison.",
                "In Japan, bowing is more common than _____ for greeting.",
                "handshaking"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "Which country has a culture that places a strong emphasis on tea ceremonies?",
                listOf("Italy", "Japan", "Brazil"),
                "Japan"
            ),

            OpcionMultiple(
                "True or False",
                "In many Latin American countries, family gatherings are larger and more frequent than in some European countries.",
                listOf("True", "False"),
                "True"
            ),

            OrdenarPalabras(
                "Arrange the words to create a sentence comparing holidays.",
                "",
                listOf("Thanksgiving", "celebrated", "differently", "Christmas", "from", "is"),
                "Thanksgiving is celebrated differently from Christmas"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which culture is known for valuing punctuality highly?",
                listOf("Germany", "Spain", "Brazil"),
                "Germany"
            ),

            OpcionMultiple(
                "True or False",
                "In Spain, it is common to have dinner earlier than in most Northern European countries.",
                listOf("True", "False"),
                "False"
            ),

            OrdenarPalabras(
                "Arrange the words to make a comparison about festivals.",
                "",
                listOf("colorful", "are", "festivals", "Brazilian", "very"),
                "Brazilian festivals are very colorful"
            ),

            CompletarFrase(
                "Complete the sentence with a comparative word.",
                "Traditional French cuisine is often considered more sophisticated than ____  _____.",
                "fast food"
            ),

            OpcionMultiple(
                "Select the correct option",
                "In which country is it customary to greet with a kiss on both cheeks?",
                listOf("France", "Japan", "Germany"),
                "France"
            ),


        ))

        val temaB1M4_4 = Tema("Basic social etiquette", "b1m4t4", listOf(

            CompletarFrase(
                "Complete the sentence with the correct etiquette advice.",
                "In many cultures, it is polite to ____ before entering someone's home.",
                "knock"
            ),

            OpcionMultiple(
                "Select the correct answer",
                "What should you do when you meet someone for the first time?",
                listOf("Ignore them", "Shake their hand", "Wave from afar"),
                "Shake their hand"
            ),

            OpcionMultiple(
                "True or False",
                "It is considered rude to talk loudly on your phone in a public place.",
                listOf("True", "False"),
                "True"
            ),

            OrdenarPalabras(
                "Arrange the words to create a sentence about greetings.",
                "",
                listOf("bow", "Japanese", "in", "people", "often"),
                "Japanese people often bow"
            ),

            CompletarFrase(
                "Complete the sentence with the correct etiquette term.",
                "In formal settings, addressing someone as '____' or 'Madam' shows respect.",
                "Sir"
            ),

            OpcionMultiple(
                "Select the correct option",
                "What is considered impolite during a meal in many Western cultures?",
                listOf("Talking with your mouth full", "Sitting in silence", "Asking for water"),
                "Talking with your mouth full"
            ),

            OrdenarPalabras(
                "Arrange the words to make a polite reminder.",
                "",
                listOf("turn", "Please", "your", "phone", "off"),
                "Please turn your phone off"
            ),

            CompletarFrase(
                "Complete the sentence with the correct word.",
                "When receiving a gift, it is polite to ____ the person.",
                "thank"
            ),

            OpcionMultiple(
                "Select the correct option",
                "Which of these is a polite way to excuse yourself from a conversation?",
                listOf("Just walk away", "Say 'Excuse me, I must go'", "Ignore them"),
                "Say 'Excuse me, I must go'"
            ),


            CompletarFrase(
                "Translate:",
                "En muchas culturas, mostrar respeto a los mayores es fundamental.",
                "In many cultures, showing respect to elders is essential."
            )

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
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))
        val temaB2M4_4 = Tema("Basic art criticism", "https://cdn.pixabay.com/video/2023/11/28/191159-889246512_tiny.mp4", listOf(
            OpcionMultiple("Select the correct choice","What is the correct way to ask someone's name?", listOf("You call how?", "What is your name?", "You name is?", "How you name?"), "What is your name?"),
            CompletarFrase("Complete the Sentence", "I ______ from Canada.", "am"),
            OpcionMultiple("True or False","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OpcionMultiple("Select the correct choice","The word \"apple\" starts with a consonant.", listOf("True", "False"), "False"),
            OrdenarPalabras(" Arrange the words to form a correct sentence:","",listOf("is", "the", "red", "apple"), "the apple is red")
        ))


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


        val modulo1A1 = Modulo("Greetings and introductions", listOf(temaA1M1_1, temaA1M1_2, temaA1M1_3, temaA1M1_4))
        val modulo2A1 = Modulo("Numbers and dates", listOf(temaA1M2_1, temaA1M2_2, temaA1M2_3,temaA1M2_4))
        val modulo3A1 = Modulo("Family and friends", listOf(temaA1M3_1, temaA1M3_2, temaA1M3_3,temaA1M3_4))
        val modulo4A1 = Modulo("Everyday objects", listOf(temaA1M4_1, temaA1M4_2, temaA1M4_3,temaA1M4_4))

        val modulo1A2 = Modulo("Daily routines", listOf(temaA2M1_1, temaA2M1_2, temaA2M1_3, temaA2M1_4))
        val modulo2A2 = Modulo("Hobbies and free time", listOf(temaA2M2_1, temaA2M2_2, temaA2M2_3,temaA2M2_4))
        val modulo4A2 = Modulo("Basic shopping", listOf(temaA2M3_1, temaA2M3_2, temaA2M3_3,temaA2M3_4))
        val modulo5A2 = Modulo("Weather and seasons", listOf(temaA2M4_1, temaA2M4_2, temaA2M4_3,temaA2M4_4))

        val modulo1B1 = Modulo("Work and professions", listOf(temaB1M1_1, temaB1M1_2, temaB1M1_3, temaB1M1_4))
        val modulo3B1 = Modulo("Health and well-being", listOf(temaB1M2_1, temaB1M2_2, temaB1M2_3,temaB1M2_4))
        val modulo4B1 = Modulo("Basic technology", listOf(temaB1M3_1, temaB1M3_2, temaB1M3_3,temaB1M3_4))
        val modulo5B1 = Modulo("Culture and customs", listOf(temaB1M4_1, temaB1M4_2, temaB1M4_3,temaB1M4_4))

        val modulo1B2 = Modulo("Environment and nature", listOf(temaB2M1_1, temaB2M1_2, temaB2M1_3, temaB2M1_4))
        val modulo2B2 = Modulo("Education and learning", listOf(temaB2M2_1, temaB2M2_2, temaB2M2_3,temaB2M2_4))
        val modulo3B2 = Modulo("Media", listOf(temaB2M3_1, temaB2M3_2, temaB2M3_3,temaB2M3_4))
        val modulo4B2 = Modulo("Art and entertainment", listOf(temaB2M4_1, temaB2M4_2, temaB2M4_3,temaB2M4_4))

        val modulo1C1 = Modulo("Politics and government", listOf(temaC1M1_1, temaC1M1_2, temaC1M1_3, temaC1M1_4))
        val modulo2C1 = Modulo("Economy and business", listOf(temaC1M2_1, temaC1M2_2, temaC1M2_3,temaC1M2_4))
        val modulo3C1 = Modulo("Advanced science and technology", listOf(temaC1M3_1, temaC1M3_2, temaC1M3_3,temaC1M3_4))
        val modulo4C1 = Modulo("Literature and philosophy", listOf(temaC1M4_1, temaC1M4_2, temaC1M4_3,temaC1M4_4))

        val modulo1C2 = Modulo("Critical analysis of complex texts", listOf(temaC2M1_1, temaC2M1_2, temaC2M1_3, temaC2M1_4))
        val modulo2C2 = Modulo("Academic research", listOf(temaC2M2_1, temaC2M2_2, temaC2M2_3,temaC2M2_4))
        val modulo3C2 = Modulo("Idiomatic and colloquial expression", listOf(temaC2M3_1, temaC2M3_2, temaC2M3_3,temaC2M3_4))
        val modulo4C2 = Modulo("Creative and persuasive writing", listOf(temaC2M4_1, temaC2M4_2, temaC2M4_3,temaC2M4_4))


        val nivelA1 = Nivel("A1", listOf(modulo1A1, modulo2A1, modulo3A1, modulo4A1))
        val nivelA2 = Nivel("A2", listOf(modulo1A2, modulo2A2,  modulo4A2, modulo5A2))
        val nivelB1 = Nivel("B1", listOf(modulo1B1, modulo3B1, modulo4B1, modulo5B1))
        val nivelB2 = Nivel("B2", listOf(modulo1B2, modulo2B2, modulo3B2, modulo4B2))
        val nivelC1 = Nivel("C1", listOf(modulo1C1, modulo2C1, modulo3C1, modulo4C1))
        val nivelC2 = Nivel("C2", listOf(modulo1C2, modulo2C2, modulo3C2, modulo4C2))

        return listOf(nivelA1, nivelA2, nivelB1, nivelB2, nivelC1, nivelC2)
    }

}

