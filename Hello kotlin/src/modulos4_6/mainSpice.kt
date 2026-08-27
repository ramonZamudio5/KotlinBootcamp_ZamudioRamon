package modulos4_6

fun main() {

}

abstract class mainSpice(val name: String, val spiciness: String ="mild", val heat:Int) {


    init {
        println("nombre: ${name}, spiciness: ${spiciness}, heat: ${heat}")
    }

    override fun toString(): String {
        return "SimpleSpice(heat=$heat, name='$name', spiciness='$spiciness')"
    }

    fun makeSalt(listspices: List<SimpleSpice>) {
        println(listspices.sortedByDescending { it.heat })
    }

    open abstract fun prepareSpice()

}

interface Grinder{
    fun grind()
}



