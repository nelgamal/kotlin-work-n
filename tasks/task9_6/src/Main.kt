// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    if (args.size != 1) {
        println("Error: filename required")
        exitProcess(1)
    }

    try {
        val data = readData(args[0])
        val result = variance(data)

        println("Dataset size = ${data.size}")
        println("Variance = ${"%.5f".format(result)}")
    }
    catch (error: Exception) {
        println("Error: ${error.message}")
        exitProcess(1)
    }

}
