val fish = "fish"
val plant = "plant"

fish == fish

fish != plant

val numnerOfFish = 50
val numberOfPlants = 23
if(numnerOfFish == numnerOfFish) println("good ratio")
else
    println("unhealty ratio")

val fishh = 50
if(fishh in 1..100)println(fishh)

when (numnerOfFish){
    0-> println("empty tank")
    50-> println("full tank")
    else -> println("perfect")
}
