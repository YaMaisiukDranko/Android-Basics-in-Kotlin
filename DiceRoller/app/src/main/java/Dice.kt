class Dice {
    val sides = 6

    fun roll(): Int
    {
        val randomNum = (1..6).random()
        println(randomNum)
        return randomNum
    }
}

fun main ()
{
    val myFirstDice = Dice()
    //println(myFirstDice.sides)
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}!")
}