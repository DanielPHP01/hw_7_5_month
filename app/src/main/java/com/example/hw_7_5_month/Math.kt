package com.example.hw_7_5_month

class Math {

    fun add(a: String, b: String): String {
        var result = ""

        if (a.isInteger() && b.isInteger()) {
            result = (a.toInt() + b.toInt()).toString()
        } else if (a.contains(".") || b.contains(".")) {
            result = "Введите целые числа"
        } else if (b == "0") {
            result = "На ноль делить нельзя"
        } else {
            result = "Вы обязаны ввести числа"
        }
        return result
    }

    fun divide(a: String, b: String): String {
        var result = ""

        if (a.isInteger() && b.isInteger()) {
            if (b.toInt() == 0 || a.toInt() == 0) {
                result = "На ноль делить нельзя"
            } else if ((a.toDouble() / b.toDouble()) % 1 == 0.0) {
                result = (a.toInt() / b.toInt()).toString()
            } else {
                result = (a.toDouble() / b.toDouble()).toString()
            }
        } else {
            result = "Введите целые числа"
        }
        return result
    }

    //fun String.isInteger() = this.all { it in integerChars }

    fun String.isInteger() = this.toIntOrNull()?.let { true } ?: false
}