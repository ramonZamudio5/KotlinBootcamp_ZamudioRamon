fun main(args: Array<String>){
    whatShouldIDoToday("happy")
}

fun whatShouldIDoToday(mood:String,
                       weather: String = "Sunny",
                       temperature: Int = 24,){
    when{
        mood == "sad" && weather == "rainy" && temperature == 0 -> print("stay in bed")
        temperature > 35 -> println("go swimming")
    }
}