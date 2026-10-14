// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 2) {
        println("Error: Two words required")
        exitProcess(1)
    }

    val first = args[0]
    val second = args[1]

    val result = anagrams(first, second)

    println("Are $first and $second anagrams? $result")
}