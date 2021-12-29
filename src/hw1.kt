import java.lang.ArithmeticException

//calculator - hw1
//Shahzada Stamova

var i1: Int = 0
var i2: Int = 0

fun main() {

        try {
            println("Введите первое число: ")
            i1 = readLine()!!.toInt()
            println("Введите второе число:")
            i2 = readLine()!!.toInt()
        } catch (e: NumberFormatException) {
            println("Вводите только число!")
        }

        println("Какая операция?")
        val operation = readLine().toString()

        when (operation) {
            "+" -> print("Сложение = ${i1 + i2}")
            "-" -> print("Вычитание = ${i1 - i2}")
            "*" -> print("Умножение = ${i1 * i2}")
            "/" -> divide()
            else -> {
                println("Неверная операция!")
            }
        }

}


private fun divide(){
    div(i1, i2)
}

private fun div(i1: Int, i2: Int) {
    try {
        println("Деление = ${i1 / i2}")
    } catch (e: ArithmeticException) {
        println("На ноль делить нельзя!")
    }
}
