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
    val myFirstDice = Dice(6) //NumSides
    //println(myFirstDice.sides)
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")
}