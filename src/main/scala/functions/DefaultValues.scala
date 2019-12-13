package functions

object DefaultValues {

    def main(args: Array[String]): Unit = {

        // usual function call with values
        println(MathLocal.add(2, 5))
        // function call for default value
        println(MathLocal.add())
        // function call with one value(ie first param) Second param is
        // selected from default value.
        println(MathLocal.add(19))
    }

    // declare the object with object keyword
    object MathLocal {
        def add(x: Int = 10, y: Int = 5) = x + y
    }

}
