package classes

class Shark : FishAction, FishColour {
    override val color = "gold"
    override fun eat() {
        println("hunt and eat fish")
    }
}