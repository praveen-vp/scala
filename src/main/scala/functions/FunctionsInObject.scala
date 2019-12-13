package functions

object FunctionsInObject {

    // declare the object with object keyword
    object MathLocal {
        def add(x: Int, y: Int) = x + y
    }

    def main(args: Array[String]): Unit = {
        // calling the function in MathLocal object as a static method call
        // in java.
        println(MathLocal.add(2, 5))

        // another option as we use 'to' or 'until' in loops
        println(MathLocal add(4,5))
    }
}
