// Task 7.7.1: statistics functions
fun median(numbers: List<Float>): Float {
    require(numbers.isNotEmpty()) { "The list can't be empty" }

    val sorted = numbers.sorted()
    val size = sorted.size

    return if (size % 2 == 1) {
        sorted[size / 2]
    } else {
        (sorted[size / 2 - 1] + sorted[size / 2]) / 2
    }
}

fun displayStats(numbers: List<Float>) {
    println("Minimum = ${numbers.min()}")
    println("Maximum = ${numbers.max()}")
    println("Mean = ${numbers.average()}")
    println("Median = ${median(numbers)}")
}