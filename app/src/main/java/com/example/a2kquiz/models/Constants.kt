package com.example.a2kquiz.models

import com.example.a2kquiz.R

object Constants {
    //This function will return all questions
    fun getAllQuestions():ArrayList<Question>{
     //1. Create Empty ArrayList
        var allQuestions = ArrayList<Question>()

        //TODO: 2. Create data
        val que1 = Question(
            1,
            "Which Spider-Man was in No Way Home",
            R.drawable.ic_help,
            optionOne = "Tom Holland",
            optionTwo = "Andrew Garfield",
            optionThree = "Toby Maguire",
            optionFour = "All Of The Above"
        )
        //add question to array
        allQuestions.add(que1)
        //3. return data
        return allQuestions

    //TODO: Add Marvel Questions
    }

}