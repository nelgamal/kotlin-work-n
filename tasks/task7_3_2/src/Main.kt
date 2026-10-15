fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)

    numbers[0] = 1
    println(numbers)

    numbers.add(10)
    println(numbers)

    numbers.addAll(listOf(11, 12))
    println(numbers)

    numbers.remove(3)
    println(numbers)

    numbers.removeAll(listOf(2, 8))
    println(numbers)

    numbers.removeAt(0)
    println(numbers)

    numbers.clear()
    println(numbers)
}