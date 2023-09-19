fun main() {


    //In Kotlin when pass something into functions parameter
    // they act as a Val by default which means without
    // this compiler was using local scope variables not global scope
    // but when we use this keyword we tell compiler,
    // with keyword this property over here before = is global scope this.

    val obj =  DemoClass()
    println(obj.name)
    obj.newFunction("Shivam")
    println(obj.name)
}
class DemoClass(){
    var name:String = "Naveen Kanojiya"

    fun newFunction(names: String) {
        this.name = names

    }
}