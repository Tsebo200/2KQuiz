package com.example.a2kquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.a2kquiz.databinding.ActivityQuestionBinding
import com.example.a2kquiz.models.Constants.getAllQuestions

class QuestionActivity : AppCompatActivity() {
    //We need to define binding view
    private lateinit var binding: ActivityQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //UPDATED: inflate
        binding = ActivityQuestionBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //Call for all my questions
        var questions = getAllQuestions()
        Log.i("Question Count:", "${questions[0].questionText}")

        binding.tvQuestionText.setText(questions[3].questionText)

//        R.id.tv_question_text.setText(questions[0].questionText)
    }
}