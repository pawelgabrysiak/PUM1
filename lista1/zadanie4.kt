
fun isPerfect(n: Int){
    var sum = 0
    for (i in 1..n/2){
        if (n % i == 0){
            sum += i
        }
    }
    if (sum == n){
        println("perfect")
    } else if (sum > n){
        println("abundant")
    } else {
        println("deficient")
    }
}

fun main(){
    isPerfect(28)
}