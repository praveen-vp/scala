package functions

/**
  * Higher order functions are functions in scala, which can take functions as
  * arguments and able to return a function.
  */
object HigherOrderFunctions {

    def main(args: Array[String]): Unit = {
        println(math(12.00, 14.00, (x, y) => x + y))
        println(math(12.00, 14.00, (x, y) => x * y))
        println(math(12.00, 14.00, (x, y) => x / y))
        println(math(12.00, 14.00, (x, y) => x min y))
        println(math(12.00, 14.00, (x, y) => x max y))

        // using wild cards
        println(math(12.00, 14.00, _+_))
        println(math(12.00, 14.00, _*_))
        println(math(12.00, 14.00, _/_))
        println(math(12.00, 14.00, _ min _))
        println(math(12.00, 14.00, _ max _))
    }

    def math(x: Double, y: Double, fn: (Double, Double) => Double): Double = fn(x, y)


}
