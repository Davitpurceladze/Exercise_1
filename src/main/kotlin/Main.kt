import java.lang.NumberFormatException

fun main() {
    var answer: Boolean = true
    while(answer) {
        var firstInput: String?
        var secondInput: String?

        // get first integer
        do {
            print("Enter first number as integer: ")
            firstInput = readln().trim()
        } while (!firstInput!!.isNumeric())

        val firstNumber = firstInput.toInt()


        // get second integer
        do {
            println("Enter second number as integer: ")
            secondInput = readln().trim()
        } while (!secondInput!!.isNumeric())

        val secondNumber = secondInput.toInt()


        // print final result
        println("Sum of $firstNumber and $secondNumber is: ${firstNumber + secondNumber}")


        // ask user repeat or not program
        do {
            println("Do you want to repeat sum program? enter Y for YES / N for NO")
            val response = readln().trim().uppercase()

            when(response) {
                "Y" -> answer = true
                "N" -> answer = false
                else -> println("Invalid Input. Please enter Y for YES / N for NO")
            }
        } while ( response != "Y" && response != "N")
    }
}

// check string is convertible to Int or not
fun String.isNumeric(): Boolean {
    return try {
        this.toInt()
        true
    } catch (e: NumberFormatException) {
        false
    }
}