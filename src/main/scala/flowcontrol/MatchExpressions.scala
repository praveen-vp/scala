package flowcontrol

object MatchExpressions {

    def main(args: Array[String]) {

        val age = 20

        // similar to switch statement
        age match {
            case 20 => println("age is 20")
            case 30 => println("age is 30")
            case 40 => println("age is 40")
            case _ => println(" default case")
        }

        // match returning value
        val result = age match {
            case 20 => age / 2
            case 30 => age / 3
            case 40 => age / 4
            case _ => 0
        }

        println("result from match :" + result)
        // use brackets for separating the result with strings, else type
        // casting will fail.
        println("result in single step : " + (age match {
            case 20 => age / 2
            case 30 => age / 3
            case 40 => age / 4
            case _ => 0
        }))

        println(s"String interpolation-- result in single step : " + (age
        match {
            case 20 => age / 2
            case 30 => age / 3
            case 40 => age / 4
            case _ => 0
        }))

        // multiple conditions
        val i = 7
        i match {
            case 1 | 3 | 5 | 7 | 9 => println(" odd number ")
            case 2 | 4 | 6 | 8 | 10 => println(" even number")
        }
        // prints ' odd number '
    }


}
