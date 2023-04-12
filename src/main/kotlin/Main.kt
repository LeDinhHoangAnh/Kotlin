fun assignment1() {
    var result = ""
    for (i in 10..200) {
        if (i % 7 == 0 && i % 5 != 0) {
            if (result.isNotEmpty()) result += ", "
            result += i.toString()
        }
    }
    println(result)
    println("------------")
}

fun assignment2() {
    print("Enter a two-digit integer number: ")
    val input = readLine()!!.toInt()

    val binary = Integer.toBinaryString(input)
    val hexadecimal = Integer.toHexString(input)
    

    println("Binary: $binary")
    println("Hexadecimal: $hexadecimal")
    println("------------")
}

fun assignment3() {
    print("Enter the size of the array: ")
    val size = readLine()!!.toInt()

    // Initialize the array with user input
    val arr = IntArray(size)
    println("Enter $size integer numbers:")
    for (i in 0 until size) {
        arr[i] = readLine()!!.toInt()
    }

    arr.sort()

    // Sort the array in ascending order
//    for (i in 0 until size) {
//        for (j in i + 1 until size) {
//            if (arr[j] < arr[i]) {
//                val temp = arr[i]
//                arr[i] = arr[j]
//                arr[j] = temp
//            }
//        }
//    }


    // Print the sorted array in ascending order
    print("Sorted array in ascending order: ")
    for (i in 0 until size) {
        print("${arr[i]} ")
    }

    println("------------")

}


fun assignment4() {
    print("Enter a string: ")
    val input = readLine()!!

    // Count the number of words in the input string
    val words = input.split(" ")
    val numWords = words.size

    // Capitalize the first letter of each sentence
    var output = ""
    for (i in words.indices) {
        val word = words[i]
        if (word.isNotEmpty()) {
            val firstChar = word[0]
            val capitalizedWord = if (i == 0 || firstChar == '.' || firstChar == '!' || firstChar == '?') {
                // Capitalize the first letter of the word if it begins a sentence
                firstChar.toUpperCase() + word.substring(1)
            } else {
                // Leave the word as is
                word
            }
            output += capitalizedWord + " "
        }
    }

    println("Number of words: $numWords")
    println("Capitalized string: $output")
    println("------------")


}

fun assignment5() {
    print("Enter the month (1-12): ")
    var month = readln().toInt()
    do {
        if (month in 1..12) {
            print("Valid month")
        } else {
            println("Enter again")
            month = readln()!!.toInt()
        }
    } while (month < 1 || month > 12)


    print("Enter the year: ")
    var year = readln().toInt()
    do {
        if (year in 1..99999) {
            print("Valid year")
        } else {
            println("Enter again")
            year = readln()!!.toInt()
        }
    } while (year < 1 || year > 99999)


    val numDays = getNumDays(month, year)
    println("Number of days in the month: $numDays")

}

fun getNumDays(month: Int, year: Int): Int {
    return when (month) {
        2 -> {
            if (year % 4 == 0) 29 else 28
        }

        4, 6, 9, 11 -> 30
        else -> 31
    }
}

fun task1() {
    fun Int.toHexString(): String {
        return Integer.toHexString(this)
    }

    val hexStr = 200.toHexString()
    println(hexStr)

}

fun task2() {
    fun String.toBinaryString(): String {
        val hexValue = this.toInt(16)
        val binaryValue = Integer.toBinaryString(hexValue)
        return binaryValue.padStart(8, '0')
    }

    val result = "c8".toBinaryString()
    println(result)

}

fun task3() {
    fun turnOffB2b3(hexString: String): String {
        val binaryString = hexString.toBigInteger(16).toString(2).padStart(16 * 4, '0')
        val modifiedBinaryString = binaryString.substring(0, 8 * 2 + 2) + "000" + binaryString.substring(8 * 2 + 5)
        return java.lang.Long.parseLong(modifiedBinaryString, 2).toString(16).padStart(8, '0')
    }

    val result = turnOffB2b3("12345678")
    println(result) // output: "12305678"


}

fun main() {
//    assignment1()
//    assignment2()
    //    assignment3()
//    assignment4()
//    assignment5()

    task1()
    task2()
    task3()

}