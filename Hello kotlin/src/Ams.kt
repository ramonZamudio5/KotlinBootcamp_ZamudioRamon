import java.util.Calendar
import java.util.Random

fun main(args: Array<String>) {
    println("hello ${args[0]}")
    println(shouldChangeWater("Domingo"))
}

fun dayOfWeek(){
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        1->println("Domingo")
        2->println("Lunes")
        3->println("Martes")
        4->println("Miercoles")
        5->println("Jueves")
        6->println("Viernes")
        7->println("Sabado")
        else->println("el tiempo llego a su fin")
    }
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("hoy es: $day, y los pecess comen: $food")
    if(shouldChangeWater(day)){
        println("change the water today")
    }
}

fun fishFood(day: String) :String {
    return when(day){
        "Lunes"->"flakes"
        "Miercoles"->"redworms"
        "Jueves"->"granules"
        "Viernes"->"mosquitoes"
        "Domingo"->"plakton"
        else -> "fasting"
    }

}

fun randomDay(): String{
    val week = listOf("Lunes","Martes","Miercoles","Jueves", "viernes","Sabado","Domingo")
    return week[Random().nextInt(7)]
}

fun getDirtySensor() = 20


fun shouldChangeWater(day:String,
                      temperature: Int =22,
                      dirty: Int = getDirtySensor(),): Boolean{
    val isTooHot=temperature > 30
    val isDirty=dirty>30
    val isSunday = day == "Domingo"
    return when{
        isTooHot(temperature)->true
        isDirty(dirty)->true
        isSunday(day)->true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty:Int) = dirty >30
fun isSunday(day:String) = day == "Domingo"

fun fitMoreFish(tankSize: Int,
                currentFish: List<Int>,
                fishSize: Int = 2,
                hasDecoration: Boolean = true): Boolean {
    var lenght:Int = 1
    for(item in currentFish){
        lenght *= item
    }
    if(hasDecoration){
        if (lenght<(tankSize-tankSize*.80)){
            return true
        }else{
            return false
        }
    }else {
        if (currentFish.size > tankSize){
            return true
        }else{
            return false
        }
    }
}



