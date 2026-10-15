// Task 7.7.2: database-handling functions

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()

fun Database.load(filename: String) {
    Path(filename).forEachLine {
        val parts = it.split(",")
        this[parts[0]] = parts[1]
     }
}

fun Database.save(filename: String) {
    Path(filename).writer().use {
        for ((name, number) in this) {
            it.write("$name,$number\n")
        }
    }
}
