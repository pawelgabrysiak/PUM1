fun suma(a: List<Int>): Int{
    return a.filter { it > 0}.sum() //filtrujemy liste na elemnety ktore sa wieksze od zera, nastepnie je sumujemy
}


fun main(){
    val result = suma(listOf(1, -4, 12, 0, -3, 29, -150))
    println(result)  

}