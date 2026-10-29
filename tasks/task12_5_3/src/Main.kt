// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main() {
    val date = LocalDate(1997, 8, 23)
    val p = Person("Joe", date)

    println(p.name)

    p.name = ""

    println(p.name)
}
