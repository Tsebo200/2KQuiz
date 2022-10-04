package com.example.a2kquiz.models

import com.example.a2kquiz.R

object Constants {
    //This function will return all questions
    fun getAllQuestions(): ArrayList<Question> {
        //1. Create Empty ArrayList
        var allQuestions = ArrayList<Question>()

        //TODO: 2. Create data
        val Marvque1 = Question(
            1,
            "Which Spider-Man was in No Way Home?",
            R.drawable.ic_help,
            optionOne = "Tom Holland",
            optionTwo = "Andrew Garfield",
            optionThree = "Toby Maguire",
            optionFour = "All Of The Above",
//            Answer = optionFour
        )

        //TODO: Add Marvel Questions
        val Marvque2 = Question(
            2,
            "Who is the new Captain America?",
            R.drawable.ic_help,
            "Loki Laufeyson (Loki)",
            "Sam Wilson (Falcon)",
            "Bucky Barnes (The Winter Soldier)",
            "Peggy Carter"
//            Answer = optionTwo
        )

        val Marvque3 = Question(
            3,
            "What rare metal is abundant in Wakanda?",
            R.drawable.ic_help,
            "Vibranium",
            "Gold",
            "Unobtaniu",
            "Nothing"
//            Answer = optionOne
        )
        val Marvque4 = Question(
            4,
            "What is Thor’s hammer called?",
            R.drawable.mjolnir,
            "Mäjinol",
            "Mjölnir",
            "Märigöl",
            "Storm breaker"
//            Answer = optionTwo
        )
        val Marvque5 = Question(
            5,
            "What was the first MCU movie called?",
            R.drawable.ic_help,
            "Spider-Man",
            "Iron Man",
            "BatMan",
            "Captain America"
//            Answer = optionTwo
        )

        //TODO: Add Anime Questions
        val Anique1 = Question(
            1,
            "Who killed the whole of the Uchiha Clan?",
            R.drawable.ic_help,
            "Naruto",
            "Itachi",
            "Sasuke",
            "Kakshi"
//            Answer = optionTwo
        )

        val Anique2 = Question(
            2,
            "How many swords does Asta own?",
            R.drawable.ic_help,
            "Four",
            "Two",
            "Five",
            "Three"
//            Answer = optionFour/optionOne
        )

        val Anique3 = Question(
            3,
            "What is the name of this Anime?",
            //Promotional picture of the Anime (Initial D)
            R.drawable.ic_help,
            "Tomodachi Game",
            "No Gmae No life",
            "Inital D",
            "Naruto"

//            Answer = optionThree
        )

        val Anique4 = Question(
            4,
            "Which Anime is part of the big 3?",
            //Promotional picture of the Anime (Initial D)
            R.drawable.ic_help,
            "DBZ",
            "Demon Slayer",
            "Bleach",
            "JoJo"
//            Answer = optionThree
        )

        val Anique5 = Question(
            5,
            "Which manga had the most hyped anime Adaptation ever?",
            //Promotional picture of the Anime (Initial D)
            R.drawable.ic_help,
            "Tokyo Ghoul",
            "ChainSaw Man",
            "Jujutsu Kaisen",
            "Boruto"
//            Answer = optionTwo
        )

        //TODO: Add Formula One Questions
        val Formque1 = Question(
            1,
            "Lewis Hamilton has won 7 world championship titles?",
            R.drawable.ic_help,
            "True",
            "False",

//          Not using these options for this question
            "Maybe",
            "of Cousrse"
//            Answer = optionOne
        )

        val Formque2 = Question(
            2,
            "Who holds the record of the most world championship titles?",
            R.drawable.ic_help,
            "Max Veerstappen",
            "Michael Schumacher",
            "Nicholas Latifi",
            "Lewis Hamilton"
//            Answer = optionOne or option Two
        )

        val Formque3 = Question(
            3,
            "What does a Black flag mean?",
            R.drawable.ic_help,
            "You have been disqualified",
            "You may use DRS",
            "Safety car warning",
            "You are too fast"
//            Answer = optionOne
        )
        val Formque4 = Question(
            4,
            "What does DRS stand for?",
            //Must type this answer
            R.drawable.ic_help,
            "Type",
            "Type",
            "Type",
            "Type"
//            Answer = Drag Reduction System
        )

        val Formque5 = Question(
            5,
            "Who is known to be the most aggressive driver in 2021?",
            //Must type this answer
            R.drawable.ic_help,
            "Piere Gasly",
            "George Russel",
            "Lando Norris",
            "Max Verstappen"
//            Answer = optionFour/optionOne but less points for optionOne
        )


        //TODO: Add NBA Questions
        val NBAque1 = Question(
            1,
            "Which Team Does Steph Curry Play for?",
            R.drawable.ic_help,
            "Memphis Grizzlies",
            "Brooklyn Nets",
            "Golden State Warriors",
            "Los Angeles Lakers"
//        Answer = optionThree
        )

        val NBAque2 = Question(
            2,
            "Who are the splash brothers?",
            R.drawable.ic_help,
            "Steph and Klay",
            "Lebron and Harden",
            "Kobe and Jordan",
            "Ja and Westbrook"
//          Answer = optionOne
        )

        val NBAque3 = Question(
            3,
            "Which player has been memed the most for their size?",
            R.drawable.ic_help,
            "James Harden",
            "Shaquille O'Neal's",
            "Kobe Bryant",
            "Giannis Antetokounmpo"
//           Answer = optionTwo
        )

        val NBAque4 = Question(
            4,
            "Who is this player?",
            // Image of Kyrie Irving
            R.drawable.ic_help,
            "Type",
            "Type",
            "Type",
            "Type"
//         Answer = Kyrie Irving
        )

        val NBAque5 = Question(
            5,
            "Which player is known to have the best drip?",
            R.drawable.ic_help,
            "James Harden",
            "Shaquille O'Neal's",
            "Kobe Bryant",
            "Russell Westbrook"
//          Answer = optionFour
        )
        //add question to array
        allQuestions.add(Marvque1)
        allQuestions.add(Marvque2)
        allQuestions.add(Marvque3)
        allQuestions.add(Marvque4)
        allQuestions.add(Marvque5)
        allQuestions.add(Anique1)
        allQuestions.add(Anique2)
        allQuestions.add(Anique3)
        allQuestions.add(Anique4)
        allQuestions.add(Anique5)
        allQuestions.add(Formque1)
        allQuestions.add(Formque2)
        allQuestions.add(Formque3)
        allQuestions.add(Formque4)
        allQuestions.add(Formque5)
        allQuestions.add(NBAque1)
        allQuestions.add(NBAque2)
        allQuestions.add(NBAque3)
        allQuestions.add(NBAque4)
        allQuestions.add(NBAque5)
        //3. return data
        return allQuestions


    }


}


