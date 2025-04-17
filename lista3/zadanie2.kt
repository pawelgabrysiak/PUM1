fun addToBoolean(): Map<Int, Boolean>{
    return (1..20).associate { it to (it % 2 == 0) } // associate tworzy mape,
                                // potem przypisujemy do kazdej wartosci wartosc true lub false za pomoca warunku
}

fun  main(){
    println(addToBoolean())
}