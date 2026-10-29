// Task 12.9: demo program for class implementing Static Factory Method

import kotlinx.datetime.LocalDate

fun main() {
    val p1 = Person.create("Sarah", LocalDate(2005, 7, 16))
    println(p1.name)

    val p2 = Person.create("Sarah", LocalDate(2004, 3, 12))
    println(p2.name)
}
