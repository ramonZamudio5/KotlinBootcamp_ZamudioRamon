open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded: Int = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded: Int = 8
}

class Building<T : BaseBuildingMaterial>(val material: T) {
    val baseMaterialsNeeded: Int = 100

    val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} required")
    }
}


fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("large building")
    }
}

fun main() {
    val woodBuilding = Building(Wood())
    woodBuilding.build() // Imprime: 400 Wood required
    isSmallBuilding(woodBuilding) // Imprime: small building

    println("---")

    val brickBuilding = Building(Brick())
    brickBuilding.build() // Imprime: 800 Brick required
    isSmallBuilding(brickBuilding) // Imprime: large building
}