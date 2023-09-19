fun main() {

    //Getter is use to get any value from any variable and setter is use to
    //Set value in any variable and you can also validate it


    val obj = exClass()
    obj.name
    println(obj.name)  //Chahiye Getter Name get
    obj.name = "NaveenKanojiya"  //Ser value Setter
    println("New Name is ${obj.name}")
}
class exClass(){

    var name:String? = null
        get() = field

        set(value){
            if (value?.length!!>6){
                field = value
            }
            else{
                println(value?.length)
            }

        }

}