// Task 12.5.4: demo program for class with a computed property

import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("Joe", LocalDate(2000, 8, 23))

    println(p.name)
    println(p.birth)
    println(p.age)
}
