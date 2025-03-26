
fun <A> tailToHead(lst: List<A>): List<A> {

        val list = lst.toMutableList()
        list.add(0, list.last())
        list.removeLast()



    if (lst.isEmpty()){
        throw IllegalStateException("Empty list")
    }

    return list
}


fun main(){
    println(tailToHead(listOf(1,2,3,4)))

}