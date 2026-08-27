fun getFurtuneCookie() : String{
    val fortuneCookie = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!" ,
        "Treasure your friends because they are your greatest fortune.")
    var birthday = getBirthday()
    return when(birthday){
        28-> fortuneCookie[-1]
        31-> fortuneCookie[2]
        else -> fortuneCookie[birthday%fortuneCookie.size]
    }
}

fun getBirthday() : Int{
    print("Ingresa tu cumpleaños")
    return readLine()?.toIntOrNull()?:1
}


