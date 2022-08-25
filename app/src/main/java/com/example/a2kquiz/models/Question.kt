package com.example.a2kquiz.models

data class Question (
        val id: Int,
        val questionText: String,
        val icon: Int,
        val optionOne: String,
        val optionTwo: String
)