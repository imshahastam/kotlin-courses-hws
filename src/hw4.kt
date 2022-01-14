//Shahzada Stamova
fun main(args: Array<String>) {

    var count = 0
    println("Введите число:")
    var num = readLine()!!.toInt()

    while (num != 0) {
        num /= 10
        count++
    }
    println("Введенное число содержит $count цифр(у/ы)")
}