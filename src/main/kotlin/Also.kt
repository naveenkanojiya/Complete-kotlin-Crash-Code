//This is the part of Scope Functions
// Let ,With,Also, Apply , Run these are the scope functions

fun main() {

    val name:String = "Naveen Kanojiya"
    val list = mutableListOf<String>("a","b","c","d","e","f","g","h","i")

    with(list){
        for (i in this){
            println(i)
        }
    }.also {
        println("List Success")
    }

}