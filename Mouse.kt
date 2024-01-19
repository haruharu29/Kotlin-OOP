class Mouse (_name:String="The mouse"):Animal(_name) {
    override fun makeASound(){
        squeak()
    }
    private fun squeak() {
        println("$animalName squeaks!")
    }

    private var cheeseAmount:Int = 0

    fun StealCheese(x:Int) //"StealCheese" that increments the CheeseAmount by an integer x
    {
        cheeseAmount+=x
    }

    fun EatCheese() //function "EatCheese" that decrements CheeseAmount by 1
    {
        cheeseAmount--
    }
}