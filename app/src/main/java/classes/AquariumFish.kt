package classes

abstract class AquariumFish {

    interface FishAction { fun eat() }

    interface FishColour { val color: String }
    
    class Plecostomus: FishAction, FishColour {
        override val color = "grey"
        override fun eat() {
            println("eat algae")
        }
    }

    class Shark : FishAction, FishColour {
        override val color = "gold"
        override fun eat() {
            println("hunt and eat fish")
        }
    }
}
