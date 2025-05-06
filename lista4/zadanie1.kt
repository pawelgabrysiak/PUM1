//Napisz funkcję groupedCostMap przyjmującą listę kosztów List<Cost>, która zwróci mapę kosztów pogrupowaną według miesiąców i posortowaną rosnąco .


import java.time.Month

fun groupedCostMap(costs: List<Cost>): Map<Month, List<Cost> > {
return costs.groupBy { it.data.month } // grupowanie wedlug miesiacow
    .toSortedMap() // sortowanie rosnaco

}


fun main(){
    println(groupedCostMap(DataProvider.generalCosts(5)))
}