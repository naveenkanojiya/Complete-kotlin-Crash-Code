import staticClass.Companion.API_KEY

class accessApiUsingCompanionObj {

    fun access(){
        println(API_KEY)
    }
}

fun main() {
    val obj = accessApiUsingCompanionObj()
    obj.access()
}