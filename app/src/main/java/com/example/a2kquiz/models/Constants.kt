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
            "Which Spider-Man was in No Way Home",
            R.drawable.ic_help,
            optionOne = "Tom Holland",
            optionTwo = "Andrew Garfield",
            optionThree = "Toby Maguire",
            optionFour = "All Of The Above"
        )

        //TODO: Add Marvel Questions
        val Marvque2 = Question(
            2,
            "Who is the new Captain America",
            R.drawable.ic_help,
            "Loki Laufeyson (Loki)",
            "Sam Wilson (Falcon)",
            "Bucky Barnes (The Winter Soldier)",
            "Peggy Carter"
        )

        //TODO: Add Anime Questions
        val Anique1 = Question(
            1,
            "Ilike Pixxa",
            R.drawable.ic_help,
            "Loki Laufeyson (Loki)",
            "Sam Wilson (Falcon)",
            "Bucky Barnes (The Winter Soldier)",
            "Peggy Carter"
        )


        //TODO: Add Formula One Questions
        val Formque1 = Question(
            1,
            "Who is You",
            R.drawable.ic_help,
            "Loki Laufeyson (Loki)",
            "Sam Wilson (Falcon)",
            "Bucky Barnes (The Winter Soldier)",
            "Peggy Carter"
        )

        //TODO: Add NBA Questions
        val NBAque1 = Question(
            1,
            "Lets play",
            R.drawable.ic_help,
            "Loki Laufeyson (Loki)",
            "Sam Wilson (Falcon)",
            "Bucky Barnes (The Winter Soldier)",
            "Peggy Carter"
        )

        //add question to array
        allQuestions.add(Marvque1)
        allQuestions.add(Marvque2)
        allQuestions.add(Anique1)
        allQuestions.add(Formque1)
        allQuestions.add(NBAque1)
        //3. return data
        return allQuestions


    }


}


