class Dice {
    val sides = 20 //Sides Number

    fun roll(): Int //All fun is Int
    {
        val randomNum = (1..sides).random()
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