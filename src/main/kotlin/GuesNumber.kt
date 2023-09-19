import kotlin.random.Random

fun main() {

    val randomNum = Random.nextInt(1,5)
    println(randomNum)

    var i = 0
    while (i <= 3){
        println("Enter Your Number")
        val a = readln()
        val userNumber = a.toInt()
        if (randomNum==userNumber){
            println("You Are Win!!")
        }else{
            println("You have ${2-1} Try Remain")
            println("Try Again")
        }
        i++
    }

}