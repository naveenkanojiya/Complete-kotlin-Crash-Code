
fun main() {

    //Primary Constructor
    val a = primaryConstructor("Naveen",23,16.5)

    //SecodaryConstructor
    val b = SecodaryConstructor("Naveen",23)
    val ans = b.sum(10,45)
    println(ans)

}
class primaryConstructor(s: String, i: Int, d: Double) {
    init {
        println(s)
        println(i)
        println(d)
    }
}
class SecodaryConstructor(Shivan:String,age:Int){

    fun sum(value1:Int,value2:Int):Int{
        return value1+value2

    }
}