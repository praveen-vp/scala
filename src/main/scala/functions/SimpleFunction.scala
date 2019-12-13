package functions

object SimpleFunction {

    def main(args: Array[String]): Unit = {

        println(addInt(2, 3))
        println(addIntSingleLine(2, 4))
        println(addIntWithoutReturn(2, 5))
        println(multiply(2, 3))

        printFunction("praveen")
        print("printing without 'Unit' keyword")
    }

    // simple add function
    def addInt(x: Int, y: Int): Int = {
        return x + y
    }

    // without return keyword. As scala consider the last line as a return
    // statement
    def addIntWithoutReturn(x: Int, y: Int): Int = {
        x + y
    }

    // another way, as the function is only having one line.
    def addIntSingleLine(x: Int, y: Int): Int = x + y

    // without referring the return type
    def multiply(x: Int, y: Int) = x * y

    // function without return value, use Unit keyword as in the main
    // function signature
    def printFunction(s :String) : Unit = {
        println(s)
    }

    def print(s : String) = println(s)
}
