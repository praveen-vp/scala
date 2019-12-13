package strings

/**
  * The String class is the same class java.lang.String, so all the methods are
  * available in this class is also accessible in scala also.
  */
object Strings {

    def main(args: Array[String]): Unit = {

        val str = "HelloWorld!!"
        println(str)
        println(str.length())
        println(str.length)

        val max = " max"
        println(str.concat(max))

        // formatted printing
        val num = 9;
        val float = 2.08

        printf(" num:  %d float: %f, String : %s", num, float, str)
    }
}

