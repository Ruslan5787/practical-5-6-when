fun main() {
    println("Введите число двухзначное число");
    val x = readLine()!!.toString();

    when {
        x.length != 2 -> println("Число должно быть двухзначным.");
        x[0] == '8' || x[1] == '8' -> println("В числе присутствует цифра 8.");
        else -> println("В числе отсутствует цифра 8.");
    }
}