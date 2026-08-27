package scratches

val trout = "trout"
val haddock = "haddock"
val snapper = "snapper"

println("me gustan todos los tipos de pescados como por ejemplo el $trout, el $haddock y tambien el $snapper")
val fishName = "fishName"
when(fishName.length) {
    0->println("el nombre no puede estar vacio")
    in 3..12 ->println("buen nombre")
    else ->println("ok")
}

