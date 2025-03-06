//a)
fun printNumbersUpToA(n: Int) {
    for (i in 1..n) {
        if (i % 15 == 0) {
            println("trzypiec")
        } else if (i % 5 == 0) {
            println("piec")
        } else if (i % 3 == 0) {
            println("trzy")
        } else {
            println(i)
        }
    }
}

//b)
    fun printNumbersUpToB(n: Int){
        for (i in 1..n){
            if (i % 105 == 0){
                println("trzypiecsiedem")
            } else if (i % 35 == 0){
                println("piecsiedem")
            } else if (i % 21 == 0){
                println("trzysiedem")
            } else if (i % 15 == 0){
                println("trzypiec")
            } else if (i % 7 == 0){
                println("siedem")
            } else if (i % 5 == 0){
                println("piec")
            } else if (i % 3 == 0){
                println("trzy")
            } else {
                println(i)
            }
        }
    }

//c) z stringBuilder
    fun printNumbersUpToC(n: Int){

    for (i in 1..n){
        val output = StringBuilder() // uzywamy StringBuildera ktory laczy w pasujace warunki w calosc
        if (i % 3 == 0) output.append("trzy")
        if (i % 5 == 0) output.append("piec")
        if (i % 7 == 0) output.append("siedem")
        if (i % 11 == 0)output.append("jedenascie")
        if (i % 13 == 0) output.append("trzynascie")

        if (output.isNotEmpty()){
            println(output)
        } else {
            println(i)
        }
        }

    }








fun main(){
//    val num = 15
//    printNumbersUpToA(15)
//    printNumbersUpToB(105)
    printNumbersUpToC(15015)

}