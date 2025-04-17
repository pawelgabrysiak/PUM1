fun evenPositiveSquare(numbers: List<Int>): List<Int> {
    return numbers
        .filterIndexed { index, value -> index % 2 != 0 && value > 0 }  // Wybieramy liczby dodatnie o nieparzystych indeksach
        .map { it * it }  // Podnosimy każdą liczbę do kwadratu
}

fun main() {
    val result = evenPositiveSquare(listOf(1, 2, 3, 5, -6, -1, 2, 3))
    println(result)  // Oczekiwany wynik: [4, 25, 9]
}
