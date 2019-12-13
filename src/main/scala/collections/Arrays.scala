package collections

import Array._

object Arrays {

    // array definitions
    val myArray: Array[Int] = new Array[Int](4)
    val myArray2 = new Array[Boolean](4)
    val myArray3 = Array[String]("a", "b", "c", "d")
    val myArray4 = Array[String]("tail array")

    def main(args: Array[String]): Unit = {

        myArray(0) = 0
        myArray(1) = 1
        myArray(2) = 2
        myArray(3) = 3

        println(myArray)

        for (x <- myArray) {
            println(x)
        }

        for (i <- 0 to myArray2.length - 1) {
            println(myArray2(i))
        }

        println(myArray3.length)

        // concat array3
        val arrayResult = concat(myArray3, myArray4)

        for (x <- arrayResult) {
            print(x+" ")
        }

    }

}
