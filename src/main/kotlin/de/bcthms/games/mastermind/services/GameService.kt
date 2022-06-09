package de.bcthms.games.mastermind.services

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
        return Game(guesserName)
    }

}