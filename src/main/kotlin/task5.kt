fun main() {
    var figure: Figure?

    do {
        figure = getFigure()
    } while (figure == null)

    println("Объем фигуры: ${figure.GetVolume()}")
    println("Площадь боковой проекции: ${figure.GetLateralProjectionArea()}")
    println("Площадь проекции сверху: ${figure.GetTopProjectionArea()}")
}

fun getFigure(): Figure? {
    print("Введите тип фигуры: ")
    val userInput = readLine()?.lowercase()

    val height = getInput("Введите высоту фигуры: ")
    val base = getInput("Введите основание/диаметр фигуры: ")

    return when (userInput) {
        "куб" -> Cube(height, base)
        "пирамида" -> Pyramid(height, base)
        "конус" -> Cone(height, base)
        else -> {
            println("Неверный ввод. Пожалуйста, введите куб, пирамиду или конус.")
            null
        }
    }
}

fun getInput(prompt: String): Int {
    do {
        print(prompt)
        val input = readLine()?.toIntOrNull()
        if (input != null) {
            return input
        } else {
            println("Неверный ввод. Пожалуйста, введите числовое значение.")
        }
    } while (true)
}

abstract class Figure(var height: Int, var base: Int) {
    abstract fun GetVolume(): Double
    abstract fun GetLateralProjectionArea(): Double
    abstract fun GetTopProjectionArea(): Double
}

class Cone(height: Int, base: Int) : Figure(height, base) {
    override fun GetVolume(): Double {
        return Math.PI * base * base * (height / 3)
    }

    override fun GetLateralProjectionArea(): Double {
        return (height * base / 2).toDouble()
    }

    override fun GetTopProjectionArea(): Double {
        return Math.PI * base * base / 4
    }

}

class Cube(height: Int, base: Int) : Figure(height, base) {
    override fun GetVolume(): Double {
        return (height * height * height).toDouble()
    }

    override fun GetLateralProjectionArea(): Double {
        return (height * height).toDouble()
    }

    override fun GetTopProjectionArea(): Double {
        return (height * height).toDouble()
    }

}

class Pyramid(height: Int, base: Int) : Figure(height, base) {
    override fun GetVolume(): Double {
        return (height * base * base / 3).toDouble()
    }

    override fun GetLateralProjectionArea(): Double {
        return (height * base / 2).toDouble()
    }

    override fun GetTopProjectionArea(): Double {
        return (base * base).toDouble()
    }

}
