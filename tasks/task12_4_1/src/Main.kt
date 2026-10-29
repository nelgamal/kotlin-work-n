// Task 12.4.1: main program

fun main() {
    val circle = Circle(Point(2.0, 3.0), 5.0)

    println("Area = ${circle.area()}")
    println("Perimeter = ${circle.perimeter()}")

    val inside = Point(3.0, 4.0)
    val outside = Point(10.0, 10.0)

    println("Inside point: ${circle.contains(inside)}")
    println("Outside point: ${circle.contains(outside)}")
}
