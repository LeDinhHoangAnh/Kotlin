fun main() {
    println("20 số Fibonacci đầu tiên theo thứ tự giảm dần:")
    for (i in 20 downTo 1) {
        print("${fibonacci(i)} ")
    }
}

fun fibonacci(n: Int): Int {
    return when (n) {
        1 -> 0
        2 -> 1
        else -> fibonacci(n - 1) + fibonacci(n - 2)
    }
}
