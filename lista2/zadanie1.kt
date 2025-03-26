fun repeat(s: String, i: Int): String {
    return s.repeat(i)
}

// tworzymy wyrazenia lambda, {parametry -> ciało funkcji}
val r: (String, Int) -> Unit = { name, i ->
    println(repeat(name, i))
}

fun  main(){
    r("Paweł", 3)
  println( repeat("Paweł", 3))
}