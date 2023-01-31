fun main() {
    println("Введите число");
    val x = readLine()!!.toDouble();

    when {
        x <= 3 -> println(Math.pow(x, 2.0) - 3 * x + 9);
        x > 3 -> println(1 / (Math.pow(x, 3.0) + 6));
    }
}
