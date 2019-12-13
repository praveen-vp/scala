package collections

object Lists {

    // lists are immutable, ie values of a list cannot be changed once the list is
    // created or instantiated. On other hand we can change the value of an elements in
    // an Array.
    // Arrays are mutable and Lists are immutable.
    // List represents linked list

    val numbers: List[Int] = List(1, 2, 3, 4, 5)
    val names: List[String] = List("praveen", "vp")

    def main(args: Array[String]): Unit = {

        println(names)
        println(numbers)

        //        Nil -- is type of List, an empty
        println(Nil)
        println(names.head)
        println(names.tail) // returns the list containing all the elements in the list
        // after the first element.
        println(names.isEmpty)
        println(numbers.max)
        println(numbers.min)
        println(numbers.sum)

        println(names.reverse) // reverses the list.

        // fill function to create a list of same elements
        println(List.fill(5)(2))

        numbers.foreach(println) // passing a function
        var sum: Int = 0
        numbers.foreach(sum += _)
        println(sum)

    }

}
