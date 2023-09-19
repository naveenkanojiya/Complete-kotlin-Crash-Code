fun main() {

    val Bmw = Car()
    val secondBMW = Car()
    secondBMW.print()

}
class Carr(){
    val tire:Int= 10

    inner class OtherCar(){
        fun print(){
            println("BMW S Class")
        }
    }
}