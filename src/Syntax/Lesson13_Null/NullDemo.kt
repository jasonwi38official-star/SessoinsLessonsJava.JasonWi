package Syntax.Lesson13_Null

fun main() {
    var nullAbleString: String = "Jason"
    println(nullAbleString?.uppercase() ?: "Null value here")


//    val PI: Double? = 3.14
    val PI: Double? = null
    println("The pi constant is ${PI ?: "3.1415926"}")


}