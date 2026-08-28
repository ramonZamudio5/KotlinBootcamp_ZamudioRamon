package modulos4_6

class MyIntList{
    fun get(pos:Int):Int{return 0}
    fun addItem(Item:Int){}
}

class MyShortList{
    fun get(pos:Int):Short{return 0}
    fun addItem(Item:Short){}
}

class MyList<T>{
    fun get(pos:Int){
    }
    fun addItem(Item:T){}
}

fun workWithMyList(){
    val initList = ArrayList<Int>()
    val fishList = ArrayList<Fish>()
}