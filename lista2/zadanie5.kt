fun <A> setHead(lst: List<A>, item: A): List<A>{
    val list = lst.toMutableList()
    list.add(0, item)
    list.removeAt(1)
    return list
}

fun main(){
    println(setHead(listOf(1, 2, 3, 4), 5))
}