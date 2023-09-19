fun main() {

    val obj1  = getStudent()
    obj1.readBook("Rich Dad Poor Dad")
    obj1.reading()
    obj1.writing()

    val obj2 = classA(12)
    obj2.Add(3,4,5)
    println(obj2.Add(3,4))
    println(obj2.Add(3,4,5))


    val obj3 = IndainHotel()
    obj3.food()
}


interface Student{
    val name:String
    fun reading()
    fun writing()
    fun readBook(bookName:String){
        println("Student is Reading $bookName")
    }
}
class Naveen :Student {
    override val name: String = "Example Book"

    override fun reading() {
        println("Student is Reading")
    }

    override fun writing() {
        println("Student is Writing")
    }
}
fun getStudent() :Student{
    return Naveen()
}




//Example :-2

interface Add{
    var firstNo : Int
    fun Add(a:Int,b:Int):Int
    fun Add(a:Int,b:Int,c:Int):Int
}
class classA(override var firstNo: Int) : Add{
    override fun Add(a: Int, b: Int): Int {
        return a+b
    }

    override fun Add(a: Int, b: Int, c: Int): Int {
        return a*b
    }


}


//Example:- 3


interface Hotel{
    fun food()
}
class IndainHotel:Hotel{
    override fun food() {
       println("Indian Food is Available")
    }
}
class ChainesHotel:Hotel{
    override fun food() {
        println("Chainess Food is Available")
    }

}