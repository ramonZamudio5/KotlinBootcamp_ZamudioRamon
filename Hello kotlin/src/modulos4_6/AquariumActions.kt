package modulos4_6

interface AquariumActions {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim(){
        println("swim")
    }
}

interface FishActions {
    fun eat()
}

abstract class AquariumFish2: FishActions {
    abstract val color : String
    override fun eat() = println("yum")
}