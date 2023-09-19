//fun main() {


//    man()
//    println(sum(20,34)) //This is argument
//    println(sum(naveen = 50, rohan = 55))
//}
//fun man(){
//    println("I am a men")
//    println(4*8)
//}


//fun sum(naveen:Int,rohan:Int):Int{  //And Here is pramenter
//    return naveen+rohan


    //Same As
//    fun sum(naveen:Int,rohan:Int):Int = rohan+naveen





//Function Overloading............................................!!!



//    println(naveen(2))
//    println(naveen(2,3.3))

//fun naveen(one:Int){
//    println("$one")
//
//
//}
//fun naveen(one: Int,two:Double){
//    println("${one+two}")
//
//}




    //Function Practice...........................................!!!!!

    //1:- Make function for multiplication

//fun main() {
//    val name = multi(5,6)
//    val id = multi("Naveen"," Kanojijya")
//    println(name)
//    println(id)
//    val add= add("vishal","kumawat")
//    println(add)
//
//
//}
//
//fun multi(naveen:Int,suraj:Int):Int{
//    return naveen*suraj
//}
//fun multi(name:String,surname:String):String{
//    return name+surname
//}
//
//
////2:- Make it one line function

//fun add(name: String,surname: String):String= name+surname




//3:- Ask users name and birth year and count age of user

//fun main() {
//
//    println("Enter your Name")
//    val a = readln()
//    println("Enter Your Birth year")
//    val b= readln()
//    val byear = b.toInt()
//    countAge(a,byear)
//
//}
//fun countAge(name:String, bYear: Int){
//    println("Your Name is $name and your Age is ${2023-bYear}")
//
//
//}

//4:- Pass list and print whole list

//fun main() {
////
////    val list = arrayListOf<String>("A","B","C","D")
////    println(list)
////
////}
////fun printList(list:ArrayList<String>){
////    for (i in list){
////        println(i)
////    }
////
////
////}


//5:- Get product price and quantity from user
// and give them 10% discount of and count Final Bill

fun main() {

    println("Enter Price of Product ")
    val a= readln()
    val quantity = a.toDouble()

    println("Enter Quantity of Product ")
    val b  = readln()
    val product = b.toDouble()

    println(finalBill(quantity,product))

}
fun finalBill(q:Double,price:Double): Double {
    val total = q*price
    val discount = total*1/10
    val finalBill = total- discount
    return finalBill





}



















