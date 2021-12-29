//Shahzada Stamova
fun main() {

    println("Введите ЧЕТЫРЕХЗНАЧНОЕ число: ")
    val numbers = readLine()?.toInt()

    val fourthN = numbers!! % 10 // 1234 % 10 = 123
    val thirdN = numbers / 10 % 10
    val secondN = numbers / 100 % 10
    val firstN = numbers / 1000 % 10

    val sum1 = firstN + secondN
    val sum2 = thirdN + fourthN

    if (sum1 == sum2) {
        println("$numbers счастливое число")
    } else {
        println("$numbers несчастливое число")
    }
}

