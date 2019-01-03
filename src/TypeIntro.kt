import java.util.Collections.list

const val MAX_EXPERIENCE = 5000

fun main(args: Array<String>) {
    val playerName = "Estragon"
    var experiencePoints = 5
    var hasSteed = false
    var pubName = "The Unicorns Horn"
    var publicanName = "Ted"
    var goldPurse = 50
    var drinksMenu = listOf("mead", "wine", "LaCroix")
    experiencePoints += 5
    println(experiencePoints)
    println(playerName)
    println("Welcome to $pubName my name is $publicanName and today I have $drinksMenu too serve")
    println("Hello my name is $playerName, I have $goldPurse and would I like a drink")
    println("Looking ih the mirror he sees ${playerName.reversed()}")
}