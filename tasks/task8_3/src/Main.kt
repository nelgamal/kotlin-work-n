// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
        if (args.size != 1) {
        println("Error: CSV filename required")
        exitProcess(1)
    }

    val data = fetchData(args[0])

    val lowest = data.minBy { it.second }
    val highest = data.maxBy { it.second }

    println("Coldest station: ${lowest.first}, ${lowest.second}")
    println("Warmest station: ${highest.first}, ${highest.second}")

    val average = data.sumOf { it.second } / data.size
    println("Average temperature: %.2f".format(average))


}
