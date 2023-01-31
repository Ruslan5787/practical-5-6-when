fun main() {
    println("Возраст двух друзей числа через Enter");

    var ageFirstFriend = readLine()!!.toInt();
    var ageSecondFriend = readLine()!!.toInt();

    if(ageFirstFriend < 1 || ageSecondFriend < 1) {
        println("Введите нормальный возраст");
    } else {
        when(ageFirstFriend) {
            in 7..16 -> println("Первый друг ребёнок");
            else -> println("Первый друг не ребёнок");
        }

        when(ageSecondFriend) {
            in 7..16 -> println("Второй друг ребёнок");
            else -> println("Второй друг не ребёнок");
        }
    }
}
