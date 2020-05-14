package classes

open class Aquarium(open var width: Int = 20, open var height: Int = 40, open var length: Int = 100) {

    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9

    open var volume: Int
        get() = width * height * length /1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    init { println("Aquarium is initialising") }

    constructor(numberOfFish:Int) : this(){
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize(){
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm " +
                "Volume: $volume l")
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")

    }
}