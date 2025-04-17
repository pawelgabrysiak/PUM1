fun <T> perm(list: List<T>): List<List<T>> {
    // Podstawowy przypadek: jeśli lista jest pusta, zwracamy listę zawierającą pustą listę
    if (list.isEmpty()) return listOf(list)

    // Dla każdego elementu w liście generujemy permutacje reszty listy
    return list.flatMap { element ->
        // Dla pozostałej części listy (po usunięciu bieżącego elementu), generujemy permutacje rekurencyjnie
        perm(list.filterNot { it == element })
            .map {
                // Do każdej permutacji dołączamy bieżący element
                listOf(element) + it
            }
    }
}

fun main() {
    // Testowanie funkcji
    val result = perm(listOf(1, 2, 3))
    println(result)  // Oczekiwany wynik: [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
}

