fun main(args: Array<String>) {
    // Задача 2
    printFullName("Max","Efimenko") // Вызываю функции из задания два
    // Задача 6
    println(fibonacci(6))
}

// Задача 1
fun printFullName(firstName: String, lastName: String){ // Создаю функцию , принимающую две строки
    println(firstName + " " + lastName) // Функцию выводит полное имя
}

// Задача 3
fun calculateFullName(firstName: String, lastName: String): String{ // Создаю функцию, которая возвращает полное имя в виде строки.
    return "$firstName $lastName" // Сохраняем своё Имя и Фамилию в константку
}

// Задача 4

fun calculateFullNameAndLength(firstName: String, lastName: String): Pair<String,Int>{
    return Pair("$firstName $lastName",(firstName + lastName).length)
}

// Задача 5
fun isPrimeNumber(number:Int): Boolean{
    if (number <= 1) return false
    for (i in 2..number){
        if (number % i == 0) return false
    }
    return true
}

// Задача 6

fun fibonacci(n:Int): Int{
    var previous1 = 1
    var previous2 = 1
    var current = 0
    for (i in 3..n){
        current = previous1 + previous2
        previous1 = previous2
        previous2 = current
    }
    return current
}







