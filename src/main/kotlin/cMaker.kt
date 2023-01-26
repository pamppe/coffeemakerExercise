
// Emil Lehtonen
// Student number: 2201349

class CoffeeMaker(val coffeeCapacity: Int = 50, val waterCapacity: Int = 150) {
   private var coffeeAmount: Int = 0
    private var waterAmount: Int = 0
    var isOn: Boolean = false

    override fun toString(): String {
        return "CoffeeMaker (coffeeCapacity= $coffeeCapacity, waterCapacity= $waterCapacity, coffeeAmount= $coffeeAmount, waterAmount= $waterAmount, isOn= $isOn)"
    }




    fun makeDoubleEspresso() {
        if (isOn) {
            if (coffeeAmount >= 16 && waterAmount >= 30) {
                coffeeAmount -= 16
                waterAmount -= 30
                println("Double espresso is ready!")
            } else {
                println("Not enough ingredients. Please add more coffee or water.")
            }
        } else {
            println("Coffee maker is not on.")
        }
    }
    // makeRegular method uses 10 units of coffee and 120 units of water
    // If the amount of coffee and water is not enough, it will not change the state of the coffee machine

    fun makeRegular() {
        if (isOn) {
            if (coffeeAmount >= 10 && waterAmount >= 120) {
                coffeeAmount -= 10
                waterAmount -= 120
                println("Regular coffee is ready!")
            } else {
                println("Not enough ingredients. Please add more coffee or water.")
            }
        } else {
            println("Coffee maker is not on.")
        }
    }
    // fillAll method tops up the coffee and water amounts to their maximums
    fun fillAll() {
        if (isOn) {
            coffeeAmount = coffeeCapacity
            waterAmount = waterCapacity
        } else {
            println("Coffee maker is not on.")
        }
    }
}


    fun main(){
        val cm = CoffeeMaker()
        println(cm)
        cm.makeRegular()
        println(cm)
        cm.isOn = true
        println(cm)
        cm.makeRegular()
        println(cm)
        cm.fillAll()
        println(cm)
        cm.makeRegular()
        println(cm)
        cm.makeDoubleEspresso()
        println(cm)
        cm.makeDoubleEspresso()

    }