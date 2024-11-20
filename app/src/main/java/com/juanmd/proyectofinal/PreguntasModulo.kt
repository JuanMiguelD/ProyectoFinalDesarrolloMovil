package com.juanmd.proyectofinal

object PreguntasModulo {

    // Mapa que asocia cada módulo con su lista de preguntas
    private val preguntasPorModulo = mapOf(
        //Modulos A1
        "Greetings and introductions" to listOf(
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
            ),

            CompletarFrase(
                "Translate:",
                "Ella es de México",
                "She is from Mexico"
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

            OrdenarPalabras(
                "Arrange the words to make a sentence about how someone feels.",
                "",
                listOf("is", "She", "because", "happy", "it's", "her", "birthday"),
                "She is happy because it's her birthday"
            ),

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
            )

            ),

        "Numbers and dates" to listOf(

            OpcionMultiple(
                "True or False",
                "The number 'ten' is an ordinal number.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Él vive en el quinto piso",
                "He lives on the fifth floor"
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
                "Mi estación favorita es otoño, que comienza en septiembre",
                "My favorite season is fall, which starts in September"
            ),

            OpcionMultiple(
                "True or False",
                "Half past seven means 7:30.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "Es la una y cuarto",
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
            )
        ),

        "Family and friends" to listOf(

            OrdenarPalabras(
                "Arrange the words to make a sentence about family.",
                "",
                listOf("my", "is", "uncle", "he"),
                "He is my uncle"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about a family member.",
                "",
                listOf("is", "son", "my", "he"),
                "He is my son"
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
            )

        ),

        "Everyday objects" to listOf(

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
                "Ella tiene una chaqueta azul",
                "She has a blue jacket"
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
            )


        ),

        // Modulo A2
        "Daily routines" to listOf(

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
                "Voy al trabajo en coche",
                "I go to work by car"
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
                "Yo estudio inglés todos los días",
                "I study English every day"
            )

            ),

        "Hobbies and free time" to listOf(
            OpcionMultiple(
                "True or False",
                "'I enjoy' means the same as 'I dislike'.",
                listOf("True", "False"),
                "False"
            ),

            CompletarFrase(
                "Translate:",
                "Me gusta bailar",
                "I like to dance"
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
                "Voy a ver una película el domingo",
                "I am going to watch a movie on Sunday"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence about weekend plans.",
                "",
                listOf("a", "going", "they", "are", "to", "concert"),
                "They are going to a concert"
            ),


        ),

        "Basic shopping" to listOf(

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
            ),

            CompletarFrase(
                "Complete the sentence with a clothing item.",
                "You wear ______ on your feet when it rains.",
                "boots"
            ),

            OpcionMultiple(
                "Choose the clothing item.",
                "What do you wear to go swimming?",
                listOf("swimsuit", "jacket", "boots"),
                "swimsuit"
            ),

            OpcionMultiple(
                "Choose the clothing item.",
                "What do you wear to sleep?",
                listOf("pajamas", "scarf", "hat"),
                "pajamas"
            ),

            OrdenarPalabras(
                "Arrange the words to make a sentence.",
                "Arrange the words to name an accessory.",
                listOf("sunglasses", "protect", "from", "eyes", "the", "sun", "your"),
                "Sunglasses protect your eyes from the sun"
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

            CompletarFrase(
                "Translate the dialogue.",
                "Cliente: ¿Cuánto cuesta este libro?",
                "Customer: How much does this book cost?"
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

            ),

        "Weather and seasons" to listOf(

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
                "True or False",
                "Winter is the season when it is usually cold.",
                listOf("True", "False"),
                "True"
            ),

            CompletarFrase(
                "Translate:",
                "La primavera es mi estación favorita",
                "Spring is my favorite season"
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
                "En otoño, la gente recoge hojas",
                "In autumn, people rake leaves"
            ),

            OrdenarPalabras(
                "Arrange the words to describe a spring activity.",
                "",
                listOf("plant", "flowers", "in", "spring", "we"),
                "We plant flowers in spring"
            ),

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

            ),

        // Modulos B1
        "Daily routines" to listOf(

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
                "Mi padre es un abogado",
                "My father is a lawyer"
            ),

            OrdenarPalabras(
                "Arrange the words to describe a profession.",
                "",
                listOf("an", "engineer", "is", "He"),
                "He is an engineer"
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

            OpcionMultiple(
                "Select the correct answer",
                "What do most people do at the beginning of the workday?",
                listOf("Go to bed", "Start their tasks", "Have dinner"),
                "Start their tasks"
            ),

            CompletarFrase(
                "Translate:",
                "Él toma un descanso a las 10 de la mañana",
                "He takes a break at 10 in the morning"
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

            ),

        "Hobbies and free time" to listOf(

            CompletarFrase(
                "Complete the sentence with the correct body part.",
                "You use your _____ to hear sounds.",
                "ears"
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
                "Hacer ejercicio todos los días es bueno para la salud",
                "Exercising every day is good for your health"
            ),

            OrdenarPalabras(
                "Arrange the words to form a sentence about healthy eating.",
                "",
                listOf("fruits", "vegetables", "eat", "and", "regularly"),
                "Eat fruits and vegetables regularly"
            ),

            OrdenarPalabras(
                "Arrange the words to create a sentence about sleep.",
                "",
                listOf("hours", "night", "sleep", "eight", "at", "least", "a"),
                "Sleep at least eight hours a night"
            ),

            CompletarFrase(
                "Translate:",
                "Tomar descansos regulares durante el trabajo es beneficioso",
                "Taking regular breaks during work is beneficial"
            )




            ),

        "Basic shopping" to listOf(

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
                "Voy a cargar mi portátil antes de la reunión",
                "I am going to charge my laptop before the meeting"
            ),

            OrdenarPalabras(
                "Arrange the words to create a sentence about using electronic devices.",
                "",
                listOf("the", "turned", "He", "radio", "on"),
                "He turned on the radio"
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
                "Ella siempre revisa las redes sociales por la mañana",
                "She always checks social media in the morning"
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
            )

        ),

        "Weather and seasons" to listOf(

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
                "El festival de las linternas en Tailandia es muy famoso",
                "The lantern festival in Thailand is very famous"
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
                "En muchas culturas, mostrar respeto a los mayores es fundamental",
                "In many cultures, showing respect to elders is essential"
            )




            )



    )

    // Función para obtener preguntas según el nombre del módulo
    fun obtenerPreguntas(moduloNombre: String): List<Ejercicio> {
        return preguntasPorModulo[moduloNombre] ?: emptyList()
    }
}
