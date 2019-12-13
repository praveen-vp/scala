package flowcontrol

object IfElse {

    def main(args: Array[String]) {

        var x = 1
        var res = ""

        if (x == 1) {
            res = " x = 1"
        } else {
            res = " x != 1"
        }

        println(res)

        x = 2
        // if with return value
        val res2 = if (x == 1) " x = 1" else " x != 1"
        println(res2)

        // further shortening
        println(if (x == 1) " x = 1" else " x != 1")
    }
}
