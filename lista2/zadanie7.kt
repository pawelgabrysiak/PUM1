fun check(N: Int, list: List<Int>): Int {
    // petla przechodzi przez liste, aby sprawdzic preambule w kazdym mozliwym miejscu
    // petla konczy sie na 'list.size - N', poniewaz wtedy preambula ma sens
    for (i in 0..list.size - N) {
        val preambula = list.subList(i, i + N) // wybieramy preambule o dlugosci N, zaczynajac od indeksu i

        val sums = mutableSetOf<Int>() // zbior na przechowanie sum dwoch liczb z preambuly

        // petla, ktora oblicza wszystkie sumy par liczb w preambule
        for (j in 0 until N) { // dla kazdego elementu w preambule (indeks j)
            for (k in j + 1 until N) { // dla kazdego elementu, ktory jest po j (indeks k)
                sums.add(preambula[j] + preambula[k]) // dodajemy sume dwoch liczb z preambuly do zbioru 'sums'
            }
        }

        // sprawdzamy, czy ktorakolwiek z tych sum znajduje sie w reszcie listy
        for (sum in sums) { // iterujemy przez kazda sume, ktora obliczylismy
            // sprawdzamy, czy suma wystepuje w reszcie listy (po preambule)
            if (list.drop(i + N).contains(sum)) { // 'drop(i + N)' usuwa sprawdzona preambule
                return sum // jesli suma istnieje w reszcie listy, zwracamy ja
            }
        }
    }
    return -1 // jesli zadna suma nie pasuje, zwracamy -1
}


fun main(){
        println(check(3, listOf(1, 2, 3, 5, 7, 12, 30)))
        println(check(2, listOf(1, 3, 5, 7)))
}