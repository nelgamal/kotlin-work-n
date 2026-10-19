// Task 8.5: example of using a higher-order function

fun main() {
    val text = "Hello Kotlin 123"

    val vowels = text.howMany { it.lowercase() in "aeiou" }
    val digits = text.howMany { it.isDigit() }
    val uppercase = text.howMany { it.isUpperCase() }
    val spaces = text.howMany { it == ' ' }

    println("Vowels: $vowels")
    println("Digits: $digits")
    println("Uppercase letters: $uppercase")
    println("Spaces: $spaces")

}
