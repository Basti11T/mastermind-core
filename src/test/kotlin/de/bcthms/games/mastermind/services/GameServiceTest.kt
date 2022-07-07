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
    fun createNewGame_CheckName() {
        val name = "Spiderman"
        val game = GameService.newGame(name)
        Assertions.assertEquals(name, game.guesserName)
    }

    @Test
    fun createNewGame_CheckColorCode() {
        // TODO hier weitermachen und zweimal neues Game erzeugen und prüfen, dass der ColorCode unterschiedlich ist!
    }
}