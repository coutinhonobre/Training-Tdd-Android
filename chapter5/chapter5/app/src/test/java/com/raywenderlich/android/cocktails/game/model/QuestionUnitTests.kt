package com.raywenderlich.android.cocktails.game.model

import org.junit.Assert.assertNull
import org.junit.Test

class QuestionUnitTests {

    @Test
    fun whenCreatingQuestion_shouldNotHaveAnsweredOption() {
        val question = Question(correctOption = "CORRECT", incorrectOption = "INCORRECT")

        assertNull(question.answeredOption)
    }


}