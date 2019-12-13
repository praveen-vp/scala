package functions

/**
  * Closure is a function which uses one or more variables declared outside the
  * function.
  * 1. Impure closure : when the outside variable is of datatype 'var'
  * 2. Pure closure : the outside variable is of datatype 'val'
  */
object Closures {

    //    val add = (x: Int ) => x + costNumber
    // rewrite the add as below

    val add = (x: Int) => {
        costNumber = costNumber + x
        costNumber
    }

    val costVal = 20

    val multiply = (x: Int) => {
        costVal * x
    }

    var costNumber = 10

    def main(args: Array[String]): Unit = {

        // impure closures
        println(add(30))
        // closure changes the value of costNumber
        println(costNumber)

        // changes the value of costNumber
        costNumber = 100
        println(add(10))
        println(costNumber)

        // pure closure
        println(multiply(10))

    }
}
