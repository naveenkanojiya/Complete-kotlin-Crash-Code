//This is the part of Scope Functions
// Let ,With,Also, Apply , Run these are the scope functions
fun main() {

    val name:String = "Naveen Kanojiya"
    val list = mutableListOf<String>("a","b","c","d","e","f","g","h","i")

    list.apply {
        for (i in this){
            println(i)
        }
    }.also {
        println("Android developer")
    }

}