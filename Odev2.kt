
class Odev2 {

    // 1. Dereceyi Fahrenheit'a çeviren metod
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32
    }

    // 2. Dikdörtgenin çevresini hesaplayan metod
    fun rectanglePerimeter(length: Double, width: Double): Double {
        return 2 * (length + width)
    }

    // 3. Sayının faktöriyelini hesaplayan metod
    fun factorial(n: Int): Long {
        var result = 1L
        for (i in 1..n) {
            result *= i
        }
        return result
    }

    // 4. Kelime içindeki 'a' harfi sayısını bulan metod
    fun countLetterA(word: String): Int {
        return word.count { it == 'a' || it == 'A' }
    }

    // 5. Çokgenin iç açılar toplamını hesaplayan metod
    fun sumOfInteriorAngles(sides: Int): Int {
        return (sides - 2) * 180
    }

    // 6. Gün sayısına göre maaş hesaplayan metod
    fun calculateSalary(days: Int): Int {
        val hoursWorked = days * 8
        return if (hoursWorked <= 160) {
            hoursWorked * 10
        } else {
            (160 * 10) + ((hoursWorked - 160) * 20)
        }
    }

    // 7. Kota miktarına göre internet ücreti hesaplayan metod
    fun calculateInternetFee(gbUsed: Int): Int {
        return if (gbUsed <= 50) {
            100
        } else {
            100 + (gbUsed - 50) * 4
        }
    }
}

// Test için main fonksiyon (istersen kullanabilirsin)
fun main() {
    val odev = Odev2()

    println("30°C -> ${odev.celsiusToFahrenheit(30.0)} Fahrenheit")
    println("Dikdörtgen çevresi -> ${odev.rectanglePerimeter(5.0, 10.0)}")
    println("5! = ${odev.factorial(5)}")
    println("'Araba' kelimesinde 'a' harfi sayısı = ${odev.countLetterA("Araba")}")
    println("6 kenarlı çokgen iç açılar toplamı = ${odev.sumOfInteriorAngles(6)}")
    println("20 gün çalışan maaşı = ${odev.calculateSalary(20)} TL")
    println("60 GB internet ücreti = ${odev.calculateInternetFee(60)} TL")
}
