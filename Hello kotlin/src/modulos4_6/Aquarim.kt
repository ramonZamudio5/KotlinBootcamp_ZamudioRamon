package modulos4_6

import kotlin.math.PI

open class Aquarim (var lenght : Int =100, var width : Int = 20, var height : Int = 40) {

    open var volume: Int
        get() =  width * height * lenght /1000
        set(value) {height= (value *1000)/(height * lenght) }

    open var water = volume *0.9

    constructor(numberOfFish: Int): this() {
        val water: Int = numberOfFish * 2000//cm3
        val tank: Double = water + water * 0.1
        height = (tank / (lenght * width)).toInt()
    }
}

class TowerTank(): Aquarim(){
    override var water = volume * 0.8

    override var volume: Int
        get() =(width * height * lenght/1000* PI).toInt()
        set(value){
            height = (value * 1000) / (width * lenght)
        }
}