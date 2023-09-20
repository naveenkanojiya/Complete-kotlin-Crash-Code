fun main() {

//    var testObj = object {
//        val x :Int = 20
//        fun method(){
//            println("Im the method in object expression")
//        }
//    }
//    println(testObj.method())

    var obj = object : Cloneable{
        override fun clone() {
            println("I am Clone ")
        }

    }
    obj.clone()


}
interface Cloneable{
    fun clone()
}