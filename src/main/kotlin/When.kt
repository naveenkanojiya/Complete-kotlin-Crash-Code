fun main() {

    /*Kotlin replace Switch case in when statement is use to
      Get choices from user and run the specific code*/


    //1.Get Number from user and execute output

//    val a = readln()
//    val number= a.toInt()
//
//    when (number){
//        0 -> {
//            println("One Number")
//        }
//        1 ->{
//            println("One Number")
//        }
//        2-> {
//            println("Two Number")
//        }
//        else->{
//            println("Invalid Output")
//        }
//    }


    //2.Check Version of Language
//
//    println("Enter Language Name")
//    val a = readln()
//
//    when (a) {
//        "Java" ->{
//            println("Current version of java is 20.2")
//        }
//        "Kotlin" ->{
//            println("Current version of Kotlin is 24.6")
//        }
//        "Android" ->{
//            println("Current version of Android is Giraff")
//        }else ->{
//            println("Invalid Language")
//        }
//    }


    //3.Check morning noon night afternoon from time
    //6-12 morning
    //12-16 afternoon
    //16-19 evening
    //19-24 night

    println("What is time")
    val a= readln()
    val time = a.toInt()

    when (time){
        in 6..12 -> {
            println("Good Morning")
        }
        in 12..16->{
            println("Good Afternoon")
        }
        in 16..19->{
            println("Good Evening")
        }
        in 19..24 ->{
            println("Good Night")
        }else->{
            println("Invalid Day")
        }
    }









}