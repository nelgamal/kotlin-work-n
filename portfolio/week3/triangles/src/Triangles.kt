// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

fun triangleArea(triangle: Triangle): Double {
    if (!isValidTriangle(triangle)) {
        throw IllegalArgumentException("Triangle is invalid")
    }

    val side1 = triangle.first
    val side2 = triangle.second
    val side3 = triangle.third
    
    //calculating semi-perimeter 
    val s = (side1 + side2 + side3) / 2

    //calculating perimeter 
    val area = sqrt(s*(s-side1)*(s-side2)*(s-side3))

    //returning area 
    return area 
}

fun isValidTriangle(triangle: Triangle): Boolean {
    val side1 = triangle.first
    val side2 = triangle.second
    val side3 = triangle.third
    
    return side1 < side2 + side3 && side2 < side1 + side3 && side3 < side2 + side1
}
// Add isValidTriangle() and triangleArea() functions here
