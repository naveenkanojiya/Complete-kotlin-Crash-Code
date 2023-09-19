fun main() {

    var list = arrayListOf<Developer>()

    list.add(Developer("Naveen", "Kanojiya", 22, "Android Developer"))
    list.add(Developer("Shivam", "Kanojiya", 22, "Android Developer"))
    list.add(Developer("Krishna", "Kanojiya", 22, "Android Developer"))
    list.add(Developer("Rishab", "Kanojiya", 22, "Android Developer"))

    for (i in list){
        println(i)
    }
}

data class Developer(
    var name: String,
    var surname: String,
    var age: Int,
    var profashion: String
)