//Napisz funkcję drukującą wszystkie koszty.
//
//koszty powinny być pogrupowane według miesięcy
//koszty powinny być posortowane według dat

fun printCosts(costs: List<Cost>){
   val grouped = costs
        .groupBy { it.data.month } //grupowanie kosztow wedlug miesiecy
        .mapValues { (_, list) -> list.sortedBy { it.data }  } // sortowanie kosztow wedlug dat
        .toSortedMap()

    for ((month, costList) in grouped){ // petla destrykturyzacja mapy
        println(month) // wypisujemy miesiace jako klucze mapy
        for (cost in costList){ // petla po liscie kosztow
            print(cost.data.dayOfMonth.toString().padStart(2, '0') + " " + cost.type.costType + " " + cost.amount.toString() + " zł") // wypisujemy obiekty Cost
            println()
        }
    }
}

fun main(){
    printCosts(DataProvider.generalCosts(5))
}