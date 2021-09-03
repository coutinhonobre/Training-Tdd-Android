package com.raywenderlich.android.cocktails.game.model

import org.junit.Assert.assertEquals
import org.junit.Test

class GameUnitTests {
    // 1
    @Test
    fun whenIncrementingScore_shouldIncrementCurrentScore() {
        // 2
        val game = Game()

        // 3
        game.incrementScore()

        // 4
        assertEquals(1, game.currentScore)
        assertEquals("Current score should have been 1",
            1, game.currentScore)
    }

    @Test
    fun whenIncrementingScore_aboveHighScore_shouldAlsoIncrementHighScore() {
        val game = Game()

        game.incrementScore()

        assertEquals(1, game.highestScore)
    }

    @Test
    fun whenIncrementingScore_belowHighScore_shouldNotIncrementHighScore() {
        val game = Game(10)

        game.incrementScore()

        assertEquals(10, game.highestScore)
    }
}