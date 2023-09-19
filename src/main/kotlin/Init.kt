fun main() {


//The code inside the init block is the first to be executed when the class is initialize.
// The init block is run every time the class is initialize,
// with any kind of constructor as we shall see next.
// Multiple initializer blocks can be written in a class.


    val obj = Example()
    obj.first()


}
class Example(){
    fun first(){
        println("Hello I am the first Run")
    }

    init {
        println("Hey Guyz You already know who is First")
    }
}