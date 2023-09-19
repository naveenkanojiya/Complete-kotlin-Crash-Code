 fun main() {

     //Ex :- 1
    //1.Get value from user hungry or not in Boolean format
    //If hungry then give food otherwise don’t give

//    println("Are you Hungry")
//    val a= readln()
//    val isHungry  = a.toBoolean()
//
//    if (isHungry==true){
//        println("You can eat food ")
//    }else{
//        println("You can't eat food ")
//    }

     //Ex :-2
     //2.Get age from user and check user can smoke or not
//     println("Enter your Age")
//     val a = readln()
//     val age = a.toInt()
//
//     if (age>18) {
//         println("You can smoke")
//     }
//     else{
//         println("You can't smoke")
//     }

     //Ex:- 3
     //3.shop has some product make list of
     // product and get name of product from user
     // and check it user can buy that product or not

//     val shopProducts = listOf("Laptop","Specker","Keyboard" , "Mause")
//     println("What you want to purchase?")
//     val c= readln()
//
//     if (c.toString().equals(shopProducts[0])){
//         println("You can take ${shopProducts[0]}")
//     }else if (c.toString().equals(shopProducts[1])){
//         println("You can take ${shopProducts[1]}")
//     }else if (c.toString().equals(shopProducts[2])) {
//         println("You can take ${shopProducts[2]}")
//
//
//     }


     //Ex:- 4
     //4.Get number from user and check number is even or odd
     //Even number= 2,4,6,8,10…
     //Odd number=1,3,5,7,9,11…

     println("Enter Your Number")
     val a = readln()
     val number = a.toInt()

     if (number%2==0){
         println("$number is Even Number")
     }else{
         println("$number is Odd Number")
     }











}