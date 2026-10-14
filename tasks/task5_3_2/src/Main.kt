// Task 5.3.2: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Please provide a dice specification")
        exitProcess(1)
    }

    val specification = args[0]

    val dice = specification.substringBefore("d").toInt()
    val sides = specification.substringAfter("d").toInt()

    rollDice(sides = sides, dice = dice)
}
