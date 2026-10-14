// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(sides: Int = 6, dice: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20) && dice > 0) {
        var total = 0

        for (i in 1..dice) {
            val result = Random.nextInt(1, sides + 1)
            total += result
        }

        println("Total score = $total")
    }
    else {
        println("Error: Invalid dice specification")
    }
}