package modulos4_6

class Fish (val friendly: Boolean = true, volumenNeeded: Int){

    init{
        println("first init block")
    }

    constructor():this(true,9){
        println("running the secondary constructor")
    }
    var size: Int
    init{
        if(friendly){
            size = volumenNeeded
        }else{
            size = volumenNeeded*2
        }
    }
    init{
        println("constructed fish of size $volumenNeeded final size ${this.size}")
    }
    init{
        println("last init block")
    }

    fun makeDefaultFish()=Fish(true,50)




}