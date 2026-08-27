package modulos4_6

open class Book (val author : String ="", val title: String = ""){

    private var currentPage : Int = 0
    open fun readPage(){
        currentPage++
    }


}

class EBook(): Book() {
    var wordCount: Int = 0
    override fun readPage(){
        wordCount+=250
    }
}