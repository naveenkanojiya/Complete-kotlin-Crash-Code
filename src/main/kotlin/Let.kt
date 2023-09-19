
//This is the part of Scope Functions
// Let ,With,Also, Apply , Run these are the scope functions

fun main() {
    val name:String = "Naveen Kanojiya"
    val list = mutableListOf<String>("a","b","c","d","e","f","g","h","i")

    name.let {
        println(it.length)
        println(it[4])
    }

    list.let {
        println(it[3])
    }

    val obj = demoClass()
    obj.let {ok->
        ok.firstfun()
        ok.secondfun()
    }
}
class demoClas(){
    fun firstfun(){
        println("My name is first function")
    }
    fun secondfun(){
        println("My name is  second function")
    }
}