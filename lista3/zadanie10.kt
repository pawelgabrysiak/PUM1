data class Point(var x: Int, var y: Int) {
    // Przeciążenie operatora +
    operator fun plus(p: Point): Point {
        return Point(x + p.x, y + p.y)
    }

    // Przeciążenie operatora +=
    operator fun plusAssign(value: Int) {
        // Dodanie wartości do obu współrzędnych
        x += value
        y += value
    }

    // Przeciążenie operatora -
    operator fun minus(p: Point): Point {
        return Point(x - p.x, y - p.y)
    }

    // Przeciążenie operatora *
    operator fun times(p: Point): Point {
        return Point(x * p.x, y * p.y)
    }

    // Przeciążenie operatora ++
    operator fun inc(): Point {
        return Point(x + 1, y + 1)
    }

    // Przeciążenie operatora --
    operator fun dec(): Point {
        return Point(x - 1, y - 1)
    }

    // Przeciążenie operatora !
    operator fun not(): Point {
        return Point(-x, -y)
    }
}

fun main() {
    var p1 = Point(1, 1)
    val p2 = Point(2, 2)


    // Wyniki dla operacji
    println(p1 + p2)    // Output: (3, 3)


    println(p1 - p2)     // Output: (-1, -1)
    println(p1 * p2)     // Output: (2, 2)
    println(p1++)
    println(p1--)
    !p1
    p1 += 1
    println(p1)




}



//    input: p1 + p2    output: (3, 3)
//    input: p1 += 1    output: (2, 2)
//    input: p1 - p2    output: (-1, -1)
//    input: p1 * p2    output: (2, 2)
//    input: p1++    output: (2, 2)
//    input: p1--    output: (0, 0)
//    input: !p1    output: (-1, -1)

