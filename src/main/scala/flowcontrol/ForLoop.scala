package flowcontrol

object ForLoop {

    def main(args: Array[String]) {

        // simple foo loop
        for (i <- 1 to 5) {
            println(" i using 'to' keyword : " + i)
        }

        // another 'to' operation
        for (i <- 1.to(5)) {
            println(" i using 'to' method : " + i)
        }

        // using until
        // loops til the value reaches the 5, ie it will loop til 1 ... 4,
        // and reaches 5 which breaks the looping condition.
        for (i <- 1 until 5) {
            println(" i using 'until' : " + i)
        }

        // we can use the until as below also
        for (i <- 1.until(5)) {
            println(" i using 'until' : " + i)
        }

        // nested for loop
        for (i <- 1 to 4; j <- 1 to 2) {
            println(" i: " + i + ", j: " + j)
        }

        // over list
        val list = List(1, 2, 3, 4, 5, 6)
        for (i <- list) {
            println("list value : " + i)
        }

        // list and filter condition
        for (i <- list; if i % 2 == 1) {
            println(" list and condition i: " + i)
        }

        // for loop with return value/ as an expression
        val result = for {i <- list; if i % 2 == 1} yield {
            i * i
        }
        println(result)

        // further shortening
        println(for {i <- list; if i % 2 == 0} yield {
            i * i
        })
    }
}
