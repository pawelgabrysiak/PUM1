//Napisz funkcję getFullCosts(List<Car>) podsumowującą wszystkie poniesione koszta (dla wszystkich samochodów).
//Funkcja oblicza sumę kosztów każdego typu. Funkcja zwraca mapę (typ kosztu, suma).
//Napisz funkcję printFullCost(Map<CostType, Int>) drukującą mapę wszystkich kosztów.

fun getFullCosts(cars: List<Car>): Map<CostType, Int> {
    // 1. Łączymy wszystkie koszty ze wszystkich samochodów w jedną listę
    val allCosts = cars.flatMap { it.costs } // splaszcza liste list do jednej wspolnej listy

    // 2. Grupujemy koszty po typie i sumujemy kwoty
    val grouped = allCosts
        .groupBy { it.type }
        .mapValues { (_, costs) -> costs.sumOf { it.amount } }
        .toMutableMap()

    // 3. Dodajemy brakujące typy kosztów z wartością 0, jeśli nie występują
    for (type in CostType.entries) {
        if (type !in grouped) {
            grouped[type] = 0
        }
    }

    return grouped
}

fun printFullCost(costs: Map<CostType, Int>) {
    for ((type, amount) in costs) {
        println("${type.name} $amount")
    }
}


fun main(){

    printFullCost(getFullCosts(DataProvider.cars))
}
