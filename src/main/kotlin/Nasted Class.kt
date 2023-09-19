fun main() {

    val BMW = Car()
    val secondBMW = Car.OtherCar()
    secondBMW.BMW()

}
class Car(){
    fun print() {
        println("BMW S Class")
    }

    val tire:Int= 10

    class OtherCar(){
        fun BMW(){
            println("BMW S Class")
        }
    }
}