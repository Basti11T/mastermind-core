package de.bcthms.games.mastermind.entities

enum class Color {
    RED,
    BLUE,
    YELLOW,
    GREEN,
    WHITE,
    BLACK
}

enum class CheckPin {
    NOTHING,
    COLOR_ONLY,
    POS_AND_COLOR
}

enum class GameState {
    OFF,
    RUNNING,
    GUESSER_HAS_WON,
    CHECKER_HAS_WON
}