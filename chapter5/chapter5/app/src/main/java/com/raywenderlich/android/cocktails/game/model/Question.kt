package com.raywenderlich.android.cocktails.game.model

class Question(
    val correctOption: String,
    val incorrectOption: String
) {
    var answeredOption: String? = null
        private set
}