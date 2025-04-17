fun convert(word: String): String {
    // Mapa przypisująca litery do cyfr
    // przypisujemy litery do cyfr za pomoca mapy
    val letterToDigit = mapOf(
        'a' to '2', 'b' to '2', 'c' to '2',
        'd' to '3', 'e' to '3', 'f' to '3',
        'g' to '4', 'h' to '4', 'i' to '4',
        'j' to '5', 'k' to '5', 'l' to '5',
        'm' to '6', 'n' to '6', 'o' to '6',
        'p' to '7', 'q' to '7', 'r' to '7', 's' to '7',
        't' to '8', 'u' to '8', 'v' to '8',
        'w' to '9', 'x' to '9', 'y' to '9', 'z' to '9'
    )
//372 635
    // Zmieniamy litery w słowie na odpowiadające cyfry
    //return word.toLowerCase().map { letterToDigit[it] }.joinToString("")
    return  word.lowercase().map { letterToDigit[it] ?: it }.joinToString("")
}

fun main() {
    val word = "Franek"
    println(convert(word))
}
