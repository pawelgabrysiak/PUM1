
fun isPalindrome(word: String){
    if (word == word.reversed()){ // porownujemy z odczytanym slowem z drugiej strony
        println("Słowo " + word + " jest palindromem")
    } else {
        println("Słowo " + word + " nie jest palindromem")
    }
}

fun main(){
    val word = "kajak"
    val word2 = "lolek"
    isPalindrome(word)
    isPalindrome(word2)


}