class Dice(val numSides: Int) {
    //val sides = 20 //Sides Number

    fun roll(): Int //All fun is Int
    {
        val randomNum = (1..numSides).random()
        println(randomNum)
        return randomNum
    }
}

fun main ()
{
    //first Dice
    val myFirstDice = Dice(6) //NumSides
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")

    //Second Dice
    val mySecondDice = Dice(2) //NumSides
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
}