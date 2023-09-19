fun main() {

//    val a= listOf("A","B","C","E","D")
//    for (kuchbhbi in a)
//        println(kuchbhbi)
//

//    for (i in 1..25 step 5)
//    {
//        println(i)
//    }

//    for (i in 25 downTo 0 step 2)
//    {
//        println(i)
//    }

//    val hasList = hashMapOf(Pair("A","Naveen"), Pair("B","Shivam"),Pair("C","Sidharth"))
//    for (i in hasList.keys){
//        println(hasList[i])
//    }



    //Practice ForLoop.........................................................................................

//    //1.Print Number 1 to 120

//    println("Enter your Number")
//    val a = readln()
//    val size = a.toInt()
//    for (i in 1..size) {
//        println(i)
//    }


//    //2.Print Complete list Using For Loop


//    val list= arrayListOf<Int>(1,3,4,5,6,8,9,10)
//    for (i in list){
//        println(i)
//    }



    //4.Print Emoji Like This
    //
    //❤
    //❤ ❤
    //❤ ❤ ❤
    //❤ ❤ ❤ ❤
    //❤ ❤ ❤ ❤ ❤


    for (i in 0..5){
        for (j in 0..i){
            print("❤")
        }
        println("")
    }


}