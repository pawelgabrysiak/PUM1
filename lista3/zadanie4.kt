fun countElements(lists: List<List<String>>): Map<String, Int>{
    return lists.flatten() // laczenie podlist
        .groupingBy { it } // grupowanie elemntow za pomoca it
        .eachCount() // zliczanie
}

fun main() {
    val result = countElements(
        listOf(
            listOf("a", "b", "c"),
            listOf("c", "d", "f"),
            listOf("d", "f", "g")
        )
    )
    println(result)  // {a=1, b=1, c=2, d=2, f=2, g=1}
}