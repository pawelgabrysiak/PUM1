
val <T : Any> List<T>.tail: List<T>

    get() = drop(1) // implementacja zwracajaca reszte listy oprocz pierwszego elementu



val <T> List<T>.Head: T
    get() = this.first() // pobranie pierwszego elementu z listy

fun main(){
    val numbers = listOf(2, 3, 4, 5, 6, 7, 8) // tworzymy przykladowa liste

    println(numbers.tail)
    println(numbers.Head)

}