// Task 7.7.2: phone book simulator
import kotlin.io.path.Path
import kotlin.io.path.exists

const val CSV_FILENAME = "phone.csv"

fun main() {
    val database = createDatabase()

    if (Path(CSV_FILENAME).exists()) {
        database.load(CSV_FILENAME)
    }

    while (true) {
        print("Enter contact name (or quit to exit): ")
        val name = readln()

        if (name == "quit") {
            break
        }

        if (name in database) {
            println("Phone number: ${database[name]}")
        } else {
            print("Enter phone number: ")
            val number = readln()

            database[name] = number
            database.save(CSV_FILENAME)

            println("Contact saved!")
        }
    }
}
