fun main() {
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementFblikes()
    SharingWidget.incrementFblikes()
    SharingWidget.incrementFblikes()
    SharingWidget.display()
}
object SharingWidget{
    private var twitterLikes = 0
    private var fblikes =0

    fun incrementTwitterLikes()= twitterLikes++
    fun incrementFblikes() = fblikes++

    fun display() = println("Facbook -$fblikes -- Twitter --$twitterLikes")
}