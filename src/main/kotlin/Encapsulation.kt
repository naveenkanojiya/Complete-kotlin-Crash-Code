fun main() {

    val obj = Calculation()
    obj.add()
    obj.multiply()
    obj.num2
    obj.num1



}
class Calculation(){

    //Data Members
    var num1 =4
    var num2 =5

    //Members Function
    fun add(){
        println("Sum is these number is ${num1+num2}")
    }

    fun multiply() {
        println("Multiply is these number is ${num1 *num2}")
    }
}