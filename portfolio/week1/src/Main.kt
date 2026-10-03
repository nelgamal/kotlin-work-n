// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle
// Name: Nadine ElGamal - Student ID: 201962580 - Username: znhg0906

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    } else {
        //switching command-line arguments to floats 
        val arg0 = args[0].toFloat()
        val arg1 = args[1].toFloat()
        val arg2 = args[2].toFloat()

        //calculating semi-perimeter 
        val s = (arg0 + arg1 + arg2) / 2

        //calculating perimeter 
        val area = sqrt(s*(s-arg0)*(s-arg1)*(s-arg2))

        //printing area 
        println("Area = " + "%.5f".format(area))
    }
}