
class DailyTask{

    private val num1 = 33
    val num2 =35

    fun add(){
        println("Adding two number is = ${num1+num2}")
    }
    fun multi(){
        println("Multi two number is = ${num1*num2}")
    }

//    fun bath(){
//        println("Taking Bath...")
//    }
//    fun ready(){
//        println("Getting ready....")
//    }
//    fun study(){
//        println("Studying in college...")
//    }
//    fun backToHome(){
//        println("Back to home...")
//    }
}
fun main(args: Array<String>) {

    val obj = DailyTask()
    obj.add()
    obj.multi()
    println(obj.num2)

//    val person1 = DailyTask()
//    person1.bath()
//    person1.ready()
//    person1.study()
//    person1.backToHome()
//    val naveen = DailyTask()
//    naveen.study()
//    naveen.backToHome()

}



//    println("What is your age...?")
//    var age = readLine()?.toInt()
//    println("your age is $age")
//
//    if (age != null) {
//        if (age < 10)
//            println("You are boy and you can't cast the vote")
//        else(age > 20)
//    }
//        println("You can not cast the vote")

//task()
//    println("Day2")
//    task()


//fun task(){
//    val a=12
//    val b=21
//    val c=a+b
//    println("sum of these 2 number is $c")

//var a = task2()
//println(a)
//    task3(5,8)

//fun task2():Int{
//    var a=12
//    var b=21
//    var c=a+b
//    return c
//}

//fun task3(a:Int,b:Int){
//    var c=a+b
//    println("sum of these two number is $c")
//}

//    var lamda = {a:Int,b:Int -> a+b}
//    println(lamda(6,6))
//    println(task4(3,6))
//}
//fun task4(a:Int,b:Int): Int {
//    var c= a+b
//    return c
//}