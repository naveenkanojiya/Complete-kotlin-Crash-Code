open class father{
    protected val car = "Fortuner"
}
open class child: father() {
    protected val bike ="Kawasaki N2R"
//    fun car(){
//        println(car)
//    }
}
open class childchild : child() {
    fun bike(){
        println(bike)
    }
}

fun main() {
    val obj = childchild()
    obj.bike()





open class father{
   protected open val properties = "10 Cor"
    protected val car = "Audi 4*4"
    protected val shop = "kirana shop "

}
class child1:father(){
    override val properties = "2 Cor"
    fun naveen(){
        println("Naveen properties is ${this.properties}")

    }
}
class child2 :father(){
    fun naveen2(){
        println(properties)
    }
}
class child3 :father(){
    fun sonam(){
        println(car)
    }
}
class child4 :father(){
    fun komal(){
        println(shop)
    }
}

//fun main() {
//    val obj = child1()
//    obj.naveen()
//    val obj2=child2()
//    obj2.naveen2()
//    val obj3 = child3()
//    obj3.sonam()
//    val ojb4 =child4()
//    ojb4.komal()
//}
}





















