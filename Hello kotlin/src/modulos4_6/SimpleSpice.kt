package modulos4_6

class SimpleSpice(name: String, spiciness: String ="mild",val heat:Int) {
    val name = "curry"
    val spiciness ="mild"


    init{
        println("nombre: ${name}, spiciness: ${spiciness}, heat: ${heat}")
    }

    override fun toString(): String {
        return "SimpleSpice(heat=$heat, name='$name', spiciness='$spiciness')"
    }

    fun makeSalt(listspices: List<SimpleSpice>){
        println(listspices.sortedByDescending { it.heat })
    }

}