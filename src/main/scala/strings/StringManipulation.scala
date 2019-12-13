package strings

object StringManipulation {

    def main(args: Array[String]) {

        println("String operations !!!!!")

        val firstName = "praveen"
        val lastName = "vp"
        val age = 18

        val height = 5.6
        println(firstName + " " + lastName + " is " + age + " years old.")

        // s String interpolation
        // not type safe usage, as we are using both String and Int type variables (firstName, lastName is String and age is Int)
        println(s"$firstName $lastName is $age years old. (Using s string interpolation)")

        // f String interpolation
        // for making it type safe, we pass the variable type along with the arguments.
        println(f"$firstName%s $lastName%s is $age%d years old.(Using f string interpolation)")

        println(s"$firstName $lastName is $age years old. And his height is $height. (Using s string interpolation)")

        // the value of float will be printed as '5.600000' // TODO
        println(f"$firstName%s $lastName%s is $age%d years old. And his height is $height%f. (Using f string interpolation)")

        // the \n is considered as the next line, ie it is identified as an escape char.
        println(s"$firstName $lastName.\n His height is $height foot.")
        // raw String interpolation., the \n is not identified as an escape character.
        println(raw"$firstName $lastName.\n His height is $height foot.")
        // output -> praveen vp.\n His height is 5.6 foot.

    }
}
