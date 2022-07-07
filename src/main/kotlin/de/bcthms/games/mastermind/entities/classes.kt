package de.bcthms.games.mastermind.entities

data class Game(val guesserName: String, val colorCode: ColorCode)

data class ColorCode(val colOne: Color, val colTwo: Color, val colThree: Color, val colFour: Color)