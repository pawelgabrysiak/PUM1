//Napisz funkcję getCarCosts(String) podsumowującą wszystkie wydatki danego auta. Funkcja przyjmuje nazwę samochodu
//i zwraca listę par (Pair) wszystkich typów kosztów wraz z sumą wydatków dla tego auta -
//lista jest posortowana malejąco względem kosztów. Napisz funkcję printCarCosts(List<Pair<CostType, Int>>) drukującą listę kosztów.

fun getCarCosts(name: String): List<Pair<CostType, Int>>{
    // znajdujemy samochod po nazwie
    val car = DataProvider.cars.find { it.name == name }?: return emptyList()

    // grupujemy po CostType, sumujemy koszty dla danego typu

      val grouped = car.costs.groupBy { it.type }
        .mapValues { (_, costs) -> costs.sumOf { it.amount } } // Map<CostType, List<cost>>
        .toMutableMap() // zamieniamy na mutowalna aby dodac brakujace typy

    // dodajemy brakujace typy kosztow z  wartoscia zero, jesli nie wystapily

        for (type in CostType.entries){
            if (type !in grouped){
                grouped[type] = 0
            }
        }

    //  sortowanie malejąco po sumie i przekształć do listy par


    return  grouped.entries // kolekcja kluczy i wartosci
        .sortedByDescending { it.value } // sortowanie kostow malejaco
        .map { it.toPair() } // konwertujemy do listy Pair

}

fun printCarCosts(costs: List<Pair<CostType, Int>>){
    for ((type, amount) in costs){
        println("${type.name} ${amount} zł")
    }
}

fun main(){
    printCarCosts(getCarCosts("Domowy"))
}