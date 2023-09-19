//Ex:-1
abstract class Abstraction {
    abstract fun hello()
    fun hello2() {
        println("This is hello from hello2 function")
    }

}

class B1 : Abstraction() {
    override fun hello() {
        println("This is hello from abstract function")
    }

}

fun main() {
    val obj = B1()
    obj.hello()
    obj.hello2()

    val obj1 = sum(10)
    println(obj1.calculation())
    println(obj1.dataPrinting())

    val obj2 = mul(4)
    println(obj2.calculation())
    println(obj2.dataPrinting())
}

// Example :- 2

abstract class parent() {
    abstract fun dataPrinting()
    abstract fun calculation():Int
}
class sum(val value1:Int):parent(){
    override fun dataPrinting() {
        println("Sum is getting Print")
    }

    override fun calculation(): Int {
        return value1+value1
    }
}
class mul(val value1: Int):parent(){
    override fun dataPrinting() {
        println("mul is  getting print")
    }

    override fun calculation(): Int {
        return value1*value1
    }

}
class naveen(): parent() {
    override fun dataPrinting() {
        TODO("Not yet implemented")
    }

    override fun calculation(): Int {
        TODO("Not yet implemented")
    }

}