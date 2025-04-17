fun srt(words: List<String>): List<Pair<Char, List<String>>> {
    return words
        .filter { it.length % 2 == 0 }  // Filtrujemy tylko słowa o parzystej długości
        .groupBy { it[0].lowercaseChar() }  // Grupujemy według pierwszej litery
        .map { (key, value) -> key to value.sorted() }  // Sortujemy listy w grupach
        .sortedBy { it.first }  // Sortujemy pary według pierwszej litery
}


fun main() {
    val result = srt(listOf("cherry", "blueberry", "citrus", "apple", "apricot", "banana", "coconut"))
    println(result)  // Oczekiwany wynik: [[b, [banana]], [c, [cherry, citrus]]]
}
