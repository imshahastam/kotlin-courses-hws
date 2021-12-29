//Shahzada Stamova
fun main(args: Array<String>) {

    val myArray = bubbleSort(intArrayOf(5, 2, 6, 7, 9, 6, 1, 8, 4, 3))
    println(myArray.toList())
    println("Sorted ${myArray.toList()}")

}

fun bubbleSort(arr: IntArray) : IntArray {
    var sorted = false
    while (!sorted) {
        sorted = true
        for (i in 0 until arr.size-1)
        {
            if (arr[i] > arr[i+1]) {
                val buffer = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = buffer

                sorted = false
            }
        }
    }
    return arr
}