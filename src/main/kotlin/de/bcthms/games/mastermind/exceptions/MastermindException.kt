package de.bcthms.games.mastermind.exceptions

/**
 * MastermindException Documentation:
 *
 * _______________________
 * @author: Bastian Thomas
 * @created: 02.01.2022
 */
class MastermindException(message: String, cause: Exception? = null) : RuntimeException(message, cause) {
}