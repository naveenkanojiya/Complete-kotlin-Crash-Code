fun main() {
//    var a:Int? = 3 // THis value is Nonnull type
//    var b = 2          //And value is simple type
//    println(a?.plus(b))
//
//    println(a?.minus(b))
//
//    println(a?.times(b))

    val  a :String = readlnOrNull() ?:" "
    val b = 20

    println(a.toInt().plus(b))
    println(a.toInt().minus(b))
    println(a.toInt().times(b))

}