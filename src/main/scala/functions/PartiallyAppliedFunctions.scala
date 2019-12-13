package functions

object PartiallyAppliedFunctions {

    def main(args: Array[String]): Unit = {

        val sum = (a: Int, b: Int) => a + b
        println(sum(2, 3)) // fully applied functions, applied all the arguments

        // partially applied function
        // define another function say 'sump' or variable with the same function and not
        // passing all the arguments and a wild card argument, when this new function
        // sump is called then the wild card value will be passed. And other values
        // will be like default values, which used while declaring sump the function.

        val sump = sum(2, _: Int) // partially defined function or variable as all the
        // arguments are not being passed. The wild card value will be passed while
        // calling the 'sump'
        println(sump(4)) // the value of 4 is actually the second argument in the 'sum'
        // function. First argument is '2' which is mentioned during the sump declaration.

        // NOTE : useful in log function, custom or fixed messages along with some
        // marking.
        // now define a partially applied function which have fixed values for the user
        val logpvp = log("pvp (fixed variable)", _)
        logpvp("message passed in the partially applied fn ")
    }


    // defining a function fully applied function
    def log(name: String, message: String): Unit = {
        println(System.currentTimeMillis() + " =)) " + name + " > " + message)
    }

}
