fun main() {

    val a:String? = null
    val b = "Bhavesh"


    try {
        println(a!!.length)

    }catch (e:Exception){
        println("Error Msg is $e")
        println("Here B is ........$b")
    }
    finally {
        println("Code is Running Wait........")
        println(b)
    }
}