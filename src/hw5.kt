//Shahzada Stamova

val scan = java.util.Scanner(System.`in`)

fun main(args: Array<String>) {

    val phoneBook = hashMapOf<String, Int>()

    println("Введите количество контактов, которые хотите записать: ")
    var sum = readLine()!!.toInt()

    for (i in 1..sum) {
        println("Введите имя:")
        val name = scan.nextLine()

        println("Введите номер:")
        val phone = scan.nextLine()

        phoneBook[name] = phone.toInt()
        println(phoneBook)
    }

    do {
        println("Введите имя, чтобы узнать номер: ")
        val name = readLine()

        if (name in phoneBook.keys) {
            println("$name = ${phoneBook[name]}")
        } else {
            println("Not found")
        }
    } while (name != "exit")
}