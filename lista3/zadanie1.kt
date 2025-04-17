
fun <A : Comparable<A>> findDuplicates(lst: List<A>): List<A> {
    val seen = mutableSetOf<A>() // Zbiór unikalnych elementów
    val duplicates = mutableSetOf<A>() // Zbiór duplikatów

    // Przechodzimy przez listę
    for (item in lst) {
        val add = seen.add(item) // Dodajemy element do zbioru 'seen'
        if (!add) { // Jeśli add zwróci false, to oznacza, że element się powtarza
            duplicates.add(item) // Dodajemy element do zbioru 'duplicates'
        }
    }

    // Zwracamy posortowaną listę duplikatów
    return duplicates.toList().sorted()
}


fun main(){
    println(findDuplicates(listOf(1, 2, 3, 4, 1, 2, 3, 4,5,6,7,8)))
    println("Hello Paweł")
}