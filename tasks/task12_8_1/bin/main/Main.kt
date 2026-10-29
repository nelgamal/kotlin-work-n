// Task 12.8.1: demo program for Day enum class

fun main() {
    print("Enter a day: ")
    val input = readln()

    try {
        val day = Day.valueOf(input)
        println("You entered: $day")
    } catch (e: IllegalArgumentException) {
        println("Invalid day!")
        println("Valid options are:")

        for (day in Day.entries) {
            println(day)
        }
    }
}
