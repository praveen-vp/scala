package functions

// scala support operators as function name.
// ie + or * are function in scala
object FunctionNaming {

    def main(args: Array[String]): Unit = {

        println(Math.+(55, 9))
        println(Math.*(2, 2))

        // anonymous functions, no function name and assign directly to a
        // variable.
        val a = (x: Int, y: Int) => x + y
        // call the function with parameters.
        println(a(4, 5))
    }


    object Math {

        def +(x: Int, y: Int) = x + y

        def *(x: Int, y: Int) = x * y
    }

}
