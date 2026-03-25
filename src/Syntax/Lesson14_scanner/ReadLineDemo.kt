package Syntax.Lesson14_scanner

fun main() {


    print("Enter your name: ")

    val name = readLine()

    print("Enter your age: ")
    val age = readLine()?.toIntOrNull() ?: 0

    println("Hello my name is $name! I'm ${age} years old.")
}