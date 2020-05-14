package classes

fun buildAquarium() {
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
    val towerTank1 = TowerTank(25, 80)
    towerTank1.printSize()
}

fun makeFish(){
    val shark = Shark()
    println("Shark: ${shark.color}")
    shark.eat()
    val pleco = Plecostomus()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}
fun main(){
makeFish()
}