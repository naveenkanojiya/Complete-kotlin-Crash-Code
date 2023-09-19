fun main() {
    val onj = Names()
    println(onj.NAveen("Naveen Kanojiya"))
    println(onj.Shivam("Shivam ",23))

}
class Names(){
    lateinit var name:String

    fun NAveen(name:String):String{
        return name

    }
    fun Shivam(name: String,Age:Int): String {
        return name +Age

    }
}