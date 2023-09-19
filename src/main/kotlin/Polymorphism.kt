open class A {
    open fun hello1(){
        println("This is  a base Class")
    }
    fun add(num1:Int , num2:Int):Int{
        return num1+num2
    }
}
class B : A(){
        fun add(num1:Int , num2:Int,num3:Int):Int{
            return num1+num2+num3
        }
    fun hello2(){
        println("This is a sub class")
    }
}



fun main() {
    var obj1 = A()
    obj1.hello1()
    val ans2 =obj1.add(9,2)
    println(ans2)

    val obj = subClass()
    obj.hello()
    val ans = obj.add(12,21,2)
    val answ = obj.add(12,21,3)
    println(ans)
    println(answ)

}
open class baseClass(){
    open fun hello(){
        println("Hello this is msg from BaseClass")
    }
    fun add(num1 :Int, num2:Int):Int{
        return num1+num2
    }
}
class subClass(): baseClass(){
    override fun hello(){
        println("This is msg from SubClass")
        super.hello()
    }
    fun add(num1 :Int, num2:Int,num3:Int):Int{
        return num1+num2+num3

    }
}






