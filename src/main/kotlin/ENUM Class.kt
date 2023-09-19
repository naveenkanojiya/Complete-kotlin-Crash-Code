fun main() {

    val imageCount = API.Image.size
    println(imageCount)

}
enum class API(val size:Int){
    Image(100),
    video(10),
    Audios(20),
    PDF(5)
}