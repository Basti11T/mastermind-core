package de.bcthms.games.mastermind.services

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * GameServiceTest Documentation:
 *
 * _______________________
 * @author: Bastian Thomas
 * @created: 09.06.2022
 */
class GameServiceTest {

    @Test
    fun createNewGame() {
        val name = "Spiderman"
        val game = GameService.newGame(name)

        Assertions.assertEquals(name, game.guesserName)
    }


}