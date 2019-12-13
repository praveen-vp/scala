package flowcontrol

object WhileLoop {

    def main(args: Array[String]) {

        var x = 0

        while (x < 5) {
            println(" x : " + x)
            x += 1
        }

        // do while loop
        // do part will execute at least one time, even if the condition is
        // not satisfied.
        x = 1
        do {
            println("x : " + x)
            x += 1
        } while (x < 5)


    }
}
