package modulos4_6.generics

open class WaterSupply(var needsProcessed:Boolean)

class TapWater : WaterSupply(true){
    fun addChemicalCleanners(){
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true){
    fun filter(){
        needsProcessed = false
    }
}

class Aquarium<T>(val waterSupply: T)

fun genericalExample(){
    val aquarium = Aquarium<TapWater>(TapWater())
    aquarium.waterSupply.addChemicalCleanners()
}

