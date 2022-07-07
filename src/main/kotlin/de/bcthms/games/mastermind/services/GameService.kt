package de.bcthms.games.mastermind.services

import de.bcthms.games.mastermind.entities.Color
import de.bcthms.games.mastermind.entities.ColorCode
import de.bcthms.games.mastermind.entities.Game

/**
 * GameService Documentation:
 *
 * _______________________
 * @author: Bastian Thomas
 * @created: 09.06.2022
 */
object GameService {

    fun newGame(guesserName: String): Game {
        val colorCode = ColorCode(Color.RED, Color.BLACK, Color.BLUE, Color.WHITE)
        return Game(guesserName, colorCode)
    }

}