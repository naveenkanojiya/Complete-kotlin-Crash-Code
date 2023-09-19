//This is the part of Scope Functions
// Let ,With,Also, Apply , Run these are the scope functions


fun main() {
    val name:String = "Naveen Kanojiya"
    val list = mutableListOf<String>("a","b","c","d","e","f","g","h","i")


    with(name){
        this.plus("Android Developer")
        this[3]
        this.length
    }

    with(demoClass()){
        this.firstfun()
        this.secondfun()
    }


}
class demoClass(){
    fun firstfun(){
        println("My name is first function")
    }
    fun secondfun(){
        println("My name is  second function")
    }
}