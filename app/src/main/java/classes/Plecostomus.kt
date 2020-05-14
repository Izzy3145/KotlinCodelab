package classes

class Plecostomus: FishAction, FishColour {
    override val color = "grey"
    override fun eat() {
        println("eat algae")
    }
}