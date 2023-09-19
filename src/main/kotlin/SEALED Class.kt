fun main() {

    val honda = TypeofVehicle.Bike("Honda Spelondor",80000)
    val BMW = TypeofVehicle.Bike("BMW",1280000)
}
sealed class TypeofVehicle(){

    class Car(val name:String):TypeofVehicle()

    class Bike(val name:String,val price:Int):TypeofVehicle()

}