// Task 4.7: finding the longest line in a file

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.system.exitProcess


fun  main(args: Array<String>){
    val filePath = Path(args[0])

    var lineNumber = 0
    var longestLineNumber = 0
    var longestLength = 0

    filePath.forEachLine {
        lineNumber += 1

        if (it.length > longestLength) {
            longestLength = it.length
            longestLineNumber = lineNumber
        }
    }

    println("Line $longestLineNumber is the longest (length = $longestLength)")

}
