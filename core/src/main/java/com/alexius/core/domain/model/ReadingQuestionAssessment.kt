package com.alexius.core.domain.model

data class ReadingQuestionAssessment(
    val id: Int,
    val questionText: String,
    val options: List<String>,
    val correctAnswerIndex: Int,
    var selectedAnswer: Int? = null
)
