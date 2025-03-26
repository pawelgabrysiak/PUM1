
fun <A> isSorted(lst: List<A>, order: (A, A) -> Boolean): Boolean {
    for (i in 0 until(lst.size - 1)){
        if (!order(lst[i], lst[i+1])){
            return false // jesli kolejnosc jest zla zwracamy false
        }
    }
    return true
}


fun main(){
   println(isSorted(listOf(1, 2, 3, 1), order = {a, b -> a <=b})) // uzywamy listy i funkcji porownawczej
    println(isSorted(listOf(1, 1, 1, 0), order = {a, b -> a ==b}))
    println(isSorted(listOf("ahyyhh", "bkjn", "cnn", "duu"), order = {a,b -> a <b}))
}