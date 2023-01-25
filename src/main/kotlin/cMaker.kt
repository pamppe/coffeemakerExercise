class CoffeeMaker(val coffeeCapacity: Int = 50, val waterCapacity: Int = 150) {
    var coffeeAmount: Int = 0
    var waterAmount: Int = 0
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
