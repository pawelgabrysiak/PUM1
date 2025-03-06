
fun checkArmstrong(number: Int) {
    val digitsCount = number.toString().length // toString aby policzyc liczbe cyfr w liczbie
    var sum = 0
    var temp = number // zmienna pomocnicza

   while (temp > 0){
       val newNumber = temp % 10
       sum += Math.pow(newNumber.toDouble(), digitsCount.toDouble()).toInt()
       temp /= 10 // usuwamy ostania cyfre z liczby
   }
    if (sum == number) {
        println("Liczba jest liczbą Armstronga")

    } else {
        println("Liczba nie jest liczbą Armstronga")
    }

}

fun main(){
    checkArmstrong(153)
}