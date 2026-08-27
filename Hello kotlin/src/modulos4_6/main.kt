package modulos4_6

fun main(args: Array<String>) {
delegate()
}

fun buildaquarium(){
    val myAquarim = Aquarim()
    println("lenght: ${myAquarim.lenght}"+
            " widht: ${myAquarim.width}"+
            " height: ${myAquarim.height}")
    myAquarim.height = 80
    println("lenght: ${myAquarim.height}")
    val smallAquarim = Aquarim(20,15,30)
    println("Small aquarium: ${smallAquarim.volume} liters")
    val myAquarim2 = Aquarim(numberOfFish =9)
    println("aquario 2 volumen ${myAquarim2.volume} liters, lenght: ${myAquarim2.lenght}"+
            " widht: ${myAquarim2.width}"+
            " height: ${myAquarim2.height}")
}

fun makeFish(){
    val shark = Shark()
    val plecostomus = Plecostomus()

    println("Shark: ${shark.color}  plecot: ${plecostomus.color}")
    shark.eat()
    plecostomus.eat()
}

fun delegate (){
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}


interface FishColor{
    val color : String
}

object GoldColor: FishColor{
    override val color = "gold"
}
object RedColor: FishColor{
    override val color = "red"
}

class PrintingFishAction(val food: String): FishAction{
    override fun eat() {
        println(food)
    }
}