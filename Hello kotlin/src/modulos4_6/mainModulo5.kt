package modulos4_6

import kotlin.random.Random


fun main(args: Array<String>) {
    /*
    val symptoms: MutableList<String> = mutableListOf("white spots","red spots", "not eating")
    symptoms.add("white fungus")
    symptoms.remove("white fungus")
    symptoms.contains("red")
    symptoms.contains("red spots")

    println(symptoms.subList(4,symptoms.size))

    listOf(1,5,3).sum()
    listOf("a","b","c").sumBy { it.length }
    */
    /*
    val allBooks: Set<BasicBook> = setOf(BasicBook("William Shekespeare","Romeo y Julieta",1999), BasicBook("William Shekespeare","Hamlet",1999))
    val library : Map<String, Set<BasicBook>> = mapOf("William Shekespeare" to allBooks)

    println(library.any { (_,books)->books.any({it.title.equals("Hamlet")})})

    val moreBooks = mutableMapOf("The Hobbit" to "J.R.R. Tolkien")

    moreBooks.getOrPut("1984") { "George Orwell" }

    moreBooks.getOrPut("The Hobbit") { "Different Author" }

    println(moreBooks)
    */

    val myBook = BasicBook("Cien Años de Soledad", "Gabriel García Márquez", 50,50)
    val myPuppy = Puppy()

    println("Páginas iniciales: ${myBook.pages} (Peso: ${myBook.weight()}g)")

    while (myBook.pages > 0) {
        myPuppy.playWithBook(myBook)
    }

    println("¡El perrito destruyó el libro por completo!")
}


class BasicBook(var author: String, var title: String, var year:Int, var pages:Int) {
    fun getTitleAndAuthor():Pair<String, String> = Pair(title, author)

    fun getTitleAuthorAndYear(): Triple<String,String,Int> = Triple(title, author, year)



}

fun BasicBook.weight(): Double {
    return pages * 1.5
}

fun BasicBook.tornPages(torn: Int) {
    if (pages >= torn) {
        pages -= torn
    } else {
        pages = 0
    }
}

class Puppy {
    fun playWithBook(libro: BasicBook) {
        val damage = Random.nextInt(1, 16)
        libro.tornPages(damage)
        println("El perrito arrancó $damage páginas. Peso actual: ${libro.weight()}g. Páginas restantes: ${libro.pages}")
    }
}