package functions

/**
  * Currying is a technique of transforming a function which takes multiple arguments
  * into a function which takes a single argument.
  */
object Currying {

    def main(args: Array[String]): Unit = {

        println(add(3, 8))
        println(add2(12)(13))

        // now call the partially applied function using this.
        var sum40 = add2(40)
        println(sum40(20))

        println(add3(2)(3))
        // partial application
        val sum50 = add3(50) _
        println(sum50(100))

    }

    // currying definition
    def add2(x: Int) = (y: Int) => x + y

    // actual function definition
    def add(x: Int, y: Int) = x + y

    // simple currying definition
    def add3(x: Int)(y: Int) = x + y

}
