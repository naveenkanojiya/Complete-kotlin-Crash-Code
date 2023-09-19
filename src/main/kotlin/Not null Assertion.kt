fun main() {


    //!!
    //This  means I need Value I don't know anything


//    val name:String? = null
//    println(name!!.toString())

    /*Practice
    //Question :-
    Get product quantity from user
    Product value is 20Rs
    Count Final Value
    User Not null Assertion*/

    println("Enter Product Quantity ")
    val productQuantity = readLine()   //5 bisket

    val productValue = 20
    println("Final Price is ${productQuantity!!.toInt()!!.times(productValue)}")






}