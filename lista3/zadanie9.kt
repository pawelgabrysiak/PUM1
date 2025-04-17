// Klasa StudentScore przechowuje dane studenta: jego imię, przedmiot, oraz wynik
data class StudentScore(val name: String, val subject: String, val score: Int)

// Funkcja analizująca wyniki studentów
fun analyzeResults(students: List<StudentScore>): Triple<Map<String, List<StudentScore>>, List<StudentScore>, List<String>> {

    // Tworzymy mapę przedmiotów z listą studentów, którzy zdali (wynik >= 50)
    val passedBySubject = students
        .filter { it.score >= 50 } // Filtrowanie studentów, którzy zdali
        .groupBy { it.subject }    // Grupowanie według przedmiotu

    // Tworzymy listę studentów, którzy nie zdali (wynik < 50)
    val failed = students.filter { it.score < 50 }

    // Tworzymy listę przedmiotów, w których wszyscy studenci zdali
    val subjectsAllPassed = students
        .groupBy { it.subject }  // Grupowanie według przedmiotu
        .filter { (_, studentsInSubject) ->  // Sprawdzamy, czy wszyscy studenci zdali
            studentsInSubject.all { it.score >= 50 }
        }
        .keys.toList()  // Zwracamy tylko klucze (czyli nazwy przedmiotów)

    // Zwracamy wynik w postaci Triple: mapa przedmiotów z zaliczonymi studentami, lista studentów, którzy nie zdali, oraz lista przedmiotów, w których wszyscy zdali
    return Triple(passedBySubject, failed, subjectsAllPassed)
}

fun main() {
    // Lista wyników studentów
    val students = listOf(
        StudentScore("Alice", "Math", 78),
        StudentScore("Bob", "Math", 45),
        StudentScore("Charlie", "Physics", 92),
        StudentScore("Dave", "Physics", 55),
        StudentScore("Eve", "Physics", 40),
        StudentScore("Frank", "CS", 60),
        StudentScore("Grace", "CS", 80)
    )

    // Wywołanie funkcji analyzeResults
    val (passedBySubject, failed, subjectsAllPassed) = analyzeResults(students)

    // Drukowanie wyników
    println("Zdani studenci według przedmiotów: $passedBySubject")
    println("Niezdani studenci: $failed")
    println("Przedmioty, w których wszyscy zdali: $subjectsAllPassed")
}
