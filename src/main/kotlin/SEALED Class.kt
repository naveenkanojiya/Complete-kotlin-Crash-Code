fun main() {

    val honda = TypeofVehicle.Bike("Honda Spelondor",80000)
    val BMW = TypeofVehicle.Bike("BMW",1280000)
    var naveein = TypeofVehicle.Car("Audi G23")
    var ehfbli = TypeofVehicle.Car("fjvblwv")
}
sealed class TypeofVehicle(){

    class Car(val name:String):TypeofVehicle()

    class Bike(val name:String,val price:Int):TypeofVehicle()

}
// sealed class se hum ak class k multiple Object bna skte hai