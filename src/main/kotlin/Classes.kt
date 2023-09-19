fun main() {

    var obj = Song()
    obj.songName = "Chorni"
    obj.songDuration = 3.52
    obj.songonTseries = true
    obj.songSinger = "Sidhu Mosewala"

    println(obj.songName)
    println(obj.songDuration)
    println(obj.songSinger)

    obj.play()
    obj.pause()
    obj.stop()

    var song2 = Song()
    song2.songName = "Chorni2"
    song2.songDuration = 3.523
    song2.songonTseries = false
    song2.songSinger = "chidu Mosewala"

    println(song2.songName)
    println(song2.songDuration)
    println(song2.songSinger)

    song2.play()
    song2.pause()
    song2.stop()

    //Call Function of class using Object of class

    



}

class Song() {

    var songName: String? = null
    var songDuration: Double? = null
    var songSinger: String? = null
    var songonTseries: Boolean? = null


    fun play() {
        println("Song is Playing")
    }

    fun pause() {
        println("Song is Paush")
    }

    fun stop() {
        println("Song is Stop")
    }


}